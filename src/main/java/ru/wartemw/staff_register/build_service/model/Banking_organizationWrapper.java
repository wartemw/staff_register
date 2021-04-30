package ru.wartemw.staff_register.build_service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Banking_organization}.
 * </p>
 *
 * @author wARTEMw
 * @see Banking_organization
 * @generated
 */
public class Banking_organizationWrapper implements Banking_organization,
    ModelWrapper<Banking_organization> {
    private Banking_organization _banking_organization;

    public Banking_organizationWrapper(
        Banking_organization banking_organization) {
        _banking_organization = banking_organization;
    }

    @Override
    public Class<?> getModelClass() {
        return Banking_organization.class;
    }

    @Override
    public String getModelClassName() {
        return Banking_organization.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("banking_organizationID", getBanking_organizationID());
        attributes.put("name", getName());
        attributes.put("identification_code", getIdentification_code());
        attributes.put("address", getAddress());
        attributes.put("workerID", getWorkerID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long banking_organizationID = (Long) attributes.get(
                "banking_organizationID");

        if (banking_organizationID != null) {
            setBanking_organizationID(banking_organizationID);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Integer identification_code = (Integer) attributes.get(
                "identification_code");

        if (identification_code != null) {
            setIdentification_code(identification_code);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        Long workerID = (Long) attributes.get("workerID");

        if (workerID != null) {
            setWorkerID(workerID);
        }
    }

    /**
    * Returns the primary key of this banking_organization.
    *
    * @return the primary key of this banking_organization
    */
    @Override
    public long getPrimaryKey() {
        return _banking_organization.getPrimaryKey();
    }

    /**
    * Sets the primary key of this banking_organization.
    *
    * @param primaryKey the primary key of this banking_organization
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _banking_organization.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the banking_organization i d of this banking_organization.
    *
    * @return the banking_organization i d of this banking_organization
    */
    @Override
    public long getBanking_organizationID() {
        return _banking_organization.getBanking_organizationID();
    }

    /**
    * Sets the banking_organization i d of this banking_organization.
    *
    * @param banking_organizationID the banking_organization i d of this banking_organization
    */
    @Override
    public void setBanking_organizationID(long banking_organizationID) {
        _banking_organization.setBanking_organizationID(banking_organizationID);
    }

    /**
    * Returns the name of this banking_organization.
    *
    * @return the name of this banking_organization
    */
    @Override
    public java.lang.String getName() {
        return _banking_organization.getName();
    }

    /**
    * Sets the name of this banking_organization.
    *
    * @param name the name of this banking_organization
    */
    @Override
    public void setName(java.lang.String name) {
        _banking_organization.setName(name);
    }

    /**
    * Returns the identification_code of this banking_organization.
    *
    * @return the identification_code of this banking_organization
    */
    @Override
    public int getIdentification_code() {
        return _banking_organization.getIdentification_code();
    }

    /**
    * Sets the identification_code of this banking_organization.
    *
    * @param identification_code the identification_code of this banking_organization
    */
    @Override
    public void setIdentification_code(int identification_code) {
        _banking_organization.setIdentification_code(identification_code);
    }

    /**
    * Returns the address of this banking_organization.
    *
    * @return the address of this banking_organization
    */
    @Override
    public java.lang.String getAddress() {
        return _banking_organization.getAddress();
    }

    /**
    * Sets the address of this banking_organization.
    *
    * @param address the address of this banking_organization
    */
    @Override
    public void setAddress(java.lang.String address) {
        _banking_organization.setAddress(address);
    }

    /**
    * Returns the worker i d of this banking_organization.
    *
    * @return the worker i d of this banking_organization
    */
    @Override
    public long getWorkerID() {
        return _banking_organization.getWorkerID();
    }

    /**
    * Sets the worker i d of this banking_organization.
    *
    * @param workerID the worker i d of this banking_organization
    */
    @Override
    public void setWorkerID(long workerID) {
        _banking_organization.setWorkerID(workerID);
    }

    @Override
    public boolean isNew() {
        return _banking_organization.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _banking_organization.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _banking_organization.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _banking_organization.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _banking_organization.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _banking_organization.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _banking_organization.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _banking_organization.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _banking_organization.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _banking_organization.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _banking_organization.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Banking_organizationWrapper((Banking_organization) _banking_organization.clone());
    }

    @Override
    public int compareTo(
        ru.wartemw.staff_register.build_service.model.Banking_organization banking_organization) {
        return _banking_organization.compareTo(banking_organization);
    }

    @Override
    public int hashCode() {
        return _banking_organization.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.wartemw.staff_register.build_service.model.Banking_organization> toCacheModel() {
        return _banking_organization.toCacheModel();
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization toEscapedModel() {
        return new Banking_organizationWrapper(_banking_organization.toEscapedModel());
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Banking_organization toUnescapedModel() {
        return new Banking_organizationWrapper(_banking_organization.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _banking_organization.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _banking_organization.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _banking_organization.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Banking_organizationWrapper)) {
            return false;
        }

        Banking_organizationWrapper banking_organizationWrapper = (Banking_organizationWrapper) obj;

        if (Validator.equals(_banking_organization,
                    banking_organizationWrapper._banking_organization)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Banking_organization getWrappedBanking_organization() {
        return _banking_organization;
    }

    @Override
    public Banking_organization getWrappedModel() {
        return _banking_organization;
    }

    @Override
    public void resetOriginalValues() {
        _banking_organization.resetOriginalValues();
    }
}
