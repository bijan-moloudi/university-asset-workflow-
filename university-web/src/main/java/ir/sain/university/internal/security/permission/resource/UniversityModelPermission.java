package ir.sain.university.internal.security.permission.resource;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import ir.sain.university.model.University;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;

@Component(immediate = true)
public class UniversityModelPermission {

    public static boolean contains(
            PermissionChecker permissionChecker, University university, String actionId) throws PortalException {

        return _UniversityModelResourcePermission.contains(permissionChecker, university, actionId);
    }

    public static boolean contains(
            PermissionChecker permissionChecker, long universityId, String actionId) throws PortalException {

        return _UniversityModelResourcePermission.contains(permissionChecker, universityId, actionId);
    }

    @Reference(
            target = "(model.class.name=ir.sain.university.model.University)",
            unbind = "-")
    protected void setUniversityModelPermission(ModelResourcePermission<University> modelResourcePermission) {

        _UniversityModelResourcePermission = modelResourcePermission;
    }

    private static ModelResourcePermission<University>_UniversityModelResourcePermission;


}
