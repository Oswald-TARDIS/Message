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
 * Provides a wrapper for {@link t_messageService}.
 *
 * @author mazhe
 * @see t_messageService
 * @generated
 */
public class t_messageServiceWrapper implements t_messageService,
	ServiceWrapper<t_messageService> {
	public t_messageServiceWrapper(t_messageService t_messageService) {
		_t_messageService = t_messageService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _t_messageService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_t_messageService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _t_messageService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public t_messageService getWrappedt_messageService() {
		return _t_messageService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedt_messageService(t_messageService t_messageService) {
		_t_messageService = t_messageService;
	}

	@Override
	public t_messageService getWrappedService() {
		return _t_messageService;
	}

	@Override
	public void setWrappedService(t_messageService t_messageService) {
		_t_messageService = t_messageService;
	}

	private t_messageService _t_messageService;
}