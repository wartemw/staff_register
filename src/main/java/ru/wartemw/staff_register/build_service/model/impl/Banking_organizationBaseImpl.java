package ru.wartemw.staff_register.build_service.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import ru.wartemw.staff_register.build_service.model.Banking_organization;
import ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil;

/**
 * The extended model base implementation for the Banking_organization service. Represents a row in the &quot;staff_register_Banking_organization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Banking_organizationImpl}.
 * </p>
 *
 * @author wARTEMw
 * @see Banking_organizationImpl
 * @see ru.wartemw.staff_register.build_service.model.Banking_organization
 * @generated
 */
public abstract class Banking_organizationBaseImpl
    extends Banking_organizationModelImpl implements Banking_organization {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a banking_organization model instance should use the {@link Banking_organization} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Banking_organizationLocalServiceUtil.addBanking_organization(this);
        } else {
            Banking_organizationLocalServiceUtil.updateBanking_organization(this);
        }
    }
}
