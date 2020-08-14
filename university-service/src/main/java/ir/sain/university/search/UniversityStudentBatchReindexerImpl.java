package ir.sain.university.search;

import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.indexer.IndexerDocumentBuilder;
import com.liferay.portal.search.indexer.IndexerWriter;
import ir.sain.university.model.Student;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.search.Document;

@Component(immediate = true, service = UniversityStudentBatchReindexer.class)
public class UniversityStudentBatchReindexerImpl implements UniversityStudentBatchReindexer {

    @Override
    public void reindex(long universityId, long companyId) {
        BatchIndexingActionable batchIndexingActionable =
                indexerWriter.getBatchIndexingActionable();

        batchIndexingActionable.setAddCriteriaMethod(dynamicQuery -> {
            Property universityIdPropery = PropertyFactoryUtil.forName(
                    "universityId");

            dynamicQuery.add(universityIdPropery.eq(universityId));
        });

        batchIndexingActionable.setCompanyId(companyId);

        batchIndexingActionable.setPerformActionMethod((Student student) -> {
            Document document = indexerDocumentBuilder.getDocument(student);

            batchIndexingActionable.addDocuments(document);
        });

        batchIndexingActionable.performActions();

    }

    @Reference(target = "(indexer.class.name=ir.sain.university.model.Student)")
    protected IndexerDocumentBuilder indexerDocumentBuilder;

    @Reference(target = "(indexer.class.name=ir.sain.university.model.Student)")
    protected IndexerWriter<Student> indexerWriter;


}
