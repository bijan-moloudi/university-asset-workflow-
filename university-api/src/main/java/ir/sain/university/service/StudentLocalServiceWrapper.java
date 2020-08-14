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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StudentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentLocalService
 * @generated
 */
public class StudentLocalServiceWrapper
	implements ServiceWrapper<StudentLocalService>, StudentLocalService {

	public StudentLocalServiceWrapper(StudentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	@Override
	public void addCourseStudent(long courseId, long studentId) {
		_studentLocalService.addCourseStudent(courseId, studentId);
	}

	@Override
	public void addCourseStudent(
		long courseId, ir.sain.university.model.Student student) {

		_studentLocalService.addCourseStudent(courseId, student);
	}

	@Override
	public void addCourseStudents(
		long courseId,
		java.util.List<ir.sain.university.model.Student> students) {

		_studentLocalService.addCourseStudents(courseId, students);
	}

	@Override
	public void addCourseStudents(long courseId, long[] studentIds) {
		_studentLocalService.addCourseStudents(courseId, studentIds);
	}

	@Override
	public ir.sain.university.model.Student addStudent(
			long userId, long universityId, String name, String phone,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.addStudent(
			userId, universityId, name, phone, serviceContext);
	}

	/**
	 * Adds the student to the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was added
	 */
	@Override
	public ir.sain.university.model.Student addStudent(
		ir.sain.university.model.Student student) {

		return _studentLocalService.addStudent(student);
	}

	@Override
	public void clearCourseStudents(long courseId) {
		_studentLocalService.clearCourseStudents(courseId);
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentId the primary key for the new student
	 * @return the new student
	 */
	@Override
	public ir.sain.university.model.Student createStudent(long studentId) {
		return _studentLocalService.createStudent(studentId);
	}

	@Override
	public void deleteCourseStudent(long courseId, long studentId) {
		_studentLocalService.deleteCourseStudent(courseId, studentId);
	}

	@Override
	public void deleteCourseStudent(
		long courseId, ir.sain.university.model.Student student) {

		_studentLocalService.deleteCourseStudent(courseId, student);
	}

	@Override
	public void deleteCourseStudents(
		long courseId,
		java.util.List<ir.sain.university.model.Student> students) {

		_studentLocalService.deleteCourseStudents(courseId, students);
	}

	@Override
	public void deleteCourseStudents(long courseId, long[] studentIds) {
		_studentLocalService.deleteCourseStudents(courseId, studentIds);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student
	 * @return the student that was removed
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Override
	public ir.sain.university.model.Student deleteStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.deleteStudent(studentId);
	}

	@Override
	public ir.sain.university.model.Student deleteStudent(
			long studentId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.deleteStudent(studentId, serviceContext);
	}

	/**
	 * Deletes the student from the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was removed
	 */
	@Override
	public ir.sain.university.model.Student deleteStudent(
		ir.sain.university.model.Student student) {

		return _studentLocalService.deleteStudent(student);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _studentLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _studentLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _studentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _studentLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _studentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _studentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ir.sain.university.model.Student fetchStudent(long studentId) {
		return _studentLocalService.fetchStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	@Override
	public ir.sain.university.model.Student fetchStudentByUuidAndGroupId(
		String uuid, long groupId) {

		return _studentLocalService.fetchStudentByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _studentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the courseIds of the courses associated with the student.
	 *
	 * @param studentId the studentId of the student
	 * @return long[] the courseIds of courses associated with the student
	 */
	@Override
	public long[] getCoursePrimaryKeys(long studentId) {
		return _studentLocalService.getCoursePrimaryKeys(studentId);
	}

	@Override
	public java.util.List<ir.sain.university.model.Student> getCourseStudents(
		long courseId) {

		return _studentLocalService.getCourseStudents(courseId);
	}

	@Override
	public java.util.List<ir.sain.university.model.Student> getCourseStudents(
		long courseId, int start, int end) {

		return _studentLocalService.getCourseStudents(courseId, start, end);
	}

	@Override
	public java.util.List<ir.sain.university.model.Student> getCourseStudents(
		long courseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ir.sain.university.model.Student> orderByComparator) {

		return _studentLocalService.getCourseStudents(
			courseId, start, end, orderByComparator);
	}

	@Override
	public int getCourseStudentsCount(long courseId) {
		return _studentLocalService.getCourseStudentsCount(courseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _studentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _studentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _studentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student with the primary key.
	 *
	 * @param studentId the primary key of the student
	 * @return the student
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Override
	public ir.sain.university.model.Student getStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student
	 * @throws PortalException if a matching student could not be found
	 */
	@Override
	public ir.sain.university.model.Student getStudentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getStudentByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public int getStudentCount(long groupId, long guestbookId) {
		return _studentLocalService.getStudentCount(groupId, guestbookId);
	}

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
	@Override
	public java.util.List<ir.sain.university.model.Student> getStudents(
		int start, int end) {

		return _studentLocalService.getStudents(start, end);
	}

	@Override
	public java.util.List<ir.sain.university.model.Student> getStudents(
		long groupId, long guestbookId) {

		return _studentLocalService.getStudents(groupId, guestbookId);
	}

	@Override
	public java.util.List<ir.sain.university.model.Student> getStudents(
			long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _studentLocalService.getStudents(
			groupId, guestbookId, start, end);
	}

	@Override
	public java.util.List<ir.sain.university.model.Student> getStudents(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ir.sain.university.model.Student> obc) {

		return _studentLocalService.getStudents(
			groupId, guestbookId, start, end, obc);
	}

	/**
	 * Returns all the students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @return the matching students, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ir.sain.university.model.Student>
		getStudentsByUuidAndCompanyId(String uuid, long companyId) {

		return _studentLocalService.getStudentsByUuidAndCompanyId(
			uuid, companyId);
	}

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
	@Override
	public java.util.List<ir.sain.university.model.Student>
		getStudentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ir.sain.university.model.Student> orderByComparator) {

		return _studentLocalService.getStudentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	@Override
	public int getStudentsCount() {
		return _studentLocalService.getStudentsCount();
	}

	@Override
	public boolean hasCourseStudent(long courseId, long studentId) {
		return _studentLocalService.hasCourseStudent(courseId, studentId);
	}

	@Override
	public boolean hasCourseStudents(long courseId) {
		return _studentLocalService.hasCourseStudents(courseId);
	}

	@Override
	public void setCourseStudents(long courseId, long[] studentIds) {
		_studentLocalService.setCourseStudents(courseId, studentIds);
	}

	@Override
	public ir.sain.university.model.Student updateStudent(
			long userId, long universityId, long studentId, String name,
			String phone,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _studentLocalService.updateStudent(
			userId, universityId, studentId, name, phone, serviceContext);
	}

	/**
	 * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was updated
	 */
	@Override
	public ir.sain.university.model.Student updateStudent(
		ir.sain.university.model.Student student) {

		return _studentLocalService.updateStudent(student);
	}

	@Override
	public StudentLocalService getWrappedService() {
		return _studentLocalService;
	}

	@Override
	public void setWrappedService(StudentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	private StudentLocalService _studentLocalService;

}