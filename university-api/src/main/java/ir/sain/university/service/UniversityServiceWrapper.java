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
 * Provides a wrapper for {@link UniversityService}.
 *
 * @author Brian Wing Shun Chan
 * @see UniversityService
 * @generated
 */
public class UniversityServiceWrapper
	implements ServiceWrapper<UniversityService>, UniversityService {

	public UniversityServiceWrapper(UniversityService universityService) {
		_universityService = universityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _universityService.getOSGiServiceIdentifier();
	}

	@Override
	public UniversityService getWrappedService() {
		return _universityService;
	}

	@Override
	public void setWrappedService(UniversityService universityService) {
		_universityService = universityService;
	}

	private UniversityService _universityService;

}