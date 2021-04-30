package ru.wartemw.staff_register.build_service.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.wartemw.staff_register.build_service.model.Worker;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Worker in entity cache.
 *
 * @author wARTEMw
 * @see Worker
 * @generated
 */
public class WorkerCacheModel implements CacheModel<Worker>, Externalizable {
    public long workerID;
    public String surname;
    public String name;
    public String patronymic;
    public String gender;
    public long date_of_birth;
    public long date_of_employment;
    public long salary_level;
    public long work_number;
    public long telephone_number;
    public boolean archival_status;
    public long position_directoryID;
    public long banking_organizationID;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{workerID=");
        sb.append(workerID);
        sb.append(", surname=");
        sb.append(surname);
        sb.append(", name=");
        sb.append(name);
        sb.append(", patronymic=");
        sb.append(patronymic);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", date_of_birth=");
        sb.append(date_of_birth);
        sb.append(", date_of_employment=");
        sb.append(date_of_employment);
        sb.append(", salary_level=");
        sb.append(salary_level);
        sb.append(", work_number=");
        sb.append(work_number);
        sb.append(", telephone_number=");
        sb.append(telephone_number);
        sb.append(", archival_status=");
        sb.append(archival_status);
        sb.append(", position_directoryID=");
        sb.append(position_directoryID);
        sb.append(", banking_organizationID=");
        sb.append(banking_organizationID);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Worker toEntityModel() {
        WorkerImpl workerImpl = new WorkerImpl();

        workerImpl.setWorkerID(workerID);

        if (surname == null) {
            workerImpl.setSurname(StringPool.BLANK);
        } else {
            workerImpl.setSurname(surname);
        }

        if (name == null) {
            workerImpl.setName(StringPool.BLANK);
        } else {
            workerImpl.setName(name);
        }

        if (patronymic == null) {
            workerImpl.setPatronymic(StringPool.BLANK);
        } else {
            workerImpl.setPatronymic(patronymic);
        }

        if (gender == null) {
            workerImpl.setGender(StringPool.BLANK);
        } else {
            workerImpl.setGender(gender);
        }

        if (date_of_birth == Long.MIN_VALUE) {
            workerImpl.setDate_of_birth(null);
        } else {
            workerImpl.setDate_of_birth(new Date(date_of_birth));
        }

        if (date_of_employment == Long.MIN_VALUE) {
            workerImpl.setDate_of_employment(null);
        } else {
            workerImpl.setDate_of_employment(new Date(date_of_employment));
        }

        workerImpl.setSalary_level(salary_level);
        workerImpl.setWork_number(work_number);
        workerImpl.setTelephone_number(telephone_number);
        workerImpl.setArchival_status(archival_status);
        workerImpl.setPosition_directoryID(position_directoryID);
        workerImpl.setBanking_organizationID(banking_organizationID);

        workerImpl.resetOriginalValues();

        return workerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        workerID = objectInput.readLong();
        surname = objectInput.readUTF();
        name = objectInput.readUTF();
        patronymic = objectInput.readUTF();
        gender = objectInput.readUTF();
        date_of_birth = objectInput.readLong();
        date_of_employment = objectInput.readLong();
        salary_level = objectInput.readLong();
        work_number = objectInput.readLong();
        telephone_number = objectInput.readLong();
        archival_status = objectInput.readBoolean();
        position_directoryID = objectInput.readLong();
        banking_organizationID = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(workerID);

        if (surname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(surname);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (patronymic == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(patronymic);
        }

        if (gender == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gender);
        }

        objectOutput.writeLong(date_of_birth);
        objectOutput.writeLong(date_of_employment);
        objectOutput.writeLong(salary_level);
        objectOutput.writeLong(work_number);
        objectOutput.writeLong(telephone_number);
        objectOutput.writeBoolean(archival_status);
        objectOutput.writeLong(position_directoryID);
        objectOutput.writeLong(banking_organizationID);
    }
}
