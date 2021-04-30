package ru.wartemw.staff_register.build_service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author wARTEMw
 * @generated
 */
public class Position_directorySoap implements Serializable {
    private long _position_directoryID;
    private String _name;
    private boolean _archival_status;

    public Position_directorySoap() {
    }

    public static Position_directorySoap toSoapModel(Position_directory model) {
        Position_directorySoap soapModel = new Position_directorySoap();

        soapModel.setPosition_directoryID(model.getPosition_directoryID());
        soapModel.setName(model.getName());
        soapModel.setArchival_status(model.getArchival_status());

        return soapModel;
    }

    public static Position_directorySoap[] toSoapModels(
        Position_directory[] models) {
        Position_directorySoap[] soapModels = new Position_directorySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Position_directorySoap[][] toSoapModels(
        Position_directory[][] models) {
        Position_directorySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Position_directorySoap[models.length][models[0].length];
        } else {
            soapModels = new Position_directorySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Position_directorySoap[] toSoapModels(
        List<Position_directory> models) {
        List<Position_directorySoap> soapModels = new ArrayList<Position_directorySoap>(models.size());

        for (Position_directory model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Position_directorySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _position_directoryID;
    }

    public void setPrimaryKey(long pk) {
        setPosition_directoryID(pk);
    }

    public long getPosition_directoryID() {
        return _position_directoryID;
    }

    public void setPosition_directoryID(long position_directoryID) {
        _position_directoryID = position_directoryID;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public boolean getArchival_status() {
        return _archival_status;
    }

    public boolean isArchival_status() {
        return _archival_status;
    }

    public void setArchival_status(boolean archival_status) {
        _archival_status = archival_status;
    }
}
