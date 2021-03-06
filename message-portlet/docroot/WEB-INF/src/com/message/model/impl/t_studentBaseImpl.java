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

import com.liferay.portal.kernel.exception.SystemException;

import com.message.model.t_student;

import com.message.service.t_studentLocalServiceUtil;

/**
 * The extended model base implementation for the t_student service. Represents a row in the &quot;message_t_student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link t_studentImpl}.
 * </p>
 *
 * @author mazhe
 * @see t_studentImpl
 * @see com.message.model.t_student
 * @generated
 */
public abstract class t_studentBaseImpl extends t_studentModelImpl
	implements t_student {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t_student model instance should use the {@link t_student} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			t_studentLocalServiceUtil.addt_student(this);
		}
		else {
			t_studentLocalServiceUtil.updatet_student(this);
		}
	}
}