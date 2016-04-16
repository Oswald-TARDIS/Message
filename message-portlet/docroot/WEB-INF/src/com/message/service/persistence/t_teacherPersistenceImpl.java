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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.message.NoSucht_teacherException;

import com.message.model.impl.t_teacherImpl;
import com.message.model.impl.t_teacherModelImpl;
import com.message.model.t_teacher;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t_teacher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mazhe
 * @see t_teacherPersistence
 * @see t_teacherUtil
 * @generated
 */
public class t_teacherPersistenceImpl extends BasePersistenceImpl<t_teacher>
	implements t_teacherPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link t_teacherUtil} to access the t_teacher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = t_teacherImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherModelImpl.FINDER_CACHE_ENABLED, t_teacherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherModelImpl.FINDER_CACHE_ENABLED, t_teacherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYUSERNAME =
		new FinderPath(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherModelImpl.FINDER_CACHE_ENABLED, t_teacherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfindByUserName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME =
		new FinderPath(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherModelImpl.FINDER_CACHE_ENABLED, t_teacherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfindByUserName",
			new String[] { String.class.getName() },
			t_teacherModelImpl.USERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDBYUSERNAME = new FinderPath(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfindByUserName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the t_teachers where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching t_teachers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_teacher> findByfindByUserName(String userName)
		throws SystemException {
		return findByfindByUserName(userName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_teachers where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_teacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of t_teachers
	 * @param end the upper bound of the range of t_teachers (not inclusive)
	 * @return the range of matching t_teachers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_teacher> findByfindByUserName(String userName, int start,
		int end) throws SystemException {
		return findByfindByUserName(userName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_teachers where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_teacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of t_teachers
	 * @param end the upper bound of the range of t_teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_teachers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_teacher> findByfindByUserName(String userName, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME;
			finderArgs = new Object[] { userName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYUSERNAME;
			finderArgs = new Object[] { userName, start, end, orderByComparator };
		}

		List<t_teacher> list = (List<t_teacher>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (t_teacher t_teacher : list) {
				if (!Validator.equals(userName, t_teacher.getUserName())) {
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

			query.append(_SQL_SELECT_T_TEACHER_WHERE);

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(t_teacherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserName) {
					qPos.add(userName);
				}

				if (!pagination) {
					list = (List<t_teacher>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<t_teacher>(list);
				}
				else {
					list = (List<t_teacher>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first t_teacher in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_teacher
	 * @throws com.message.NoSucht_teacherException if a matching t_teacher could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher findByfindByUserName_First(String userName,
		OrderByComparator orderByComparator)
		throws NoSucht_teacherException, SystemException {
		t_teacher t_teacher = fetchByfindByUserName_First(userName,
				orderByComparator);

		if (t_teacher != null) {
			return t_teacher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucht_teacherException(msg.toString());
	}

	/**
	 * Returns the first t_teacher in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_teacher, or <code>null</code> if a matching t_teacher could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher fetchByfindByUserName_First(String userName,
		OrderByComparator orderByComparator) throws SystemException {
		List<t_teacher> list = findByfindByUserName(userName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_teacher in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_teacher
	 * @throws com.message.NoSucht_teacherException if a matching t_teacher could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher findByfindByUserName_Last(String userName,
		OrderByComparator orderByComparator)
		throws NoSucht_teacherException, SystemException {
		t_teacher t_teacher = fetchByfindByUserName_Last(userName,
				orderByComparator);

		if (t_teacher != null) {
			return t_teacher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucht_teacherException(msg.toString());
	}

	/**
	 * Returns the last t_teacher in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_teacher, or <code>null</code> if a matching t_teacher could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher fetchByfindByUserName_Last(String userName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfindByUserName(userName);

		if (count == 0) {
			return null;
		}

		List<t_teacher> list = findByfindByUserName(userName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_teachers before and after the current t_teacher in the ordered set where userName = &#63;.
	 *
	 * @param teacherId the primary key of the current t_teacher
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_teacher
	 * @throws com.message.NoSucht_teacherException if a t_teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher[] findByfindByUserName_PrevAndNext(long teacherId,
		String userName, OrderByComparator orderByComparator)
		throws NoSucht_teacherException, SystemException {
		t_teacher t_teacher = findByPrimaryKey(teacherId);

		Session session = null;

		try {
			session = openSession();

			t_teacher[] array = new t_teacherImpl[3];

			array[0] = getByfindByUserName_PrevAndNext(session, t_teacher,
					userName, orderByComparator, true);

			array[1] = t_teacher;

			array[2] = getByfindByUserName_PrevAndNext(session, t_teacher,
					userName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected t_teacher getByfindByUserName_PrevAndNext(Session session,
		t_teacher t_teacher, String userName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_T_TEACHER_WHERE);

		boolean bindUserName = false;

		if (userName == null) {
			query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_1);
		}
		else if (userName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_3);
		}
		else {
			bindUserName = true;

			query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(t_teacherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUserName) {
			qPos.add(userName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(t_teacher);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<t_teacher> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_teachers where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindByUserName(String userName)
		throws SystemException {
		for (t_teacher t_teacher : findByfindByUserName(userName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(t_teacher);
		}
	}

	/**
	 * Returns the number of t_teachers where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching t_teachers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindByUserName(String userName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDBYUSERNAME;

		Object[] finderArgs = new Object[] { userName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_T_TEACHER_WHERE);

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_FINDBYUSERNAME_USERNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserName) {
					qPos.add(userName);
				}

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

	private static final String _FINDER_COLUMN_FINDBYUSERNAME_USERNAME_1 = "t_teacher.userName IS NULL";
	private static final String _FINDER_COLUMN_FINDBYUSERNAME_USERNAME_2 = "t_teacher.userName = ?";
	private static final String _FINDER_COLUMN_FINDBYUSERNAME_USERNAME_3 = "(t_teacher.userName IS NULL OR t_teacher.userName = '')";

	public t_teacherPersistenceImpl() {
		setModelClass(t_teacher.class);
	}

	/**
	 * Caches the t_teacher in the entity cache if it is enabled.
	 *
	 * @param t_teacher the t_teacher
	 */
	@Override
	public void cacheResult(t_teacher t_teacher) {
		EntityCacheUtil.putResult(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherImpl.class, t_teacher.getPrimaryKey(), t_teacher);

		t_teacher.resetOriginalValues();
	}

	/**
	 * Caches the t_teachers in the entity cache if it is enabled.
	 *
	 * @param t_teachers the t_teachers
	 */
	@Override
	public void cacheResult(List<t_teacher> t_teachers) {
		for (t_teacher t_teacher : t_teachers) {
			if (EntityCacheUtil.getResult(
						t_teacherModelImpl.ENTITY_CACHE_ENABLED,
						t_teacherImpl.class, t_teacher.getPrimaryKey()) == null) {
				cacheResult(t_teacher);
			}
			else {
				t_teacher.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t_teachers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(t_teacherImpl.class.getName());
		}

		EntityCacheUtil.clearCache(t_teacherImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t_teacher.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(t_teacher t_teacher) {
		EntityCacheUtil.removeResult(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherImpl.class, t_teacher.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<t_teacher> t_teachers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (t_teacher t_teacher : t_teachers) {
			EntityCacheUtil.removeResult(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
				t_teacherImpl.class, t_teacher.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t_teacher with the primary key. Does not add the t_teacher to the database.
	 *
	 * @param teacherId the primary key for the new t_teacher
	 * @return the new t_teacher
	 */
	@Override
	public t_teacher create(long teacherId) {
		t_teacher t_teacher = new t_teacherImpl();

		t_teacher.setNew(true);
		t_teacher.setPrimaryKey(teacherId);

		return t_teacher;
	}

	/**
	 * Removes the t_teacher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teacherId the primary key of the t_teacher
	 * @return the t_teacher that was removed
	 * @throws com.message.NoSucht_teacherException if a t_teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher remove(long teacherId)
		throws NoSucht_teacherException, SystemException {
		return remove((Serializable)teacherId);
	}

	/**
	 * Removes the t_teacher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t_teacher
	 * @return the t_teacher that was removed
	 * @throws com.message.NoSucht_teacherException if a t_teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher remove(Serializable primaryKey)
		throws NoSucht_teacherException, SystemException {
		Session session = null;

		try {
			session = openSession();

			t_teacher t_teacher = (t_teacher)session.get(t_teacherImpl.class,
					primaryKey);

			if (t_teacher == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSucht_teacherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(t_teacher);
		}
		catch (NoSucht_teacherException nsee) {
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
	protected t_teacher removeImpl(t_teacher t_teacher)
		throws SystemException {
		t_teacher = toUnwrappedModel(t_teacher);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(t_teacher)) {
				t_teacher = (t_teacher)session.get(t_teacherImpl.class,
						t_teacher.getPrimaryKeyObj());
			}

			if (t_teacher != null) {
				session.delete(t_teacher);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (t_teacher != null) {
			clearCache(t_teacher);
		}

		return t_teacher;
	}

	@Override
	public t_teacher updateImpl(com.message.model.t_teacher t_teacher)
		throws SystemException {
		t_teacher = toUnwrappedModel(t_teacher);

		boolean isNew = t_teacher.isNew();

		t_teacherModelImpl t_teacherModelImpl = (t_teacherModelImpl)t_teacher;

		Session session = null;

		try {
			session = openSession();

			if (t_teacher.isNew()) {
				session.save(t_teacher);

				t_teacher.setNew(false);
			}
			else {
				session.merge(t_teacher);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !t_teacherModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((t_teacherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						t_teacherModelImpl.getOriginalUserName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBYUSERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME,
					args);

				args = new Object[] { t_teacherModelImpl.getUserName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBYUSERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
			t_teacherImpl.class, t_teacher.getPrimaryKey(), t_teacher);

		return t_teacher;
	}

	protected t_teacher toUnwrappedModel(t_teacher t_teacher) {
		if (t_teacher instanceof t_teacherImpl) {
			return t_teacher;
		}

		t_teacherImpl t_teacherImpl = new t_teacherImpl();

		t_teacherImpl.setNew(t_teacher.isNew());
		t_teacherImpl.setPrimaryKey(t_teacher.getPrimaryKey());

		t_teacherImpl.setTeacherId(t_teacher.getTeacherId());
		t_teacherImpl.setGroupId(t_teacher.getGroupId());
		t_teacherImpl.setCompanyId(t_teacher.getCompanyId());
		t_teacherImpl.setUserId(t_teacher.getUserId());
		t_teacherImpl.setUserName(t_teacher.getUserName());
		t_teacherImpl.setPasswd(t_teacher.getPasswd());

		return t_teacherImpl;
	}

	/**
	 * Returns the t_teacher with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_teacher
	 * @return the t_teacher
	 * @throws com.message.NoSucht_teacherException if a t_teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher findByPrimaryKey(Serializable primaryKey)
		throws NoSucht_teacherException, SystemException {
		t_teacher t_teacher = fetchByPrimaryKey(primaryKey);

		if (t_teacher == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSucht_teacherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return t_teacher;
	}

	/**
	 * Returns the t_teacher with the primary key or throws a {@link com.message.NoSucht_teacherException} if it could not be found.
	 *
	 * @param teacherId the primary key of the t_teacher
	 * @return the t_teacher
	 * @throws com.message.NoSucht_teacherException if a t_teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher findByPrimaryKey(long teacherId)
		throws NoSucht_teacherException, SystemException {
		return findByPrimaryKey((Serializable)teacherId);
	}

	/**
	 * Returns the t_teacher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_teacher
	 * @return the t_teacher, or <code>null</code> if a t_teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		t_teacher t_teacher = (t_teacher)EntityCacheUtil.getResult(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
				t_teacherImpl.class, primaryKey);

		if (t_teacher == _nullt_teacher) {
			return null;
		}

		if (t_teacher == null) {
			Session session = null;

			try {
				session = openSession();

				t_teacher = (t_teacher)session.get(t_teacherImpl.class,
						primaryKey);

				if (t_teacher != null) {
					cacheResult(t_teacher);
				}
				else {
					EntityCacheUtil.putResult(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
						t_teacherImpl.class, primaryKey, _nullt_teacher);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(t_teacherModelImpl.ENTITY_CACHE_ENABLED,
					t_teacherImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return t_teacher;
	}

	/**
	 * Returns the t_teacher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param teacherId the primary key of the t_teacher
	 * @return the t_teacher, or <code>null</code> if a t_teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_teacher fetchByPrimaryKey(long teacherId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)teacherId);
	}

	/**
	 * Returns all the t_teachers.
	 *
	 * @return the t_teachers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_teacher> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_teacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_teachers
	 * @param end the upper bound of the range of t_teachers (not inclusive)
	 * @return the range of t_teachers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_teacher> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_teacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_teachers
	 * @param end the upper bound of the range of t_teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_teachers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_teacher> findAll(int start, int end,
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

		List<t_teacher> list = (List<t_teacher>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_T_TEACHER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_T_TEACHER;

				if (pagination) {
					sql = sql.concat(t_teacherModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<t_teacher>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<t_teacher>(list);
				}
				else {
					list = (List<t_teacher>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the t_teachers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (t_teacher t_teacher : findAll()) {
			remove(t_teacher);
		}
	}

	/**
	 * Returns the number of t_teachers.
	 *
	 * @return the number of t_teachers
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

				Query q = session.createQuery(_SQL_COUNT_T_TEACHER);

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
	 * Initializes the t_teacher persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.message.model.t_teacher")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<t_teacher>> listenersList = new ArrayList<ModelListener<t_teacher>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<t_teacher>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(t_teacherImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_T_TEACHER = "SELECT t_teacher FROM t_teacher t_teacher";
	private static final String _SQL_SELECT_T_TEACHER_WHERE = "SELECT t_teacher FROM t_teacher t_teacher WHERE ";
	private static final String _SQL_COUNT_T_TEACHER = "SELECT COUNT(t_teacher) FROM t_teacher t_teacher";
	private static final String _SQL_COUNT_T_TEACHER_WHERE = "SELECT COUNT(t_teacher) FROM t_teacher t_teacher WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "t_teacher.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No t_teacher exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No t_teacher exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(t_teacherPersistenceImpl.class);
	private static t_teacher _nullt_teacher = new t_teacherImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<t_teacher> toCacheModel() {
				return _nullt_teacherCacheModel;
			}
		};

	private static CacheModel<t_teacher> _nullt_teacherCacheModel = new CacheModel<t_teacher>() {
			@Override
			public t_teacher toEntityModel() {
				return _nullt_teacher;
			}
		};
}