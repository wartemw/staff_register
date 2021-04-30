package ru.wartemw.staff_register.build_service.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.wartemw.staff_register.build_service.service.ClpSerializer;
import ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Position_directoryClp extends BaseModelImpl<Position_directory>
    implements Position_directory {
    private long _position_directoryID;
    private String _name;
    private boolean _archival_status;
    private BaseModel<?> _position_directoryRemoteModel;
    private Class<?> _clpSerializerClass = ru.wartemw.staff_register.build_service.service.ClpSerializer.class;

    public Position_directoryClp() {
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
    public long getPrimaryKey() {
        return _position_directoryID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPosition_directoryID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _position_directoryID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getPosition_directoryID() {
        return _position_directoryID;
    }

    @Override
    public void setPosition_directoryID(long position_directoryID) {
        _position_directoryID = position_directoryID;

        if (_position_directoryRemoteModel != null) {
            try {
                Class<?> clazz = _position_directoryRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_directoryID",
                        long.class);

                method.invoke(_position_directoryRemoteModel,
                    position_directoryID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_position_directoryRemoteModel != null) {
            try {
                Class<?> clazz = _position_directoryRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_position_directoryRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchival_status() {
        return _archival_status;
    }

    @Override
    public boolean isArchival_status() {
        return _archival_status;
    }

    @Override
    public void setArchival_status(boolean archival_status) {
        _archival_status = archival_status;

        if (_position_directoryRemoteModel != null) {
            try {
                Class<?> clazz = _position_directoryRemoteModel.getClass();

                Method method = clazz.getMethod("setArchival_status",
                        boolean.class);

                method.invoke(_position_directoryRemoteModel, archival_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPosition_directoryRemoteModel() {
        return _position_directoryRemoteModel;
    }

    public void setPosition_directoryRemoteModel(
        BaseModel<?> position_directoryRemoteModel) {
        _position_directoryRemoteModel = position_directoryRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _position_directoryRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_position_directoryRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Position_directoryLocalServiceUtil.addPosition_directory(this);
        } else {
            Position_directoryLocalServiceUtil.updatePosition_directory(this);
        }
    }

    @Override
    public Position_directory toEscapedModel() {
        return (Position_directory) ProxyUtil.newProxyInstance(Position_directory.class.getClassLoader(),
            new Class[] { Position_directory.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Position_directoryClp clone = new Position_directoryClp();

        clone.setPosition_directoryID(getPosition_directoryID());
        clone.setName(getName());
        clone.setArchival_status(getArchival_status());

        return clone;
    }

    @Override
    public int compareTo(Position_directory position_directory) {
        long primaryKey = position_directory.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Position_directoryClp)) {
            return false;
        }

        Position_directoryClp position_directory = (Position_directoryClp) obj;

        long primaryKey = position_directory.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{position_directoryID=");
        sb.append(getPosition_directoryID());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", archival_status=");
        sb.append(getArchival_status());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append(
            "ru.wartemw.staff_register.build_service.model.Position_directory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>position_directoryID</column-name><column-value><![CDATA[");
        sb.append(getPosition_directoryID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archival_status</column-name><column-value><![CDATA[");
        sb.append(getArchival_status());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
