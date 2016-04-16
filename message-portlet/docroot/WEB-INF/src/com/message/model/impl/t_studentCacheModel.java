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

import com.message.model.t_student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing t_student in entity cache.
 *
 * @author mazhe
 * @see t_student
 * @generated
 */
public class t_studentCacheModel implements CacheModel<t_student>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{studentId=");
		sb.append(studentId);
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
	public t_student toEntityModel() {
		t_studentImpl t_studentImpl = new t_studentImpl();

		t_studentImpl.setStudentId(studentId);
		t_studentImpl.setGroupId(groupId);
		t_studentImpl.setCompanyId(companyId);
		t_studentImpl.setUserId(userId);

		if (userName == null) {
			t_studentImpl.setUserName(StringPool.BLANK);
		}
		else {
			t_studentImpl.setUserName(userName);
		}

		if (passwd == null) {
			t_studentImpl.setPasswd(StringPool.BLANK);
		}
		else {
			t_studentImpl.setPasswd(passwd);
		}

		t_studentImpl.resetOriginalValues();

		return t_studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studentId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		passwd = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(studentId);
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

	public long studentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public String passwd;
}