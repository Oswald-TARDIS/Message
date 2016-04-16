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
 * This class is used by SOAP remote services, specifically {@link com.message.service.http.t_studentServiceSoap}.
 *
 * @author mazhe
 * @see com.message.service.http.t_studentServiceSoap
 * @generated
 */
public class t_studentSoap implements Serializable {
	public static t_studentSoap toSoapModel(t_student model) {
		t_studentSoap soapModel = new t_studentSoap();

		soapModel.setStudentId(model.getStudentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setPasswd(model.getPasswd());

		return soapModel;
	}

	public static t_studentSoap[] toSoapModels(t_student[] models) {
		t_studentSoap[] soapModels = new t_studentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static t_studentSoap[][] toSoapModels(t_student[][] models) {
		t_studentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new t_studentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new t_studentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static t_studentSoap[] toSoapModels(List<t_student> models) {
		List<t_studentSoap> soapModels = new ArrayList<t_studentSoap>(models.size());

		for (t_student model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new t_studentSoap[soapModels.size()]);
	}

	public t_studentSoap() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getPasswd() {
		return _passwd;
	}

	public void setPasswd(String passwd) {
		_passwd = passwd;
	}

	private long _studentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private String _passwd;
}