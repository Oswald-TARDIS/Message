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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.message.model.t_teacher;
import com.message.model.t_teacherModel;
import com.message.model.t_teacherSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the t_teacher service. Represents a row in the &quot;message_t_teacher&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.message.model.t_teacherModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link t_teacherImpl}.
 * </p>
 *
 * @author mazhe
 * @see t_teacherImpl
 * @see com.message.model.t_teacher
 * @see com.message.model.t_teacherModel
 * @generated
 */
@JSON(strict = true)
public class t_teacherModelImpl extends BaseModelImpl<t_teacher>
	implements t_teacherModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t_teacher model instance should use the {@link com.message.model.t_teacher} interface instead.
	 */
	public static final String TABLE_NAME = "message_t_teacher";
	public static final Object[][] TABLE_COLUMNS = {
			{ "teacherId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "passwd", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table message_t_teacher (teacherId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,passwd VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table message_t_teacher";
	public static final String ORDER_BY_JPQL = " ORDER BY t_teacher.teacherId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY message_t_teacher.teacherId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.message.model.t_teacher"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.message.model.t_teacher"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.message.model.t_teacher"),
			true);
	public static long USERNAME_COLUMN_BITMASK = 1L;
	public static long TEACHERID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static t_teacher toModel(t_teacherSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		t_teacher model = new t_teacherImpl();

		model.setTeacherId(soapModel.getTeacherId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setPasswd(soapModel.getPasswd());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<t_teacher> toModels(t_teacherSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<t_teacher> models = new ArrayList<t_teacher>(soapModels.length);

		for (t_teacherSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.message.model.t_teacher"));

	public t_teacherModelImpl() {
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
	public Class<?> getModelClass() {
		return t_teacher.class;
	}

	@Override
	public String getModelClassName() {
		return t_teacher.class.getName();
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

	@JSON
	@Override
	public long getTeacherId() {
		return _teacherId;
	}

	@Override
	public void setTeacherId(long teacherId) {
		_columnBitmask = -1L;

		_teacherId = teacherId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_columnBitmask |= USERNAME_COLUMN_BITMASK;

		if (_originalUserName == null) {
			_originalUserName = _userName;
		}

		_userName = userName;
	}

	public String getOriginalUserName() {
		return GetterUtil.getString(_originalUserName);
	}

	@JSON
	@Override
	public String getPasswd() {
		if (_passwd == null) {
			return StringPool.BLANK;
		}
		else {
			return _passwd;
		}
	}

	@Override
	public void setPasswd(String passwd) {
		_passwd = passwd;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			t_teacher.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public t_teacher toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (t_teacher)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		t_teacherImpl t_teacherImpl = new t_teacherImpl();

		t_teacherImpl.setTeacherId(getTeacherId());
		t_teacherImpl.setGroupId(getGroupId());
		t_teacherImpl.setCompanyId(getCompanyId());
		t_teacherImpl.setUserId(getUserId());
		t_teacherImpl.setUserName(getUserName());
		t_teacherImpl.setPasswd(getPasswd());

		t_teacherImpl.resetOriginalValues();

		return t_teacherImpl;
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

		if (!(obj instanceof t_teacher)) {
			return false;
		}

		t_teacher t_teacher = (t_teacher)obj;

		long primaryKey = t_teacher.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		t_teacherModelImpl t_teacherModelImpl = this;

		t_teacherModelImpl._originalUserName = t_teacherModelImpl._userName;

		t_teacherModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<t_teacher> toCacheModel() {
		t_teacherCacheModel t_teacherCacheModel = new t_teacherCacheModel();

		t_teacherCacheModel.teacherId = getTeacherId();

		t_teacherCacheModel.groupId = getGroupId();

		t_teacherCacheModel.companyId = getCompanyId();

		t_teacherCacheModel.userId = getUserId();

		t_teacherCacheModel.userName = getUserName();

		String userName = t_teacherCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			t_teacherCacheModel.userName = null;
		}

		t_teacherCacheModel.passwd = getPasswd();

		String passwd = t_teacherCacheModel.passwd;

		if ((passwd != null) && (passwd.length() == 0)) {
			t_teacherCacheModel.passwd = null;
		}

		return t_teacherCacheModel;
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

	private static ClassLoader _classLoader = t_teacher.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			t_teacher.class
		};
	private long _teacherId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private String _originalUserName;
	private String _passwd;
	private long _columnBitmask;
	private t_teacher _escapedModel;
}