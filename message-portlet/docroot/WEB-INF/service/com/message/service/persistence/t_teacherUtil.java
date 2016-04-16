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

import com.message.model.t_teacher;

import java.util.List;

/**
 * The persistence utility for the t_teacher service. This utility wraps {@link t_teacherPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mazhe
 * @see t_teacherPersistence
 * @see t_teacherPersistenceImpl
 * @generated
 */
public class t_teacherUtil {
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
	public static void clearCache(t_teacher t_teacher) {
		getPersistence().clearCache(t_teacher);
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
	public static List<t_teacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<t_teacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<t_teacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static t_teacher update(t_teacher t_teacher)
		throws SystemException {
		return getPersistence().update(t_teacher);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static t_teacher update(t_teacher t_teacher,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(t_teacher, serviceContext);
	}

	/**
	* Returns all the t_teachers where userName = &#63;.
	*
	* @param userName the user name
	* @return the matching t_teachers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.message.model.t_teacher> findByfindByUserName(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfindByUserName(userName);
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
	public static java.util.List<com.message.model.t_teacher> findByfindByUserName(
		java.lang.String userName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfindByUserName(userName, start, end);
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
	public static java.util.List<com.message.model.t_teacher> findByfindByUserName(
		java.lang.String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindByUserName(userName, start, end, orderByComparator);
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
	public static com.message.model.t_teacher findByfindByUserName_First(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_teacherException {
		return getPersistence()
				   .findByfindByUserName_First(userName, orderByComparator);
	}

	/**
	* Returns the first t_teacher in the ordered set where userName = &#63;.
	*
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t_teacher, or <code>null</code> if a matching t_teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_teacher fetchByfindByUserName_First(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindByUserName_First(userName, orderByComparator);
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
	public static com.message.model.t_teacher findByfindByUserName_Last(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_teacherException {
		return getPersistence()
				   .findByfindByUserName_Last(userName, orderByComparator);
	}

	/**
	* Returns the last t_teacher in the ordered set where userName = &#63;.
	*
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t_teacher, or <code>null</code> if a matching t_teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_teacher fetchByfindByUserName_Last(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindByUserName_Last(userName, orderByComparator);
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
	public static com.message.model.t_teacher[] findByfindByUserName_PrevAndNext(
		long teacherId, java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_teacherException {
		return getPersistence()
				   .findByfindByUserName_PrevAndNext(teacherId, userName,
			orderByComparator);
	}

	/**
	* Removes all the t_teachers where userName = &#63; from the database.
	*
	* @param userName the user name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindByUserName(java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfindByUserName(userName);
	}

	/**
	* Returns the number of t_teachers where userName = &#63;.
	*
	* @param userName the user name
	* @return the number of matching t_teachers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindByUserName(java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfindByUserName(userName);
	}

	/**
	* Caches the t_teacher in the entity cache if it is enabled.
	*
	* @param t_teacher the t_teacher
	*/
	public static void cacheResult(com.message.model.t_teacher t_teacher) {
		getPersistence().cacheResult(t_teacher);
	}

	/**
	* Caches the t_teachers in the entity cache if it is enabled.
	*
	* @param t_teachers the t_teachers
	*/
	public static void cacheResult(
		java.util.List<com.message.model.t_teacher> t_teachers) {
		getPersistence().cacheResult(t_teachers);
	}

	/**
	* Creates a new t_teacher with the primary key. Does not add the t_teacher to the database.
	*
	* @param teacherId the primary key for the new t_teacher
	* @return the new t_teacher
	*/
	public static com.message.model.t_teacher create(long teacherId) {
		return getPersistence().create(teacherId);
	}

	/**
	* Removes the t_teacher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teacherId the primary key of the t_teacher
	* @return the t_teacher that was removed
	* @throws com.message.NoSucht_teacherException if a t_teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_teacher remove(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_teacherException {
		return getPersistence().remove(teacherId);
	}

	public static com.message.model.t_teacher updateImpl(
		com.message.model.t_teacher t_teacher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(t_teacher);
	}

	/**
	* Returns the t_teacher with the primary key or throws a {@link com.message.NoSucht_teacherException} if it could not be found.
	*
	* @param teacherId the primary key of the t_teacher
	* @return the t_teacher
	* @throws com.message.NoSucht_teacherException if a t_teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_teacher findByPrimaryKey(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_teacherException {
		return getPersistence().findByPrimaryKey(teacherId);
	}

	/**
	* Returns the t_teacher with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param teacherId the primary key of the t_teacher
	* @return the t_teacher, or <code>null</code> if a t_teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.message.model.t_teacher fetchByPrimaryKey(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(teacherId);
	}

	/**
	* Returns all the t_teachers.
	*
	* @return the t_teachers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.message.model.t_teacher> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.message.model.t_teacher> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.message.model.t_teacher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t_teachers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of t_teachers.
	*
	* @return the number of t_teachers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static t_teacherPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (t_teacherPersistence)PortletBeanLocatorUtil.locate(com.message.service.ClpSerializer.getServletContextName(),
					t_teacherPersistence.class.getName());

			ReferenceRegistry.registerReference(t_teacherUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(t_teacherPersistence persistence) {
	}

	private static t_teacherPersistence _persistence;
}