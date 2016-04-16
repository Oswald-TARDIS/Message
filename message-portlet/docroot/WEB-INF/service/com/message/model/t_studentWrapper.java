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
 * This class is a wrapper for {@link t_student}.
 * </p>
 *
 * @author mazhe
 * @see t_student
 * @generated
 */
public class t_studentWrapper implements t_student, ModelWrapper<t_student> {
	public t_studentWrapper(t_student t_student) {
		_t_student = t_student;
	}

	@Override
	public Class<?> getModelClass() {
		return t_student.class;
	}

	@Override
	public String getModelClassName() {
		return t_student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("passwd", getPasswd());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
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
	* Returns the primary key of this t_student.
	*
	* @return the primary key of this t_student
	*/
	@Override
	public long getPrimaryKey() {
		return _t_student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t_student.
	*
	* @param primaryKey the primary key of this t_student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_t_student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student ID of this t_student.
	*
	* @return the student ID of this t_student
	*/
	@Override
	public long getStudentId() {
		return _t_student.getStudentId();
	}

	/**
	* Sets the student ID of this t_student.
	*
	* @param studentId the student ID of this t_student
	*/
	@Override
	public void setStudentId(long studentId) {
		_t_student.setStudentId(studentId);
	}

	/**
	* Returns the group ID of this t_student.
	*
	* @return the group ID of this t_student
	*/
	@Override
	public long getGroupId() {
		return _t_student.getGroupId();
	}

	/**
	* Sets the group ID of this t_student.
	*
	* @param groupId the group ID of this t_student
	*/
	@Override
	public void setGroupId(long groupId) {
		_t_student.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this t_student.
	*
	* @return the company ID of this t_student
	*/
	@Override
	public long getCompanyId() {
		return _t_student.getCompanyId();
	}

	/**
	* Sets the company ID of this t_student.
	*
	* @param companyId the company ID of this t_student
	*/
	@Override
	public void setCompanyId(long companyId) {
		_t_student.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this t_student.
	*
	* @return the user ID of this t_student
	*/
	@Override
	public long getUserId() {
		return _t_student.getUserId();
	}

	/**
	* Sets the user ID of this t_student.
	*
	* @param userId the user ID of this t_student
	*/
	@Override
	public void setUserId(long userId) {
		_t_student.setUserId(userId);
	}

	/**
	* Returns the user uuid of this t_student.
	*
	* @return the user uuid of this t_student
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_student.getUserUuid();
	}

	/**
	* Sets the user uuid of this t_student.
	*
	* @param userUuid the user uuid of this t_student
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_t_student.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this t_student.
	*
	* @return the user name of this t_student
	*/
	@Override
	public java.lang.String getUserName() {
		return _t_student.getUserName();
	}

	/**
	* Sets the user name of this t_student.
	*
	* @param userName the user name of this t_student
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_t_student.setUserName(userName);
	}

	/**
	* Returns the passwd of this t_student.
	*
	* @return the passwd of this t_student
	*/
	@Override
	public java.lang.String getPasswd() {
		return _t_student.getPasswd();
	}

	/**
	* Sets the passwd of this t_student.
	*
	* @param passwd the passwd of this t_student
	*/
	@Override
	public void setPasswd(java.lang.String passwd) {
		_t_student.setPasswd(passwd);
	}

	@Override
	public boolean isNew() {
		return _t_student.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_t_student.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _t_student.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_t_student.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _t_student.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _t_student.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_t_student.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _t_student.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_t_student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_t_student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_t_student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new t_studentWrapper((t_student)_t_student.clone());
	}

	@Override
	public int compareTo(com.message.model.t_student t_student) {
		return _t_student.compareTo(t_student);
	}

	@Override
	public int hashCode() {
		return _t_student.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.message.model.t_student> toCacheModel() {
		return _t_student.toCacheModel();
	}

	@Override
	public com.message.model.t_student toEscapedModel() {
		return new t_studentWrapper(_t_student.toEscapedModel());
	}

	@Override
	public com.message.model.t_student toUnescapedModel() {
		return new t_studentWrapper(_t_student.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _t_student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _t_student.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_t_student.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof t_studentWrapper)) {
			return false;
		}

		t_studentWrapper t_studentWrapper = (t_studentWrapper)obj;

		if (Validator.equals(_t_student, t_studentWrapper._t_student)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public t_student getWrappedt_student() {
		return _t_student;
	}

	@Override
	public t_student getWrappedModel() {
		return _t_student;
	}

	@Override
	public void resetOriginalValues() {
		_t_student.resetOriginalValues();
	}

	private t_student _t_student;
}