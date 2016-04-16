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
 * Provides a wrapper for {@link t_studentService}.
 *
 * @author mazhe
 * @see t_studentService
 * @generated
 */
public class t_studentServiceWrapper implements t_studentService,
	ServiceWrapper<t_studentService> {
	public t_studentServiceWrapper(t_studentService t_studentService) {
		_t_studentService = t_studentService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _t_studentService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_t_studentService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _t_studentService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public t_studentService getWrappedt_studentService() {
		return _t_studentService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedt_studentService(t_studentService t_studentService) {
		_t_studentService = t_studentService;
	}

	@Override
	public t_studentService getWrappedService() {
		return _t_studentService;
	}

	@Override
	public void setWrappedService(t_studentService t_studentService) {
		_t_studentService = t_studentService;
	}

	private t_studentService _t_studentService;
}