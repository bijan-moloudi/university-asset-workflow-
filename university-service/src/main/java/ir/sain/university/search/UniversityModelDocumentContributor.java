package ir.sain.university.search;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import ir.sain.university.model.University;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;

@Component(
        immediate = true,
        property = "indexer.class.name=ir.sain.university.model.University",
        service = ModelDocumentContributor.class
)
public class UniversityModelDocumentContributor implements ModelDocumentContributor<University>  {

    @Override
    public void contribute(Document document, University university) {
        try {

            document.addDate(Field.MODIFIED_DATE, university.getModifiedDate());

            Locale defaultLocale = PortalUtil.getSiteDefaultLocale(
                    university.getGroupId());

            String localizedTitle = LocalizationUtil.getLocalizedName(
                    Field.TITLE, defaultLocale.toString());

            document.addText(localizedTitle, university.getName());

        } catch (PortalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn(
                        "Unable to index university " + university.getUniversityId(), pe);
            }
        }
    }

    private static final Log _log = LogFactoryUtil.getLog(
            UniversityModelDocumentContributor.class);
}
