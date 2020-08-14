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

import ir.sain.university.service.base.CourseLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the course local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>ir.sain.university.service.CourseLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=ir.sain.university.model.Course",
        service = AopService.class
)
public class CourseLocalServiceImpl extends CourseLocalServiceBaseImpl {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Use <code>ir.sain.university.service.CourseLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ir.sain.university.service.CourseLocalServiceUtil</code>.
     */
}