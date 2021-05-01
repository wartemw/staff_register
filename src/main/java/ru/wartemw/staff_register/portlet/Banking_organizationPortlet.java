package ru.wartemw.staff_register.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Banking_organizationPortlet extends MVCPortlet {

    public void editBanking_organization(ActionRequest request, ActionResponse response) {

        long banking_organizationID = ParamUtil.getLong(request, "banking_organizationID");

        String name = ParamUtil.getString(request, "name");
        int identification_code = ParamUtil.getInteger(request, "identification_code");
        String address = ParamUtil.getString(request, "address");

        if (banking_organizationID != 0) {
            Banking_organizationLocalServiceUtil.updateBanking_organization(banking_organizationID, name, identification_code, address);

            Logger.getLogger(Banking_organizationPortlet.class.getName()).log(
                    Level.SEVERE, null, "Изменил банк.");
        } else {
            Banking_organizationLocalServiceUtil.addBanking_organization(name,identification_code,address);
            Logger.getLogger(Banking_organizationPortlet.class.getName()).log(
                    Level.SEVERE, null, "Добавил банк.");
        }

    }

    public void deleteBanking_organization(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        long banking_organizationID = ParamUtil.getLong(request, "banking_organizationID");
        Banking_organizationLocalServiceUtil.deleteBanking_organization(banking_organizationID);
    }

}
