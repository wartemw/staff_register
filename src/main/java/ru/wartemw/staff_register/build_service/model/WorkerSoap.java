package ru.wartemw.staff_register.build_service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author wARTEMw
 * @generated
 */
public class WorkerSoap implements Serializable {
    private long _workerID;
    private String _surname;
    private String _name;
    private String _patronymic;
    private String _gender;
    private Date _date_of_birth;
    private Date _date_of_employment;
    private long _salary_level;
    private long _work_number;
    private long _telephone_number;
    private boolean _archival_status;
    private long _position_directoryID;
    private long _banking_organizationID;

    public WorkerSoap() {
    }

    public static WorkerSoap toSoapModel(Worker model) {
        WorkerSoap soapModel = new WorkerSoap();

        soapModel.setWorkerID(model.getWorkerID());
        soapModel.setSurname(model.getSurname());
        soapModel.setName(model.getName());
        soapModel.setPatronymic(model.getPatronymic());
        soapModel.setGender(model.getGender());
        soapModel.setDate_of_birth(model.getDate_of_birth());
        soapModel.setDate_of_employment(model.getDate_of_employment());
        soapModel.setSalary_level(model.getSalary_level());
        soapModel.setWork_number(model.getWork_number());
        soapModel.setTelephone_number(model.getTelephone_number());
        soapModel.setArchival_status(model.getArchival_status());
        soapModel.setPosition_directoryID(model.getPosition_directoryID());
        soapModel.setBanking_organizationID(model.getBanking_organizationID());

        return soapModel;
    }

    public static WorkerSoap[] toSoapModels(Worker[] models) {
        WorkerSoap[] soapModels = new WorkerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static WorkerSoap[][] toSoapModels(Worker[][] models) {
        WorkerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new WorkerSoap[models.length][models[0].length];
        } else {
            soapModels = new WorkerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static WorkerSoap[] toSoapModels(List<Worker> models) {
        List<WorkerSoap> soapModels = new ArrayList<WorkerSoap>(models.size());

        for (Worker model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new WorkerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _workerID;
    }

    public void setPrimaryKey(long pk) {
        setWorkerID(pk);
    }

    public long getWorkerID() {
        return _workerID;
    }

    public void setWorkerID(long workerID) {
        _workerID = workerID;
    }

    public String getSurname() {
        return _surname;
    }

    public void setSurname(String surname) {
        _surname = surname;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getPatronymic() {
        return _patronymic;
    }

    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;
    }

    public String getGender() {
        return _gender;
    }

    public void setGender(String gender) {
        _gender = gender;
    }

    public Date getDate_of_birth() {
        return _date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        _date_of_birth = date_of_birth;
    }

    public Date getDate_of_employment() {
        return _date_of_employment;
    }

    public void setDate_of_employment(Date date_of_employment) {
        _date_of_employment = date_of_employment;
    }

    public long getSalary_level() {
        return _salary_level;
    }

    public void setSalary_level(long salary_level) {
        _salary_level = salary_level;
    }

    public long getWork_number() {
        return _work_number;
    }

    public void setWork_number(long work_number) {
        _work_number = work_number;
    }

    public long getTelephone_number() {
        return _telephone_number;
    }

    public void setTelephone_number(long telephone_number) {
        _telephone_number = telephone_number;
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

    public long getPosition_directoryID() {
        return _position_directoryID;
    }

    public void setPosition_directoryID(long position_directoryID) {
        _position_directoryID = position_directoryID;
    }

    public long getBanking_organizationID() {
        return _banking_organizationID;
    }

    public void setBanking_organizationID(long banking_organizationID) {
        _banking_organizationID = banking_organizationID;
    }
}
