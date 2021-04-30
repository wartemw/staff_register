package ru.wartemw.staff_register.build_service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Banking_organizationLocalService}.
 *
 * @author wARTEMw
 * @see Banking_organizationLocalService
 * @generated
 */
public class Banking_organizationLocalServiceWrapper
    implements Banking_organizationLocalService,
        ServiceWrapper<Banking_organizationLocalService> {
    private Banking_organizationLocalService _banking_organizationLocalService;

    public Banking_organizationLocalServiceWrapper(
        Banking_organizationLocalService banking_organizationLocalService) {
        _banking_organizationLocalService = banking_organizationLocalService;
    }

    /**
    * Adds the banking_organization to the database. Also notifies the appropriate model listeners.
    *
    * @param banking_organization the banking_organization
    * @return the banking_organization that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization addBanking_organization(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.addBanking_organization(banking_organization);
    }

    /**
    * Creates a new banking_organization with the primary key. Does not add the banking_organization to the database.
    *
    * @param banking_organizationID the primary key for the new banking_organization
    * @return the new banking_organization
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization createBanking_organization(
        long banking_organizationID) {
        return _banking_organizationLocalService.createBanking_organization(banking_organizationID);
    }

    /**
    * Deletes the banking_organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param banking_organizationID the primary key of the banking_organization
    * @return the banking_organization that was removed
    * @throws PortalException if a banking_organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization deleteBanking_organization(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.deleteBanking_organization(banking_organizationID);
    }

    /**
    * Deletes the banking_organization from the database. Also notifies the appropriate model listeners.
    *
    * @param banking_organization the banking_organization
    * @return the banking_organization that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization deleteBanking_organization(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.deleteBanking_organization(banking_organization);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _banking_organizationLocalService.dynamicQuery();
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
        return _banking_organizationLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Banking_organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _banking_organizationLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Banking_organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _banking_organizationLocalService.dynamicQuery(dynamicQuery,
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
        return _banking_organizationLocalService.dynamicQueryCount(dynamicQuery);
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
        return _banking_organizationLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization fetchBanking_organization(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.fetchBanking_organization(banking_organizationID);
    }

    /**
    * Returns the banking_organization with the primary key.
    *
    * @param banking_organizationID the primary key of the banking_organization
    * @return the banking_organization
    * @throws PortalException if a banking_organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization getBanking_organization(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.getBanking_organization(banking_organizationID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the banking_organizations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Banking_organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of banking_organizations
    * @param end the upper bound of the range of banking_organizations (not inclusive)
    * @return the range of banking_organizations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> getBanking_organizations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.getBanking_organizations(start,
            end);
    }

    /**
    * Returns the number of banking_organizations.
    *
    * @return the number of banking_organizations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBanking_organizationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.getBanking_organizationsCount();
    }

    /**
    * Updates the banking_organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param banking_organization the banking_organization
    * @return the banking_organization that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization updateBanking_organization(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banking_organizationLocalService.updateBanking_organization(banking_organization);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _banking_organizationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _banking_organizationLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _banking_organizationLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization createEntity() {
        return _banking_organizationLocalService.createEntity();
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization addBanking_organization(
        java.lang.String name, int identification_code, java.lang.String address) {
        return _banking_organizationLocalService.addBanking_organization(name,
            identification_code, address);
    }

    @Override
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> getBanking_organizationList() {
        return _banking_organizationLocalService.getBanking_organizationList();
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization updateBanking_organization(
        long banking_organizationId, java.lang.String name,
        int identification_code, java.lang.String address) {
        return _banking_organizationLocalService.updateBanking_organization(banking_organizationId,
            name, identification_code, address);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Banking_organizationLocalService getWrappedBanking_organizationLocalService() {
        return _banking_organizationLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBanking_organizationLocalService(
        Banking_organizationLocalService banking_organizationLocalService) {
        _banking_organizationLocalService = banking_organizationLocalService;
    }

    @Override
    public Banking_organizationLocalService getWrappedService() {
        return _banking_organizationLocalService;
    }

    @Override
    public void setWrappedService(
        Banking_organizationLocalService banking_organizationLocalService) {
        _banking_organizationLocalService = banking_organizationLocalService;
    }
}
