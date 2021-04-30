package ru.wartemw.staff_register.build_service.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.wartemw.staff_register.build_service.NoSuchPosition_directoryException;
import ru.wartemw.staff_register.build_service.model.Position_directory;
import ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil;
import ru.wartemw.staff_register.build_service.service.base.Position_directoryLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the position_directory local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.wartemw.staff_register.build_service.service.Position_directoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author wARTEMw
 * @see ru.wartemw.staff_register.build_service.service.base.Position_directoryLocalServiceBaseImpl
 * @see ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil
 */
public class Position_directoryLocalServiceImpl
    extends Position_directoryLocalServiceBaseImpl {

    public Position_directory createEntity() {
        Position_directory position_directory = position_directoryPersistence.create(0);
        position_directory.setName("");
        position_directory.setArchival_status(false);

        return position_directory;
    }

    public Position_directory addPosition_directory(String name, boolean archival_status) {
        try {
            long position_directoryID = counterLocalService.increment(Position_directory.class.getName());

            Position_directory position_directory = position_directoryPersistence.create(position_directoryID);

            position_directory.setName(name);
            position_directory.setArchival_status(archival_status);

            super.addPosition_directory(position_directory);

        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }

    @Override
    public Position_directory deletePosition_directory(long position_directoryId) {
        try {
            Position_directory position_directory = position_directoryPersistence.findByPrimaryKey(position_directoryId);
            return deletePosition_directory(position_directory);
        } catch (NoSuchPosition_directoryException e) {
            //TODO добавить Logger
        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }

    public Position_directory getPosition_directory(long position_directoryId) {
        try {
            return position_directoryPersistence.findByPrimaryKey(position_directoryId);
        } catch (SystemException e) {
            //TODO добавить Logger
        } catch (NoSuchPosition_directoryException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }

    public Position_directory changePosition_directoryArchivalStatus(long position_directoryId) {
        try {
            Position_directory positionDirectory = Position_directoryLocalServiceUtil.fetchPosition_directory(position_directoryId);
            positionDirectory.setArchival_status(!positionDirectory.getArchival_status());
            super.updatePosition_directory(positionDirectory);
            return positionDirectory;
        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }

    public List<Position_directory> getPosition_directoryList() {
        try {
            return position_directoryPersistence.findAll();
        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return new ArrayList<Position_directory>();
    }

    public Position_directory updatePosition_directory(long position_directoryId, String name, boolean archival_status) {
        try {
            Position_directory position_directory = Position_directoryLocalServiceUtil.fetchPosition_directory(position_directoryId);

            position_directory.setName(name);
            position_directory.setArchival_status(archival_status);

            super.updatePosition_directory(position_directory);

        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return createEntity();


    }
}
