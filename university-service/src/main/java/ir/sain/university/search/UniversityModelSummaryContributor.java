package ir.sain.university.search;




import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;

@Component(
        immediate = true,
        property = "indexer.class.name=ir.sain.university.model.University",
        service = ModelSummaryContributor.class
)
public class UniversityModelSummaryContributor implements ModelSummaryContributor {

    private Summary createSummary(Document document) {
        String prefix = Field.SNIPPET + StringPool.UNDERLINE;

        String title = document.get(prefix + Field.TITLE, Field.TITLE);

        return new Summary(title, StringPool.BLANK);
    }


    @Override
    public Summary getSummary(Document document, Locale locale, String snippet) {
        Summary summary = createSummary(document);

        summary.setMaxContentLength(200);

        return summary;
    }
}
