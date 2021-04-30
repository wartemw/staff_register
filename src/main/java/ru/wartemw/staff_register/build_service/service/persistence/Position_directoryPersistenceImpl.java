package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException;
import ru.wartemw.staff_register.build_service.model.Position_directory;
import ru.wartemw.staff_register.build_service.model.impl.Position_directoryImpl;
import ru.wartemw.staff_register.build_service.model.impl.Position_directoryModelImpl;
import ru.wartemw.staff_register.build_service.service.persistence.Position_directoryPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the position_directory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see Position_directoryPersistence
 * @see Position_directoryUtil
 * @generated
 */
public class Position_directoryPersistenceImpl extends BasePersistenceImpl<Position_directory>
    implements Position_directoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Position_directoryUtil} to access the position_directory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Position_directoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
            Position_directoryModelImpl.FINDER_CACHE_ENABLED,
            Position_directoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
            Position_directoryModelImpl.FINDER_CACHE_ENABLED,
            Position_directoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
            Position_directoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_POSITION_DIRECTORY = "SELECT position_directory FROM Position_directory position_directory";
    private static final String _SQL_COUNT_POSITION_DIRECTORY = "SELECT COUNT(position_directory) FROM Position_directory position_directory";
    private static final String _ORDER_BY_ENTITY_ALIAS = "position_directory.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Position_directory exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Position_directoryPersistenceImpl.class);
    private static Position_directory _nullPosition_directory = new Position_directoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Position_directory> toCacheModel() {
                return _nullPosition_directoryCacheModel;
            }
        };

    private static CacheModel<Position_directory> _nullPosition_directoryCacheModel =
        new CacheModel<Position_directory>() {
            @Override
            public Position_directory toEntityModel() {
                return _nullPosition_directory;
            }
        };

    public Position_directoryPersistenceImpl() {
        setModelClass(Position_directory.class);
    }

    /**
     * Caches the position_directory in the entity cache if it is enabled.
     *
     * @param position_directory the position_directory
     */
    @Override
    public void cacheResult(Position_directory position_directory) {
        EntityCacheUtil.putResult(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
            Position_directoryImpl.class, position_directory.getPrimaryKey(),
            position_directory);

        position_directory.resetOriginalValues();
    }

    /**
     * Caches the position_directories in the entity cache if it is enabled.
     *
     * @param position_directories the position_directories
     */
    @Override
    public void cacheResult(List<Position_directory> position_directories) {
        for (Position_directory position_directory : position_directories) {
            if (EntityCacheUtil.getResult(
                        Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
                        Position_directoryImpl.class,
                        position_directory.getPrimaryKey()) == null) {
                cacheResult(position_directory);
            } else {
                position_directory.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all position_directories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Position_directoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Position_directoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the position_directory.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Position_directory position_directory) {
        EntityCacheUtil.removeResult(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
            Position_directoryImpl.class, position_directory.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Position_directory> position_directories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Position_directory position_directory : position_directories) {
            EntityCacheUtil.removeResult(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
                Position_directoryImpl.class, position_directory.getPrimaryKey());
        }
    }

    /**
     * Creates a new position_directory with the primary key. Does not add the position_directory to the database.
     *
     * @param position_directoryID the primary key for the new position_directory
     * @return the new position_directory
     */
    @Override
    public Position_directory create(long position_directoryID) {
        Position_directory position_directory = new Position_directoryImpl();

        position_directory.setNew(true);
        position_directory.setPrimaryKey(position_directoryID);

        return position_directory;
    }

    /**
     * Removes the position_directory with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param position_directoryID the primary key of the position_directory
     * @return the position_directory that was removed
     * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position_directory remove(long position_directoryID)
        throws NoSuchPosition_directoryException, SystemException {
        return remove((Serializable) position_directoryID);
    }

    /**
     * Removes the position_directory with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the position_directory
     * @return the position_directory that was removed
     * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position_directory remove(Serializable primaryKey)
        throws NoSuchPosition_directoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Position_directory position_directory = (Position_directory) session.get(Position_directoryImpl.class,
                    primaryKey);

            if (position_directory == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPosition_directoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(position_directory);
        } catch (NoSuchPosition_directoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Position_directory removeImpl(
        Position_directory position_directory) throws SystemException {
        position_directory = toUnwrappedModel(position_directory);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(position_directory)) {
                position_directory = (Position_directory) session.get(Position_directoryImpl.class,
                        position_directory.getPrimaryKeyObj());
            }

            if (position_directory != null) {
                session.delete(position_directory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (position_directory != null) {
            clearCache(position_directory);
        }

        return position_directory;
    }

    @Override
    public Position_directory updateImpl(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws SystemException {
        position_directory = toUnwrappedModel(position_directory);

        boolean isNew = position_directory.isNew();

        Session session = null;

        try {
            session = openSession();

            if (position_directory.isNew()) {
                session.save(position_directory);

                position_directory.setNew(false);
            } else {
                session.merge(position_directory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
            Position_directoryImpl.class, position_directory.getPrimaryKey(),
            position_directory);

        return position_directory;
    }

    protected Position_directory toUnwrappedModel(
        Position_directory position_directory) {
        if (position_directory instanceof Position_directoryImpl) {
            return position_directory;
        }

        Position_directoryImpl position_directoryImpl = new Position_directoryImpl();

        position_directoryImpl.setNew(position_directory.isNew());
        position_directoryImpl.setPrimaryKey(position_directory.getPrimaryKey());

        position_directoryImpl.setPosition_directoryID(position_directory.getPosition_directoryID());
        position_directoryImpl.setName(position_directory.getName());
        position_directoryImpl.setArchival_status(position_directory.isArchival_status());

        return position_directoryImpl;
    }

    /**
     * Returns the position_directory with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the position_directory
     * @return the position_directory
     * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position_directory findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPosition_directoryException, SystemException {
        Position_directory position_directory = fetchByPrimaryKey(primaryKey);

        if (position_directory == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPosition_directoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return position_directory;
    }

    /**
     * Returns the position_directory with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException} if it could not be found.
     *
     * @param position_directoryID the primary key of the position_directory
     * @return the position_directory
     * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position_directory findByPrimaryKey(long position_directoryID)
        throws NoSuchPosition_directoryException, SystemException {
        return findByPrimaryKey((Serializable) position_directoryID);
    }

    /**
     * Returns the position_directory with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the position_directory
     * @return the position_directory, or <code>null</code> if a position_directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position_directory fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Position_directory position_directory = (Position_directory) EntityCacheUtil.getResult(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
                Position_directoryImpl.class, primaryKey);

        if (position_directory == _nullPosition_directory) {
            return null;
        }

        if (position_directory == null) {
            Session session = null;

            try {
                session = openSession();

                position_directory = (Position_directory) session.get(Position_directoryImpl.class,
                        primaryKey);

                if (position_directory != null) {
                    cacheResult(position_directory);
                } else {
                    EntityCacheUtil.putResult(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
                        Position_directoryImpl.class, primaryKey,
                        _nullPosition_directory);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Position_directoryModelImpl.ENTITY_CACHE_ENABLED,
                    Position_directoryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return position_directory;
    }

    /**
     * Returns the position_directory with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param position_directoryID the primary key of the position_directory
     * @return the position_directory, or <code>null</code> if a position_directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position_directory fetchByPrimaryKey(long position_directoryID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) position_directoryID);
    }

    /**
     * Returns all the position_directories.
     *
     * @return the position_directories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Position_directory> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Position_directory> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Position_directory> findAll(int start, int end,
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

        List<Position_directory> list = (List<Position_directory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POSITION_DIRECTORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POSITION_DIRECTORY;

                if (pagination) {
                    sql = sql.concat(Position_directoryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Position_directory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Position_directory>(list);
                } else {
                    list = (List<Position_directory>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the position_directories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Position_directory position_directory : findAll()) {
            remove(position_directory);
        }
    }

    /**
     * Returns the number of position_directories.
     *
     * @return the number of position_directories
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

                Query q = session.createQuery(_SQL_COUNT_POSITION_DIRECTORY);

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
     * Initializes the position_directory persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.wartemw.staff_register.build_service.model.Position_directory")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Position_directory>> listenersList = new ArrayList<ModelListener<Position_directory>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Position_directory>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Position_directoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
