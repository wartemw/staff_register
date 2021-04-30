package ru.wartemw.staff_register.build_service.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Banking_organization. This utility wraps
 * {@link ru.wartemw.staff_register.build_service.service.impl.Banking_organizationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author wARTEMw
 * @see Banking_organizationLocalService
 * @see ru.wartemw.staff_register.build_service.service.base.Banking_organizationLocalServiceBaseImpl
 * @see ru.wartemw.staff_register.build_service.service.impl.Banking_organizationLocalServiceImpl
 * @generated
 */
public class Banking_organizationLocalServiceUtil {
    private static Banking_organizationLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ru.wartemw.staff_register.build_service.service.impl.Banking_organizationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the banking_organization to the database. Also notifies the appropriate model listeners.
    *
    * @param banking_organization the banking_organization
    * @return the banking_organization that was added
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Banking_organization addBanking_organization(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBanking_organization(banking_organization);
    }

    /**
    * Creates a new banking_organization with the primary key. Does not add the banking_organization to the database.
    *
    * @param banking_organizationID the primary key for the new banking_organization
    * @return the new banking_organization
    */
    public static ru.wartemw.staff_register.build_service.model.Banking_organization createBanking_organization(
        long banking_organizationID) {
        return getService().createBanking_organization(banking_organizationID);
    }

    /**
    * Deletes the banking_organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param banking_organizationID the primary key of the banking_organization
    * @return the banking_organization that was removed
    * @throws PortalException if a banking_organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Banking_organization deleteBanking_organization(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBanking_organization(banking_organizationID);
    }

    /**
    * Deletes the banking_organization from the database. Also notifies the appropriate model listeners.
    *
    * @param banking_organization the banking_organization
    * @return the banking_organization that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Banking_organization deleteBanking_organization(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBanking_organization(banking_organization);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static ru.wartemw.staff_register.build_service.model.Banking_organization fetchBanking_organization(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBanking_organization(banking_organizationID);
    }

    /**
    * Returns the banking_organization with the primary key.
    *
    * @param banking_organizationID the primary key of the banking_organization
    * @return the banking_organization
    * @throws PortalException if a banking_organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Banking_organization getBanking_organization(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBanking_organization(banking_organizationID);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> getBanking_organizations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBanking_organizations(start, end);
    }

    /**
    * Returns the number of banking_organizations.
    *
    * @return the number of banking_organizations
    * @throws SystemException if a system exception occurred
    */
    public static int getBanking_organizationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBanking_organizationsCount();
    }

    /**
    * Updates the banking_organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param banking_organization the banking_organization
    * @return the banking_organization that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Banking_organization updateBanking_organization(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBanking_organization(banking_organization);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static ru.wartemw.staff_register.build_service.model.Banking_organization createEntity() {
        return getService().createEntity();
    }

    public static ru.wartemw.staff_register.build_service.model.Banking_organization addBanking_organization(
        java.lang.String name, int identification_code, java.lang.String address) {
        return getService()
                   .addBanking_organization(name, identification_code, address);
    }

    public static java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> getBanking_organizationList() {
        return getService().getBanking_organizationList();
    }

    public static ru.wartemw.staff_register.build_service.model.Banking_organization updateBanking_organization(
        long banking_organizationId, java.lang.String name,
        int identification_code, java.lang.String address) {
        return getService()
                   .updateBanking_organization(banking_organizationId, name,
            identification_code, address);
    }

    public static void clearService() {
        _service = null;
    }

    public static Banking_organizationLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Banking_organizationLocalService.class.getName());

            if (invokableLocalService instanceof Banking_organizationLocalService) {
                _service = (Banking_organizationLocalService) invokableLocalService;
            } else {
                _service = new Banking_organizationLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Banking_organizationLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Banking_organizationLocalService service) {
    }
}
