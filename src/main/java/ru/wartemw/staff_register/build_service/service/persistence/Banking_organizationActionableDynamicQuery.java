package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.wartemw.staff_register.build_service.model.Banking_organization;
import ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil;

/**
 * @author wARTEMw
 * @generated
 */
public abstract class Banking_organizationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Banking_organizationActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(Banking_organizationLocalServiceUtil.getService());
        setClass(Banking_organization.class);

        setClassLoader(ru.wartemw.staff_register.build_service.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("banking_organizationID");
    }
}
