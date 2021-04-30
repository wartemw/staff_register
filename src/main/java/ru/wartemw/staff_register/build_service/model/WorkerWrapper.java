package ru.wartemw.staff_register.build_service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Worker}.
 * </p>
 *
 * @author wARTEMw
 * @see Worker
 * @generated
 */
public class WorkerWrapper implements Worker, ModelWrapper<Worker> {
    private Worker _worker;

    public WorkerWrapper(Worker worker) {
        _worker = worker;
    }

    @Override
    public Class<?> getModelClass() {
        return Worker.class;
    }

    @Override
    public String getModelClassName() {
        return Worker.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("workerID", getWorkerID());
        attributes.put("surname", getSurname());
        attributes.put("name", getName());
        attributes.put("patronymic", getPatronymic());
        attributes.put("gender", getGender());
        attributes.put("date_of_birth", getDate_of_birth());
        attributes.put("date_of_employment", getDate_of_employment());
        attributes.put("salary_level", getSalary_level());
        attributes.put("work_number", getWork_number());
        attributes.put("telephone_number", getTelephone_number());
        attributes.put("archival_status", getArchival_status());
        attributes.put("position_directoryID", getPosition_directoryID());
        attributes.put("banking_organizationID", getBanking_organizationID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long workerID = (Long) attributes.get("workerID");

        if (workerID != null) {
            setWorkerID(workerID);
        }

        String surname = (String) attributes.get("surname");

        if (surname != null) {
            setSurname(surname);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String patronymic = (String) attributes.get("patronymic");

        if (patronymic != null) {
            setPatronymic(patronymic);
        }

        String gender = (String) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        Date date_of_birth = (Date) attributes.get("date_of_birth");

        if (date_of_birth != null) {
            setDate_of_birth(date_of_birth);
        }

        Date date_of_employment = (Date) attributes.get("date_of_employment");

        if (date_of_employment != null) {
            setDate_of_employment(date_of_employment);
        }

        Long salary_level = (Long) attributes.get("salary_level");

        if (salary_level != null) {
            setSalary_level(salary_level);
        }

        Long work_number = (Long) attributes.get("work_number");

        if (work_number != null) {
            setWork_number(work_number);
        }

        Long telephone_number = (Long) attributes.get("telephone_number");

        if (telephone_number != null) {
            setTelephone_number(telephone_number);
        }

        Boolean archival_status = (Boolean) attributes.get("archival_status");

        if (archival_status != null) {
            setArchival_status(archival_status);
        }

        Long position_directoryID = (Long) attributes.get(
                "position_directoryID");

        if (position_directoryID != null) {
            setPosition_directoryID(position_directoryID);
        }

        Long banking_organizationID = (Long) attributes.get(
                "banking_organizationID");

        if (banking_organizationID != null) {
            setBanking_organizationID(banking_organizationID);
        }
    }

    /**
    * Returns the primary key of this worker.
    *
    * @return the primary key of this worker
    */
    @Override
    public long getPrimaryKey() {
        return _worker.getPrimaryKey();
    }

    /**
    * Sets the primary key of this worker.
    *
    * @param primaryKey the primary key of this worker
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _worker.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the worker i d of this worker.
    *
    * @return the worker i d of this worker
    */
    @Override
    public long getWorkerID() {
        return _worker.getWorkerID();
    }

    /**
    * Sets the worker i d of this worker.
    *
    * @param workerID the worker i d of this worker
    */
    @Override
    public void setWorkerID(long workerID) {
        _worker.setWorkerID(workerID);
    }

    /**
    * Returns the surname of this worker.
    *
    * @return the surname of this worker
    */
    @Override
    public java.lang.String getSurname() {
        return _worker.getSurname();
    }

    /**
    * Sets the surname of this worker.
    *
    * @param surname the surname of this worker
    */
    @Override
    public void setSurname(java.lang.String surname) {
        _worker.setSurname(surname);
    }

    /**
    * Returns the name of this worker.
    *
    * @return the name of this worker
    */
    @Override
    public java.lang.String getName() {
        return _worker.getName();
    }

    /**
    * Sets the name of this worker.
    *
    * @param name the name of this worker
    */
    @Override
    public void setName(java.lang.String name) {
        _worker.setName(name);
    }

    /**
    * Returns the patronymic of this worker.
    *
    * @return the patronymic of this worker
    */
    @Override
    public java.lang.String getPatronymic() {
        return _worker.getPatronymic();
    }

    /**
    * Sets the patronymic of this worker.
    *
    * @param patronymic the patronymic of this worker
    */
    @Override
    public void setPatronymic(java.lang.String patronymic) {
        _worker.setPatronymic(patronymic);
    }

    /**
    * Returns the gender of this worker.
    *
    * @return the gender of this worker
    */
    @Override
    public java.lang.String getGender() {
        return _worker.getGender();
    }

    /**
    * Sets the gender of this worker.
    *
    * @param gender the gender of this worker
    */
    @Override
    public void setGender(java.lang.String gender) {
        _worker.setGender(gender);
    }

    /**
    * Returns the date_of_birth of this worker.
    *
    * @return the date_of_birth of this worker
    */
    @Override
    public java.util.Date getDate_of_birth() {
        return _worker.getDate_of_birth();
    }

    /**
    * Sets the date_of_birth of this worker.
    *
    * @param date_of_birth the date_of_birth of this worker
    */
    @Override
    public void setDate_of_birth(java.util.Date date_of_birth) {
        _worker.setDate_of_birth(date_of_birth);
    }

    /**
    * Returns the date_of_employment of this worker.
    *
    * @return the date_of_employment of this worker
    */
    @Override
    public java.util.Date getDate_of_employment() {
        return _worker.getDate_of_employment();
    }

    /**
    * Sets the date_of_employment of this worker.
    *
    * @param date_of_employment the date_of_employment of this worker
    */
    @Override
    public void setDate_of_employment(java.util.Date date_of_employment) {
        _worker.setDate_of_employment(date_of_employment);
    }

    /**
    * Returns the salary_level of this worker.
    *
    * @return the salary_level of this worker
    */
    @Override
    public long getSalary_level() {
        return _worker.getSalary_level();
    }

    /**
    * Sets the salary_level of this worker.
    *
    * @param salary_level the salary_level of this worker
    */
    @Override
    public void setSalary_level(long salary_level) {
        _worker.setSalary_level(salary_level);
    }

    /**
    * Returns the work_number of this worker.
    *
    * @return the work_number of this worker
    */
    @Override
    public long getWork_number() {
        return _worker.getWork_number();
    }

    /**
    * Sets the work_number of this worker.
    *
    * @param work_number the work_number of this worker
    */
    @Override
    public void setWork_number(long work_number) {
        _worker.setWork_number(work_number);
    }

    /**
    * Returns the telephone_number of this worker.
    *
    * @return the telephone_number of this worker
    */
    @Override
    public long getTelephone_number() {
        return _worker.getTelephone_number();
    }

    /**
    * Sets the telephone_number of this worker.
    *
    * @param telephone_number the telephone_number of this worker
    */
    @Override
    public void setTelephone_number(long telephone_number) {
        _worker.setTelephone_number(telephone_number);
    }

    /**
    * Returns the archival_status of this worker.
    *
    * @return the archival_status of this worker
    */
    @Override
    public boolean getArchival_status() {
        return _worker.getArchival_status();
    }

    /**
    * Returns <code>true</code> if this worker is archival_status.
    *
    * @return <code>true</code> if this worker is archival_status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchival_status() {
        return _worker.isArchival_status();
    }

    /**
    * Sets whether this worker is archival_status.
    *
    * @param archival_status the archival_status of this worker
    */
    @Override
    public void setArchival_status(boolean archival_status) {
        _worker.setArchival_status(archival_status);
    }

    /**
    * Returns the position_directory i d of this worker.
    *
    * @return the position_directory i d of this worker
    */
    @Override
    public long getPosition_directoryID() {
        return _worker.getPosition_directoryID();
    }

    /**
    * Sets the position_directory i d of this worker.
    *
    * @param position_directoryID the position_directory i d of this worker
    */
    @Override
    public void setPosition_directoryID(long position_directoryID) {
        _worker.setPosition_directoryID(position_directoryID);
    }

    /**
    * Returns the banking_organization i d of this worker.
    *
    * @return the banking_organization i d of this worker
    */
    @Override
    public long getBanking_organizationID() {
        return _worker.getBanking_organizationID();
    }

    /**
    * Sets the banking_organization i d of this worker.
    *
    * @param banking_organizationID the banking_organization i d of this worker
    */
    @Override
    public void setBanking_organizationID(long banking_organizationID) {
        _worker.setBanking_organizationID(banking_organizationID);
    }

    @Override
    public boolean isNew() {
        return _worker.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _worker.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _worker.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _worker.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _worker.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _worker.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _worker.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _worker.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _worker.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _worker.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _worker.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new WorkerWrapper((Worker) _worker.clone());
    }

    @Override
    public int compareTo(
        ru.wartemw.staff_register.build_service.model.Worker worker) {
        return _worker.compareTo(worker);
    }

    @Override
    public int hashCode() {
        return _worker.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.wartemw.staff_register.build_service.model.Worker> toCacheModel() {
        return _worker.toCacheModel();
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Worker toEscapedModel() {
        return new WorkerWrapper(_worker.toEscapedModel());
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Worker toUnescapedModel() {
        return new WorkerWrapper(_worker.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _worker.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _worker.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _worker.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof WorkerWrapper)) {
            return false;
        }

        WorkerWrapper workerWrapper = (WorkerWrapper) obj;

        if (Validator.equals(_worker, workerWrapper._worker)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Worker getWrappedWorker() {
        return _worker;
    }

    @Override
    public Worker getWrappedModel() {
        return _worker;
    }

    @Override
    public void resetOriginalValues() {
        _worker.resetOriginalValues();
    }
}
