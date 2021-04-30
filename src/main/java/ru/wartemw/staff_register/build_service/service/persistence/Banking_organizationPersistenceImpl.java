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

import ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException;
import ru.wartemw.staff_register.build_service.model.Banking_organization;
import ru.wartemw.staff_register.build_service.model.impl.Banking_organizationImpl;
import ru.wartemw.staff_register.build_service.model.impl.Banking_organizationModelImpl;
import ru.wartemw.staff_register.build_service.service.persistence.Banking_organizationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the banking_organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see Banking_organizationPersistence
 * @see Banking_organizationUtil
 * @generated
 */
public class Banking_organizationPersistenceImpl extends BasePersistenceImpl<Banking_organization>
    implements Banking_organizationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Banking_organizationUtil} to access the banking_organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Banking_organizationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationModelImpl.FINDER_CACHE_ENABLED,
            Banking_organizationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationModelImpl.FINDER_CACHE_ENABLED,
            Banking_organizationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WORKERID = new FinderPath(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationModelImpl.FINDER_CACHE_ENABLED,
            Banking_organizationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByworkerID",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKERID =
        new FinderPath(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationModelImpl.FINDER_CACHE_ENABLED,
            Banking_organizationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByworkerID",
            new String[] { Long.class.getName() },
            Banking_organizationModelImpl.WORKERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_WORKERID = new FinderPath(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByworkerID",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_WORKERID_WORKERID_2 = "banking_organization.workerID = ?";
    private static final String _SQL_SELECT_BANKING_ORGANIZATION = "SELECT banking_organization FROM Banking_organization banking_organization";
    private static final String _SQL_SELECT_BANKING_ORGANIZATION_WHERE = "SELECT banking_organization FROM Banking_organization banking_organization WHERE ";
    private static final String _SQL_COUNT_BANKING_ORGANIZATION = "SELECT COUNT(banking_organization) FROM Banking_organization banking_organization";
    private static final String _SQL_COUNT_BANKING_ORGANIZATION_WHERE = "SELECT COUNT(banking_organization) FROM Banking_organization banking_organization WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "banking_organization.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Banking_organization exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Banking_organization exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Banking_organizationPersistenceImpl.class);
    private static Banking_organization _nullBanking_organization = new Banking_organizationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Banking_organization> toCacheModel() {
                return _nullBanking_organizationCacheModel;
            }
        };

    private static CacheModel<Banking_organization> _nullBanking_organizationCacheModel =
        new CacheModel<Banking_organization>() {
            @Override
            public Banking_organization toEntityModel() {
                return _nullBanking_organization;
            }
        };

    public Banking_organizationPersistenceImpl() {
        setModelClass(Banking_organization.class);
    }

    /**
     * Returns all the banking_organizations where workerID = &#63;.
     *
     * @param workerID the worker i d
     * @return the matching banking_organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Banking_organization> findByworkerID(long workerID)
        throws SystemException {
        return findByworkerID(workerID, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the banking_organizations where workerID = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Banking_organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param workerID the worker i d
     * @param start the lower bound of the range of banking_organizations
     * @param end the upper bound of the range of banking_organizations (not inclusive)
     * @return the range of matching banking_organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Banking_organization> findByworkerID(long workerID, int start,
        int end) throws SystemException {
        return findByworkerID(workerID, start, end, null);
    }

    /**
     * Returns an ordered range of all the banking_organizations where workerID = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Banking_organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param workerID the worker i d
     * @param start the lower bound of the range of banking_organizations
     * @param end the upper bound of the range of banking_organizations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching banking_organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Banking_organization> findByworkerID(long workerID, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKERID;
            finderArgs = new Object[] { workerID };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WORKERID;
            finderArgs = new Object[] { workerID, start, end, orderByComparator };
        }

        List<Banking_organization> list = (List<Banking_organization>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Banking_organization banking_organization : list) {
                if ((workerID != banking_organization.getWorkerID())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BANKING_ORGANIZATION_WHERE);

            query.append(_FINDER_COLUMN_WORKERID_WORKERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Banking_organizationModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(workerID);

                if (!pagination) {
                    list = (List<Banking_organization>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Banking_organization>(list);
                } else {
                    list = (List<Banking_organization>) QueryUtil.list(q,
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
     * Returns the first banking_organization in the ordered set where workerID = &#63;.
     *
     * @param workerID the worker i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching banking_organization
     * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a matching banking_organization could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization findByworkerID_First(long workerID,
        OrderByComparator orderByComparator)
        throws NoSuchBanking_organizationException, SystemException {
        Banking_organization banking_organization = fetchByworkerID_First(workerID,
                orderByComparator);

        if (banking_organization != null) {
            return banking_organization;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("workerID=");
        msg.append(workerID);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBanking_organizationException(msg.toString());
    }

    /**
     * Returns the first banking_organization in the ordered set where workerID = &#63;.
     *
     * @param workerID the worker i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching banking_organization, or <code>null</code> if a matching banking_organization could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization fetchByworkerID_First(long workerID,
        OrderByComparator orderByComparator) throws SystemException {
        List<Banking_organization> list = findByworkerID(workerID, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last banking_organization in the ordered set where workerID = &#63;.
     *
     * @param workerID the worker i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching banking_organization
     * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a matching banking_organization could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization findByworkerID_Last(long workerID,
        OrderByComparator orderByComparator)
        throws NoSuchBanking_organizationException, SystemException {
        Banking_organization banking_organization = fetchByworkerID_Last(workerID,
                orderByComparator);

        if (banking_organization != null) {
            return banking_organization;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("workerID=");
        msg.append(workerID);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBanking_organizationException(msg.toString());
    }

    /**
     * Returns the last banking_organization in the ordered set where workerID = &#63;.
     *
     * @param workerID the worker i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching banking_organization, or <code>null</code> if a matching banking_organization could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization fetchByworkerID_Last(long workerID,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByworkerID(workerID);

        if (count == 0) {
            return null;
        }

        List<Banking_organization> list = findByworkerID(workerID, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the banking_organizations before and after the current banking_organization in the ordered set where workerID = &#63;.
     *
     * @param banking_organizationID the primary key of the current banking_organization
     * @param workerID the worker i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next banking_organization
     * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a banking_organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization[] findByworkerID_PrevAndNext(
        long banking_organizationID, long workerID,
        OrderByComparator orderByComparator)
        throws NoSuchBanking_organizationException, SystemException {
        Banking_organization banking_organization = findByPrimaryKey(banking_organizationID);

        Session session = null;

        try {
            session = openSession();

            Banking_organization[] array = new Banking_organizationImpl[3];

            array[0] = getByworkerID_PrevAndNext(session, banking_organization,
                    workerID, orderByComparator, true);

            array[1] = banking_organization;

            array[2] = getByworkerID_PrevAndNext(session, banking_organization,
                    workerID, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Banking_organization getByworkerID_PrevAndNext(Session session,
        Banking_organization banking_organization, long workerID,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKING_ORGANIZATION_WHERE);

        query.append(_FINDER_COLUMN_WORKERID_WORKERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(Banking_organizationModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(workerID);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(banking_organization);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Banking_organization> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the banking_organizations where workerID = &#63; from the database.
     *
     * @param workerID the worker i d
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByworkerID(long workerID) throws SystemException {
        for (Banking_organization banking_organization : findByworkerID(
                workerID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(banking_organization);
        }
    }

    /**
     * Returns the number of banking_organizations where workerID = &#63;.
     *
     * @param workerID the worker i d
     * @return the number of matching banking_organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByworkerID(long workerID) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_WORKERID;

        Object[] finderArgs = new Object[] { workerID };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BANKING_ORGANIZATION_WHERE);

            query.append(_FINDER_COLUMN_WORKERID_WORKERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(workerID);

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
     * Caches the banking_organization in the entity cache if it is enabled.
     *
     * @param banking_organization the banking_organization
     */
    @Override
    public void cacheResult(Banking_organization banking_organization) {
        EntityCacheUtil.putResult(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationImpl.class,
            banking_organization.getPrimaryKey(), banking_organization);

        banking_organization.resetOriginalValues();
    }

    /**
     * Caches the banking_organizations in the entity cache if it is enabled.
     *
     * @param banking_organizations the banking_organizations
     */
    @Override
    public void cacheResult(List<Banking_organization> banking_organizations) {
        for (Banking_organization banking_organization : banking_organizations) {
            if (EntityCacheUtil.getResult(
                        Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
                        Banking_organizationImpl.class,
                        banking_organization.getPrimaryKey()) == null) {
                cacheResult(banking_organization);
            } else {
                banking_organization.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all banking_organizations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Banking_organizationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Banking_organizationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the banking_organization.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Banking_organization banking_organization) {
        EntityCacheUtil.removeResult(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationImpl.class, banking_organization.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Banking_organization> banking_organizations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Banking_organization banking_organization : banking_organizations) {
            EntityCacheUtil.removeResult(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
                Banking_organizationImpl.class,
                banking_organization.getPrimaryKey());
        }
    }

    /**
     * Creates a new banking_organization with the primary key. Does not add the banking_organization to the database.
     *
     * @param banking_organizationID the primary key for the new banking_organization
     * @return the new banking_organization
     */
    @Override
    public Banking_organization create(long banking_organizationID) {
        Banking_organization banking_organization = new Banking_organizationImpl();

        banking_organization.setNew(true);
        banking_organization.setPrimaryKey(banking_organizationID);

        return banking_organization;
    }

    /**
     * Removes the banking_organization with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param banking_organizationID the primary key of the banking_organization
     * @return the banking_organization that was removed
     * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a banking_organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization remove(long banking_organizationID)
        throws NoSuchBanking_organizationException, SystemException {
        return remove((Serializable) banking_organizationID);
    }

    /**
     * Removes the banking_organization with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the banking_organization
     * @return the banking_organization that was removed
     * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a banking_organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization remove(Serializable primaryKey)
        throws NoSuchBanking_organizationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Banking_organization banking_organization = (Banking_organization) session.get(Banking_organizationImpl.class,
                    primaryKey);

            if (banking_organization == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBanking_organizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(banking_organization);
        } catch (NoSuchBanking_organizationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Banking_organization removeImpl(
        Banking_organization banking_organization) throws SystemException {
        banking_organization = toUnwrappedModel(banking_organization);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(banking_organization)) {
                banking_organization = (Banking_organization) session.get(Banking_organizationImpl.class,
                        banking_organization.getPrimaryKeyObj());
            }

            if (banking_organization != null) {
                session.delete(banking_organization);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (banking_organization != null) {
            clearCache(banking_organization);
        }

        return banking_organization;
    }

    @Override
    public Banking_organization updateImpl(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws SystemException {
        banking_organization = toUnwrappedModel(banking_organization);

        boolean isNew = banking_organization.isNew();

        Banking_organizationModelImpl banking_organizationModelImpl = (Banking_organizationModelImpl) banking_organization;

        Session session = null;

        try {
            session = openSession();

            if (banking_organization.isNew()) {
                session.save(banking_organization);

                banking_organization.setNew(false);
            } else {
                session.merge(banking_organization);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Banking_organizationModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((banking_organizationModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        banking_organizationModelImpl.getOriginalWorkerID()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WORKERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKERID,
                    args);

                args = new Object[] { banking_organizationModelImpl.getWorkerID() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WORKERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
            Banking_organizationImpl.class,
            banking_organization.getPrimaryKey(), banking_organization);

        return banking_organization;
    }

    protected Banking_organization toUnwrappedModel(
        Banking_organization banking_organization) {
        if (banking_organization instanceof Banking_organizationImpl) {
            return banking_organization;
        }

        Banking_organizationImpl banking_organizationImpl = new Banking_organizationImpl();

        banking_organizationImpl.setNew(banking_organization.isNew());
        banking_organizationImpl.setPrimaryKey(banking_organization.getPrimaryKey());

        banking_organizationImpl.setBanking_organizationID(banking_organization.getBanking_organizationID());
        banking_organizationImpl.setName(banking_organization.getName());
        banking_organizationImpl.setIdentification_code(banking_organization.getIdentification_code());
        banking_organizationImpl.setAddress(banking_organization.getAddress());
        banking_organizationImpl.setWorkerID(banking_organization.getWorkerID());

        return banking_organizationImpl;
    }

    /**
     * Returns the banking_organization with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the banking_organization
     * @return the banking_organization
     * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a banking_organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBanking_organizationException, SystemException {
        Banking_organization banking_organization = fetchByPrimaryKey(primaryKey);

        if (banking_organization == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBanking_organizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return banking_organization;
    }

    /**
     * Returns the banking_organization with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException} if it could not be found.
     *
     * @param banking_organizationID the primary key of the banking_organization
     * @return the banking_organization
     * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a banking_organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization findByPrimaryKey(long banking_organizationID)
        throws NoSuchBanking_organizationException, SystemException {
        return findByPrimaryKey((Serializable) banking_organizationID);
    }

    /**
     * Returns the banking_organization with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the banking_organization
     * @return the banking_organization, or <code>null</code> if a banking_organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Banking_organization banking_organization = (Banking_organization) EntityCacheUtil.getResult(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
                Banking_organizationImpl.class, primaryKey);

        if (banking_organization == _nullBanking_organization) {
            return null;
        }

        if (banking_organization == null) {
            Session session = null;

            try {
                session = openSession();

                banking_organization = (Banking_organization) session.get(Banking_organizationImpl.class,
                        primaryKey);

                if (banking_organization != null) {
                    cacheResult(banking_organization);
                } else {
                    EntityCacheUtil.putResult(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
                        Banking_organizationImpl.class, primaryKey,
                        _nullBanking_organization);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Banking_organizationModelImpl.ENTITY_CACHE_ENABLED,
                    Banking_organizationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return banking_organization;
    }

    /**
     * Returns the banking_organization with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param banking_organizationID the primary key of the banking_organization
     * @return the banking_organization, or <code>null</code> if a banking_organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Banking_organization fetchByPrimaryKey(long banking_organizationID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) banking_organizationID);
    }

    /**
     * Returns all the banking_organizations.
     *
     * @return the banking_organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Banking_organization> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Banking_organization> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the banking_organizations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.wartemw.staff_register.build_service.model.impl.Banking_organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of banking_organizations
     * @param end the upper bound of the range of banking_organizations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of banking_organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Banking_organization> findAll(int start, int end,
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

        List<Banking_organization> list = (List<Banking_organization>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BANKING_ORGANIZATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BANKING_ORGANIZATION;

                if (pagination) {
                    sql = sql.concat(Banking_organizationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Banking_organization>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Banking_organization>(list);
                } else {
                    list = (List<Banking_organization>) QueryUtil.list(q,
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
     * Removes all the banking_organizations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Banking_organization banking_organization : findAll()) {
            remove(banking_organization);
        }
    }

    /**
     * Returns the number of banking_organizations.
     *
     * @return the number of banking_organizations
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

                Query q = session.createQuery(_SQL_COUNT_BANKING_ORGANIZATION);

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
     * Initializes the banking_organization persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.wartemw.staff_register.build_service.model.Banking_organization")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Banking_organization>> listenersList = new ArrayList<ModelListener<Banking_organization>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Banking_organization>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Banking_organizationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
