package ru.wartemw.staff_register.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.wartemw.staff_register.build_service.model.Worker;
import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkerPortlet extends MVCPortlet {

    public void changeWorkerArchivalStatus(ActionRequest request, ActionResponse response) {
        long workerID = ParamUtil.getLong(request, "workerID");
        WorkerLocalServiceUtil.changeWorkerArchivalStatus(workerID);
    }

    public void editWorker(ActionRequest request, ActionResponse response) {
        long workerID = ParamUtil.getLong(request, "workerID");

        String surname = ParamUtil.getString(request, "surname");
        String name = ParamUtil.getString(request, "name");
        String patronymic = ParamUtil.getString(request, "patronymic");
        String gender = ParamUtil.getString(request, "gender");
        String date_of_birthString = ParamUtil.getString(request, "date_of_birth");
        long positionID = ParamUtil.getLong(request, "positionID");
        String date_of_employmentString = ParamUtil.getString(request, "date_of_employment");
        String salary_level = ParamUtil.getString(request, "salary_level");
        String work_number = ParamUtil.getString(request, "work_number");
        String telephone_number = ParamUtil.getString(request, "telephone_number");
        long banking_organizationID = ParamUtil.getLong(request, "banking_organizationID");
        String archival_status = ParamUtil.getString(request, "archival_status");

        Date date_of_birth = null;
        Date date_of_employment = null;
        try {
            date_of_birth = convert(date_of_birthString);
        } catch (ParseException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[editWorker] ошибка с конвертации даты: " + date_of_birthString + "!");
        }
        try {
            date_of_employment = convert(date_of_employmentString);
        } catch (ParseException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[editWorker] ошибка с конвертации даты: " + date_of_employmentString + "!");
        }

        if (workerID != 0) {
            WorkerLocalServiceUtil.updateWorker(workerID, surname, name, patronymic, gender, date_of_birth, positionID, date_of_employment,
                    Long.parseLong(salary_level), Long.parseLong(work_number), Long.parseLong(telephone_number),
                    banking_organizationID, Boolean.parseBoolean(archival_status));
        } else {
            WorkerLocalServiceUtil.addWorker(surname, name, patronymic, gender, date_of_birth, positionID, date_of_employment,
                    Long.parseLong(salary_level), Long.parseLong(work_number), Long.parseLong(telephone_number),
                    banking_organizationID, Boolean.parseBoolean(archival_status));
        }

    }

    public void sortWorkerByDate_of_birth(ActionRequest request, ActionResponse response) {
        Date date_of_birthIn = ParamUtil.getDate(request, "date_of_birthIn", new SimpleDateFormat("yyyy-MM-dd"));
        Date date_of_birthTo = ParamUtil.getDate(request, "date_of_birthTo", new SimpleDateFormat("yyyy-MM-dd"));

        List<Long> workerSortList = new ArrayList<Long>();

        List<Worker> workerList = WorkerLocalServiceUtil.getWorkerList();
        for (Worker worker : workerList) {
            Date date_of_birth = worker.getDate_of_birth();

            if (date_of_birth.after(date_of_birthIn) && date_of_birth.before(date_of_birthTo))
                workerSortList.add(worker.getWorkerID());
        }
        request.setAttribute("sorted", workerSortList.size() != 0);
        request.setAttribute("workerIdList", workerSortList);
    }


    public void deleteWorker(ActionRequest request, ActionResponse response) {
        long workerID = ParamUtil.getLong(request, "workerID");
        try {
            WorkerLocalServiceUtil.deleteWorker(workerID);
        } catch (PortalException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[deleteWorker] пользователя с таким id не существует в базе данных: " + workerID + "!");
        } catch (SystemException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[deleteWorker] ошибка с подключением базы данных!");
        }
    }

    private Date convert(String dateString) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
    }
}
