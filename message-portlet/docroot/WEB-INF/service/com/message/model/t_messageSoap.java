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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.message.service.http.t_messageServiceSoap}.
 *
 * @author mazhe
 * @see com.message.service.http.t_messageServiceSoap
 * @generated
 */
public class t_messageSoap implements Serializable {
	public static t_messageSoap toSoapModel(t_message model) {
		t_messageSoap soapModel = new t_messageSoap();

		soapModel.setMessageId(model.getMessageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static t_messageSoap[] toSoapModels(t_message[] models) {
		t_messageSoap[] soapModels = new t_messageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static t_messageSoap[][] toSoapModels(t_message[][] models) {
		t_messageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new t_messageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new t_messageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static t_messageSoap[] toSoapModels(List<t_message> models) {
		List<t_messageSoap> soapModels = new ArrayList<t_messageSoap>(models.size());

		for (t_message model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new t_messageSoap[soapModels.size()]);
	}

	public t_messageSoap() {
	}

	public long getPrimaryKey() {
		return _messageId;
	}

	public void setPrimaryKey(long pk) {
		setMessageId(pk);
	}

	public long getMessageId() {
		return _messageId;
	}

	public void setMessageId(long messageId) {
		_messageId = messageId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	private long _messageId;
	private long _groupId;
	private long _companyId;
}