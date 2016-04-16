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

package com.message.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.message.model.t_student;

import com.message.service.t_studentLocalServiceUtil;

/**
 * @author mazhe
 * @generated
 */
public abstract class t_studentActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public t_studentActionableDynamicQuery() throws SystemException {
		setBaseLocalService(t_studentLocalServiceUtil.getService());
		setClass(t_student.class);

		setClassLoader(com.message.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("studentId");
	}
}