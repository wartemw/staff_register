package ru.wartemw.staff_register.build_service.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Position_directory. This utility wraps
 * {@link ru.wartemw.staff_register.build_service.service.impl.Position_directoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author wARTEMw
 * @see Position_directoryLocalService
 * @see ru.wartemw.staff_register.build_service.service.base.Position_directoryLocalServiceBaseImpl
 * @see ru.wartemw.staff_register.build_service.service.impl.Position_directoryLocalServiceImpl
 * @generated
 */
public class Position_directoryLocalServiceUtil {
    private static Position_directoryLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ru.wartemw.staff_register.build_service.service.impl.Position_directoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the position_directory to the database. Also notifies the appropriate model listeners.
    *
    * @param position_directory the position_directory
    * @return the position_directory that was added
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory addPosition_directory(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPosition_directory(position_directory);
    }

    /**
    * Creates a new position_directory with the primary key. Does not add the position_directory to the database.
    *
    * @param position_directoryID the primary key for the new position_directory
    * @return the new position_directory
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory createPosition_directory(
        long position_directoryID) {
        return getService().createPosition_directory(position_directoryID);
    }

    /**
    * Deletes the position_directory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory that was removed
    * @throws PortalException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory deletePosition_directory(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePosition_directory(position_directoryID);
    }

    /**
    * Deletes the position_directory from the database. Also notifies the appropriate model listeners.
    *
    * @param position_directory the position_directory
    * @return the position_directory that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory deletePosition_directory(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePosition_directory(position_directory);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Position_directoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static ru.wartemw.staff_register.build_service.model.Position_directory fetchPosition_directory(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPosition_directory(position_directoryID);
    }

    /**
    * Returns the position_directory with the primary key.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory
    * @throws PortalException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory getPosition_directory(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPosition_directory(position_directoryID);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> getPosition_directories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPosition_directories(start, end);
    }

    /**
    * Returns the number of position_directories.
    *
    * @return the number of position_directories
    * @throws SystemException if a system exception occurred
    */
    public static int getPosition_directoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPosition_directoriesCount();
    }

    /**
    * Updates the position_directory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param position_directory the position_directory
    * @return the position_directory that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory updatePosition_directory(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePosition_directory(position_directory);
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

    public static ru.wartemw.staff_register.build_service.model.Position_directory createEntity() {
        return getService().createEntity();
    }

    public static ru.wartemw.staff_register.build_service.model.Position_directory addPosition_directory(
        java.lang.String name, boolean archival_status) {
        return getService().addPosition_directory(name, archival_status);
    }

    public static ru.wartemw.staff_register.build_service.model.Position_directory changePosition_directoryArchivalStatus(
        long position_directoryId) {
        return getService()
                   .changePosition_directoryArchivalStatus(position_directoryId);
    }

    public static java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> getPosition_directoryList() {
        return getService().getPosition_directoryList();
    }

    public static ru.wartemw.staff_register.build_service.model.Position_directory updatePosition_directory(
        long position_directoryId, java.lang.String name,
        boolean archival_status) {
        return getService()
                   .updatePosition_directory(position_directoryId, name,
            archival_status);
    }

    public static void clearService() {
        _service = null;
    }

    public static Position_directoryLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Position_directoryLocalService.class.getName());

            if (invokableLocalService instanceof Position_directoryLocalService) {
                _service = (Position_directoryLocalService) invokableLocalService;
            } else {
                _service = new Position_directoryLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Position_directoryLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Position_directoryLocalService service) {
    }
}
