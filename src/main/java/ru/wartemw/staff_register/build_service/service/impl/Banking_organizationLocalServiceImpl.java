package ru.wartemw.staff_register.build_service.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.wartemw.staff_register.build_service.NoSuchBanking_organizationException;
import ru.wartemw.staff_register.build_service.model.Banking_organization;
import ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil;
import ru.wartemw.staff_register.build_service.service.base.Banking_organizationLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The implementation of the banking_organization local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.wartemw.staff_register.build_service.service.Banking_organizationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author wARTEMw
 * @see ru.wartemw.staff_register.build_service.service.base.Banking_organizationLocalServiceBaseImpl
 * @see ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil
 */
public class Banking_organizationLocalServiceImpl
        extends Banking_organizationLocalServiceBaseImpl {

    public Banking_organization createEntity() {
        Banking_organization banking_organization = banking_organizationPersistence.create(0);
        banking_organization.setName("");
        banking_organization.setIdentification_code(0);
        banking_organization.setAddress("");
        return banking_organization;
    }

    public Banking_organization addBanking_organization(String name, int identification_code, String address) {
        try {
            long banking_organizationID = counterLocalService.increment(Banking_organization.class.getName());

            Banking_organization banking_organization = banking_organizationPersistence.create(banking_organizationID);

            banking_organization.setName(name);
            banking_organization.setIdentification_code(identification_code);
            banking_organization.setAddress(address);

            super.addBanking_organization(banking_organization);

        } catch (SystemException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[addBanking_organization] ошибка с подключением базы данных!");
        }
        return createEntity();
    }

    @Override
    public Banking_organization deleteBanking_organization(long position_directoryId) {
        try {
            Banking_organization banking_organization = banking_organizationPersistence.findByPrimaryKey(position_directoryId);
            return deleteBanking_organization(banking_organization);
        } catch (NoSuchBanking_organizationException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[deleteBanking_organization] пользователя с таким id не существует в базе данных: " + position_directoryId + "!");
        } catch (SystemException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[deleteBanking_organization] ошибка с подключением базы данных!");
        }
        return createEntity();
    }

    public Banking_organization getBanking_organization(long banking_organizationId) {
        try {
            return banking_organizationPersistence.findByPrimaryKey(banking_organizationId);
        } catch (NoSuchBanking_organizationException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[getBanking_organization] пользователя с таким id не существует в базе данных: " + banking_organizationId + "!");
        } catch (SystemException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[getBanking_organization] ошибка с подключением базы данных!");
        }
        return createEntity();
    }

    public List<Banking_organization> getBanking_organizationList() {
        try {
            return banking_organizationPersistence.findAll();
        } catch (SystemException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[getBanking_organizationList] ошибка с подключением базы данных!");
        }
        return new ArrayList<Banking_organization>();
    }

    public Banking_organization updateBanking_organization(long banking_organizationId,
                                                           String name, int identification_code, String address) {
        try {
            Banking_organization banking_organization = Banking_organizationLocalServiceUtil.fetchBanking_organization(banking_organizationId);

            banking_organization.setName(name);
            banking_organization.setIdentification_code(identification_code);
            banking_organization.setAddress(address);

            super.updateBanking_organization(banking_organization);

        } catch (SystemException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "[updateBanking_organization] ошибка с подключением базы данных!");
        }
        return createEntity();
    }
}
