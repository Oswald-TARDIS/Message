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

package com.message.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.message.service.ClpSerializer;
import com.message.service.t_teacherLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mazhe
 */
public class t_teacherClp extends BaseModelImpl<t_teacher> implements t_teacher {
	public t_teacherClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return t_teacher.class;
	}

	@Override
	public String getModelClassName() {
		return t_teacher.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _teacherId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTeacherId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _teacherId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("teacherId", getTeacherId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("passwd", getPasswd());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long teacherId = (Long)attributes.get("teacherId");

		if (teacherId != null) {
			setTeacherId(teacherId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String passwd = (String)attributes.get("passwd");

		if (passwd != null) {
			setPasswd(passwd);
		}
	}

	@Override
	public long getTeacherId() {
		return _teacherId;
	}

	@Override
	public void setTeacherId(long teacherId) {
		_teacherId = teacherId;

		if (_t_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _t_teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setTeacherId", long.class);

				method.invoke(_t_teacherRemoteModel, teacherId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_t_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _t_teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_t_teacherRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_t_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _t_teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_t_teacherRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_t_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _t_teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_t_teacherRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_t_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _t_teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_t_teacherRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPasswd() {
		return _passwd;
	}

	@Override
	public void setPasswd(String passwd) {
		_passwd = passwd;

		if (_t_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _t_teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setPasswd", String.class);

				method.invoke(_t_teacherRemoteModel, passwd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gett_teacherRemoteModel() {
		return _t_teacherRemoteModel;
	}

	public void sett_teacherRemoteModel(BaseModel<?> t_teacherRemoteModel) {
		_t_teacherRemoteModel = t_teacherRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _t_teacherRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_t_teacherRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			t_teacherLocalServiceUtil.addt_teacher(this);
		}
		else {
			t_teacherLocalServiceUtil.updatet_teacher(this);
		}
	}

	@Override
	public t_teacher toEscapedModel() {
		return (t_teacher)ProxyUtil.newProxyInstance(t_teacher.class.getClassLoader(),
			new Class[] { t_teacher.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		t_teacherClp clone = new t_teacherClp();

		clone.setTeacherId(getTeacherId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setPasswd(getPasswd());

		return clone;
	}

	@Override
	public int compareTo(t_teacher t_teacher) {
		int value = 0;

		if (getTeacherId() < t_teacher.getTeacherId()) {
			value = -1;
		}
		else if (getTeacherId() > t_teacher.getTeacherId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof t_teacherClp)) {
			return false;
		}

		t_teacherClp t_teacher = (t_teacherClp)obj;

		long primaryKey = t_teacher.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{teacherId=");
		sb.append(getTeacherId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", passwd=");
		sb.append(getPasswd());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.message.model.t_teacher");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>teacherId</column-name><column-value><![CDATA[");
		sb.append(getTeacherId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passwd</column-name><column-value><![CDATA[");
		sb.append(getPasswd());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _teacherId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private String _passwd;
	private BaseModel<?> _t_teacherRemoteModel;
	private Class<?> _clpSerializerClass = com.message.service.ClpSerializer.class;
}