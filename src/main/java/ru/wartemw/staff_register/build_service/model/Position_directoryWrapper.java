package ru.wartemw.staff_register.build_service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Position_directory}.
 * </p>
 *
 * @author wARTEMw
 * @see Position_directory
 * @generated
 */
public class Position_directoryWrapper implements Position_directory,
    ModelWrapper<Position_directory> {
    private Position_directory _position_directory;

    public Position_directoryWrapper(Position_directory position_directory) {
        _position_directory = position_directory;
    }

    @Override
    public Class<?> getModelClass() {
        return Position_directory.class;
    }

    @Override
    public String getModelClassName() {
        return Position_directory.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("position_directoryID", getPosition_directoryID());
        attributes.put("name", getName());
        attributes.put("archival_status", getArchival_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long position_directoryID = (Long) attributes.get(
                "position_directoryID");

        if (position_directoryID != null) {
            setPosition_directoryID(position_directoryID);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Boolean archival_status = (Boolean) attributes.get("archival_status");

        if (archival_status != null) {
            setArchival_status(archival_status);
        }
    }

    /**
    * Returns the primary key of this position_directory.
    *
    * @return the primary key of this position_directory
    */
    @Override
    public long getPrimaryKey() {
        return _position_directory.getPrimaryKey();
    }

    /**
    * Sets the primary key of this position_directory.
    *
    * @param primaryKey the primary key of this position_directory
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _position_directory.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the position_directory i d of this position_directory.
    *
    * @return the position_directory i d of this position_directory
    */
    @Override
    public long getPosition_directoryID() {
        return _position_directory.getPosition_directoryID();
    }

    /**
    * Sets the position_directory i d of this position_directory.
    *
    * @param position_directoryID the position_directory i d of this position_directory
    */
    @Override
    public void setPosition_directoryID(long position_directoryID) {
        _position_directory.setPosition_directoryID(position_directoryID);
    }

    /**
    * Returns the name of this position_directory.
    *
    * @return the name of this position_directory
    */
    @Override
    public java.lang.String getName() {
        return _position_directory.getName();
    }

    /**
    * Sets the name of this position_directory.
    *
    * @param name the name of this position_directory
    */
    @Override
    public void setName(java.lang.String name) {
        _position_directory.setName(name);
    }

    /**
    * Returns the archival_status of this position_directory.
    *
    * @return the archival_status of this position_directory
    */
    @Override
    public boolean getArchival_status() {
        return _position_directory.getArchival_status();
    }

    /**
    * Returns <code>true</code> if this position_directory is archival_status.
    *
    * @return <code>true</code> if this position_directory is archival_status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchival_status() {
        return _position_directory.isArchival_status();
    }

    /**
    * Sets whether this position_directory is archival_status.
    *
    * @param archival_status the archival_status of this position_directory
    */
    @Override
    public void setArchival_status(boolean archival_status) {
        _position_directory.setArchival_status(archival_status);
    }

    @Override
    public boolean isNew() {
        return _position_directory.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _position_directory.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _position_directory.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _position_directory.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _position_directory.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _position_directory.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _position_directory.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _position_directory.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _position_directory.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _position_directory.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _position_directory.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Position_directoryWrapper((Position_directory) _position_directory.clone());
    }

    @Override
    public int compareTo(
        ru.wartemw.staff_register.build_service.model.Position_directory position_directory) {
        return _position_directory.compareTo(position_directory);
    }

    @Override
    public int hashCode() {
        return _position_directory.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.wartemw.staff_register.build_service.model.Position_directory> toCacheModel() {
        return _position_directory.toCacheModel();
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory toEscapedModel() {
        return new Position_directoryWrapper(_position_directory.toEscapedModel());
    }

    @Override
    public ru.wartemw.staff_register.build_service.model.Position_directory toUnescapedModel() {
        return new Position_directoryWrapper(_position_directory.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _position_directory.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _position_directory.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _position_directory.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Position_directoryWrapper)) {
            return false;
        }

        Position_directoryWrapper position_directoryWrapper = (Position_directoryWrapper) obj;

        if (Validator.equals(_position_directory,
                    position_directoryWrapper._position_directory)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Position_directory getWrappedPosition_directory() {
        return _position_directory;
    }

    @Override
    public Position_directory getWrappedModel() {
        return _position_directory;
    }

    @Override
    public void resetOriginalValues() {
        _position_directory.resetOriginalValues();
    }
}
