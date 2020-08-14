package ir.sain.university.internal.security.permission.resource;


import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import ir.sain.university.constants.UniversityConstants;
import ir.sain.university.constants.UniversityWebPortletKeys;
import ir.sain.university.model.University;
import ir.sain.university.service.UniversityLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.WorkflowedModelPermissionLogic;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;
import java.util.Dictionary;


@Component (immediate=true)
public class UniversityModelResourcePermissionRegistrar {

    @Activate
    public void activate(BundleContext bundleContext) {
        Dictionary<String, Object> properties = new HashMapDictionary<>();

        properties.put("model.class.name", University.class.getName());

        _serviceRegistration = bundleContext.registerService(
                ModelResourcePermission.class,
                ModelResourcePermissionFactory.create(
                        University.class, University::getUniversityId,
                        _universityLocalService::getUniversity, _portletResourcePermission,
                        (modelResourcePermission, consumer) -> {
                            consumer.accept(
                                    new StagedModelPermissionLogic<>(
                                            _stagingPermission, UniversityWebPortletKeys.UNIVERSITYWEB,
                                            University::getUniversityId));
                            consumer.accept(
                                    new WorkflowedModelPermissionLogic<>(
                                            _workflowPermission, modelResourcePermission,
                                            _groupLocalService, University::getUniversityId));
                        }),
                properties);
    }

    @Deactivate
    public void deactivate() {
        _serviceRegistration.unregister();
    }

    @Reference
    private UniversityLocalService _universityLocalService;

    @Reference(target = "(resource.name=" + UniversityConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission _portletResourcePermission;

    private ServiceRegistration<ModelResourcePermission> _serviceRegistration;

    @Reference
    private StagingPermission _stagingPermission;

    @Reference
    private WorkflowPermission _workflowPermission;

    @Reference
    private GroupLocalService _groupLocalService;
}