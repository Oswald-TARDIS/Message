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

import com.liferay.portal.service.persistence.BasePersistence;

import com.message.model.t_message;

/**
 * The persistence interface for the t_message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mazhe
 * @see t_messagePersistenceImpl
 * @see t_messageUtil
 * @generated
 */
public interface t_messagePersistence extends BasePersistence<t_message> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link t_messageUtil} to access the t_message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the t_messages where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching t_messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.message.model.t_message> findByfindById(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_message> findByfindById(
		long messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_message> findByfindById(
		long messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t_message
	* @throws com.message.NoSucht_messageException if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_message findByfindById_First(long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException;

	/**
	* Returns the first t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t_message, or <code>null</code> if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_message fetchByfindById_First(long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t_message
	* @throws com.message.NoSucht_messageException if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_message findByfindById_Last(long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException;

	/**
	* Returns the last t_message in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t_message, or <code>null</code> if a matching t_message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_message fetchByfindById_Last(long messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t_messages where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfindById(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t_messages where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching t_messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByfindById(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the t_message in the entity cache if it is enabled.
	*
	* @param t_message the t_message
	*/
	public void cacheResult(com.message.model.t_message t_message);

	/**
	* Caches the t_messages in the entity cache if it is enabled.
	*
	* @param t_messages the t_messages
	*/
	public void cacheResult(
		java.util.List<com.message.model.t_message> t_messages);

	/**
	* Creates a new t_message with the primary key. Does not add the t_message to the database.
	*
	* @param messageId the primary key for the new t_message
	* @return the new t_message
	*/
	public com.message.model.t_message create(long messageId);

	/**
	* Removes the t_message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message that was removed
	* @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_message remove(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException;

	public com.message.model.t_message updateImpl(
		com.message.model.t_message t_message)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t_message with the primary key or throws a {@link com.message.NoSucht_messageException} if it could not be found.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message
	* @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_message findByPrimaryKey(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_messageException;

	/**
	* Returns the t_message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the t_message
	* @return the t_message, or <code>null</code> if a t_message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_message fetchByPrimaryKey(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t_messages.
	*
	* @return the t_messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.message.model.t_message> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_message> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_message> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t_messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t_messages.
	*
	* @return the number of t_messages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}