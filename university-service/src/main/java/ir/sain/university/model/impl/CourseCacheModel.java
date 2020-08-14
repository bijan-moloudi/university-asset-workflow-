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

package ir.sain.university.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import ir.sain.university.model.Course;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Course in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CourseCacheModel implements CacheModel<Course>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CourseCacheModel)) {
			return false;
		}

		CourseCacheModel courseCacheModel = (CourseCacheModel)object;

		if (courseId == courseCacheModel.courseId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, courseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", code=");
		sb.append(code);
		sb.append(", name=");
		sb.append(name);
		sb.append(", unit=");
		sb.append(unit);
		sb.append(", universityId=");
		sb.append(universityId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Course toEntityModel() {
		CourseImpl courseImpl = new CourseImpl();

		if (uuid == null) {
			courseImpl.setUuid("");
		}
		else {
			courseImpl.setUuid(uuid);
		}

		courseImpl.setCourseId(courseId);
		courseImpl.setGroupId(groupId);
		courseImpl.setCompanyId(companyId);
		courseImpl.setUserId(userId);

		if (userName == null) {
			courseImpl.setUserName("");
		}
		else {
			courseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			courseImpl.setCreateDate(null);
		}
		else {
			courseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			courseImpl.setModifiedDate(null);
		}
		else {
			courseImpl.setModifiedDate(new Date(modifiedDate));
		}

		courseImpl.setStatus(status);
		courseImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			courseImpl.setStatusByUserName("");
		}
		else {
			courseImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			courseImpl.setStatusDate(null);
		}
		else {
			courseImpl.setStatusDate(new Date(statusDate));
		}

		if (code == null) {
			courseImpl.setCode("");
		}
		else {
			courseImpl.setCode(code);
		}

		if (name == null) {
			courseImpl.setName("");
		}
		else {
			courseImpl.setName(name);
		}

		courseImpl.setUnit(unit);
		courseImpl.setUniversityId(universityId);

		courseImpl.resetOriginalValues();

		return courseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		courseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		code = objectInput.readUTF();
		name = objectInput.readUTF();

		unit = objectInput.readInt();

		universityId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(courseId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(unit);

		objectOutput.writeLong(universityId);
	}

	public String uuid;
	public long courseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String code;
	public String name;
	public int unit;
	public long universityId;

}