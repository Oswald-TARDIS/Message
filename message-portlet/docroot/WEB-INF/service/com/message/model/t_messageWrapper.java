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
 * This class is a wrapper for {@link t_message}.
 * </p>
 *
 * @author mazhe
 * @see t_message
 * @generated
 */
public class t_messageWrapper implements t_message, ModelWrapper<t_message> {
	public t_messageWrapper(t_message t_message) {
		_t_message = t_message;
	}

	@Override
	public Class<?> getModelClass() {
		return t_message.class;
	}

	@Override
	public String getModelClassName() {
		return t_message.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("messageId", getMessageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long messageId = (Long)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
	}

	/**
	* Returns the primary key of this t_message.
	*
	* @return the primary key of this t_message
	*/
	@Override
	public long getPrimaryKey() {
		return _t_message.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t_message.
	*
	* @param primaryKey the primary key of this t_message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_t_message.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the message ID of this t_message.
	*
	* @return the message ID of this t_message
	*/
	@Override
	public long getMessageId() {
		return _t_message.getMessageId();
	}

	/**
	* Sets the message ID of this t_message.
	*
	* @param messageId the message ID of this t_message
	*/
	@Override
	public void setMessageId(long messageId) {
		_t_message.setMessageId(messageId);
	}

	/**
	* Returns the group ID of this t_message.
	*
	* @return the group ID of this t_message
	*/
	@Override
	public long getGroupId() {
		return _t_message.getGroupId();
	}

	/**
	* Sets the group ID of this t_message.
	*
	* @param groupId the group ID of this t_message
	*/
	@Override
	public void setGroupId(long groupId) {
		_t_message.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this t_message.
	*
	* @return the company ID of this t_message
	*/
	@Override
	public long getCompanyId() {
		return _t_message.getCompanyId();
	}

	/**
	* Sets the company ID of this t_message.
	*
	* @param companyId the company ID of this t_message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_t_message.setCompanyId(companyId);
	}

	@Override
	public boolean isNew() {
		return _t_message.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_t_message.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _t_message.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_t_message.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _t_message.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _t_message.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_t_message.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _t_message.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_t_message.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_t_message.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_t_message.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new t_messageWrapper((t_message)_t_message.clone());
	}

	@Override
	public int compareTo(com.message.model.t_message t_message) {
		return _t_message.compareTo(t_message);
	}

	@Override
	public int hashCode() {
		return _t_message.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.message.model.t_message> toCacheModel() {
		return _t_message.toCacheModel();
	}

	@Override
	public com.message.model.t_message toEscapedModel() {
		return new t_messageWrapper(_t_message.toEscapedModel());
	}

	@Override
	public com.message.model.t_message toUnescapedModel() {
		return new t_messageWrapper(_t_message.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _t_message.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _t_message.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_t_message.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof t_messageWrapper)) {
			return false;
		}

		t_messageWrapper t_messageWrapper = (t_messageWrapper)obj;

		if (Validator.equals(_t_message, t_messageWrapper._t_message)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public t_message getWrappedt_message() {
		return _t_message;
	}

	@Override
	public t_message getWrappedModel() {
		return _t_message;
	}

	@Override
	public void resetOriginalValues() {
		_t_message.resetOriginalValues();
	}

	private t_message _t_message;
}