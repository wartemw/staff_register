package ru.wartemw.staff_register.build_service.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.wartemw.staff_register.build_service.model.Position_directory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Position_directory in entity cache.
 *
 * @author wARTEMw
 * @see Position_directory
 * @generated
 */
public class Position_directoryCacheModel implements CacheModel<Position_directory>,
    Externalizable {
    public long position_directoryID;
    public String name;
    public boolean archival_status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{position_directoryID=");
        sb.append(position_directoryID);
        sb.append(", name=");
        sb.append(name);
        sb.append(", archival_status=");
        sb.append(archival_status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Position_directory toEntityModel() {
        Position_directoryImpl position_directoryImpl = new Position_directoryImpl();

        position_directoryImpl.setPosition_directoryID(position_directoryID);

        if (name == null) {
            position_directoryImpl.setName(StringPool.BLANK);
        } else {
            position_directoryImpl.setName(name);
        }

        position_directoryImpl.setArchival_status(archival_status);

        position_directoryImpl.resetOriginalValues();

        return position_directoryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        position_directoryID = objectInput.readLong();
        name = objectInput.readUTF();
        archival_status = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(position_directoryID);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeBoolean(archival_status);
    }
}
