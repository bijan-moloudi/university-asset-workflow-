package ir.sain.university.search;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import ir.sain.university.model.Student;
import ir.sain.university.model.University;
import ir.sain.university.service.UniversityLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Locale;

@Component(
        immediate = true,
        property = "indexer.class.name=ir.sain.university.model.Student",
        service = ModelDocumentContributor.class
)
public class UniversityStudentModelDocumentContributor implements ModelDocumentContributor<Student> {

    @Override
    public void contribute(Document document, Student student) {
        try {
            Locale defaultLocale = PortalUtil.getSiteDefaultLocale(
                    student.getGroupId());

            document.addDate(Field.MODIFIED_DATE, student.getModifiedDate());

            String localizedTitle = LocalizationUtil.getLocalizedName(
                    Field.TITLE, defaultLocale.toString());
            String localizedContent = LocalizationUtil.getLocalizedName(
                    Field.CONTENT, defaultLocale.toString());

            document.addText(localizedTitle, student.getName());
            document.addText(localizedContent, student.getPhone());

            long universityId = student.getUniversityId();

            University university = _universityLocalService.getUniversity(
                    universityId);

            String UniversityName = university.getName();

            String localizedGbName = LocalizationUtil.getLocalizedName(
                    Field.NAME, defaultLocale.toString());

            document.addText(localizedGbName, UniversityName);
        } catch (PortalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to index student " + student.getStudentId(), pe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final Log _log = LogFactoryUtil.getLog(
            UniversityStudentModelDocumentContributor.class);

    @Reference
    private UniversityLocalService _universityLocalService;

}
