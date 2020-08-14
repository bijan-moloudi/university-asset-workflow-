package ir.sain.university.search;


import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import ir.sain.university.model.University;
import ir.sain.university.service.UniversityLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
        immediate = true,
        property = "indexer.class.name=ir.sain.university.model.University",
        service = ModelIndexerWriterContributor.class
)
public class UniversityModelIndexerWriterContributor implements ModelIndexerWriterContributor<University> {

    @Override
    public void customize(
            BatchIndexingActionable batchIndexingActionable,
            ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {

        batchIndexingActionable.setPerformActionMethod((University university) -> {
            Document document = modelIndexerWriterDocumentHelper.getDocument(
                    university);

            batchIndexingActionable.addDocuments(document);
        });
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(
                universityLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(University university) {
        return university.getCompanyId();
    }

    @Override
    public void modelIndexed(University university) {
        universityStudentBatchReindexer.reindex(
                university.getUniversityId(), university.getCompanyId());
    }

    @Reference
    protected DynamicQueryBatchIndexingActionableFactory
            dynamicQueryBatchIndexingActionableFactory;

    @Reference
    protected UniversityStudentBatchReindexer universityStudentBatchReindexer;

    @Reference
    protected UniversityLocalService universityLocalService;
}

