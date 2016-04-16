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

package com.message.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.message.model.t_teacher;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing t_teacher in entity cache.
 *
 * @author mazhe
 * @see t_teacher
 * @generated
 */
public class t_teacherCacheModel implements CacheModel<t_teacher>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{teacherId=");
		sb.append(teacherId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", passwd=");
		sb.append(passwd);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public t_teacher toEntityModel() {
		t_teacherImpl t_teacherImpl = new t_teacherImpl();

		t_teacherImpl.setTeacherId(teacherId);
		t_teacherImpl.setGroupId(groupId);
		t_teacherImpl.setCompanyId(companyId);
		t_teacherImpl.setUserId(userId);

		if (userName == null) {
			t_teacherImpl.setUserName(StringPool.BLANK);
		}
		else {
			t_teacherImpl.setUserName(userName);
		}

		if (passwd == null) {
			t_teacherImpl.setPasswd(StringPool.BLANK);
		}
		else {
			t_teacherImpl.setPasswd(passwd);
		}

		t_teacherImpl.resetOriginalValues();

		return t_teacherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		teacherId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		passwd = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(teacherId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (passwd == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passwd);
		}
	}

	public long teacherId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public String passwd;
}