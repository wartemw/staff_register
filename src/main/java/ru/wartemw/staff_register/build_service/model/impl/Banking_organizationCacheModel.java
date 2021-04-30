package ru.wartemw.staff_register.build_service.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.wartemw.staff_register.build_service.model.Banking_organization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Banking_organization in entity cache.
 *
 * @author wARTEMw
 * @see Banking_organization
 * @generated
 */
public class Banking_organizationCacheModel implements CacheModel<Banking_organization>,
    Externalizable {
    public long banking_organizationID;
    public String name;
    public int identification_code;
    public String address;
    public long workerID;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{banking_organizationID=");
        sb.append(banking_organizationID);
        sb.append(", name=");
        sb.append(name);
        sb.append(", identification_code=");
        sb.append(identification_code);
        sb.append(", address=");
        sb.append(address);
        sb.append(", workerID=");
        sb.append(workerID);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Banking_organization toEntityModel() {
        Banking_organizationImpl banking_organizationImpl = new Banking_organizationImpl();

        banking_organizationImpl.setBanking_organizationID(banking_organizationID);

        if (name == null) {
            banking_organizationImpl.setName(StringPool.BLANK);
        } else {
            banking_organizationImpl.setName(name);
        }

        banking_organizationImpl.setIdentification_code(identification_code);

        if (address == null) {
            banking_organizationImpl.setAddress(StringPool.BLANK);
        } else {
            banking_organizationImpl.setAddress(address);
        }

        banking_organizationImpl.setWorkerID(workerID);

        banking_organizationImpl.resetOriginalValues();

        return banking_organizationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        banking_organizationID = objectInput.readLong();
        name = objectInput.readUTF();
        identification_code = objectInput.readInt();
        address = objectInput.readUTF();
        workerID = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(banking_organizationID);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeInt(identification_code);

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }

        objectOutput.writeLong(workerID);
    }
}
