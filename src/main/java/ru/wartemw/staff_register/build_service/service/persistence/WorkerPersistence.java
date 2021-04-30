package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.wartemw.staff_register.build_service.model.Worker;

/**
 * The persistence interface for the worker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see WorkerPersistenceImpl
 * @see WorkerUtil
 * @generated
 */
public interface WorkerPersistence extends BasePersistence<Worker> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link WorkerUtil} to access the worker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the worker where position_directoryID = &#63; or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
    *
    * @param position_directoryID the position_directory i d
    * @return the matching worker
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker findByPosition_directoryId(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException;

    /**
    * Returns the worker where position_directoryID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param position_directoryID the position_directory i d
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker fetchByPosition_directoryId(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the worker where position_directoryID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param position_directoryID the position_directory i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker fetchByPosition_directoryId(
        long position_directoryID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the worker where position_directoryID = &#63; from the database.
    *
    * @param position_directoryID the position_directory i d
    * @return the worker that was removed
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker removeByPosition_directoryId(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException;

    /**
    * Returns the number of workers where position_directoryID = &#63;.
    *
    * @param position_directoryID the position_directory i d
    * @return the number of matching workers
    * @throws SystemException if a system exception occurred
    */
    public int countByPosition_directoryId(long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the worker where banking_organizationID = &#63; or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the matching worker
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker findByBanking_organizationId(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException;

    /**
    * Returns the worker where banking_organizationID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker fetchByBanking_organizationId(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the worker where banking_organizationID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param banking_organizationID the banking_organization i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching worker, or <code>null</code> if a matching worker could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker fetchByBanking_organizationId(
        long banking_organizationID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the worker where banking_organizationID = &#63; from the database.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the worker that was removed
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker removeByBanking_organizationId(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException;

    /**
    * Returns the number of workers where banking_organizationID = &#63;.
    *
    * @param banking_organizationID the banking_organization i d
    * @return the number of matching workers
    * @throws SystemException if a system exception occurred
    */
    public int countByBanking_organizationId(long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the worker in the entity cache if it is enabled.
    *
    * @param worker the worker
    */
    public void cacheResult(
        ru.wartemw.staff_register.build_service.model.Worker worker);

    /**
    * Caches the workers in the entity cache if it is enabled.
    *
    * @param workers the workers
    */
    public void cacheResult(
        java.util.List<ru.wartemw.staff_register.build_service.model.Worker> workers);

    /**
    * Creates a new worker with the primary key. Does not add the worker to the database.
    *
    * @param workerID the primary key for the new worker
    * @return the new worker
    */
    public ru.wartemw.staff_register.build_service.model.Worker create(
        long workerID);

    /**
    * Removes the worker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param workerID the primary key of the worker
    * @return the worker that was removed
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker remove(
        long workerID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException;

    public ru.wartemw.staff_register.build_service.model.Worker updateImpl(
        ru.wartemw.staff_register.build_service.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the worker with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
    *
    * @param workerID the primary key of the worker
    * @return the worker
    * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker findByPrimaryKey(
        long workerID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchWorkerException;

    /**
    * Returns the worker with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param workerID the primary key of the worker
    * @return the worker, or <code>null</code> if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Worker fetchByPrimaryKey(
        long workerID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the workers.
    *
    * @return the workers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.wartemw.staff_register.build_service.model.Worker> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Worker> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Worker> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the workers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of workers.
    *
    * @return the number of workers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
