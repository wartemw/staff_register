package ru.wartemw.staff_register.build_service.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil;
import ru.wartemw.staff_register.build_service.service.ClpSerializer;
import ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil;
import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            Banking_organizationLocalServiceUtil.clearService();

            Position_directoryLocalServiceUtil.clearService();

            WorkerLocalServiceUtil.clearService();
        }
    }
}
