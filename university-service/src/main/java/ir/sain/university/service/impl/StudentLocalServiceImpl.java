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
import com.liferay.portal.kernel.util.Validator;
import ir.sain.university.model.Student;
import ir.sain.university.model.University;
import ir.sain.university.service.base.StudentLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

@Component(
        property = "model.class.name=ir.sain.university.model.Student",
        service = AopService.class
)
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {

    @Indexable(type = IndexableType.REINDEX)
    public Student addStudent(
            long userId, long universityId, String name, String phone,
            ServiceContext serviceContext)
            throws PortalException {

        long groupId = serviceContext.getScopeGroupId();

        User user = userLocalService.getUserById(userId);

        Date now = new Date();

        validate(name, phone);

        long studentId = counterLocalService.increment();

        Student student = studentPersistence.create(studentId);

        student.setUuid(serviceContext.getUuid());
        student.setUserId(userId);
        student.setGroupId(groupId);
        student.setCompanyId(user.getCompanyId());
        student.setUserName(user.getFullName());
        student.setCreateDate(serviceContext.getCreateDate(now));
        student.setModifiedDate(serviceContext.getModifiedDate(now));
        student.setExpandoBridgeAttributes(serviceContext);
        student.setUniversityId(universityId);

        student.setCode(String.valueOf(studentId));
        student.setName(name);
        student.setPhone(phone);

        studentPersistence.update(student);

        resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
                Student.class.getName(), studentId, false, true, true);

        return student;

    }

    @Indexable(type = IndexableType.REINDEX)
    public Student updateStudent(
            long userId, long universityId, long studentId, String name, String phone,
            ServiceContext serviceContext)
            throws PortalException, SystemException {

        Date now = new Date();

        validate(name, phone);

        Student student = getStudent(studentId);

        User user = userLocalService.getUserById(userId);

        student.setUserId(userId);
        student.setUserName(user.getFullName());
        student.setModifiedDate(serviceContext.getModifiedDate(now));

        student.setName(name);
        student.setPhone(phone);
        student.setExpandoBridgeAttributes(serviceContext);

        studentPersistence.update(student);

        resourceLocalService.updateResources(
                user.getCompanyId(), serviceContext.getScopeGroupId(),
                Student.class.getName(), studentId, serviceContext.getModelPermissions());

        return student;
    }


    @Indexable(type = IndexableType.DELETE)
    public Student deleteStudent(long studentId, ServiceContext serviceContext)
            throws PortalException {

        Student student = getStudent(studentId);

        student = deleteStudent(studentId);

        resourceLocalService.deleteResource(
                serviceContext.getCompanyId(), Student.class.getName(),
                ResourceConstants.SCOPE_INDIVIDUAL, student.getStudentId());

        return student;
    }


    public List<Student> getStudents(long groupId, long guestbookId) {
        return studentPersistence.findByG_G(groupId, guestbookId);
    }

    public List<Student> getStudents(long groupId, long guestbookId, int start, int end)
            throws SystemException {

        return studentPersistence.findByG_G(groupId, guestbookId, start, end);
    }

    public List<Student> getStudents(
            long groupId, long guestbookId, int start, int end, OrderByComparator<Student> obc) {

        return studentPersistence.findByG_G(groupId, guestbookId, start, end, obc);
    }

    public int getStudentCount(long groupId, long guestbookId) {
        return studentPersistence.countByG_G(groupId, guestbookId);
    }

    protected void validate(String name, String phone)
            throws PortalException {

        if (Validator.isNull(name)) {
            // throw new EntryNameException();
        }

        if (!Validator.isEmailAddress(phone)) {
            // throw new EntryEmailException();
        }

    }

}