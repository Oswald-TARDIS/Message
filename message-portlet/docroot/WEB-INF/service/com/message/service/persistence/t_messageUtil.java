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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.message.model.t_message;

import java.util.List;

/**
 * The persistence utility for the t_message service. This utility wraps {@link t_messagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mazhe
 * @see t_messagePersistence
 * @see t_messagePersistenceImpl
 * @generated
 */
public class t_messageUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(t_message t_message) {
		getPersistence().clearCache(t_message);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<t_message> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<t_message> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<t_message> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static t_message update(t_message t_message)
		throws SystemException {
		return getPersistence().update(t_message);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static t_message update(t_message t_message,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(t_message, serviceContext);
	}

	/**
	* Returns all the t_messages where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching t_messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.message.model.t_message> findByfindById(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfindById(messageId);
	}

	/**
	* Returns a range of all the t_messages where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_messageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of t_messages
	* @param end the upper bound of the range of t_messages (not inclusive)
	* @return the range of matching t_messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.message.model.t_message> findByfindById(
		long messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfindById(messageId, start, end);
	}

	/**
	* Returns an ordered range of all the t_messages where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_messageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of t_messages
	* @param end the upper bound of the range of t_messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t_messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.message.model.t_message> findByfindById(
		long messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindById(messageId, start, end, orderByComparator);
	}

	/**
	* Returns the first t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t_message
	* @throws com.message.NoSucht_messageException if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_message findByfindById_First(
		long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException {
		return getPersistence()
				   .findByfindById_First(messageId, orderByComparator);
	}

	/**
	* Returns the first t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t_message, or <code>null</code> if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_message fetchByfindById_First(
		long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindById_First(messageId, orderByComparator);
	}

	/**
	* Returns the last t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t_message
	* @throws com.message.NoSucht_messageException if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_message findByfindById_Last(
		long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException {
		return getPersistence().findByfindById_Last(messageId, orderByComparator);
	}

	/**
	* Returns the last t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t_message, or <code>null</code> if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_message fetchByfindById_Last(
		long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindById_Last(messageId, orderByComparator);
	}

	/**
	* Removes all the t_messages where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindById(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfindById(messageId);
	}

	/**
	* Returns the number of t_messages where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching t_messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindById(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfindById(messageId);
	}

	/**
	* Caches the t_message in the entity cache if it is enabled.
	*
	* @param t_message the t_message
	*/
	public static void cacheResult(com.message.model.t_message t_message) {
		getPersistence().cacheResult(t_message);
	}

	/**
	* Caches the t_messages in the entity cache if it is enabled.
	*
	* @param t_messages the t_messages
	*/
	public static void cacheResult(
		java.util.List<com.message.model.t_message> t_messages) {
		getPersistence().cacheResult(t_messages);
	}

	/**
	* Creates a new t_message with the primary key. Does not add the t_message to the database.
	*
	* @param messageId the primary key for the new t_message
	* @return the new t_message
	*/
	public static com.message.model.t_message create(long messageId) {
		return getPersistence().create(messageId);
	}

	/**
	* Removes the t_message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message that was removed
	* @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_message remove(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException {
		return getPersistence().remove(messageId);
	}

	public static com.message.model.t_message updateImpl(
		com.message.model.t_message t_message)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(t_message);
	}

	/**
	* Returns the t_message with the primary key or throws a {@link com.message.NoSucht_messageException} if it could not be found.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message
	* @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_message findByPrimaryKey(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException {
		return getPersistence().findByPrimaryKey(messageId);
	}

	/**
	* Returns the t_message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message, or <code>null</code> if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_message fetchByPrimaryKey(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(messageId);
	}

	/**
	* Returns all the t_messages.
	*
	* @return the t_messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.message.model.t_message> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.message.model.t_message> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the t_messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_messageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t_messages
	* @param end the upper bound of the range of t_messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t_messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.message.model.t_message> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t_messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of t_messages.
	*
	* @return the number of t_messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static t_messagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (t_messagePersistence)PortletBeanLocatorUtil.locate(com.message.service.ClpSerializer.getServletContextName(),
					t_messagePersistence.class.getName());

			ReferenceRegistry.registerReference(t_messageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(t_messagePersistence persistence) {
	}

	private static t_messagePersistence _persistence;
}