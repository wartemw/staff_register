package ru.wartemw.staff_register.build_service.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.wartemw.staff_register.build_service.service.ClpSerializer;
import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class WorkerClp extends BaseModelImpl<Worker> implements Worker {
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
    private BaseModel<?> _workerRemoteModel;
    private Class<?> _clpSerializerClass = ru.wartemw.staff_register.build_service.service.ClpSerializer.class;

    public WorkerClp() {
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
    public long getPrimaryKey() {
        return _workerID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setWorkerID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _workerID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getWorkerID() {
        return _workerID;
    }

    @Override
    public void setWorkerID(long workerID) {
        _workerID = workerID;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setWorkerID", long.class);

                method.invoke(_workerRemoteModel, workerID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSurname() {
        return _surname;
    }

    @Override
    public void setSurname(String surname) {
        _surname = surname;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setSurname", String.class);

                method.invoke(_workerRemoteModel, surname);
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

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_workerRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPatronymic() {
        return _patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setPatronymic", String.class);

                method.invoke(_workerRemoteModel, patronymic);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGender() {
        return _gender;
    }

    @Override
    public void setGender(String gender) {
        _gender = gender;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", String.class);

                method.invoke(_workerRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDate_of_birth() {
        return _date_of_birth;
    }

    @Override
    public void setDate_of_birth(Date date_of_birth) {
        _date_of_birth = date_of_birth;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_birth", Date.class);

                method.invoke(_workerRemoteModel, date_of_birth);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDate_of_employment() {
        return _date_of_employment;
    }

    @Override
    public void setDate_of_employment(Date date_of_employment) {
        _date_of_employment = date_of_employment;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_employment",
                        Date.class);

                method.invoke(_workerRemoteModel, date_of_employment);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSalary_level() {
        return _salary_level;
    }

    @Override
    public void setSalary_level(long salary_level) {
        _salary_level = salary_level;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary_level", long.class);

                method.invoke(_workerRemoteModel, salary_level);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getWork_number() {
        return _work_number;
    }

    @Override
    public void setWork_number(long work_number) {
        _work_number = work_number;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setWork_number", long.class);

                method.invoke(_workerRemoteModel, work_number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTelephone_number() {
        return _telephone_number;
    }

    @Override
    public void setTelephone_number(long telephone_number) {
        _telephone_number = telephone_number;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setTelephone_number",
                        long.class);

                method.invoke(_workerRemoteModel, telephone_number);
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

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setArchival_status",
                        boolean.class);

                method.invoke(_workerRemoteModel, archival_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPosition_directoryID() {
        return _position_directoryID;
    }

    @Override
    public void setPosition_directoryID(long position_directoryID) {
        _position_directoryID = position_directoryID;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_directoryID",
                        long.class);

                method.invoke(_workerRemoteModel, position_directoryID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBanking_organizationID() {
        return _banking_organizationID;
    }

    @Override
    public void setBanking_organizationID(long banking_organizationID) {
        _banking_organizationID = banking_organizationID;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setBanking_organizationID",
                        long.class);

                method.invoke(_workerRemoteModel, banking_organizationID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getWorkerRemoteModel() {
        return _workerRemoteModel;
    }

    public void setWorkerRemoteModel(BaseModel<?> workerRemoteModel) {
        _workerRemoteModel = workerRemoteModel;
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

        Class<?> remoteModelClass = _workerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_workerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            WorkerLocalServiceUtil.addWorker(this);
        } else {
            WorkerLocalServiceUtil.updateWorker(this);
        }
    }

    @Override
    public Worker toEscapedModel() {
        return (Worker) ProxyUtil.newProxyInstance(Worker.class.getClassLoader(),
            new Class[] { Worker.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        WorkerClp clone = new WorkerClp();

        clone.setWorkerID(getWorkerID());
        clone.setSurname(getSurname());
        clone.setName(getName());
        clone.setPatronymic(getPatronymic());
        clone.setGender(getGender());
        clone.setDate_of_birth(getDate_of_birth());
        clone.setDate_of_employment(getDate_of_employment());
        clone.setSalary_level(getSalary_level());
        clone.setWork_number(getWork_number());
        clone.setTelephone_number(getTelephone_number());
        clone.setArchival_status(getArchival_status());
        clone.setPosition_directoryID(getPosition_directoryID());
        clone.setBanking_organizationID(getBanking_organizationID());

        return clone;
    }

    @Override
    public int compareTo(Worker worker) {
        long primaryKey = worker.getPrimaryKey();

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

        if (!(obj instanceof WorkerClp)) {
            return false;
        }

        WorkerClp worker = (WorkerClp) obj;

        long primaryKey = worker.getPrimaryKey();

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
        StringBundler sb = new StringBundler(27);

        sb.append("{workerID=");
        sb.append(getWorkerID());
        sb.append(", surname=");
        sb.append(getSurname());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", patronymic=");
        sb.append(getPatronymic());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append(", date_of_birth=");
        sb.append(getDate_of_birth());
        sb.append(", date_of_employment=");
        sb.append(getDate_of_employment());
        sb.append(", salary_level=");
        sb.append(getSalary_level());
        sb.append(", work_number=");
        sb.append(getWork_number());
        sb.append(", telephone_number=");
        sb.append(getTelephone_number());
        sb.append(", archival_status=");
        sb.append(getArchival_status());
        sb.append(", position_directoryID=");
        sb.append(getPosition_directoryID());
        sb.append(", banking_organizationID=");
        sb.append(getBanking_organizationID());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("ru.wartemw.staff_register.build_service.model.Worker");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>workerID</column-name><column-value><![CDATA[");
        sb.append(getWorkerID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>surname</column-name><column-value><![CDATA[");
        sb.append(getSurname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>patronymic</column-name><column-value><![CDATA[");
        sb.append(getPatronymic());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_birth</column-name><column-value><![CDATA[");
        sb.append(getDate_of_birth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_employment</column-name><column-value><![CDATA[");
        sb.append(getDate_of_employment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary_level</column-name><column-value><![CDATA[");
        sb.append(getSalary_level());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>work_number</column-name><column-value><![CDATA[");
        sb.append(getWork_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>telephone_number</column-name><column-value><![CDATA[");
        sb.append(getTelephone_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archival_status</column-name><column-value><![CDATA[");
        sb.append(getArchival_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position_directoryID</column-name><column-value><![CDATA[");
        sb.append(getPosition_directoryID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>banking_organizationID</column-name><column-value><![CDATA[");
        sb.append(getBanking_organizationID());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
