package ir.sain.university.internal.security.permission.resource;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import ir.sain.university.model.Student;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;

@Component(immediate = true)
public class UniversityStudentPermission {

    public static boolean contains(
            PermissionChecker permissionChecker, Student student, String actionId) throws PortalException {

        return _universityStudentModelResourcePermission.contains(permissionChecker, student, actionId);
    }

    public static boolean contains(
            PermissionChecker permissionChecker, long studentId, String actionId) throws PortalException {

        return _universityStudentModelResourcePermission.contains(permissionChecker, studentId, actionId);
    }

    @Reference(
            target = "(model.class.name=ir.sain.university.model.Student)",
            unbind = "-")
    protected void setEntryModelPermission(ModelResourcePermission<Student> modelResourcePermission) {

        _universityStudentModelResourcePermission = modelResourcePermission;
    }

    private static ModelResourcePermission<Student> _universityStudentModelResourcePermission;


}
