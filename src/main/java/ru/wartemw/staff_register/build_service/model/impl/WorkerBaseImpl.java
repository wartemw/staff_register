package ru.wartemw.staff_register.build_service.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import ru.wartemw.staff_register.build_service.model.Worker;
import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;

/**
 * The extended model base implementation for the Worker service. Represents a row in the &quot;staff_register_Worker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkerImpl}.
 * </p>
 *
 * @author wARTEMw
 * @see WorkerImpl
 * @see ru.wartemw.staff_register.build_service.model.Worker
 * @generated
 */
public abstract class WorkerBaseImpl extends WorkerModelImpl implements Worker {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a worker model instance should use the {@link Worker} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            WorkerLocalServiceUtil.addWorker(this);
        } else {
            WorkerLocalServiceUtil.updateWorker(this);
        }
    }
}
