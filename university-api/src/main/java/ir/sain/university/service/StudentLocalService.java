/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ir.sain.university.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import ir.sain.university.model.Student;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Student. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see StudentLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface StudentLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StudentLocalServiceUtil} to access the student local service. Add custom service methods to <code>ir.sain.university.service.impl.StudentLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public void addCourseStudent(long courseId, long studentId);

	public void addCourseStudent(long courseId, Student student);

	public void addCourseStudents(long courseId, List<Student> students);

	public void addCourseStudents(long courseId, long[] studentIds);

	@Indexable(type = IndexableType.REINDEX)
	public Student addStudent(
			long userId, long universityId, String name, String phone,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Adds the student to the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Student addStudent(Student student);

	public void clearCourseStudents(long courseId);

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentId the primary key for the new student
	 * @return the new student
	 */
	@Transactional(enabled = false)
	public Student createStudent(long studentId);

	public void deleteCourseStudent(long courseId, long studentId);

	public void deleteCourseStudent(long courseId, Student student);

	public void deleteCourseStudents(long courseId, List<Student> students);

	public void deleteCourseStudents(long courseId, long[] studentIds);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student
	 * @return the student that was removed
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Student deleteStudent(long studentId) throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	public Student deleteStudent(long studentId, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Deletes the student from the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Student deleteStudent(Student student);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Student fetchStudent(long studentId);

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Student fetchStudentByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the courseIds of the courses associated with the student.
	 *
	 * @param studentId the studentId of the student
	 * @return long[] the courseIds of courses associated with the student
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getCoursePrimaryKeys(long studentId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getCourseStudents(long courseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getCourseStudents(long courseId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getCourseStudents(
		long courseId, int start, int end,
		OrderByComparator<Student> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCourseStudentsCount(long courseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the student with the primary key.
	 *
	 * @param studentId the primary key of the student
	 * @return the student
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Student getStudent(long studentId) throws PortalException;

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student
	 * @throws PortalException if a matching student could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Student getStudentByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStudentCount(long groupId, long guestbookId);

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getStudents(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getStudents(long groupId, long guestbookId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getStudents(
			long groupId, long guestbookId, int start, int end)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getStudents(
		long groupId, long guestbookId, int start, int end,
		OrderByComparator<Student> obc);

	/**
	 * Returns all the students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @return the matching students, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getStudentsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching students, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> getStudentsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Student> orderByComparator);

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStudentsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCourseStudent(long courseId, long studentId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCourseStudents(long courseId);

	public void setCourseStudents(long courseId, long[] studentIds);

	@Indexable(type = IndexableType.REINDEX)
	public Student updateStudent(
			long userId, long universityId, long studentId, String name,
			String phone, ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	 * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Student updateStudent(Student student);

}