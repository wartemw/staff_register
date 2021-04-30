package ru.wartemw.staff_register.build_service.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.wartemw.staff_register.build_service.NoSuchWorkerException;
import ru.wartemw.staff_register.build_service.model.Worker;
import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;
import ru.wartemw.staff_register.build_service.service.base.WorkerLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the worker local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.wartemw.staff_register.build_service.service.WorkerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author wARTEMw
 * @see ru.wartemw.staff_register.build_service.service.base.WorkerLocalServiceBaseImpl
 * @see ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil
 */
public class WorkerLocalServiceImpl extends WorkerLocalServiceBaseImpl {

    public Worker createEntity() {
        Worker worker = workerPersistence.create(0);
        worker.setSurname("");
        worker.setName("");
        worker.setPatronymic("");
        worker.setGender("");
        worker.setDate_of_birth(new Date());
        worker.setDate_of_employment(new Date());
        worker.setSalary_level(0);
        worker.setWork_number(0);
        worker.setTelephone_number(0);

        worker.setPosition_directoryID(0);
        worker.setBanking_organizationID(0);

        return worker;
    }

    public Worker addWorker(String surname, String name, String patronymic, String gender, Date date_of_birth,
                            long position, Date date_of_employment, long salary_level, long work_number,
                            long telephone_number, long banking_organization, boolean archival_status) {
        Worker worker = createEntity();
        try {
            long workerId = counterLocalService.increment(Worker.class.getName());

            worker = workerPersistence.create(workerId);

            worker.setSurname(surname);
            worker.setName(name);
            worker.setPatronymic(patronymic);
            worker.setGender(gender);
            worker.setDate_of_birth(date_of_birth);
            worker.setPosition_directoryID(position);
            worker.setDate_of_employment(date_of_employment);
            worker.setSalary_level(salary_level);
            worker.setWork_number(work_number);
            worker.setTelephone_number(telephone_number);
            worker.setBanking_organizationID(banking_organization);
            worker.setArchival_status(archival_status);

            super.addWorker(worker);

        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return worker;
    }

    @Override
    public Worker deleteWorker(long workerId) {
        try {
            Worker worker = workerPersistence.findByPrimaryKey(workerId);
            return deleteWorker(worker);
        } catch (SystemException e) {
            //TODO добавить Logger
        } catch (NoSuchWorkerException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }

    public Worker getWorker(long workerId) {
        try {
            return workerPersistence.findByPrimaryKey(workerId);
        } catch (SystemException e) {
            //TODO добавить Logger
        } catch (NoSuchWorkerException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }

    public Worker changeWorkerArchivalStatus(long workerId) {
        try {
            Worker worker = WorkerLocalServiceUtil.fetchWorker(workerId);
            worker.setArchival_status(!worker.getArchival_status());
            super.updateWorker(worker);
            return worker;
        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }

    public List<Worker> getWorkerListFromPosition_directory(long position_directoryID) {
        List<Worker> list = new ArrayList<Worker>();

        List<Worker> workerList = getWorkerList();
        for (Worker worker : workerList) {
            if (worker.getPosition_directoryID() == position_directoryID)
                list.add(worker);
        }

        return list;
    }

    public List<Worker> getWorkerListFromOrPosition_directory(long position_directoryID) {
        List<Worker> list = new ArrayList<Worker>();

        List<Worker> workerList = getWorkerList();
        for (Worker worker : workerList) {
            if (worker.getPosition_directoryID() != position_directoryID)
                list.add(worker);
        }

        return list;
    }

    public List<Worker> getWorkerList() {
        try {
            return workerPersistence.findAll();
        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return new ArrayList<Worker>();
    }

    public Worker updateWorker(long workerId, String surname, String name, String patronymic, String gender, Date date_of_birth,
                               long position, Date date_of_employment, long salary_level, long work_number,
                               long telephone_number, long banking_organization, boolean archival_status) {
        try {
            Worker worker = WorkerLocalServiceUtil.fetchWorker(workerId);

            worker.setSurname(surname);
            worker.setName(name);
            worker.setPatronymic(patronymic);
            worker.setGender(gender);
            worker.setDate_of_birth(date_of_birth);
            worker.setPosition_directoryID(position);
            worker.setDate_of_employment(date_of_employment);
            worker.setSalary_level(salary_level);
            worker.setWork_number(work_number);
            worker.setTelephone_number(telephone_number);
            worker.setBanking_organizationID(banking_organization);
            worker.setArchival_status(archival_status);

            super.updateWorker(worker);
        } catch (SystemException e) {
            //TODO добавить Logger
        }
        return createEntity();
    }
}
