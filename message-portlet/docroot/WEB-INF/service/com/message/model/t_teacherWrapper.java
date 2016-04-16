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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link t_teacher}.
 * </p>
 *
 * @author mazhe
 * @see t_teacher
 * @generated
 */
public class t_teacherWrapper implements t_teacher, ModelWrapper<t_teacher> {
	public t_teacherWrapper(t_teacher t_teacher) {
		_t_teacher = t_teacher;
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

	/**
	* Returns the primary key of this t_teacher.
	*
	* @return the primary key of this t_teacher
	*/
	@Override
	public long getPrimaryKey() {
		return _t_teacher.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t_teacher.
	*
	* @param primaryKey the primary key of this t_teacher
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_t_teacher.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the teacher ID of this t_teacher.
	*
	* @return the teacher ID of this t_teacher
	*/
	@Override
	public long getTeacherId() {
		return _t_teacher.getTeacherId();
	}

	/**
	* Sets the teacher ID of this t_teacher.
	*
	* @param teacherId the teacher ID of this t_teacher
	*/
	@Override
	public void setTeacherId(long teacherId) {
		_t_teacher.setTeacherId(teacherId);
	}

	/**
	* Returns the group ID of this t_teacher.
	*
	* @return the group ID of this t_teacher
	*/
	@Override
	public long getGroupId() {
		return _t_teacher.getGroupId();
	}

	/**
	* Sets the group ID of this t_teacher.
	*
	* @param groupId the group ID of this t_teacher
	*/
	@Override
	public void setGroupId(long groupId) {
		_t_teacher.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this t_teacher.
	*
	* @return the company ID of this t_teacher
	*/
	@Override
	public long getCompanyId() {
		return _t_teacher.getCompanyId();
	}

	/**
	* Sets the company ID of this t_teacher.
	*
	* @param companyId the company ID of this t_teacher
	*/
	@Override
	public void setCompanyId(long companyId) {
		_t_teacher.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this t_teacher.
	*
	* @return the user ID of this t_teacher
	*/
	@Override
	public long getUserId() {
		return _t_teacher.getUserId();
	}

	/**
	* Sets the user ID of this t_teacher.
	*
	* @param userId the user ID of this t_teacher
	*/
	@Override
	public void setUserId(long userId) {
		_t_teacher.setUserId(userId);
	}

	/**
	* Returns the user uuid of this t_teacher.
	*
	* @return the user uuid of this t_teacher
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_teacher.getUserUuid();
	}

	/**
	* Sets the user uuid of this t_teacher.
	*
	* @param userUuid the user uuid of this t_teacher
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_t_teacher.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this t_teacher.
	*
	* @return the user name of this t_teacher
	*/
	@Override
	public java.lang.String getUserName() {
		return _t_teacher.getUserName();
	}

	/**
	* Sets the user name of this t_teacher.
	*
	* @param userName the user name of this t_teacher
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_t_teacher.setUserName(userName);
	}

	/**
	* Returns the passwd of this t_teacher.
	*
	* @return the passwd of this t_teacher
	*/
	@Override
	public java.lang.String getPasswd() {
		return _t_teacher.getPasswd();
	}

	/**
	* Sets the passwd of this t_teacher.
	*
	* @param passwd the passwd of this t_teacher
	*/
	@Override
	public void setPasswd(java.lang.String passwd) {
		_t_teacher.setPasswd(passwd);
	}

	@Override
	public boolean isNew() {
		return _t_teacher.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_t_teacher.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _t_teacher.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_t_teacher.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _t_teacher.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _t_teacher.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_t_teacher.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _t_teacher.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_t_teacher.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_t_teacher.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_t_teacher.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new t_teacherWrapper((t_teacher)_t_teacher.clone());
	}

	@Override
	public int compareTo(com.message.model.t_teacher t_teacher) {
		return _t_teacher.compareTo(t_teacher);
	}

	@Override
	public int hashCode() {
		return _t_teacher.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.message.model.t_teacher> toCacheModel() {
		return _t_teacher.toCacheModel();
	}

	@Override
	public com.message.model.t_teacher toEscapedModel() {
		return new t_teacherWrapper(_t_teacher.toEscapedModel());
	}

	@Override
	public com.message.model.t_teacher toUnescapedModel() {
		return new t_teacherWrapper(_t_teacher.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _t_teacher.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _t_teacher.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_t_teacher.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof t_teacherWrapper)) {
			return false;
		}

		t_teacherWrapper t_teacherWrapper = (t_teacherWrapper)obj;

		if (Validator.equals(_t_teacher, t_teacherWrapper._t_teacher)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public t_teacher getWrappedt_teacher() {
		return _t_teacher;
	}

	@Override
	public t_teacher getWrappedModel() {
		return _t_teacher;
	}

	@Override
	public void resetOriginalValues() {
		_t_teacher.resetOriginalValues();
	}

	private t_teacher _t_teacher;
}