package ru.wartemw.staff_register.build_service.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.wartemw.staff_register.build_service.model.Position_directory;
import ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil;

/**
 * @author wARTEMw
 * @generated
 */
public abstract class Position_directoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Position_directoryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Position_directoryLocalServiceUtil.getService());
        setClass(Position_directory.class);

        setClassLoader(ru.wartemw.staff_register.build_service.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("position_directoryID");
    }
}
