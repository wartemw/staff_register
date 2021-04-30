package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.wartemw.staff_register.build_service.model.Position_directory;

import java.util.List;

/**
 * The persistence utility for the position_directory service. This utility wraps {@link Position_directoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see Position_directoryPersistence
 * @see Position_directoryPersistenceImpl
 * @generated
 */
public class Position_directoryUtil {
    private static Position_directoryPersistence _persistence;

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
    public static void clearCache(Position_directory position_directory) {
        getPersistence().clearCache(position_directory);
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
    public static List<Position_directory> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Position_directory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Position_directory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Position_directory update(
        Position_directory position_directory) throws SystemException {
        return getPersistence().update(position_directory);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Position_directory update(
        Position_directory position_directory, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(position_directory, serviceContext);
    }

    /**
    * Caches the position_directory in the entity cache if it is enabled.
    *
    * @param position_directory the position_directory
    */
    public static void cacheResult(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory) {
        getPersistence().cacheResult(position_directory);
    }

    /**
    * Caches the position_directories in the entity cache if it is enabled.
    *
    * @param position_directories the position_directories
    */
    public static void cacheResult(
        java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> position_directories) {
        getPersistence().cacheResult(position_directories);
    }

    /**
    * Creates a new position_directory with the primary key. Does not add the position_directory to the database.
    *
    * @param position_directoryID the primary key for the new position_directory
    * @return the new position_directory
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory create(
        long position_directoryID) {
        return getPersistence().create(position_directoryID);
    }

    /**
    * Removes the position_directory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory that was removed
    * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory remove(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException {
        return getPersistence().remove(position_directoryID);
    }

    public static ru.wartemw.staff_register.build_service.model.Position_directory updateImpl(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(position_directory);
    }

    /**
    * Returns the position_directory with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException} if it could not be found.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory
    * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory findByPrimaryKey(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException {
        return getPersistence().findByPrimaryKey(position_directoryID);
    }

    /**
    * Returns the position_directory with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory, or <code>null</code> if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Position_directory fetchByPrimaryKey(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(position_directoryID);
    }

    /**
    * Returns all the position_directories.
    *
    * @return the position_directories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the position_directories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Position_directoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of position_directories
    * @param end the upper bound of the range of position_directories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of position_directories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the position_directories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of position_directories.
    *
    * @return the number of position_directories
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Position_directoryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Position_directoryPersistence) PortletBeanLocatorUtil.locate(ru.wartemw.staff_register.build_service.service.ClpSerializer.getServletContextName(),
                    Position_directoryPersistence.class.getName());

            ReferenceRegistry.registerReference(Position_directoryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Position_directoryPersistence persistence) {
    }
}
