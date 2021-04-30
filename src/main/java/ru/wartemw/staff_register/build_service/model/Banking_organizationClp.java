package ru.wartemw.staff_register.build_service.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil;
import ru.wartemw.staff_register.build_service.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Banking_organizationClp extends BaseModelImpl<Banking_organization>
    implements Banking_organization {
    private long _banking_organizationID;
    private String _name;
    private int _identification_code;
    private String _address;
    private long _workerID;
    private BaseModel<?> _banking_organizationRemoteModel;
    private Class<?> _clpSerializerClass = ru.wartemw.staff_register.build_service.service.ClpSerializer.class;

    public Banking_organizationClp() {
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
    public long getPrimaryKey() {
        return _banking_organizationID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBanking_organizationID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _banking_organizationID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getBanking_organizationID() {
        return _banking_organizationID;
    }

    @Override
    public void setBanking_organizationID(long banking_organizationID) {
        _banking_organizationID = banking_organizationID;

        if (_banking_organizationRemoteModel != null) {
            try {
                Class<?> clazz = _banking_organizationRemoteModel.getClass();

                Method method = clazz.getMethod("setBanking_organizationID",
                        long.class);

                method.invoke(_banking_organizationRemoteModel,
                    banking_organizationID);
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

        if (_banking_organizationRemoteModel != null) {
            try {
                Class<?> clazz = _banking_organizationRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_banking_organizationRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getIdentification_code() {
        return _identification_code;
    }

    @Override
    public void setIdentification_code(int identification_code) {
        _identification_code = identification_code;

        if (_banking_organizationRemoteModel != null) {
            try {
                Class<?> clazz = _banking_organizationRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentification_code",
                        int.class);

                method.invoke(_banking_organizationRemoteModel,
                    identification_code);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAddress() {
        return _address;
    }

    @Override
    public void setAddress(String address) {
        _address = address;

        if (_banking_organizationRemoteModel != null) {
            try {
                Class<?> clazz = _banking_organizationRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_banking_organizationRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getWorkerID() {
        return _workerID;
    }

    @Override
    public void setWorkerID(long workerID) {
        _workerID = workerID;

        if (_banking_organizationRemoteModel != null) {
            try {
                Class<?> clazz = _banking_organizationRemoteModel.getClass();

                Method method = clazz.getMethod("setWorkerID", long.class);

                method.invoke(_banking_organizationRemoteModel, workerID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBanking_organizationRemoteModel() {
        return _banking_organizationRemoteModel;
    }

    public void setBanking_organizationRemoteModel(
        BaseModel<?> banking_organizationRemoteModel) {
        _banking_organizationRemoteModel = banking_organizationRemoteModel;
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

        Class<?> remoteModelClass = _banking_organizationRemoteModel.getClass();

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

        Object returnValue = method.invoke(_banking_organizationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Banking_organizationLocalServiceUtil.addBanking_organization(this);
        } else {
            Banking_organizationLocalServiceUtil.updateBanking_organization(this);
        }
    }

    @Override
    public Banking_organization toEscapedModel() {
        return (Banking_organization) ProxyUtil.newProxyInstance(Banking_organization.class.getClassLoader(),
            new Class[] { Banking_organization.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Banking_organizationClp clone = new Banking_organizationClp();

        clone.setBanking_organizationID(getBanking_organizationID());
        clone.setName(getName());
        clone.setIdentification_code(getIdentification_code());
        clone.setAddress(getAddress());
        clone.setWorkerID(getWorkerID());

        return clone;
    }

    @Override
    public int compareTo(Banking_organization banking_organization) {
        long primaryKey = banking_organization.getPrimaryKey();

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

        if (!(obj instanceof Banking_organizationClp)) {
            return false;
        }

        Banking_organizationClp banking_organization = (Banking_organizationClp) obj;

        long primaryKey = banking_organization.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{banking_organizationID=");
        sb.append(getBanking_organizationID());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", identification_code=");
        sb.append(getIdentification_code());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", workerID=");
        sb.append(getWorkerID());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append(
            "ru.wartemw.staff_register.build_service.model.Banking_organization");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>banking_organizationID</column-name><column-value><![CDATA[");
        sb.append(getBanking_organizationID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identification_code</column-name><column-value><![CDATA[");
        sb.append(getIdentification_code());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>workerID</column-name><column-value><![CDATA[");
        sb.append(getWorkerID());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
