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

import ir.sain.university.exception.NoSuchUniversityException;
import ir.sain.university.model.University;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the university service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UniversityUtil
 * @generated
 */
@ProviderType
public interface UniversityPersistence extends BasePersistence<University> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UniversityUtil} to access the university persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the universities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching universities
	 */
	public java.util.List<University> findByUuid(String uuid);

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
	public java.util.List<University> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<University> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

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
	public java.util.List<University> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public University findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Returns the first university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

	/**
	 * Returns the last university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public University findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Returns the last university in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

	/**
	 * Returns the universities before and after the current university in the ordered set where uuid = &#63;.
	 *
	 * @param universityId the primary key of the current university
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public University[] findByUuid_PrevAndNext(
			long universityId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Removes all the universities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of universities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching universities
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the university where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUniversityException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public University findByUUID_G(String uuid, long groupId)
		throws NoSuchUniversityException;

	/**
	 * Returns the university where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the university where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the university where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the university that was removed
	 */
	public University removeByUUID_G(String uuid, long groupId)
		throws NoSuchUniversityException;

	/**
	 * Returns the number of universities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching universities
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the universities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching universities
	 */
	public java.util.List<University> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<University> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<University> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

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
	public java.util.List<University> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public University findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Returns the first university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

	/**
	 * Returns the last university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public University findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Returns the last university in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

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
	public University[] findByUuid_C_PrevAndNext(
			long universityId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Removes all the universities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of universities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching universities
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the universities where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching universities
	 */
	public java.util.List<University> findByGroupId(long groupId);

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
	public java.util.List<University> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<University> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

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
	public java.util.List<University> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public University findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Returns the first university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

	/**
	 * Returns the last university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university
	 * @throws NoSuchUniversityException if a matching university could not be found
	 */
	public University findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Returns the last university in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching university, or <code>null</code> if a matching university could not be found
	 */
	public University fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

	/**
	 * Returns the universities before and after the current university in the ordered set where groupId = &#63;.
	 *
	 * @param universityId the primary key of the current university
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public University[] findByGroupId_PrevAndNext(
			long universityId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Returns all the universities that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching universities that the user has permission to view
	 */
	public java.util.List<University> filterFindByGroupId(long groupId);

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
	public java.util.List<University> filterFindByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<University> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

	/**
	 * Returns the universities before and after the current university in the ordered set of universities that the user has permission to view where groupId = &#63;.
	 *
	 * @param universityId the primary key of the current university
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public University[] filterFindByGroupId_PrevAndNext(
			long universityId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<University>
				orderByComparator)
		throws NoSuchUniversityException;

	/**
	 * Removes all the universities where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of universities where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching universities
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of universities that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching universities that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Caches the university in the entity cache if it is enabled.
	 *
	 * @param university the university
	 */
	public void cacheResult(University university);

	/**
	 * Caches the universities in the entity cache if it is enabled.
	 *
	 * @param universities the universities
	 */
	public void cacheResult(java.util.List<University> universities);

	/**
	 * Creates a new university with the primary key. Does not add the university to the database.
	 *
	 * @param universityId the primary key for the new university
	 * @return the new university
	 */
	public University create(long universityId);

	/**
	 * Removes the university with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param universityId the primary key of the university
	 * @return the university that was removed
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public University remove(long universityId)
		throws NoSuchUniversityException;

	public University updateImpl(University university);

	/**
	 * Returns the university with the primary key or throws a <code>NoSuchUniversityException</code> if it could not be found.
	 *
	 * @param universityId the primary key of the university
	 * @return the university
	 * @throws NoSuchUniversityException if a university with the primary key could not be found
	 */
	public University findByPrimaryKey(long universityId)
		throws NoSuchUniversityException;

	/**
	 * Returns the university with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param universityId the primary key of the university
	 * @return the university, or <code>null</code> if a university with the primary key could not be found
	 */
	public University fetchByPrimaryKey(long universityId);

	/**
	 * Returns all the universities.
	 *
	 * @return the universities
	 */
	public java.util.List<University> findAll();

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
	public java.util.List<University> findAll(int start, int end);

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
	public java.util.List<University> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator);

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
	public java.util.List<University> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<University>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the universities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of universities.
	 *
	 * @return the number of universities
	 */
	public int countAll();

}