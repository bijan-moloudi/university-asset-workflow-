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

package ir.sain.university.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import ir.sain.university.exception.NoSuchCourseException;
import ir.sain.university.model.Course;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the course service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseUtil
 * @generated
 */
@ProviderType
public interface CoursePersistence extends BasePersistence<Course> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CourseUtil} to access the course persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the courses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching courses
	 */
	public java.util.List<Course> findByUuid(String uuid);

	/**
	 * Returns a range of all the courses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of matching courses
	 */
	public java.util.List<Course> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the courses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching courses
	 */
	public java.util.List<Course> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns an ordered range of all the courses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching courses
	 */
	public java.util.List<Course> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first course in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public Course findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Returns the first course in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns the last course in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public Course findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Returns the last course in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns the courses before and after the current course in the ordered set where uuid = &#63;.
	 *
	 * @param courseId the primary key of the current course
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public Course[] findByUuid_PrevAndNext(
			long courseId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Removes all the courses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of courses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching courses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the course where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCourseException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public Course findByUUID_G(String uuid, long groupId)
		throws NoSuchCourseException;

	/**
	 * Returns the course where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the course where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the course where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the course that was removed
	 */
	public Course removeByUUID_G(String uuid, long groupId)
		throws NoSuchCourseException;

	/**
	 * Returns the number of courses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching courses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the courses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching courses
	 */
	public java.util.List<Course> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the courses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of matching courses
	 */
	public java.util.List<Course> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the courses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching courses
	 */
	public java.util.List<Course> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns an ordered range of all the courses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching courses
	 */
	public java.util.List<Course> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first course in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public Course findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Returns the first course in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns the last course in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public Course findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Returns the last course in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns the courses before and after the current course in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param courseId the primary key of the current course
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public Course[] findByUuid_C_PrevAndNext(
			long courseId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Removes all the courses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of courses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching courses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the courses where groupId = &#63; and universityId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @return the matching courses
	 */
	public java.util.List<Course> findByG_G(long groupId, long universityId);

	/**
	 * Returns a range of all the courses where groupId = &#63; and universityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of matching courses
	 */
	public java.util.List<Course> findByG_G(
		long groupId, long universityId, int start, int end);

	/**
	 * Returns an ordered range of all the courses where groupId = &#63; and universityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching courses
	 */
	public java.util.List<Course> findByG_G(
		long groupId, long universityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns an ordered range of all the courses where groupId = &#63; and universityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching courses
	 */
	public java.util.List<Course> findByG_G(
		long groupId, long universityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first course in the ordered set where groupId = &#63; and universityId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public Course findByG_G_First(
			long groupId, long universityId,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Returns the first course in the ordered set where groupId = &#63; and universityId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByG_G_First(
		long groupId, long universityId,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns the last course in the ordered set where groupId = &#63; and universityId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public Course findByG_G_Last(
			long groupId, long universityId,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Returns the last course in the ordered set where groupId = &#63; and universityId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course, or <code>null</code> if a matching course could not be found
	 */
	public Course fetchByG_G_Last(
		long groupId, long universityId,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns the courses before and after the current course in the ordered set where groupId = &#63; and universityId = &#63;.
	 *
	 * @param courseId the primary key of the current course
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public Course[] findByG_G_PrevAndNext(
			long courseId, long groupId, long universityId,
			com.liferay.portal.kernel.util.OrderByComparator<Course>
				orderByComparator)
		throws NoSuchCourseException;

	/**
	 * Removes all the courses where groupId = &#63; and universityId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 */
	public void removeByG_G(long groupId, long universityId);

	/**
	 * Returns the number of courses where groupId = &#63; and universityId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param universityId the university ID
	 * @return the number of matching courses
	 */
	public int countByG_G(long groupId, long universityId);

	/**
	 * Caches the course in the entity cache if it is enabled.
	 *
	 * @param course the course
	 */
	public void cacheResult(Course course);

	/**
	 * Caches the courses in the entity cache if it is enabled.
	 *
	 * @param courses the courses
	 */
	public void cacheResult(java.util.List<Course> courses);

	/**
	 * Creates a new course with the primary key. Does not add the course to the database.
	 *
	 * @param courseId the primary key for the new course
	 * @return the new course
	 */
	public Course create(long courseId);

	/**
	 * Removes the course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseId the primary key of the course
	 * @return the course that was removed
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public Course remove(long courseId) throws NoSuchCourseException;

	public Course updateImpl(Course course);

	/**
	 * Returns the course with the primary key or throws a <code>NoSuchCourseException</code> if it could not be found.
	 *
	 * @param courseId the primary key of the course
	 * @return the course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public Course findByPrimaryKey(long courseId) throws NoSuchCourseException;

	/**
	 * Returns the course with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param courseId the primary key of the course
	 * @return the course, or <code>null</code> if a course with the primary key could not be found
	 */
	public Course fetchByPrimaryKey(long courseId);

	/**
	 * Returns all the courses.
	 *
	 * @return the courses
	 */
	public java.util.List<Course> findAll();

	/**
	 * Returns a range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of courses
	 */
	public java.util.List<Course> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of courses
	 */
	public java.util.List<Course> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns an ordered range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of courses
	 */
	public java.util.List<Course> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the courses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of courses.
	 *
	 * @return the number of courses
	 */
	public int countAll();

	/**
	 * Returns the primaryKeys of students associated with the course.
	 *
	 * @param pk the primary key of the course
	 * @return long[] of the primaryKeys of students associated with the course
	 */
	public long[] getStudentPrimaryKeys(long pk);

	/**
	 * Returns all the course associated with the student.
	 *
	 * @param pk the primary key of the student
	 * @return the courses associated with the student
	 */
	public java.util.List<Course> getStudentCourses(long pk);

	/**
	 * Returns all the course associated with the student.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param pk the primary key of the student
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of courses associated with the student
	 */
	public java.util.List<Course> getStudentCourses(
		long pk, int start, int end);

	/**
	 * Returns all the course associated with the student.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>.
	 * </p>
	 *
	 * @param pk the primary key of the student
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of courses associated with the student
	 */
	public java.util.List<Course> getStudentCourses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Course>
			orderByComparator);

	/**
	 * Returns the number of students associated with the course.
	 *
	 * @param pk the primary key of the course
	 * @return the number of students associated with the course
	 */
	public int getStudentsSize(long pk);

	/**
	 * Returns <code>true</code> if the student is associated with the course.
	 *
	 * @param pk the primary key of the course
	 * @param studentPK the primary key of the student
	 * @return <code>true</code> if the student is associated with the course; <code>false</code> otherwise
	 */
	public boolean containsStudent(long pk, long studentPK);

	/**
	 * Returns <code>true</code> if the course has any students associated with it.
	 *
	 * @param pk the primary key of the course to check for associations with students
	 * @return <code>true</code> if the course has any students associated with it; <code>false</code> otherwise
	 */
	public boolean containsStudents(long pk);

	/**
	 * Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param studentPK the primary key of the student
	 */
	public void addStudent(long pk, long studentPK);

	/**
	 * Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param student the student
	 */
	public void addStudent(long pk, ir.sain.university.model.Student student);

	/**
	 * Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param studentPKs the primary keys of the students
	 */
	public void addStudents(long pk, long[] studentPKs);

	/**
	 * Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param students the students
	 */
	public void addStudents(
		long pk, java.util.List<ir.sain.university.model.Student> students);

	/**
	 * Clears all associations between the course and its students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course to clear the associated students from
	 */
	public void clearStudents(long pk);

	/**
	 * Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param studentPK the primary key of the student
	 */
	public void removeStudent(long pk, long studentPK);

	/**
	 * Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param student the student
	 */
	public void removeStudent(
		long pk, ir.sain.university.model.Student student);

	/**
	 * Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param studentPKs the primary keys of the students
	 */
	public void removeStudents(long pk, long[] studentPKs);

	/**
	 * Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param students the students
	 */
	public void removeStudents(
		long pk, java.util.List<ir.sain.university.model.Student> students);

	/**
	 * Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param studentPKs the primary keys of the students to be associated with the course
	 */
	public void setStudents(long pk, long[] studentPKs);

	/**
	 * Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the course
	 * @param students the students to be associated with the course
	 */
	public void setStudents(
		long pk, java.util.List<ir.sain.university.model.Student> students);

}