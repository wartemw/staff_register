package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.wartemw.staff_register.build_service.model.Worker;
import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;

/**
 * @author wARTEMw
 * @generated
 */
public abstract class WorkerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public WorkerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(WorkerLocalServiceUtil.getService());
        setClass(Worker.class);

        setClassLoader(ru.wartemw.staff_register.build_service.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("workerID");
    }
}
