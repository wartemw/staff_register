package ru.wartemw.staff_register.build_service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Position_directoryLocalService}.
 *
 * @author wARTEMw
 * @see Position_directoryLocalService
 * @generated
 */
public class Position_directoryLocalServiceWrapper
    implements Position_directoryLocalService,
        ServiceWrapper<Position_directoryLocalService> {
    private Position_directoryLocalService _position_directoryLocalService;

    public Position_directoryLocalServiceWrapper(
        Position_directoryLocalService position_directoryLocalService) {
        _position_directoryLocalService = position_directoryLocalService;
    }

    /**
    * Adds the position_directory to the database. Also notifies the appropriate model listeners.
    *
    * @param position_directory the position_directory
    * @return the position_directory that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory addPosition_directory(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.addPosition_directory(position_directory);
    }

    /**
    * Creates a new position_directory with the primary key. Does not add the position_directory to the database.
    *
    * @param position_directoryID the primary key for the new position_directory
    * @return the new position_directory
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory createPosition_directory(
        long position_directoryID) {
        return _position_directoryLocalService.createPosition_directory(position_directoryID);
    }

    /**
    * Deletes the position_directory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory that was removed
    * @throws PortalException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory deletePosition_directory(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.deletePosition_directory(position_directoryID);
    }

    /**
    * Deletes the position_directory from the database. Also notifies the appropriate model listeners.
    *
    * @param position_directory the position_directory
    * @return the position_directory that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory deletePosition_directory(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.deletePosition_directory(position_directory);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _position_directoryLocalService.dynamicQuery();
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
        return _position_directoryLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Position_directoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _position_directoryLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Position_directoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _position_directoryLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return _position_directoryLocalService.dynamicQueryCount(dynamicQuery);
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
        return _position_directoryLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory fetchPosition_directory(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.fetchPosition_directory(position_directoryID);
    }

    /**
    * Returns the position_directory with the primary key.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory
    * @throws PortalException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory getPosition_directory(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.getPosition_directory(position_directoryID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the position_directories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Position_directoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of position_directories
    * @param end the upper bound of the range of position_directories (not inclusive)
    * @return the range of position_directories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> getPosition_directories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.getPosition_directories(start,
            end);
    }

    /**
    * Returns the number of position_directories.
    *
    * @return the number of position_directories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPosition_directoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.getPosition_directoriesCount();
    }

    /**
    * Updates the position_directory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param position_directory the position_directory
    * @return the position_directory that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory updatePosition_directory(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _position_directoryLocalService.updatePosition_directory(position_directory);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _position_directoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _position_directoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _position_directoryLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory createEntity() {
        return _position_directoryLocalService.createEntity();
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory addPosition_directory(
        java.lang.String name, boolean archival_status) {
        return _position_directoryLocalService.addPosition_directory(name,
            archival_status);
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory changePosition_directoryArchivalStatus(
        long position_directoryId) {
        return _position_directoryLocalService.changePosition_directoryArchivalStatus(position_directoryId);
    }

    @Override
    public java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> getPosition_directoryList() {
        return _position_directoryLocalService.getPosition_directoryList();
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory updatePosition_directory(
        long position_directoryId, java.lang.String name,
        boolean archival_status) {
        return _position_directoryLocalService.updatePosition_directory(position_directoryId,
            name, archival_status);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Position_directoryLocalService getWrappedPosition_directoryLocalService() {
        return _position_directoryLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPosition_directoryLocalService(
        Position_directoryLocalService position_directoryLocalService) {
        _position_directoryLocalService = position_directoryLocalService;
    }

    @Override
    public Position_directoryLocalService getWrappedService() {
        return _position_directoryLocalService;
    }

    @Override
    public void setWrappedService(
        Position_directoryLocalService position_directoryLocalService) {
        _position_directoryLocalService = position_directoryLocalService;
    }
}
