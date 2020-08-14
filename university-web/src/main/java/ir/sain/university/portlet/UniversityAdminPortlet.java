package ir.sain.university.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import ir.sain.university.constants.UniversityWebPortletKeys;
import ir.sain.university.model.University;
import ir.sain.university.service.UniversityLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import java.util.logging.Level;
import java.util.logging.Logger;


@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.hidden",
                "com.liferay.portlet.scopeable=true",
                "javax.portlet.display-name=Universities",
                "javax.portlet.expiration-cache=0",
                "javax.portlet.init-param.portlet-title-based-navigation=true",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/universityadminportlet/view.jsp",
                "javax.portlet.name=" + UniversityWebPortletKeys.UNIVERSITYWEB_ADMIN,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=administrator",
                "javax.portlet.supports.mime-type=text/html",
                "com.liferay.portlet.add-default-resource=true"
        },
        service = Portlet.class
)
public class UniversityAdminPortlet extends MVCPortlet {

    public void addUniversity(ActionRequest request, ActionResponse response)
            throws PortalException {

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                University.class.getName(), request);

        String name = ParamUtil.getString(request, "name");

        try {
            _universityLocalService.addUniversity(
                    serviceContext.getUserId(), name, serviceContext);

            SessionMessages.add(request, "universityAdded");
        } catch (PortalException pe) {

            Logger.getLogger(UniversityAdminPortlet.class.getName()).log(
                    Level.SEVERE, null, pe);
            SessionErrors.add(request, pe.getClass().getName());

            response.setRenderParameter(
                    "mvcPath", "/universityadminportlet/edit_university.jsp");
        }
    }

    public void updateUniversity(ActionRequest request, ActionResponse response)
            throws PortalException {

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                University.class.getName(), request);

        String name = ParamUtil.getString(request, "name");
        long universityId = ParamUtil.getLong(request, "universityId");

        try {
            _universityLocalService.updateUniversity(
                    serviceContext.getUserId(), universityId, name, serviceContext);
            SessionMessages.add(request, "universityUpdated");

        } catch (PortalException pe) {

            Logger.getLogger(UniversityAdminPortlet.class.getName()).log(
                    Level.SEVERE, null, pe);

            SessionErrors.add(request, pe.getClass().getName());

            response.setRenderParameter(
                    "mvcPath", "/universityadminportlet/edit_university.jsp");
        }
    }

    public void deleteUniversity(ActionRequest request, ActionResponse response)
            throws PortalException {

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                University.class.getName(), request);

        long universityId = ParamUtil.getLong(request, "universityId");

        try {
            _universityLocalService.deleteUniversity(universityId, serviceContext);

            SessionMessages.add(request, "universityDeleted");
        } catch (PortalException pe) {

            Logger.getLogger(UniversityAdminPortlet.class.getName()).log(
                    Level.SEVERE, null, pe);
            SessionErrors.add(request, pe.getClass().getName());
        }
    }

    private UniversityLocalService _universityLocalService;

    @Reference(unbind = "-")
    protected void setUniversityService(UniversityLocalService universityLocalService) {
        _universityLocalService = universityLocalService;
    }


}
