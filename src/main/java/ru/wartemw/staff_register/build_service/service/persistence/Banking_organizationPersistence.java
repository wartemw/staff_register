package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.wartemw.staff_register.build_service.model.Banking_organization;

/**
 * The persistence interface for the banking_organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see Banking_organizationPersistenceImpl
 * @see Banking_organizationUtil
 * @generated
 */
public interface Banking_organizationPersistence extends BasePersistence<Banking_organization> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Banking_organizationUtil} to access the banking_organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the banking_organizations where workerID = &#63;.
    *
    * @param workerID the worker i d
    * @return the matching banking_organizations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> findByworkerID(
        long workerID)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> findByworkerID(
        long workerID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> findByworkerID(
        long workerID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first banking_organization in the ordered set where workerID = &#63;.
    *
    * @param workerID the worker i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching banking_organization
    * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a matching banking_organization could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization findByworkerID_First(
        long workerID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException;

    /**
    * Returns the first banking_organization in the ordered set where workerID = &#63;.
    *
    * @param workerID the worker i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching banking_organization, or <code>null</code> if a matching banking_organization could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization fetchByworkerID_First(
        long workerID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last banking_organization in the ordered set where workerID = &#63;.
    *
    * @param workerID the worker i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching banking_organization
    * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a matching banking_organization could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization findByworkerID_Last(
        long workerID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException;

    /**
    * Returns the last banking_organization in the ordered set where workerID = &#63;.
    *
    * @param workerID the worker i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching banking_organization, or <code>null</code> if a matching banking_organization could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization fetchByworkerID_Last(
        long workerID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.wartemw.staff_register.build_service.model.Banking_organization[] findByworkerID_PrevAndNext(
        long banking_organizationID, long workerID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException;

    /**
    * Removes all the banking_organizations where workerID = &#63; from the database.
    *
    * @param workerID the worker i d
    * @throws SystemException if a system exception occurred
    */
    public void removeByworkerID(long workerID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of banking_organizations where workerID = &#63;.
    *
    * @param workerID the worker i d
    * @return the number of matching banking_organizations
    * @throws SystemException if a system exception occurred
    */
    public int countByworkerID(long workerID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the banking_organization in the entity cache if it is enabled.
    *
    * @param banking_organization the banking_organization
    */
    public void cacheResult(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization);

    /**
    * Caches the banking_organizations in the entity cache if it is enabled.
    *
    * @param banking_organizations the banking_organizations
    */
    public void cacheResult(
        java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> banking_organizations);

    /**
    * Creates a new banking_organization with the primary key. Does not add the banking_organization to the database.
    *
    * @param banking_organizationID the primary key for the new banking_organization
    * @return the new banking_organization
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization create(
        long banking_organizationID);

    /**
    * Removes the banking_organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param banking_organizationID the primary key of the banking_organization
    * @return the banking_organization that was removed
    * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a banking_organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization remove(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException;

    public ru.wartemw.staff_register.build_service.model.Banking_organization updateImpl(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the banking_organization with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException} if it could not be found.
    *
    * @param banking_organizationID the primary key of the banking_organization
    * @return the banking_organization
    * @throws ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException if a banking_organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization findByPrimaryKey(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException;

    /**
    * Returns the banking_organization with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param banking_organizationID the primary key of the banking_organization
    * @return the banking_organization, or <code>null</code> if a banking_organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Banking_organization fetchByPrimaryKey(
        long banking_organizationID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the banking_organizations.
    *
    * @return the banking_organizations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Banking_organization> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the banking_organizations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of banking_organizations.
    *
    * @return the number of banking_organizations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
