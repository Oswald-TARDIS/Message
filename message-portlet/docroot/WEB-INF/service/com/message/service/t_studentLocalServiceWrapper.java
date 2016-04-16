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
 * Provides a wrapper for {@link t_studentLocalService}.
 *
 * @author mazhe
 * @see t_studentLocalService
 * @generated
 */
public class t_studentLocalServiceWrapper implements t_studentLocalService,
	ServiceWrapper<t_studentLocalService> {
	public t_studentLocalServiceWrapper(
		t_studentLocalService t_studentLocalService) {
		_t_studentLocalService = t_studentLocalService;
	}

	/**
	* Adds the t_student to the database. Also notifies the appropriate model listeners.
	*
	* @param t_student the t_student
	* @return the t_student that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_student addt_student(
		com.message.model.t_student t_student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.addt_student(t_student);
	}

	/**
	* Creates a new t_student with the primary key. Does not add the t_student to the database.
	*
	* @param studentId the primary key for the new t_student
	* @return the new t_student
	*/
	@Override
	public com.message.model.t_student createt_student(long studentId) {
		return _t_studentLocalService.createt_student(studentId);
	}

	/**
	* Deletes the t_student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the t_student
	* @return the t_student that was removed
	* @throws PortalException if a t_student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_student deletet_student(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.deletet_student(studentId);
	}

	/**
	* Deletes the t_student from the database. Also notifies the appropriate model listeners.
	*
	* @param t_student the t_student
	* @return the t_student that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_student deletet_student(
		com.message.model.t_student t_student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.deletet_student(t_student);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_studentLocalService.dynamicQuery();
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
		return _t_studentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _t_studentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _t_studentLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _t_studentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _t_studentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.message.model.t_student fetcht_student(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.fetcht_student(studentId);
	}

	/**
	* Returns the t_student with the primary key.
	*
	* @param studentId the primary key of the t_student
	* @return the t_student
	* @throws PortalException if a t_student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_student gett_student(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.gett_student(studentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.message.model.t_student> gett_students(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.gett_students(start, end);
	}

	/**
	* Returns the number of t_students.
	*
	* @return the number of t_students
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int gett_studentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.gett_studentsCount();
	}

	/**
	* Updates the t_student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param t_student the t_student
	* @return the t_student that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_student updatet_student(
		com.message.model.t_student t_student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_studentLocalService.updatet_student(t_student);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _t_studentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_t_studentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _t_studentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public t_studentLocalService getWrappedt_studentLocalService() {
		return _t_studentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedt_studentLocalService(
		t_studentLocalService t_studentLocalService) {
		_t_studentLocalService = t_studentLocalService;
	}

	@Override
	public t_studentLocalService getWrappedService() {
		return _t_studentLocalService;
	}

	@Override
	public void setWrappedService(t_studentLocalService t_studentLocalService) {
		_t_studentLocalService = t_studentLocalService;
	}

	private t_studentLocalService _t_studentLocalService;
}