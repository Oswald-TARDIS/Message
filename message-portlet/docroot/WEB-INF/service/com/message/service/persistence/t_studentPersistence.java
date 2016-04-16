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

import com.message.model.t_student;

/**
 * The persistence interface for the t_student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mazhe
 * @see t_studentPersistenceImpl
 * @see t_studentUtil
 * @generated
 */
public interface t_studentPersistence extends BasePersistence<t_student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link t_studentUtil} to access the t_student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the t_students where userName = &#63;.
	*
	* @param userName the user name
	* @return the matching t_students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.message.model.t_student> findByfindByUserName(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_student> findByfindByUserName(
		java.lang.String userName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_student> findByfindByUserName(
		java.lang.String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t_student in the ordered set where userName = &#63;.
	*
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t_student
	* @throws com.message.NoSucht_studentException if a matching t_student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_student findByfindByUserName_First(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_studentException;

	/**
	* Returns the first t_student in the ordered set where userName = &#63;.
	*
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t_student, or <code>null</code> if a matching t_student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_student fetchByfindByUserName_First(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t_student in the ordered set where userName = &#63;.
	*
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t_student
	* @throws com.message.NoSucht_studentException if a matching t_student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_student findByfindByUserName_Last(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_studentException;

	/**
	* Returns the last t_student in the ordered set where userName = &#63;.
	*
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t_student, or <code>null</code> if a matching t_student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_student fetchByfindByUserName_Last(
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.message.model.t_student[] findByfindByUserName_PrevAndNext(
		long studentId, java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_studentException;

	/**
	* Removes all the t_students where userName = &#63; from the database.
	*
	* @param userName the user name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfindByUserName(java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t_students where userName = &#63;.
	*
	* @param userName the user name
	* @return the number of matching t_students
	* @throws SystemException if a system exception occurred
	*/
	public int countByfindByUserName(java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the t_student in the entity cache if it is enabled.
	*
	* @param t_student the t_student
	*/
	public void cacheResult(com.message.model.t_student t_student);

	/**
	* Caches the t_students in the entity cache if it is enabled.
	*
	* @param t_students the t_students
	*/
	public void cacheResult(
		java.util.List<com.message.model.t_student> t_students);

	/**
	* Creates a new t_student with the primary key. Does not add the t_student to the database.
	*
	* @param studentId the primary key for the new t_student
	* @return the new t_student
	*/
	public com.message.model.t_student create(long studentId);

	/**
	* Removes the t_student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the t_student
	* @return the t_student that was removed
	* @throws com.message.NoSucht_studentException if a t_student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_student remove(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_studentException;

	public com.message.model.t_student updateImpl(
		com.message.model.t_student t_student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t_student with the primary key or throws a {@link com.message.NoSucht_studentException} if it could not be found.
	*
	* @param studentId the primary key of the t_student
	* @return the t_student
	* @throws com.message.NoSucht_studentException if a t_student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_student findByPrimaryKey(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.message.NoSucht_studentException;

	/**
	* Returns the t_student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the t_student
	* @return the t_student, or <code>null</code> if a t_student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.message.model.t_student fetchByPrimaryKey(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t_students.
	*
	* @return the t_students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.message.model.t_student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_student> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.message.model.t_student> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t_students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t_students.
	*
	* @return the number of t_students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}