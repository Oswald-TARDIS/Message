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
 * Provides a wrapper for {@link t_teacherLocalService}.
 *
 * @author mazhe
 * @see t_teacherLocalService
 * @generated
 */
public class t_teacherLocalServiceWrapper implements t_teacherLocalService,
	ServiceWrapper<t_teacherLocalService> {
	public t_teacherLocalServiceWrapper(
		t_teacherLocalService t_teacherLocalService) {
		_t_teacherLocalService = t_teacherLocalService;
	}

	/**
	* Adds the t_teacher to the database. Also notifies the appropriate model listeners.
	*
	* @param t_teacher the t_teacher
	* @return the t_teacher that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_teacher addt_teacher(
		com.message.model.t_teacher t_teacher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.addt_teacher(t_teacher);
	}

	/**
	* Creates a new t_teacher with the primary key. Does not add the t_teacher to the database.
	*
	* @param teacherId the primary key for the new t_teacher
	* @return the new t_teacher
	*/
	@Override
	public com.message.model.t_teacher createt_teacher(long teacherId) {
		return _t_teacherLocalService.createt_teacher(teacherId);
	}

	/**
	* Deletes the t_teacher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teacherId the primary key of the t_teacher
	* @return the t_teacher that was removed
	* @throws PortalException if a t_teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_teacher deletet_teacher(long teacherId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.deletet_teacher(teacherId);
	}

	/**
	* Deletes the t_teacher from the database. Also notifies the appropriate model listeners.
	*
	* @param t_teacher the t_teacher
	* @return the t_teacher that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_teacher deletet_teacher(
		com.message.model.t_teacher t_teacher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.deletet_teacher(t_teacher);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_teacherLocalService.dynamicQuery();
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
		return _t_teacherLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_teacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _t_teacherLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.message.model.impl.t_teacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _t_teacherLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _t_teacherLocalService.dynamicQueryCount(dynamicQuery);
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
		return _t_teacherLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.message.model.t_teacher fetcht_teacher(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.fetcht_teacher(teacherId);
	}

	/**
	* Returns the t_teacher with the primary key.
	*
	* @param teacherId the primary key of the t_teacher
	* @return the t_teacher
	* @throws PortalException if a t_teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_teacher gett_teacher(long teacherId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.gett_teacher(teacherId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.message.model.t_teacher> gett_teachers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.gett_teachers(start, end);
	}

	/**
	* Returns the number of t_teachers.
	*
	* @return the number of t_teachers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int gett_teachersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.gett_teachersCount();
	}

	/**
	* Updates the t_teacher in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param t_teacher the t_teacher
	* @return the t_teacher that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.message.model.t_teacher updatet_teacher(
		com.message.model.t_teacher t_teacher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t_teacherLocalService.updatet_teacher(t_teacher);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _t_teacherLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_t_teacherLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _t_teacherLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public t_teacherLocalService getWrappedt_teacherLocalService() {
		return _t_teacherLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedt_teacherLocalService(
		t_teacherLocalService t_teacherLocalService) {
		_t_teacherLocalService = t_teacherLocalService;
	}

	@Override
	public t_teacherLocalService getWrappedService() {
		return _t_teacherLocalService;
	}

	@Override
	public void setWrappedService(t_teacherLocalService t_teacherLocalService) {
		_t_teacherLocalService = t_teacherLocalService;
	}

	private t_teacherLocalService _t_teacherLocalService;
}