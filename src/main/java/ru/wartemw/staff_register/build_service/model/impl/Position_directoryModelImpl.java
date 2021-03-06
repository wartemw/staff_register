package ru.wartemw.staff_register.build_service.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import ru.wartemw.staff_register.build_service.model.Position_directory;
import ru.wartemw.staff_register.build_service.model.Position_directoryModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Position_directory service. Represents a row in the &quot;staff_register_Position_directory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ru.wartemw.staff_register.build_service.model.Position_directoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Position_directoryImpl}.
 * </p>
 *
 * @author wARTEMw
 * @see Position_directoryImpl
 * @see ru.wartemw.staff_register.build_service.model.Position_directory
 * @see ru.wartemw.staff_register.build_service.model.Position_directoryModel
 * @generated
 */
public class Position_directoryModelImpl extends BaseModelImpl<Position_directory>
    implements Position_directoryModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a position_directory model instance should use the {@link ru.wartemw.staff_register.build_service.model.Position_directory} interface instead.
     */
    public static final String TABLE_NAME = "staff_register_Position_directory";
    public static final Object[][] TABLE_COLUMNS = {
            { "position_directoryID", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "archival_status", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table staff_register_Position_directory (position_directoryID LONG not null primary key,name VARCHAR(75) null,archival_status BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table staff_register_Position_directory";
    public static final String ORDER_BY_JPQL = " ORDER BY position_directory.position_directoryID ASC";
    public static final String ORDER_BY_SQL = " ORDER BY staff_register_Position_directory.position_directoryID ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.ru.wartemw.staff_register.build_service.model.Position_directory"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.ru.wartemw.staff_register.build_service.model.Position_directory"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.ru.wartemw.staff_register.build_service.model.Position_directory"));
    private static ClassLoader _classLoader = Position_directory.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Position_directory.class
        };
    private long _position_directoryID;
    private String _name;
    private boolean _archival_status;
    private Position_directory _escapedModel;

    public Position_directoryModelImpl() {
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

    @Override
    public long getPosition_directoryID() {
        return _position_directoryID;
    }

    @Override
    public void setPosition_directoryID(long position_directoryID) {
        _position_directoryID = position_directoryID;
    }

    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
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
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Position_directory.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Position_directory toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Position_directory) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        Position_directoryImpl position_directoryImpl = new Position_directoryImpl();

        position_directoryImpl.setPosition_directoryID(getPosition_directoryID());
        position_directoryImpl.setName(getName());
        position_directoryImpl.setArchival_status(getArchival_status());

        position_directoryImpl.resetOriginalValues();

        return position_directoryImpl;
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

        if (!(obj instanceof Position_directory)) {
            return false;
        }

        Position_directory position_directory = (Position_directory) obj;

        long primaryKey = position_directory.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Position_directory> toCacheModel() {
        Position_directoryCacheModel position_directoryCacheModel = new Position_directoryCacheModel();

        position_directoryCacheModel.position_directoryID = getPosition_directoryID();

        position_directoryCacheModel.name = getName();

        String name = position_directoryCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            position_directoryCacheModel.name = null;
        }

        position_directoryCacheModel.archival_status = getArchival_status();

        return position_directoryCacheModel;
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
