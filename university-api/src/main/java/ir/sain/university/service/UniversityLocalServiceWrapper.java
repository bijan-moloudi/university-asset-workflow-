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
 * Provides a wrapper for {@link UniversityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UniversityLocalService
 * @generated
 */
public class UniversityLocalServiceWrapper
	implements ServiceWrapper<UniversityLocalService>, UniversityLocalService {

	public UniversityLocalServiceWrapper(
		UniversityLocalService universityLocalService) {

		_universityLocalService = universityLocalService;
	}

	@Override
	public ir.sain.university.model.University addUniversity(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _universityLocalService.addUniversity(
			userId, name, serviceContext);
	}

	/**
	 * Adds the university to the database. Also notifies the appropriate model listeners.
	 *
	 * @param university the university
	 * @return the university that was added
	 */
	@Override
	public ir.sain.university.model.University addUniversity(
		ir.sain.university.model.University university) {

		return _universityLocalService.addUniversity(university);
	}

	/**
	 * Creates a new university with the primary key. Does not add the university to the database.
	 *
	 * @param universityId the primary key for the new university
	 * @return the new university
	 */
	@Override
	public ir.sain.university.model.University createUniversity(
		long universityId) {

		return _universityLocalService.createUniversity(universityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _universityLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the university with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param universityId the primary key of the university
	 * @return the university that was removed
	 * @throws PortalException if a university with the primary key could not be found
	 */
	@Override
	public ir.sain.university.model.University deleteUniversity(
			long universityId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _universityLocalService.deleteUniversity(universityId);
	}

	@Override
	public ir.sain.university.model.University deleteUniversity(
			long univetsityId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _universityLocalService.deleteUniversity(
			univetsityId, serviceContext);
	}

	/**
	 * Deletes the university from the database. Also notifies the appropriate model listeners.
	 *
	 * @param university the university
	 * @return the university that was removed
	 */
	@Override
	public ir.sain.university.model.University deleteUniversity(
		ir.sain.university.model.University university) {

		return _universityLocalService.deleteUniversity(university);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _universityLocalService.dynamicQuery();
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

		return _universityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.UniversityModelImpl</code>.
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

		return _universityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.UniversityModelImpl</code>.
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

		return _universityLocalService.dynamicQuery(
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

		return _universityLocalService.dynamicQueryCount(dynamicQuery);
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

		return _universityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public ir.sain.university.model.University fetchUniversity(
		long universityId) {

		return _universityLocalService.fetchUniversity(universityId);
	}

	/**
	 * Returns the university matching the UUID and group.
	 *
	 * @param uuid the university's UUID
	 * @param groupId the primary key of the group
	 * @return the matching university, or <code>null</code> if a matching university could not be found
	 */
	@Override
	public ir.sain.university.model.University fetchUniversityByUuidAndGroupId(
		String uuid, long groupId) {

		return _universityLocalService.fetchUniversityByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _universityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _universityLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _universityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _universityLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _universityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the universities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ir.sain.university.model.impl.UniversityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @return the range of universities
	 */
	@Override
	public java.util.List<ir.sain.university.model.University> getUniversities(
		int start, int end) {

		return _universityLocalService.getUniversities(start, end);
	}

	@Override
	public java.util.List<ir.sain.university.model.University> getUniversities(
		long groupId) {

		return _universityLocalService.getUniversities(groupId);
	}

	@Override
	public java.util.List<ir.sain.university.model.University> getUniversities(
		long groupId, int start, int end) {

		return _universityLocalService.getUniversities(groupId, start, end);
	}

	@Override
	public java.util.List<ir.sain.university.model.University> getUniversities(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ir.sain.university.model.University> obc) {

		return _universityLocalService.getUniversities(
			groupId, start, end, obc);
	}

	/**
	 * Returns all the universities matching the UUID and company.
	 *
	 * @param uuid the UUID of the universities
	 * @param companyId the primary key of the company
	 * @return the matching universities, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ir.sain.university.model.University>
		getUniversitiesByUuidAndCompanyId(String uuid, long companyId) {

		return _universityLocalService.getUniversitiesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of universities matching the UUID and company.
	 *
	 * @param uuid the UUID of the universities
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of universities
	 * @param end the upper bound of the range of universities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching universities, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ir.sain.university.model.University>
		getUniversitiesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ir.sain.university.model.University> orderByComparator) {

		return _universityLocalService.getUniversitiesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of universities.
	 *
	 * @return the number of universities
	 */
	@Override
	public int getUniversitiesCount() {
		return _universityLocalService.getUniversitiesCount();
	}

	/**
	 * Returns the university with the primary key.
	 *
	 * @param universityId the primary key of the university
	 * @return the university
	 * @throws PortalException if a university with the primary key could not be found
	 */
	@Override
	public ir.sain.university.model.University getUniversity(long universityId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _universityLocalService.getUniversity(universityId);
	}

	/**
	 * Returns the university matching the UUID and group.
	 *
	 * @param uuid the university's UUID
	 * @param groupId the primary key of the group
	 * @return the matching university
	 * @throws PortalException if a matching university could not be found
	 */
	@Override
	public ir.sain.university.model.University getUniversityByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _universityLocalService.getUniversityByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public int getUniversityCount(long groupId) {
		return _universityLocalService.getUniversityCount(groupId);
	}

	@Override
	public ir.sain.university.model.University updateUniversity(
			long userId, long univetsityId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _universityLocalService.updateUniversity(
			userId, univetsityId, name, serviceContext);
	}

	/**
	 * Updates the university in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param university the university
	 * @return the university that was updated
	 */
	@Override
	public ir.sain.university.model.University updateUniversity(
		ir.sain.university.model.University university) {

		return _universityLocalService.updateUniversity(university);
	}

	@Override
	public UniversityLocalService getWrappedService() {
		return _universityLocalService;
	}

	@Override
	public void setWrappedService(
		UniversityLocalService universityLocalService) {

		_universityLocalService = universityLocalService;
	}

	private UniversityLocalService _universityLocalService;

}