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

import com.message.NoSucht_studentException;

import com.message.model.impl.t_studentImpl;
import com.message.model.impl.t_studentModelImpl;
import com.message.model.t_student;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t_student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mazhe
 * @see t_studentPersistence
 * @see t_studentUtil
 * @generated
 */
public class t_studentPersistenceImpl extends BasePersistenceImpl<t_student>
	implements t_studentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link t_studentUtil} to access the t_student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = t_studentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentModelImpl.FINDER_CACHE_ENABLED, t_studentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentModelImpl.FINDER_CACHE_ENABLED, t_studentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYUSERNAME =
		new FinderPath(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentModelImpl.FINDER_CACHE_ENABLED, t_studentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfindByUserName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME =
		new FinderPath(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentModelImpl.FINDER_CACHE_ENABLED, t_studentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfindByUserName",
			new String[] { String.class.getName() },
			t_studentModelImpl.USERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDBYUSERNAME = new FinderPath(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfindByUserName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the t_students where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching t_students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_student> findByfindByUserName(String userName)
		throws SystemException {
		return findByfindByUserName(userName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_students where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of t_students
	 * @param end the upper bound of the range of t_students (not inclusive)
	 * @return the range of matching t_students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_student> findByfindByUserName(String userName, int start,
		int end) throws SystemException {
		return findByfindByUserName(userName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_students where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of t_students
	 * @param end the upper bound of the range of t_students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_student> findByfindByUserName(String userName, int start,
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

		List<t_student> list = (List<t_student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (t_student t_student : list) {
				if (!Validator.equals(userName, t_student.getUserName())) {
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

			query.append(_SQL_SELECT_T_STUDENT_WHERE);

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
				query.append(t_studentModelImpl.ORDER_BY_JPQL);
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
					list = (List<t_student>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<t_student>(list);
				}
				else {
					list = (List<t_student>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first t_student in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_student
	 * @throws com.message.NoSucht_studentException if a matching t_student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student findByfindByUserName_First(String userName,
		OrderByComparator orderByComparator)
		throws NoSucht_studentException, SystemException {
		t_student t_student = fetchByfindByUserName_First(userName,
				orderByComparator);

		if (t_student != null) {
			return t_student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucht_studentException(msg.toString());
	}

	/**
	 * Returns the first t_student in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_student, or <code>null</code> if a matching t_student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student fetchByfindByUserName_First(String userName,
		OrderByComparator orderByComparator) throws SystemException {
		List<t_student> list = findByfindByUserName(userName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_student in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_student
	 * @throws com.message.NoSucht_studentException if a matching t_student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student findByfindByUserName_Last(String userName,
		OrderByComparator orderByComparator)
		throws NoSucht_studentException, SystemException {
		t_student t_student = fetchByfindByUserName_Last(userName,
				orderByComparator);

		if (t_student != null) {
			return t_student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucht_studentException(msg.toString());
	}

	/**
	 * Returns the last t_student in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_student, or <code>null</code> if a matching t_student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student fetchByfindByUserName_Last(String userName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfindByUserName(userName);

		if (count == 0) {
			return null;
		}

		List<t_student> list = findByfindByUserName(userName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_students before and after the current t_student in the ordered set where userName = &#63;.
	 *
	 * @param studentId the primary key of the current t_student
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_student
	 * @throws com.message.NoSucht_studentException if a t_student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student[] findByfindByUserName_PrevAndNext(long studentId,
		String userName, OrderByComparator orderByComparator)
		throws NoSucht_studentException, SystemException {
		t_student t_student = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			t_student[] array = new t_studentImpl[3];

			array[0] = getByfindByUserName_PrevAndNext(session, t_student,
					userName, orderByComparator, true);

			array[1] = t_student;

			array[2] = getByfindByUserName_PrevAndNext(session, t_student,
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

	protected t_student getByfindByUserName_PrevAndNext(Session session,
		t_student t_student, String userName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_T_STUDENT_WHERE);

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
			query.append(t_studentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(t_student);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<t_student> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_students where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindByUserName(String userName)
		throws SystemException {
		for (t_student t_student : findByfindByUserName(userName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(t_student);
		}
	}

	/**
	 * Returns the number of t_students where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching t_students
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

			query.append(_SQL_COUNT_T_STUDENT_WHERE);

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

	private static final String _FINDER_COLUMN_FINDBYUSERNAME_USERNAME_1 = "t_student.userName IS NULL";
	private static final String _FINDER_COLUMN_FINDBYUSERNAME_USERNAME_2 = "t_student.userName = ?";
	private static final String _FINDER_COLUMN_FINDBYUSERNAME_USERNAME_3 = "(t_student.userName IS NULL OR t_student.userName = '')";

	public t_studentPersistenceImpl() {
		setModelClass(t_student.class);
	}

	/**
	 * Caches the t_student in the entity cache if it is enabled.
	 *
	 * @param t_student the t_student
	 */
	@Override
	public void cacheResult(t_student t_student) {
		EntityCacheUtil.putResult(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentImpl.class, t_student.getPrimaryKey(), t_student);

		t_student.resetOriginalValues();
	}

	/**
	 * Caches the t_students in the entity cache if it is enabled.
	 *
	 * @param t_students the t_students
	 */
	@Override
	public void cacheResult(List<t_student> t_students) {
		for (t_student t_student : t_students) {
			if (EntityCacheUtil.getResult(
						t_studentModelImpl.ENTITY_CACHE_ENABLED,
						t_studentImpl.class, t_student.getPrimaryKey()) == null) {
				cacheResult(t_student);
			}
			else {
				t_student.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t_students.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(t_studentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(t_studentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t_student.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(t_student t_student) {
		EntityCacheUtil.removeResult(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentImpl.class, t_student.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<t_student> t_students) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (t_student t_student : t_students) {
			EntityCacheUtil.removeResult(t_studentModelImpl.ENTITY_CACHE_ENABLED,
				t_studentImpl.class, t_student.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t_student with the primary key. Does not add the t_student to the database.
	 *
	 * @param studentId the primary key for the new t_student
	 * @return the new t_student
	 */
	@Override
	public t_student create(long studentId) {
		t_student t_student = new t_studentImpl();

		t_student.setNew(true);
		t_student.setPrimaryKey(studentId);

		return t_student;
	}

	/**
	 * Removes the t_student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the t_student
	 * @return the t_student that was removed
	 * @throws com.message.NoSucht_studentException if a t_student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student remove(long studentId)
		throws NoSucht_studentException, SystemException {
		return remove((Serializable)studentId);
	}

	/**
	 * Removes the t_student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t_student
	 * @return the t_student that was removed
	 * @throws com.message.NoSucht_studentException if a t_student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student remove(Serializable primaryKey)
		throws NoSucht_studentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			t_student t_student = (t_student)session.get(t_studentImpl.class,
					primaryKey);

			if (t_student == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSucht_studentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(t_student);
		}
		catch (NoSucht_studentException nsee) {
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
	protected t_student removeImpl(t_student t_student)
		throws SystemException {
		t_student = toUnwrappedModel(t_student);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(t_student)) {
				t_student = (t_student)session.get(t_studentImpl.class,
						t_student.getPrimaryKeyObj());
			}

			if (t_student != null) {
				session.delete(t_student);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (t_student != null) {
			clearCache(t_student);
		}

		return t_student;
	}

	@Override
	public t_student updateImpl(com.message.model.t_student t_student)
		throws SystemException {
		t_student = toUnwrappedModel(t_student);

		boolean isNew = t_student.isNew();

		t_studentModelImpl t_studentModelImpl = (t_studentModelImpl)t_student;

		Session session = null;

		try {
			session = openSession();

			if (t_student.isNew()) {
				session.save(t_student);

				t_student.setNew(false);
			}
			else {
				session.merge(t_student);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !t_studentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((t_studentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						t_studentModelImpl.getOriginalUserName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBYUSERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME,
					args);

				args = new Object[] { t_studentModelImpl.getUserName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBYUSERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYUSERNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(t_studentModelImpl.ENTITY_CACHE_ENABLED,
			t_studentImpl.class, t_student.getPrimaryKey(), t_student);

		return t_student;
	}

	protected t_student toUnwrappedModel(t_student t_student) {
		if (t_student instanceof t_studentImpl) {
			return t_student;
		}

		t_studentImpl t_studentImpl = new t_studentImpl();

		t_studentImpl.setNew(t_student.isNew());
		t_studentImpl.setPrimaryKey(t_student.getPrimaryKey());

		t_studentImpl.setStudentId(t_student.getStudentId());
		t_studentImpl.setGroupId(t_student.getGroupId());
		t_studentImpl.setCompanyId(t_student.getCompanyId());
		t_studentImpl.setUserId(t_student.getUserId());
		t_studentImpl.setUserName(t_student.getUserName());
		t_studentImpl.setPasswd(t_student.getPasswd());

		return t_studentImpl;
	}

	/**
	 * Returns the t_student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_student
	 * @return the t_student
	 * @throws com.message.NoSucht_studentException if a t_student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student findByPrimaryKey(Serializable primaryKey)
		throws NoSucht_studentException, SystemException {
		t_student t_student = fetchByPrimaryKey(primaryKey);

		if (t_student == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSucht_studentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return t_student;
	}

	/**
	 * Returns the t_student with the primary key or throws a {@link com.message.NoSucht_studentException} if it could not be found.
	 *
	 * @param studentId the primary key of the t_student
	 * @return the t_student
	 * @throws com.message.NoSucht_studentException if a t_student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student findByPrimaryKey(long studentId)
		throws NoSucht_studentException, SystemException {
		return findByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns the t_student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_student
	 * @return the t_student, or <code>null</code> if a t_student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		t_student t_student = (t_student)EntityCacheUtil.getResult(t_studentModelImpl.ENTITY_CACHE_ENABLED,
				t_studentImpl.class, primaryKey);

		if (t_student == _nullt_student) {
			return null;
		}

		if (t_student == null) {
			Session session = null;

			try {
				session = openSession();

				t_student = (t_student)session.get(t_studentImpl.class,
						primaryKey);

				if (t_student != null) {
					cacheResult(t_student);
				}
				else {
					EntityCacheUtil.putResult(t_studentModelImpl.ENTITY_CACHE_ENABLED,
						t_studentImpl.class, primaryKey, _nullt_student);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(t_studentModelImpl.ENTITY_CACHE_ENABLED,
					t_studentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return t_student;
	}

	/**
	 * Returns the t_student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the t_student
	 * @return the t_student, or <code>null</code> if a t_student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public t_student fetchByPrimaryKey(long studentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns all the t_students.
	 *
	 * @return the t_students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_student> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_students
	 * @param end the upper bound of the range of t_students (not inclusive)
	 * @return the range of t_students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_student> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_students
	 * @param end the upper bound of the range of t_students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<t_student> findAll(int start, int end,
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

		List<t_student> list = (List<t_student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_T_STUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_T_STUDENT;

				if (pagination) {
					sql = sql.concat(t_studentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<t_student>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<t_student>(list);
				}
				else {
					list = (List<t_student>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the t_students from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (t_student t_student : findAll()) {
			remove(t_student);
		}
	}

	/**
	 * Returns the number of t_students.
	 *
	 * @return the number of t_students
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

				Query q = session.createQuery(_SQL_COUNT_T_STUDENT);

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
	 * Initializes the t_student persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.message.model.t_student")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<t_student>> listenersList = new ArrayList<ModelListener<t_student>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<t_student>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(t_studentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_T_STUDENT = "SELECT t_student FROM t_student t_student";
	private static final String _SQL_SELECT_T_STUDENT_WHERE = "SELECT t_student FROM t_student t_student WHERE ";
	private static final String _SQL_COUNT_T_STUDENT = "SELECT COUNT(t_student) FROM t_student t_student";
	private static final String _SQL_COUNT_T_STUDENT_WHERE = "SELECT COUNT(t_student) FROM t_student t_student WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "t_student.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No t_student exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No t_student exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(t_studentPersistenceImpl.class);
	private static t_student _nullt_student = new t_studentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<t_student> toCacheModel() {
				return _nullt_studentCacheModel;
			}
		};

	private static CacheModel<t_student> _nullt_studentCacheModel = new CacheModel<t_student>() {
			@Override
			public t_student toEntityModel() {
				return _nullt_student;
			}
		};
}