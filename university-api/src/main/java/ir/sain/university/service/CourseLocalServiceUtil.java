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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Course. This utility wraps
 * <code>ir.sain.university.service.impl.CourseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CourseLocalService
 * @generated
 */
public class CourseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>ir.sain.university.service.impl.CourseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the course to the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was added
	 */
	public static ir.sain.university.model.Course addCourse(
		ir.sain.university.model.Course course) {

		return getService().addCourse(course);
	}

	public static void addStudentCourse(
		long studentId, ir.sain.university.model.Course course) {

		getService().addStudentCourse(studentId, course);
	}

	public static void addStudentCourse(long studentId, long courseId) {
		getService().addStudentCourse(studentId, courseId);
	}

	public static void addStudentCourses(
		long studentId,
		java.util.List<ir.sain.university.model.Course> courses) {

		getService().addStudentCourses(studentId, courses);
	}

	public static void addStudentCourses(long studentId, long[] courseIds) {
		getService().addStudentCourses(studentId, courseIds);
	}

	public static void clearStudentCourses(long studentId) {
		getService().clearStudentCourses(studentId);
	}

	/**
	 * Creates a new course with the primary key. Does not add the course to the database.
	 *
	 * @param courseId the primary key for the new course
	 * @return the new course
	 */
	public static ir.sain.university.model.Course createCourse(long courseId) {
		return getService().createCourse(courseId);
	}

	/**
	 * Deletes the course from the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was removed
	 */
	public static ir.sain.university.model.Course deleteCourse(
		ir.sain.university.model.Course course) {

		return getService().deleteCourse(course);
	}

	/**
	 * Deletes the course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseId the primary key of the course
	 * @return the course that was removed
	 * @throws PortalException if a course with the primary key could not be found
	 */
	public static ir.sain.university.model.Course deleteCourse(long courseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCourse(courseId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static void deleteStudentCourse(
		long studentId, ir.sain.university.model.Course course) {

		getService().deleteStudentCourse(studentId, course);
	}

	public static void deleteStudentCourse(long studentId, long courseId) {
		getService().deleteStudentCourse(studentId, courseId);
	}

	public static void deleteStudentCourses(
		long studentId,
		java.util.List<ir.sain.university.model.Course> courses) {

		getService().deleteStudentCourses(studentId, courses);
	}

	public static void deleteStudentCourses(long studentId, long[] courseIds) {
		getService().deleteStudentCourses(studentId, courseIds);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.CourseModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.CourseModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ir.sain.university.model.Course fetchCourse(long courseId) {
		return getService().fetchCourse(courseId);
	}

	/**
	 * Returns the course matching the UUID and group.
	 *
	 * @param uuid the course's UUID
	 * @param groupId the primary key of the group
	 * @return the matching course, or <code>null</code> if a matching course could not be found
	 */
	public static ir.sain.university.model.Course fetchCourseByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchCourseByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the course with the primary key.
	 *
	 * @param courseId the primary key of the course
	 * @return the course
	 * @throws PortalException if a course with the primary key could not be found
	 */
	public static ir.sain.university.model.Course getCourse(long courseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCourse(courseId);
	}

	/**
	 * Returns the course matching the UUID and group.
	 *
	 * @param uuid the course's UUID
	 * @param groupId the primary key of the group
	 * @return the matching course
	 * @throws PortalException if a matching course could not be found
	 */
	public static ir.sain.university.model.Course getCourseByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCourseByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.CourseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of courses
	 */
	public static java.util.List<ir.sain.university.model.Course> getCourses(
		int start, int end) {

		return getService().getCourses(start, end);
	}

	/**
	 * Returns all the courses matching the UUID and company.
	 *
	 * @param uuid the UUID of the courses
	 * @param companyId the primary key of the company
	 * @return the matching courses, or an empty list if no matches were found
	 */
	public static java.util.List<ir.sain.university.model.Course>
		getCoursesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getCoursesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of courses matching the UUID and company.
	 *
	 * @param uuid the UUID of the courses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching courses, or an empty list if no matches were found
	 */
	public static java.util.List<ir.sain.university.model.Course>
		getCoursesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ir.sain.university.model.Course> orderByComparator) {

		return getService().getCoursesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of courses.
	 *
	 * @return the number of courses
	 */
	public static int getCoursesCount() {
		return getService().getCoursesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static java.util.List<ir.sain.university.model.Course>
		getStudentCourses(long studentId) {

		return getService().getStudentCourses(studentId);
	}

	public static java.util.List<ir.sain.university.model.Course>
		getStudentCourses(long studentId, int start, int end) {

		return getService().getStudentCourses(studentId, start, end);
	}

	public static java.util.List<ir.sain.university.model.Course>
		getStudentCourses(
			long studentId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ir.sain.university.model.Course> orderByComparator) {

		return getService().getStudentCourses(
			studentId, start, end, orderByComparator);
	}

	public static int getStudentCoursesCount(long studentId) {
		return getService().getStudentCoursesCount(studentId);
	}

	/**
	 * Returns the studentIds of the students associated with the course.
	 *
	 * @param courseId the courseId of the course
	 * @return long[] the studentIds of students associated with the course
	 */
	public static long[] getStudentPrimaryKeys(long courseId) {
		return getService().getStudentPrimaryKeys(courseId);
	}

	public static boolean hasStudentCourse(long studentId, long courseId) {
		return getService().hasStudentCourse(studentId, courseId);
	}

	public static boolean hasStudentCourses(long studentId) {
		return getService().hasStudentCourses(studentId);
	}

	public static void setStudentCourses(long studentId, long[] courseIds) {
		getService().setStudentCourses(studentId, courseIds);
	}

	/**
	 * Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was updated
	 */
	public static ir.sain.university.model.Course updateCourse(
		ir.sain.university.model.Course course) {

		return getService().updateCourse(course);
	}

	public static CourseLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CourseLocalService, CourseLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CourseLocalService.class);

		ServiceTracker<CourseLocalService, CourseLocalService> serviceTracker =
			new ServiceTracker<CourseLocalService, CourseLocalService>(
				bundle.getBundleContext(), CourseLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}