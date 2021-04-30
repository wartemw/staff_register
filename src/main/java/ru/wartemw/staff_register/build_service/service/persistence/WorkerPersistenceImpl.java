package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.wartemw.staff_register.build_service.NoSuchWorkerException;
import ru.wartemw.staff_register.build_service.model.Worker;
import ru.wartemw.staff_register.build_service.model.impl.WorkerImpl;
import ru.wartemw.staff_register.build_service.model.impl.WorkerModelImpl;
import ru.wartemw.staff_register.build_service.service.persistence.WorkerPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the worker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see WorkerPersistence
 * @see WorkerUtil
 * @generated
 */
public class WorkerPersistenceImpl extends BasePersistenceImpl<Worker>
    implements WorkerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link WorkerUtil} to access the worker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = WorkerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByPosition_directoryId",
            new String[] { Long.class.getName() },
            WorkerModelImpl.POSITION_DIRECTORYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_POSITION_DIRECTORYID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPosition_directoryId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_POSITION_DIRECTORYID_POSITION_DIRECTORYID_2 =
        "worker.position_directoryID = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByBanking_organizationId",
            new String[] { Long.class.getName() },
            WorkerModelImpl.BANKING_ORGANIZATIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKING_ORGANIZATIONID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByBanking_organizationId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_BANKING_ORGANIZATIONID_BANKING_ORGANIZATIONID_2 =
        "worker.banking_organizationID = ?";
    private static final String _SQL_SELECT_WORKER = "SELECT worker FROM Worker worker";
    private static final String _SQL_SELECT_WORKER_WHERE = "SELECT worker FROM Worker worker WHERE ";
    private static final String _SQL_COUNT_WORKER = "SELECT COUNT(worker) FROM Worker worker";
    private static final String _SQL_COUNT_WORKER_WHERE = "SELECT COUNT(worker) FROM Worker worker WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "worker.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Worker exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Worker exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(WorkerPersistenceImpl.class);
    private static Worker _nullWorker = new WorkerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Worker> toCacheModel() {
                return _nullWorkerCacheModel;
            }
        };

    private static CacheModel<Worker> _nullWorkerCacheModel = new CacheModel<Worker>() {
            @Override
            public Worker toEntityModel() {
                return _nullWorker;
            }
        };

    public WorkerPersistenceImpl() {
        setModelClass(Worker.class);
    }

    /**
     * Returns the worker where position_directoryID = &#63; or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
     *
     * @param position_directoryID the position_directory i d
     * @return the matching worker
     * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByPosition_directoryId(long position_directoryID)
        throws NoSuchWorkerException, SystemException {
        Worker worker = fetchByPosition_directoryId(position_directoryID);

        if (worker == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("position_directoryID=");
            msg.append(position_directoryID);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchWorkerException(msg.toString());
        }

        return worker;
    }

    /**
     * Returns the worker where position_directoryID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param position_directoryID the position_directory i d
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByPosition_directoryId(long position_directoryID)
        throws SystemException {
        return fetchByPosition_directoryId(position_directoryID, true);
    }

    /**
     * Returns the worker where position_directoryID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param position_directoryID the position_directory i d
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByPosition_directoryId(long position_directoryID,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { position_directoryID };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
                    finderArgs, this);
        }

        if (result instanceof Worker) {
            Worker worker = (Worker) result;

            if ((position_directoryID != worker.getPosition_directoryID())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_POSITION_DIRECTORYID_POSITION_DIRECTORYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(position_directoryID);

                List<Worker> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "WorkerPersistenceImpl.fetchByPosition_directoryId(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Worker worker = list.get(0);

                    result = worker;

                    cacheResult(worker);

                    if ((worker.getPosition_directoryID() != position_directoryID)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
                            finderArgs, worker);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Worker) result;
        }
    }

    /**
     * Removes the worker where position_directoryID = &#63; from the database.
     *
     * @param position_directoryID the position_directory i d
     * @return the worker that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker removeByPosition_directoryId(long position_directoryID)
        throws NoSuchWorkerException, SystemException {
        Worker worker = findByPosition_directoryId(position_directoryID);

        return remove(worker);
    }

    /**
     * Returns the number of workers where position_directoryID = &#63;.
     *
     * @param position_directoryID the position_directory i d
     * @return the number of matching workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPosition_directoryId(long position_directoryID)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_POSITION_DIRECTORYID;

        Object[] finderArgs = new Object[] { position_directoryID };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_POSITION_DIRECTORYID_POSITION_DIRECTORYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(position_directoryID);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the worker where banking_organizationID = &#63; or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
     *
     * @param banking_organizationID the banking_organization i d
     * @return the matching worker
     * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByBanking_organizationId(long banking_organizationID)
        throws NoSuchWorkerException, SystemException {
        Worker worker = fetchByBanking_organizationId(banking_organizationID);

        if (worker == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("banking_organizationID=");
            msg.append(banking_organizationID);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchWorkerException(msg.toString());
        }

        return worker;
    }

    /**
     * Returns the worker where banking_organizationID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param banking_organizationID the banking_organization i d
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByBanking_organizationId(long banking_organizationID)
        throws SystemException {
        return fetchByBanking_organizationId(banking_organizationID, true);
    }

    /**
     * Returns the worker where banking_organizationID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param banking_organizationID the banking_organization i d
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByBanking_organizationId(long banking_organizationID,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { banking_organizationID };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
                    finderArgs, this);
        }

        if (result instanceof Worker) {
            Worker worker = (Worker) result;

            if ((banking_organizationID != worker.getBanking_organizationID())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_BANKING_ORGANIZATIONID_BANKING_ORGANIZATIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(banking_organizationID);

                List<Worker> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "WorkerPersistenceImpl.fetchByBanking_organizationId(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Worker worker = list.get(0);

                    result = worker;

                    cacheResult(worker);

                    if ((worker.getBanking_organizationID() != banking_organizationID)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
                            finderArgs, worker);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Worker) result;
        }
    }

    /**
     * Removes the worker where banking_organizationID = &#63; from the database.
     *
     * @param banking_organizationID the banking_organization i d
     * @return the worker that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker removeByBanking_organizationId(long banking_organizationID)
        throws NoSuchWorkerException, SystemException {
        Worker worker = findByBanking_organizationId(banking_organizationID);

        return remove(worker);
    }

    /**
     * Returns the number of workers where banking_organizationID = &#63;.
     *
     * @param banking_organizationID the banking_organization i d
     * @return the number of matching workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBanking_organizationId(long banking_organizationID)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKING_ORGANIZATIONID;

        Object[] finderArgs = new Object[] { banking_organizationID };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_BANKING_ORGANIZATIONID_BANKING_ORGANIZATIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(banking_organizationID);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the worker in the entity cache if it is enabled.
     *
     * @param worker the worker
     */
    @Override
    public void cacheResult(Worker worker) {
        EntityCacheUtil.putResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerImpl.class, worker.getPrimaryKey(), worker);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
            new Object[] { worker.getPosition_directoryID() }, worker);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
            new Object[] { worker.getBanking_organizationID() }, worker);

        worker.resetOriginalValues();
    }

    /**
     * Caches the workers in the entity cache if it is enabled.
     *
     * @param workers the workers
     */
    @Override
    public void cacheResult(List<Worker> workers) {
        for (Worker worker : workers) {
            if (EntityCacheUtil.getResult(
                        WorkerModelImpl.ENTITY_CACHE_ENABLED, WorkerImpl.class,
                        worker.getPrimaryKey()) == null) {
                cacheResult(worker);
            } else {
                worker.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all workers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(WorkerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(WorkerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the worker.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Worker worker) {
        EntityCacheUtil.removeResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerImpl.class, worker.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(worker);
    }

    @Override
    public void clearCache(List<Worker> workers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Worker worker : workers) {
            EntityCacheUtil.removeResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                WorkerImpl.class, worker.getPrimaryKey());

            clearUniqueFindersCache(worker);
        }
    }

    protected void cacheUniqueFindersCache(Worker worker) {
        if (worker.isNew()) {
            Object[] args = new Object[] { worker.getPosition_directoryID() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POSITION_DIRECTORYID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
                args, worker);

            args = new Object[] { worker.getBanking_organizationID() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BANKING_ORGANIZATIONID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
                args, worker);
        } else {
            WorkerModelImpl workerModelImpl = (WorkerModelImpl) worker;

            if ((workerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { worker.getPosition_directoryID() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POSITION_DIRECTORYID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
                    args, worker);
            }

            if ((workerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { worker.getBanking_organizationID() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BANKING_ORGANIZATIONID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
                    args, worker);
            }
        }
    }

    protected void clearUniqueFindersCache(Worker worker) {
        WorkerModelImpl workerModelImpl = (WorkerModelImpl) worker;

        Object[] args = new Object[] { worker.getPosition_directoryID() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITION_DIRECTORYID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
            args);

        if ((workerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    workerModelImpl.getOriginalPosition_directoryID()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITION_DIRECTORYID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POSITION_DIRECTORYID,
                args);
        }

        args = new Object[] { worker.getBanking_organizationID() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKING_ORGANIZATIONID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
            args);

        if ((workerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    workerModelImpl.getOriginalBanking_organizationID()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKING_ORGANIZATIONID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BANKING_ORGANIZATIONID,
                args);
        }
    }

    /**
     * Creates a new worker with the primary key. Does not add the worker to the database.
     *
     * @param workerID the primary key for the new worker
     * @return the new worker
     */
    @Override
    public Worker create(long workerID) {
        Worker worker = new WorkerImpl();

        worker.setNew(true);
        worker.setPrimaryKey(workerID);

        return worker;
    }

    /**
     * Removes the worker with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param workerID the primary key of the worker
     * @return the worker that was removed
     * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker remove(long workerID)
        throws NoSuchWorkerException, SystemException {
        return remove((Serializable) workerID);
    }

    /**
     * Removes the worker with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the worker
     * @return the worker that was removed
     * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker remove(Serializable primaryKey)
        throws NoSuchWorkerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Worker worker = (Worker) session.get(WorkerImpl.class, primaryKey);

            if (worker == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchWorkerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(worker);
        } catch (NoSuchWorkerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Worker removeImpl(Worker worker) throws SystemException {
        worker = toUnwrappedModel(worker);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(worker)) {
                worker = (Worker) session.get(WorkerImpl.class,
                        worker.getPrimaryKeyObj());
            }

            if (worker != null) {
                session.delete(worker);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (worker != null) {
            clearCache(worker);
        }

        return worker;
    }

    @Override
    public Worker updateImpl(
        ru.wartemw.staff_register.build_service.model.Worker worker)
        throws SystemException {
        worker = toUnwrappedModel(worker);

        boolean isNew = worker.isNew();

        Session session = null;

        try {
            session = openSession();

            if (worker.isNew()) {
                session.save(worker);

                worker.setNew(false);
            } else {
                session.merge(worker);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !WorkerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerImpl.class, worker.getPrimaryKey(), worker);

        clearUniqueFindersCache(worker);
        cacheUniqueFindersCache(worker);

        return worker;
    }

    protected Worker toUnwrappedModel(Worker worker) {
        if (worker instanceof WorkerImpl) {
            return worker;
        }

        WorkerImpl workerImpl = new WorkerImpl();

        workerImpl.setNew(worker.isNew());
        workerImpl.setPrimaryKey(worker.getPrimaryKey());

        workerImpl.setWorkerID(worker.getWorkerID());
        workerImpl.setSurname(worker.getSurname());
        workerImpl.setName(worker.getName());
        workerImpl.setPatronymic(worker.getPatronymic());
        workerImpl.setGender(worker.getGender());
        workerImpl.setDate_of_birth(worker.getDate_of_birth());
        workerImpl.setDate_of_employment(worker.getDate_of_employment());
        workerImpl.setSalary_level(worker.getSalary_level());
        workerImpl.setWork_number(worker.getWork_number());
        workerImpl.setTelephone_number(worker.getTelephone_number());
        workerImpl.setArchival_status(worker.isArchival_status());
        workerImpl.setPosition_directoryID(worker.getPosition_directoryID());
        workerImpl.setBanking_organizationID(worker.getBanking_organizationID());

        return workerImpl;
    }

    /**
     * Returns the worker with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the worker
     * @return the worker
     * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByPrimaryKey(Serializable primaryKey)
        throws NoSuchWorkerException, SystemException {
        Worker worker = fetchByPrimaryKey(primaryKey);

        if (worker == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchWorkerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return worker;
    }

    /**
     * Returns the worker with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchWorkerException} if it could not be found.
     *
     * @param workerID the primary key of the worker
     * @return the worker
     * @throws ru.wartemw.staff_register.build_service.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByPrimaryKey(long workerID)
        throws NoSuchWorkerException, SystemException {
        return findByPrimaryKey((Serializable) workerID);
    }

    /**
     * Returns the worker with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the worker
     * @return the worker, or <code>null</code> if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Worker worker = (Worker) EntityCacheUtil.getResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                WorkerImpl.class, primaryKey);

        if (worker == _nullWorker) {
            return null;
        }

        if (worker == null) {
            Session session = null;

            try {
                session = openSession();

                worker = (Worker) session.get(WorkerImpl.class, primaryKey);

                if (worker != null) {
                    cacheResult(worker);
                } else {
                    EntityCacheUtil.putResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                        WorkerImpl.class, primaryKey, _nullWorker);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                    WorkerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return worker;
    }

    /**
     * Returns the worker with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param workerID the primary key of the worker
     * @return the worker, or <code>null</code> if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByPrimaryKey(long workerID) throws SystemException {
        return fetchByPrimaryKey((Serializable) workerID);
    }

    /**
     * Returns all the workers.
     *
     * @return the workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Worker> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Worker> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Worker> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Worker> list = (List<Worker>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_WORKER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_WORKER;

                if (pagination) {
                    sql = sql.concat(WorkerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Worker>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Worker>(list);
                } else {
                    list = (List<Worker>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the workers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Worker worker : findAll()) {
            remove(worker);
        }
    }

    /**
     * Returns the number of workers.
     *
     * @return the number of workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_WORKER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the worker persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.wartemw.staff_register.build_service.model.Worker")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Worker>> listenersList = new ArrayList<ModelListener<Worker>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Worker>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(WorkerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
