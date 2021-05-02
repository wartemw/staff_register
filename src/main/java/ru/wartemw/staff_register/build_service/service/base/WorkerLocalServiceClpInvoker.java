package ru.wartemw.staff_register.build_service.service.base;

import ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil;

import java.util.Arrays;

/**
 * @author wARTEMw
 * @generated
 */
public class WorkerLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName40;
    private String[] _methodParameterTypes40;
    private String _methodName41;
    private String[] _methodParameterTypes41;
    private String _methodName46;
    private String[] _methodParameterTypes46;
    private String _methodName47;
    private String[] _methodParameterTypes47;
    private String _methodName48;
    private String[] _methodParameterTypes48;
    private String _methodName49;
    private String[] _methodParameterTypes49;
    private String _methodName50;
    private String[] _methodParameterTypes50;
    private String _methodName51;
    private String[] _methodParameterTypes51;
    private String _methodName52;
    private String[] _methodParameterTypes52;
    private String _methodName53;
    private String[] _methodParameterTypes53;
    private String _methodName54;
    private String[] _methodParameterTypes54;
    private String _methodName55;
    private String[] _methodParameterTypes55;

    public WorkerLocalServiceClpInvoker() {
        _methodName0 = "addWorker";

        _methodParameterTypes0 = new String[] {
                "ru.wartemw.staff_register.build_service.model.Worker"
            };

        _methodName1 = "createWorker";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteWorker";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteWorker";

        _methodParameterTypes3 = new String[] {
                "ru.wartemw.staff_register.build_service.model.Worker"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchWorker";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getWorker";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getWorkers";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getWorkersCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateWorker";

        _methodParameterTypes15 = new String[] {
                "ru.wartemw.staff_register.build_service.model.Worker"
            };

        _methodName40 = "getBeanIdentifier";

        _methodParameterTypes40 = new String[] {  };

        _methodName41 = "setBeanIdentifier";

        _methodParameterTypes41 = new String[] { "java.lang.String" };

        _methodName46 = "createEntity";

        _methodParameterTypes46 = new String[] {  };

        _methodName47 = "addWorker";

        _methodParameterTypes47 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.util.Date", "long", "java.util.Date",
                "long", "long", "long", "long", "boolean"
            };

        _methodName48 = "deleteWorker";

        _methodParameterTypes48 = new String[] { "long" };

        _methodName49 = "getWorker";

        _methodParameterTypes49 = new String[] { "long" };

        _methodName50 = "changeWorkerArchivalStatus";

        _methodParameterTypes50 = new String[] { "long" };

        _methodName51 = "getWorkerListFromPosition_directory";

        _methodParameterTypes51 = new String[] { "long" };

        _methodName52 = "getWorkerList";

        _methodParameterTypes52 = new String[] {  };

        _methodName53 = "updateWorker";

        _methodParameterTypes53 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.util.Date", "long",
                "java.util.Date", "long", "long", "long", "long", "boolean"
            };

        _methodName54 = "filterByDate";

        _methodParameterTypes54 = new String[] {
                "java.util.Date", "java.util.Date"
            };

        _methodName55 = "filterByName";

        _methodParameterTypes55 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return WorkerLocalServiceUtil.addWorker((ru.wartemw.staff_register.build_service.model.Worker) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return WorkerLocalServiceUtil.createWorker(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return WorkerLocalServiceUtil.deleteWorker(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return WorkerLocalServiceUtil.deleteWorker((ru.wartemw.staff_register.build_service.model.Worker) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return WorkerLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return WorkerLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return WorkerLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return WorkerLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return WorkerLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return WorkerLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return WorkerLocalServiceUtil.fetchWorker(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return WorkerLocalServiceUtil.getWorker(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return WorkerLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return WorkerLocalServiceUtil.getWorkers(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return WorkerLocalServiceUtil.getWorkersCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return WorkerLocalServiceUtil.updateWorker((ru.wartemw.staff_register.build_service.model.Worker) arguments[0]);
        }

        if (_methodName40.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
            return WorkerLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName41.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
            WorkerLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName46.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
            return WorkerLocalServiceUtil.createEntity();
        }

        if (_methodName47.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
            return WorkerLocalServiceUtil.addWorker((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3], (java.util.Date) arguments[4],
                ((Long) arguments[5]).longValue(),
                (java.util.Date) arguments[6],
                ((Long) arguments[7]).longValue(),
                ((Long) arguments[8]).longValue(),
                ((Long) arguments[9]).longValue(),
                ((Long) arguments[10]).longValue(),
                ((Boolean) arguments[11]).booleanValue());
        }

        if (_methodName48.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
            return WorkerLocalServiceUtil.deleteWorker(((Long) arguments[0]).longValue());
        }

        if (_methodName49.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
            return WorkerLocalServiceUtil.getWorker(((Long) arguments[0]).longValue());
        }

        if (_methodName50.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
            return WorkerLocalServiceUtil.changeWorkerArchivalStatus(((Long) arguments[0]).longValue());
        }

        if (_methodName51.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
            return WorkerLocalServiceUtil.getWorkerListFromPosition_directory(((Long) arguments[0]).longValue());
        }

        if (_methodName52.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
            return WorkerLocalServiceUtil.getWorkerList();
        }

        if (_methodName53.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
            return WorkerLocalServiceUtil.updateWorker(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4], (java.util.Date) arguments[5],
                ((Long) arguments[6]).longValue(),
                (java.util.Date) arguments[7],
                ((Long) arguments[8]).longValue(),
                ((Long) arguments[9]).longValue(),
                ((Long) arguments[10]).longValue(),
                ((Long) arguments[11]).longValue(),
                ((Boolean) arguments[12]).booleanValue());
        }

        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return WorkerLocalServiceUtil.filterByDate((java.util.Date) arguments[0],
                (java.util.Date) arguments[1]);
        }

        if (_methodName55.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
            return WorkerLocalServiceUtil.filterByName((java.lang.String) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
