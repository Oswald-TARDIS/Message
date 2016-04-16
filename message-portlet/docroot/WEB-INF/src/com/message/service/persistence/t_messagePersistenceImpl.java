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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.message.NoSucht_messageException;

import com.message.model.impl.t_messageImpl;
import com.message.model.impl.t_messageModelImpl;
import com.message.model.t_message;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t_message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mazhe
 * @see t_messagePersistence
 * @see t_messageUtil
 * @generated
 */
public class t_messagePersistenceImpl extends BasePersistenceImpl<t_message>
	implements t_messagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link t_messageUtil} to access the t_message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = t_messageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageModelImpl.FINDER_CACHE_ENABLED, t_messageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageModelImpl.FINDER_CACHE_ENABLED, t_messageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYID = new FinderPath(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageModelImpl.FINDER_CACHE_ENABLED, t_messageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfindById",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYID =
		new FinderPath(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageModelImpl.FINDER_CACHE_ENABLED, t_messageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfindById",
			new String[] { Long.class.getName() },
			t_messageModelImpl.MESSAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDBYID = new FinderPath(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfindById",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t_messages where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the matching t_messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_message> findByfindById(long messageId)
		throws SystemException {
		return findByfindById(messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<t_message> findByfindById(long messageId, int start, int end)
		throws SystemException {
		return findByfindById(messageId, start, end, null);
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
	@Override
	public List<t_message> findByfindById(long messageId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYID;
			finderArgs = new Object[] { messageId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYID;
			finderArgs = new Object[] { messageId, start, end, orderByComparator };
		}

		List<t_message> list = (List<t_message>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (t_message t_message : list) {
				if ((messageId != t_message.getMessageId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_T_MESSAGE_WHERE);

			query.append(_FINDER_COLUMN_FINDBYID_MESSAGEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(t_messageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(messageId);

				if (!pagination) {
					list = (List<t_message>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<t_message>(list);
				}
				else {
					list = (List<t_message>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public t_message findByfindById_First(long messageId,
		OrderByComparator orderByComparator)
		throws NoSucht_messageException, SystemException {
		t_message t_message = fetchByfindById_First(messageId, orderByComparator);

		if (t_message != null) {
			return t_message;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucht_messageException(msg.toString());
	}

	/**
	 * Returns the first t_message in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_message, or <code>null</code> if a matching t_message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message fetchByfindById_First(long messageId,
		OrderByComparator orderByComparator) throws SystemException {
		List<t_message> list = findByfindById(messageId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public t_message findByfindById_Last(long messageId,
		OrderByComparator orderByComparator)
		throws NoSucht_messageException, SystemException {
		t_message t_message = fetchByfindById_Last(messageId, orderByComparator);

		if (t_message != null) {
			return t_message;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucht_messageException(msg.toString());
	}

	/**
	 * Returns the last t_message in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_message, or <code>null</code> if a matching t_message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message fetchByfindById_Last(long messageId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfindById(messageId);

		if (count == 0) {
			return null;
		}

		List<t_message> list = findByfindById(messageId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the t_messages where messageId = &#63; from the database.
	 *
	 * @param messageId the message ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindById(long messageId) throws SystemException {
		for (t_message t_message : findByfindById(messageId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(t_message);
		}
	}

	/**
	 * Returns the number of t_messages where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the number of matching t_messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindById(long messageId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDBYID;

		Object[] finderArgs = new Object[] { messageId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_T_MESSAGE_WHERE);

			query.append(_FINDER_COLUMN_FINDBYID_MESSAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(messageId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FINDBYID_MESSAGEID_2 = "t_message.messageId = ?";

	public t_messagePersistenceImpl() {
		setModelClass(t_message.class);
	}

	/**
	 * Caches the t_message in the entity cache if it is enabled.
	 *
	 * @param t_message the t_message
	 */
	@Override
	public void cacheResult(t_message t_message) {
		EntityCacheUtil.putResult(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageImpl.class, t_message.getPrimaryKey(), t_message);

		t_message.resetOriginalValues();
	}

	/**
	 * Caches the t_messages in the entity cache if it is enabled.
	 *
	 * @param t_messages the t_messages
	 */
	@Override
	public void cacheResult(List<t_message> t_messages) {
		for (t_message t_message : t_messages) {
			if (EntityCacheUtil.getResult(
						t_messageModelImpl.ENTITY_CACHE_ENABLED,
						t_messageImpl.class, t_message.getPrimaryKey()) == null) {
				cacheResult(t_message);
			}
			else {
				t_message.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t_messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(t_messageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(t_messageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t_message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(t_message t_message) {
		EntityCacheUtil.removeResult(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageImpl.class, t_message.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<t_message> t_messages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (t_message t_message : t_messages) {
			EntityCacheUtil.removeResult(t_messageModelImpl.ENTITY_CACHE_ENABLED,
				t_messageImpl.class, t_message.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t_message with the primary key. Does not add the t_message to the database.
	 *
	 * @param messageId the primary key for the new t_message
	 * @return the new t_message
	 */
	@Override
	public t_message create(long messageId) {
		t_message t_message = new t_messageImpl();

		t_message.setNew(true);
		t_message.setPrimaryKey(messageId);

		return t_message;
	}

	/**
	 * Removes the t_message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param messageId the primary key of the t_message
	 * @return the t_message that was removed
	 * @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message remove(long messageId)
		throws NoSucht_messageException, SystemException {
		return remove((Serializable)messageId);
	}

	/**
	 * Removes the t_message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t_message
	 * @return the t_message that was removed
	 * @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message remove(Serializable primaryKey)
		throws NoSucht_messageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			t_message t_message = (t_message)session.get(t_messageImpl.class,
					primaryKey);

			if (t_message == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSucht_messageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(t_message);
		}
		catch (NoSucht_messageException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected t_message removeImpl(t_message t_message)
		throws SystemException {
		t_message = toUnwrappedModel(t_message);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(t_message)) {
				t_message = (t_message)session.get(t_messageImpl.class,
						t_message.getPrimaryKeyObj());
			}

			if (t_message != null) {
				session.delete(t_message);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (t_message != null) {
			clearCache(t_message);
		}

		return t_message;
	}

	@Override
	public t_message updateImpl(com.message.model.t_message t_message)
		throws SystemException {
		t_message = toUnwrappedModel(t_message);

		boolean isNew = t_message.isNew();

		t_messageModelImpl t_messageModelImpl = (t_messageModelImpl)t_message;

		Session session = null;

		try {
			session = openSession();

			if (t_message.isNew()) {
				session.save(t_message);

				t_message.setNew(false);
			}
			else {
				session.merge(t_message);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !t_messageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((t_messageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						t_messageModelImpl.getOriginalMessageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBYID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYID,
					args);

				args = new Object[] { t_messageModelImpl.getMessageId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBYID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYID,
					args);
			}
		}

		EntityCacheUtil.putResult(t_messageModelImpl.ENTITY_CACHE_ENABLED,
			t_messageImpl.class, t_message.getPrimaryKey(), t_message);

		return t_message;
	}

	protected t_message toUnwrappedModel(t_message t_message) {
		if (t_message instanceof t_messageImpl) {
			return t_message;
		}

		t_messageImpl t_messageImpl = new t_messageImpl();

		t_messageImpl.setNew(t_message.isNew());
		t_messageImpl.setPrimaryKey(t_message.getPrimaryKey());

		t_messageImpl.setMessageId(t_message.getMessageId());
		t_messageImpl.setGroupId(t_message.getGroupId());
		t_messageImpl.setCompanyId(t_message.getCompanyId());

		return t_messageImpl;
	}

	/**
	 * Returns the t_message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_message
	 * @return the t_message
	 * @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message findByPrimaryKey(Serializable primaryKey)
		throws NoSucht_messageException, SystemException {
		t_message t_message = fetchByPrimaryKey(primaryKey);

		if (t_message == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSucht_messageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return t_message;
	}

	/**
	 * Returns the t_message with the primary key or throws a {@link com.message.NoSucht_messageException} if it could not be found.
	 *
	 * @param messageId the primary key of the t_message
	 * @return the t_message
	 * @throws com.message.NoSucht_messageException if a t_message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message findByPrimaryKey(long messageId)
		throws NoSucht_messageException, SystemException {
		return findByPrimaryKey((Serializable)messageId);
	}

	/**
	 * Returns the t_message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_message
	 * @return the t_message, or <code>null</code> if a t_message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		t_message t_message = (t_message)EntityCacheUtil.getResult(t_messageModelImpl.ENTITY_CACHE_ENABLED,
				t_messageImpl.class, primaryKey);

		if (t_message == _nullt_message) {
			return null;
		}

		if (t_message == null) {
			Session session = null;

			try {
				session = openSession();

				t_message = (t_message)session.get(t_messageImpl.class,
						primaryKey);

				if (t_message != null) {
					cacheResult(t_message);
				}
				else {
					EntityCacheUtil.putResult(t_messageModelImpl.ENTITY_CACHE_ENABLED,
						t_messageImpl.class, primaryKey, _nullt_message);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(t_messageModelImpl.ENTITY_CACHE_ENABLED,
					t_messageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return t_message;
	}

	/**
	 * Returns the t_message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param messageId the primary key of the t_message
	 * @return the t_message, or <code>null</code> if a t_message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_message fetchByPrimaryKey(long messageId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)messageId);
	}

	/**
	 * Returns all the t_messages.
	 *
	 * @return the t_messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_message> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<t_message> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<t_message> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<t_message> list = (List<t_message>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_T_MESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_T_MESSAGE;

				if (pagination) {
					sql = sql.concat(t_messageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<t_message>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<t_message>(list);
				}
				else {
					list = (List<t_message>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the t_messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (t_message t_message : findAll()) {
			remove(t_message);
		}
	}

	/**
	 * Returns the number of t_messages.
	 *
	 * @return the number of t_messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_T_MESSAGE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the t_message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.message.model.t_message")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<t_message>> listenersList = new ArrayList<ModelListener<t_message>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<t_message>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(t_messageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_T_MESSAGE = "SELECT t_message FROM t_message t_message";
	private static final String _SQL_SELECT_T_MESSAGE_WHERE = "SELECT t_message FROM t_message t_message WHERE ";
	private static final String _SQL_COUNT_T_MESSAGE = "SELECT COUNT(t_message) FROM t_message t_message";
	private static final String _SQL_COUNT_T_MESSAGE_WHERE = "SELECT COUNT(t_message) FROM t_message t_message WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "t_message.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No t_message exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No t_message exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(t_messagePersistenceImpl.class);
	private static t_message _nullt_message = new t_messageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<t_message> toCacheModel() {
				return _nullt_messageCacheModel;
			}
		};

	private static CacheModel<t_message> _nullt_messageCacheModel = new CacheModel<t_message>() {
			@Override
			public t_message toEntityModel() {
				return _nullt_message;
			}
		};
}