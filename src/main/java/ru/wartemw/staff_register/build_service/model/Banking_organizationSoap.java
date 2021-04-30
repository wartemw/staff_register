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
public class Banking_organizationSoap implements Serializable {
    private long _banking_organizationID;
    private String _name;
    private int _identification_code;
    private String _address;
    private long _workerID;

    public Banking_organizationSoap() {
    }

    public static Banking_organizationSoap toSoapModel(
        Banking_organization model) {
        Banking_organizationSoap soapModel = new Banking_organizationSoap();

        soapModel.setBanking_organizationID(model.getBanking_organizationID());
        soapModel.setName(model.getName());
        soapModel.setIdentification_code(model.getIdentification_code());
        soapModel.setAddress(model.getAddress());
        soapModel.setWorkerID(model.getWorkerID());

        return soapModel;
    }

    public static Banking_organizationSoap[] toSoapModels(
        Banking_organization[] models) {
        Banking_organizationSoap[] soapModels = new Banking_organizationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Banking_organizationSoap[][] toSoapModels(
        Banking_organization[][] models) {
        Banking_organizationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Banking_organizationSoap[models.length][models[0].length];
        } else {
            soapModels = new Banking_organizationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Banking_organizationSoap[] toSoapModels(
        List<Banking_organization> models) {
        List<Banking_organizationSoap> soapModels = new ArrayList<Banking_organizationSoap>(models.size());

        for (Banking_organization model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Banking_organizationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _banking_organizationID;
    }

    public void setPrimaryKey(long pk) {
        setBanking_organizationID(pk);
    }

    public long getBanking_organizationID() {
        return _banking_organizationID;
    }

    public void setBanking_organizationID(long banking_organizationID) {
        _banking_organizationID = banking_organizationID;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getIdentification_code() {
        return _identification_code;
    }

    public void setIdentification_code(int identification_code) {
        _identification_code = identification_code;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public long getWorkerID() {
        return _workerID;
    }

    public void setWorkerID(long workerID) {
        _workerID = workerID;
    }
}
