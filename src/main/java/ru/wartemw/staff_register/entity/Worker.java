package ru.wartemw.staff_register.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/*
Фамилия                         String      surname
Имя                             String      name
отчество                        String      patronymic
пол                             enum        gender
дата рождения                   Data        date_of_birth
должность                       String      position
дата трудоустройства            Data        date_of_employment
уровень зарплаты                Integer     salary_level
номер рабочего телефона         Integer      work_number
номер мобильного телефона       Integer      telephone_number
банковсткая организация         String      banking_organization
статус архивности               boolean     archival_status
 */
@Data
public class Worker {
    private String surname;                 // Фамилия
    private String name;                    // Имя
    private String patronymic;              // Отчество
    private Gender gender;                  // Пол
    private Date date_of_birth;             // Дата рождения
    private String position;                // Должность
    private Date date_of_employment;        // Дата трудоустройста
    private Integer salary_level;           // уровень зарплаты
    private Integer work_number;            // Номер рабочего телефона
    private Integer telephone_number;       // Номер мобильного телефона
    private String banking_organization;    // Банковская организация
    private Boolean archival_status;        // Статус архивности
}
