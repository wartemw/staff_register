package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.wartemw.staff_register.build_service.model.Worker;

import java.util.List;

/**
 * The persistence utility for the worker service. This utility wraps {@link WorkerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see WorkerPersistence
 * @see WorkerPersistenceImpl
 * @generated
 */
public class WorkerUtil {
    private static WorkerPersistence _persistence;

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
    public static void clearCache(Worker worker) {
        getPersistence().clearCache(worker);
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
    public static List<Worker> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Worker> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Worker> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Worker update(Worker worker) throws SystemException {
        return getPersistence().update(worker);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Worker update(Worker worker, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(worker, serviceContext);
    }

    /**
    * Returns the worker where position_directoryID = &#63; or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
    *
    * @param position_directoryID the position_directory i d
    * @return the matching worker
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker findByPosition_directoryId(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException {
        return getPersistence().findByPosition_directoryId(position_directoryID);
    }

    /**
    * Returns the worker where position_directoryID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param position_directoryID the position_directory i d
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker fetchByPosition_directoryId(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPosition_directoryId(position_directoryID);
    }

    /**
    * Returns the worker where position_directoryID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param position_directoryID the position_directory i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker fetchByPosition_directoryId(
        long position_directoryID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPosition_directoryId(position_directoryID,
            retrieveFromCache);
    }

    /**
    * Removes the worker where position_directoryID = &#63; from the database.
    *
    * @param position_directoryID the position_directory i d
    * @return the worker that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker removeByPosition_directoryId(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException {
        return getPersistence()
                   .removeByPosition_directoryId(position_directoryID);
    }

    /**
    * Returns the number of workers where position_directoryID = &#63;.
    *
    * @param position_directoryID the position_directory i d
    * @return the number of matching workers
    * @throws SystemException if a system exception occurred
    */
    public static int countByPosition_directoryId(long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPosition_directoryId(position_directoryID);
    }

    /**
    * Returns the worker where banking_organizationID = &#63; or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the matching worker
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker findByBanking_organizationId(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException {
        return getPersistence()
                   .findByBanking_organizationId(banking_organizationID);
    }

    /**
    * Returns the worker where banking_organizationID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker fetchByBanking_organizationId(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBanking_organizationId(banking_organizationID);
    }

    /**
    * Returns the worker where banking_organizationID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param banking_organizationID the banking_organization i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker fetchByBanking_organizationId(
        long banking_organizationID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBanking_organizationId(banking_organizationID,
            retrieveFromCache);
    }

    /**
    * Removes the worker where banking_organizationID = &#63; from the database.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the worker that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker removeByBanking_organizationId(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException {
        return getPersistence()
                   .removeByBanking_organizationId(banking_organizationID);
    }

    /**
    * Returns the number of workers where banking_organizationID = &#63;.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the number of matching workers
    * @throws SystemException if a system exception occurred
    */
    public static int countByBanking_organizationId(long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByBanking_organizationId(banking_organizationID);
    }

    /**
    * Caches the worker in the entity cache if it is enabled.
    *
    * @param worker the worker
    */
    public static void cacheResult(
        ru.wartemw.staff_register.build_service.model.Worker worker) {
        getPersistence().cacheResult(worker);
    }

    /**
    * Caches the workers in the entity cache if it is enabled.
    *
    * @param workers the workers
    */
    public static void cacheResult(
        java.util.List<ru.wartemw.staff_register.build_service.model.Worker> workers) {
        getPersistence().cacheResult(workers);
    }

    /**
    * Creates a new worker with the primary key. Does not add the worker to the database.
    *
    * @param workerID the primary key for the new worker
    * @return the new worker
    */
    public static ru.wartemw.staff_register.build_service.model.Worker create(
        long workerID) {
        return getPersistence().create(workerID);
    }

    /**
    * Removes the worker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param workerID the primary key of the worker
    * @return the worker that was removed
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker remove(
        long workerID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException {
        return getPersistence().remove(workerID);
    }

    public static ru.wartemw.staff_register.build_service.model.Worker updateImpl(
        ru.wartemw.staff_register.build_service.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(worker);
    }

    /**
    * Returns the worker with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
    *
    * @param workerID the primary key of the worker
    * @return the worker
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker findByPrimaryKey(
        long workerID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException {
        return getPersistence().findByPrimaryKey(workerID);
    }

    /**
    * Returns the worker with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param workerID the primary key of the worker
    * @return the worker, or <code>null</code> if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.wartemw.staff_register.build_service.model.Worker fetchByPrimaryKey(
        long workerID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(workerID);
    }

    /**
    * Returns all the workers.
    *
    * @return the workers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Worker> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the workers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of workers
    * @param end the upper bound of the range of workers (not inclusive)
    * @return the range of workers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Worker> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the workers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of workers
    * @param end the upper bound of the range of workers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of workers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.wartemw.staff_register.build_service.model.Worker> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the workers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of workers.
    *
    * @return the number of workers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static WorkerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (WorkerPersistence) PortletBeanLocatorUtil.locate(ru.wartemw.staff_register.build_service.service.ClpSerializer.getServletContextName(),
                    WorkerPersistence.class.getName());

            ReferenceRegistry.registerReference(WorkerUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(WorkerPersistence persistence) {
    }
}
