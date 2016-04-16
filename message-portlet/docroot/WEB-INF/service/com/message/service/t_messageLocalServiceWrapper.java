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
 * Provides a wrapper for {@link t_messageLocalService}.
 *
 * @author mazhe
 * @see t_messageLocalService
 * @generated
 */
public class t_messageLocalServiceWrapper implements t_messageLocalService,
	ServiceWrapper<t_messageLocalService> {
	public t_messageLocalServiceWrapper(
		t_messageLocalService t_messageLocalService) {
		_t_messageLocalService = t_messageLocalService;
	}

	/**
	* Adds the t_message to the database. Also notifies the appropriate model listeners.
	*
	* @param t_message the t_message
	* @return the t_message that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_message addt_message(
		com.message.model.t_message t_message)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.addt_message(t_message);
	}

	/**
	* Creates a new t_message with the primary key. Does not add the t_message to the database.
	*
	* @param messageId the primary key for the new t_message
	* @return the new t_message
	*/
	@Override
	public com.message.model.t_message createt_message(long messageId) {
		return _t_messageLocalService.createt_message(messageId);
	}

	/**
	* Deletes the t_message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message that was removed
	* @throws PortalException if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_message deletet_message(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.deletet_message(messageId);
	}

	/**
	* Deletes the t_message from the database. Also notifies the appropriate model listeners.
	*
	* @param t_message the t_message
	* @return the t_message that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_message deletet_message(
		com.message.model.t_message t_message)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.deletet_message(t_message);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_messageLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_messageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_messageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.message.model.t_message fetcht_message(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.fetcht_message(messageId);
	}

	/**
	* Returns the t_message with the primary key.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message
	* @throws PortalException if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_message gett_message(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.gett_message(messageId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the t_messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_messageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t_messages
	* @param end the upper bound of the range of t_messages (not inclusive)
	* @return the range of t_messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.message.model.t_message> gett_messages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.gett_messages(start, end);
	}

	/**
	* Returns the number of t_messages.
	*
	* @return the number of t_messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int gett_messagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.gett_messagesCount();
	}

	/**
	* Updates the t_message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param t_message the t_message
	* @return the t_message that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_message updatet_message(
		com.message.model.t_message t_message)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_messageLocalService.updatet_message(t_message);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _t_messageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_t_messageLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _t_messageLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public t_messageLocalService getWrappedt_messageLocalService() {
		return _t_messageLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedt_messageLocalService(
		t_messageLocalService t_messageLocalService) {
		_t_messageLocalService = t_messageLocalService;
	}

	@Override
	public t_messageLocalService getWrappedService() {
		return _t_messageLocalService;
	}

	@Override
	public void setWrappedService(t_messageLocalService t_messageLocalService) {
		_t_messageLocalService = t_messageLocalService;
	}

	private t_messageLocalService _t_messageLocalService;
}