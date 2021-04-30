package ru.wartemw.staff_register.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.wartemw.staff_register.build_service.model.Position_directory;
import ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil;
import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;

import javax.portlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Position_directoryPortlet extends MVCPortlet {
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException, IOException {



        super.render(renderRequest, renderResponse);

    }

    public void changePosition_organizationArchivalStatus(ActionRequest request, ActionResponse response) {
        long position_directoryID = ParamUtil.getLong(request, "position_directoryID");
        Position_directoryLocalServiceUtil.changePosition_directoryArchivalStatus(position_directoryID);
    }

    public void editPosition_organization(ActionRequest request, ActionResponse response) {

        long position_directoryID = ParamUtil.getLong(request, "position_directoryID");

        String name = ParamUtil.getString(request, "name");
        boolean archival_status = ParamUtil.getBoolean(request, "archival_status");

        if (position_directoryID != 0) {
            Position_directoryLocalServiceUtil.updatePosition_directory(position_directoryID,name,archival_status);

            Logger.getLogger(Position_directoryPortlet.class.getName()).log(
                    Level.SEVERE, null, "Изменил сотрудника.");
        } else {
            Position_directoryLocalServiceUtil.addPosition_directory(name,archival_status);

            Logger.getLogger(Position_directoryPortlet.class.getName()).log(
                    Level.SEVERE, null, "Добавил сотрудника.");
        }

    }

    public void deletePosition_organization(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        long position_directoryID = ParamUtil.getLong(request, "position_directoryID");

        Position_directoryLocalServiceUtil.deletePosition_directory(position_directoryID);
    }

}
