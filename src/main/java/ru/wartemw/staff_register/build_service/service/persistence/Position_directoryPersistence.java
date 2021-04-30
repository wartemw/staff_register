package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.wartemw.staff_register.build_service.model.Position_directory;

/**
 * The persistence interface for the position_directory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wARTEMw
 * @see Position_directoryPersistenceImpl
 * @see Position_directoryUtil
 * @generated
 */
public interface Position_directoryPersistence extends BasePersistence<Position_directory> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Position_directoryUtil} to access the position_directory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the position_directory in the entity cache if it is enabled.
    *
    * @param position_directory the position_directory
    */
    public void cacheResult(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory);

    /**
    * Caches the position_directories in the entity cache if it is enabled.
    *
    * @param position_directories the position_directories
    */
    public void cacheResult(
        java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> position_directories);

    /**
    * Creates a new position_directory with the primary key. Does not add the position_directory to the database.
    *
    * @param position_directoryID the primary key for the new position_directory
    * @return the new position_directory
    */
    public ru.wartemw.staff_register.build_service.model.Position_directory create(
        long position_directoryID);

    /**
    * Removes the position_directory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory that was removed
    * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Position_directory remove(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException;

    public ru.wartemw.staff_register.build_service.model.Position_directory updateImpl(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the position_directory with the primary key or throws a {@link ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException} if it could not be found.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory
    * @throws ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Position_directory findByPrimaryKey(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException;

    /**
    * Returns the position_directory with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param position_directoryID the primary key of the position_directory
    * @return the position_directory, or <code>null</code> if a position_directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.wartemw.staff_register.build_service.model.Position_directory fetchByPrimaryKey(
        long position_directoryID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the position_directories.
    *
    * @return the position_directories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.wartemw.staff_register.build_service.model.Position_directory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the position_directories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of position_directories.
    *
    * @return the number of position_directories
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
