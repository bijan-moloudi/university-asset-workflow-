package ir.sain.university.search;


import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import ir.sain.university.model.Student;
import ir.sain.university.service.StudentLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = "indexer.class.name=ir.sain.university.model.Student",
        service = ModelIndexerWriterContributor.class
)
public class UniversityStudentModelIndexerWriterContributor implements ModelIndexerWriterContributor<Student> {

    @Override
    public void customize(
            BatchIndexingActionable batchIndexingActionable,
            ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {

        batchIndexingActionable.setPerformActionMethod((Student student) -> {
            Document document = modelIndexerWriterDocumentHelper.getDocument(
                    student);

            batchIndexingActionable.addDocuments(document);

        });
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(
                studentLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(Student student) {
        return student.getCompanyId();
    }

    @Reference
    protected DynamicQueryBatchIndexingActionableFactory
            dynamicQueryBatchIndexingActionableFactory;

    @Reference
    protected StudentLocalService studentLocalService;

}
