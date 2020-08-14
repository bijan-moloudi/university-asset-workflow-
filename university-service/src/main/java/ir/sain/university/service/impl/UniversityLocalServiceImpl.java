/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ir.sain.university.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import ir.sain.university.exception.NoSuchUniversityException;
import ir.sain.university.model.Student;
import ir.sain.university.model.University;
import ir.sain.university.service.StudentLocalService;
import ir.sain.university.service.base.UniversityLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.annotations.Preference;
import java.util.Date;
import java.util.List;

@Component(
        property = "model.class.name=ir.sain.university.model.University",
        service = AopService.class
)
public class UniversityLocalServiceImpl extends UniversityLocalServiceBaseImpl {

    @Indexable(type = IndexableType.REINDEX)
    public University addUniversity(
            long userId, String name, ServiceContext serviceContext)
            throws PortalException {

        long groupId = serviceContext.getScopeGroupId();

        User user = userLocalService.getUserById(userId);

        Date now = new Date();

        validate(name);

        long universityId = counterLocalService.increment();

        University university = universityPersistence.create(universityId);

        university.setUuid(serviceContext.getUuid());
        university.setUserId(userId);
        university.setGroupId(groupId);
        university.setCompanyId(user.getCompanyId());
        university.setUserName(user.getFullName());
        university.setCreateDate(serviceContext.getCreateDate(now));
        university.setModifiedDate(serviceContext.getModifiedDate(now));
        university.setName(name);
        university.setExpandoBridgeAttributes(serviceContext);

        universityPersistence.update(university);

        // for register of resource to database
        resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
                University.class.getName(), universityId, false, true, true);

        return university;

    }


    @Indexable(type = IndexableType.REINDEX)
    public University updateUniversity(long userId, long univetsityId,
                                       String name, ServiceContext serviceContext) throws PortalException,
            SystemException {

        Date now = new Date();

        validate(name);

        University university = getUniversity(univetsityId);

        User user = userLocalService.getUser(userId);

        university.setUserId(userId);
        university.setUserName(user.getFullName());
        university.setModifiedDate(serviceContext.getModifiedDate(now));
        university.setName(name);
        university.setExpandoBridgeAttributes(serviceContext);

        universityPersistence.update(university);

        resourceLocalService.updateResources(serviceContext.getCompanyId(),
                serviceContext.getScopeGroupId(),
                University.class.getName(), univetsityId,
               serviceContext.getModelPermissions());

        return university;
    }


    @Indexable(type = IndexableType.DELETE)
    public University deleteUniversity(long univetsityId,
                                       ServiceContext serviceContext) throws PortalException,   SystemException {

        University university = getUniversity(univetsityId);

        List<Student> studentList = studentLocalService.getStudents(
                serviceContext.getScopeGroupId(), univetsityId);

        for (Student student : studentList) {
            studentLocalService.deleteStudent(student.getStudentId());
        }

        university = deleteUniversity(university);

        resourceLocalService.deleteResource(serviceContext.getCompanyId(),
                University.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
                univetsityId);

        return university;
    }


    protected void validate(String name) throws PortalException {
        if (Validator.isNull(name)) {
            throw new NoSuchUniversityException();
        }
    }

    public List<University> getUniversities(long groupId) {
        return universityPersistence.findByGroupId(groupId);
    }

    public List<University> getUniversities(long groupId, int start, int end,
                                            OrderByComparator<University> obc) {
        return universityPersistence.findByGroupId(groupId, start, end, obc);
    }

    public List<University> getUniversities(long groupId, int start, int end) {
        return universityPersistence.findByGroupId(groupId, start, end);
    }

    public int getUniversityCount(long groupId) {
        return universityPersistence.countByGroupId(groupId);
    }

    @Reference
    public StudentLocalService studentLocalService;
}