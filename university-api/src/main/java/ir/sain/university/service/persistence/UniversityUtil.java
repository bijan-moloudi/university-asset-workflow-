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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import ir.sain.university.model.University;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the university service. This utility wraps <code>ir.sain.university.service.persistence.impl.UniversityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UniversityPersistence
 * @generated
 */
public class UniversityUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(University university) {
		getPersistence().clearCache(university);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, University> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<University> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<University> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<University> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<University> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static University update(University university) {
		return getPersistence().update(university);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static University update(
		University university, ServiceContext serviceContext) {

		return getPersistence().update(university, serviceContext);
	}

	/**
	 * Returns all the universities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching universities
	 */
	public static List<University> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the universities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @return the range of matching universities
	 */
	public static List<University> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the universities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching universities
	 */
	public static List<University> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<University> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the universities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching universities
	 */
	public static List<University> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<University> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public static University findByUuid_First(
			String uuid, OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByUuid_First(
		String uuid, OrderByComparator<University> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public static University findByUuid_Last(
			String uuid, OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByUuid_Last(
		String uuid, OrderByComparator<University> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the universities before and after the current university in the ordered set where uuid = &#63;.
	 *
	 * @param universityId the primary key of the current university
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public static University[] findByUuid_PrevAndNext(
			long universityId, String uuid,
			OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByUuid_PrevAndNext(
			universityId, uuid, orderByComparator);
	}

	/**
	 * Removes all the universities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of universities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching universities
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the university where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUniversityException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public static University findByUUID_G(String uuid, long groupId)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the university where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the university where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the university where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the university that was removed
	 */
	public static University removeByUUID_G(String uuid, long groupId)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of universities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching universities
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the universities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching universities
	 */
	public static List<University> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the universities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @return the range of matching universities
	 */
	public static List<University> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the universities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching universities
	 */
	public static List<University> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<University> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the universities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching universities
	 */
	public static List<University> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<University> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public static University findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<University> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public static University findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<University> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the universities before and after the current university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param universityId the primary key of the current university
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public static University[] findByUuid_C_PrevAndNext(
			long universityId, String uuid, long companyId,
			OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByUuid_C_PrevAndNext(
			universityId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the universities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of universities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching universities
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the universities where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching universities
	 */
	public static List<University> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the universities where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @return the range of matching universities
	 */
	public static List<University> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the universities where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching universities
	 */
	public static List<University> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<University> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the universities where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching universities
	 */
	public static List<University> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<University> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public static University findByGroupId_First(
			long groupId, OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByGroupId_First(
		long groupId, OrderByComparator<University> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public static University findByGroupId_Last(
			long groupId, OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university, or <code>null</code> if a matching university could not be found
	 */
	public static University fetchByGroupId_Last(
		long groupId, OrderByComparator<University> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the universities before and after the current university in the ordered set where groupId = &#63;.
	 *
	 * @param universityId the primary key of the current university
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public static University[] findByGroupId_PrevAndNext(
			long universityId, long groupId,
			OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByGroupId_PrevAndNext(
			universityId, groupId, orderByComparator);
	}

	/**
	 * Returns all the universities that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching universities that the user has permission to view
	 */
	public static List<University> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the universities that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @return the range of matching universities that the user has permission to view
	 */
	public static List<University> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the universities that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching universities that the user has permission to view
	 */
	public static List<University> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<University> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the universities before and after the current university in the ordered set of universities that the user has permission to view where groupId = &#63;.
	 *
	 * @param universityId the primary key of the current university
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public static University[] filterFindByGroupId_PrevAndNext(
			long universityId, long groupId,
			OrderByComparator<University> orderByComparator)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			universityId, groupId, orderByComparator);
	}

	/**
	 * Removes all the universities where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of universities where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching universities
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of universities that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching universities that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Caches the university in the entity cache if it is enabled.
	 *
	 * @param university the university
	 */
	public static void cacheResult(University university) {
		getPersistence().cacheResult(university);
	}

	/**
	 * Caches the universities in the entity cache if it is enabled.
	 *
	 * @param universities the universities
	 */
	public static void cacheResult(List<University> universities) {
		getPersistence().cacheResult(universities);
	}

	/**
	 * Creates a new university with the primary key. Does not add the university to the database.
	 *
	 * @param universityId the primary key for the new university
	 * @return the new university
	 */
	public static University create(long universityId) {
		return getPersistence().create(universityId);
	}

	/**
	 * Removes the university with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param universityId the primary key of the university
	 * @return the university that was removed
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public static University remove(long universityId)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().remove(universityId);
	}

	public static University updateImpl(University university) {
		return getPersistence().updateImpl(university);
	}

	/**
	 * Returns the university with the primary key or throws a <code>NoSuchUniversityException</code> if it could not be found.
	 *
	 * @param universityId the primary key of the university
	 * @return the university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public static University findByPrimaryKey(long universityId)
		throws ir.sain.university.exception.NoSuchUniversityException {

		return getPersistence().findByPrimaryKey(universityId);
	}

	/**
	 * Returns the university with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param universityId the primary key of the university
	 * @return the university, or <code>null</code> if a university with the primary key could not be found
	 */
	public static University fetchByPrimaryKey(long universityId) {
		return getPersistence().fetchByPrimaryKey(universityId);
	}

	/**
	 * Returns all the universities.
	 *
	 * @return the universities
	 */
	public static List<University> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the universities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @return the range of universities
	 */
	public static List<University> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the universities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of universities
	 */
	public static List<University> findAll(
		int start, int end, OrderByComparator<University> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the universities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of universities
	 */
	public static List<University> findAll(
		int start, int end, OrderByComparator<University> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the universities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of universities.
	 *
	 * @return the number of universities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UniversityPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UniversityPersistence, UniversityPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UniversityPersistence.class);

		ServiceTracker<UniversityPersistence, UniversityPersistence>
			serviceTracker =
				new ServiceTracker
					<UniversityPersistence, UniversityPersistence>(
						bundle.getBundleContext(), UniversityPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}