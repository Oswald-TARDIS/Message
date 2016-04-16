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

package com.message.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link t_teacherService}.
 *
 * @author mazhe
 * @see t_teacherService
 * @generated
 */
public class t_teacherServiceWrapper implements t_teacherService,
	ServiceWrapper<t_teacherService> {
	public t_teacherServiceWrapper(t_teacherService t_teacherService) {
		_t_teacherService = t_teacherService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _t_teacherService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_t_teacherService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _t_teacherService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public t_teacherService getWrappedt_teacherService() {
		return _t_teacherService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedt_teacherService(t_teacherService t_teacherService) {
		_t_teacherService = t_teacherService;
	}

	@Override
	public t_teacherService getWrappedService() {
		return _t_teacherService;
	}

	@Override
	public void setWrappedService(t_teacherService t_teacherService) {
		_t_teacherService = t_teacherService;
	}

	private t_teacherService _t_teacherService;
}