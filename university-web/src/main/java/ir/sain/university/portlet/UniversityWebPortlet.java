package ir.sain.university.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import ir.sain.university.constants.UniversityWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import ir.sain.university.model.Student;
import ir.sain.university.model.University;
import ir.sain.university.service.StudentLocalService;
import ir.sain.university.service.UniversityLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import sun.security.pkcs11.wrapper.CK_SSL3_KEY_MAT_OUT;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author bijan
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.social",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=false",
                "javax.portlet.display-name=UniversityWeb",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/universitywebportlet/view.jsp",
                "javax.portlet.name=" + UniversityWebPortletKeys.UNIVERSITYWEB,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class UniversityWebPortlet extends MVCPortlet {


    public void addStudent(ActionRequest request, ActionResponse response)
            throws PortalException {

        System.out.println();

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                Student.class.getName(), request);

        String name = ParamUtil.getString(request, "name");
        String phone = ParamUtil.getString(request, "phone");

        long universityId = ParamUtil.getLong(request, "universityId");
        long studentId = ParamUtil.getLong(request, "studentId");

        if (studentId > 0) {

            try {

                _studentLocalService.updateStudent(
                        serviceContext.getUserId(), universityId, studentId, name,
                        phone, serviceContext);

                response.setRenderParameter(
                        "universityId", Long.toString(universityId));
                SessionMessages.add(request, "studentAdded");

            } catch (Exception e) {
                System.out.println(e);
                SessionErrors.add(request, e.getClass().getName());

                PortalUtil.copyRequestParameters(request, response);

                response.setRenderParameter(
                        "mvcPath", "/universitywebportlet/edit_student.jsp");
            }

        } else {

            try {
                _studentLocalService.addStudent(
                        serviceContext.getUserId(), universityId, name, phone,
                        serviceContext);

                SessionMessages.add(request, "studentAdded");

                response.setRenderParameter(
                        "universityId", Long.toString(universityId));

            } catch (Exception e) {
                System.out.println(e);
                SessionErrors.add(request, e.getClass().getName());

                PortalUtil.copyRequestParameters(request, response);

                response.setRenderParameter(
                        "mvcPath", "/universitywebportlet/edit_entry.jsp");
            }
        }
    }

    public void deleteStudent(ActionRequest request, ActionResponse response) throws PortalException {
        long studentId = ParamUtil.getLong(request, "studentId");
        long universityId = ParamUtil.getLong(request, "universityId");

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                Student.class.getName(), request);

        try {

            response.setRenderParameter(
                    "universityId", Long.toString(universityId));

            _studentLocalService.deleteStudent(studentId, serviceContext);
            SessionMessages.add(request, "studentDeleted");
        } catch (Exception e) {
            Logger.getLogger(UniversityWebPortlet.class.getName()).log(
                    Level.SEVERE, null, e);
            SessionErrors.add(request, e.getClass().getName());
        }
    }


    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws IOException, PortletException {

        try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(
                    University.class.getName(), renderRequest);

            long groupId = serviceContext.getScopeGroupId();

            long universityId = ParamUtil.getLong(renderRequest, "universityId");

            List<University> universityList = _universityLocalService.getUniversities(groupId);

            if (universityList.isEmpty()) {
                University university = _universityLocalService.addUniversity(
                        serviceContext.getUserId(), "Main", serviceContext);

                universityId = university.getUniversityId();
            }

            if (universityId == 0) {
                universityId = universityList.get(0).getUniversityId();
            }

            renderRequest.setAttribute("universityId", universityId);
        } catch (Exception e) {
            throw new PortletException(e);
        }

        super.render(renderRequest, renderResponse);
    }


    @Reference(unbind = "-")
    protected void setStudentService(StudentLocalService studentLocalService) {
        _studentLocalService = studentLocalService;
    }

    @Reference(unbind = "-")
    protected void setUniversityService(UniversityLocalService universityLocalService) {
        _universityLocalService = universityLocalService;
    }

    private StudentLocalService _studentLocalService;
    private UniversityLocalService _universityLocalService;


}