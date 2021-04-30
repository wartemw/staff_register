<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.model.*" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects/>

<%
    long workerID = ParamUtil.getLong(request, "workerID");

    Worker worker;
    Position_directory position_directory;
    Banking_organization banking_organization;

    if (workerID == 0) {
        worker = WorkerLocalServiceUtil.createEntity();
        position_directory = Position_directoryLocalServiceUtil.createEntity();
        banking_organization = Banking_organizationLocalServiceUtil.createEntity();
    } else {
        worker = WorkerLocalServiceUtil.getWorker(workerID);
        position_directory = Position_directoryLocalServiceUtil.getPosition_directory(worker.getPosition_directoryID());
        banking_organization = Banking_organizationLocalServiceUtil.getBanking_organization(worker.getBanking_organizationID());
    }

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String date_of_birth = dateFormat.format(worker.getDate_of_birth());
    String date_of_employment = dateFormat.format(worker.getDate_of_employment());
%>
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/viewWorker.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editWorker" var="editWorkerURL"/>

<aui:form action="<%= editWorkerURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="workerID" type="hidden" value="<%=worker.getWorkerID()%>"/>
        <aui:input name="archival_status" type="hidden" value="<%=worker.getArchival_status()%>"/>

        <aui:input name="surname" label="Фамилия" value="<%=worker.getSurname()%>" required="true"/>
        <aui:input name="name" label="Имя" value="<%=worker.getName()%>" required="true"/>
        <aui:input name="patronymic" label="Отчество" value="<%=worker.getPatronymic()%>" required="true"/>

        <p>Пол</p>
        <aui:input name="gender" type="radio" value="Мужчина" label="Мужчина"
                   checked='<%=worker.getGender().equals("Мужчина")%>' required="true"/>
        <aui:input name="gender" type="radio" value="Женщина" label="Женщина"
                   checked='<%=worker.getGender().equals("Женщина")%>' required="true"/>

        <aui:input name="date_of_birth" class="aui-date-picker" id="demo-range-2" type="date" label="Дата рождения"
                   value="<%=date_of_birth%>" required="true"/>

        <aui:select name="positionID" showEmptyOption="true" label="Должность" required="true">
            <%
                List<Position_directory> position_directoryList = Position_directoryLocalServiceUtil.getPosition_directoryList();
                for (Position_directory _position_directory : position_directoryList) {
            %>
            <aui:option
                    value="<%=String.valueOf(_position_directory.getPosition_directoryID())%>"
                    selected="<%=_position_directory.getName().equals(position_directory.getName())%>"><%=_position_directory.getName()%>
            </aui:option>
            <%}%>
        </aui:select>

        <aui:input name="date_of_employment" class="aui-date-picker" id="demo-range-2" type="date"
                   label="Дата трудоустройства" value="<%=date_of_employment%>" required="true"/>

        <aui:input name="salary_level" type="numeric" label="Уровень зарплаты" value="<%=worker.getSalary_level()%>"
                   required="true">
            <aui:validator name="digits"/>
        </aui:input>

        <aui:input name="work_number" label="Номер рабочего телефона" value="<%=worker.getWork_number()%>"
                   required="true">
            <aui:validator name="rangeLength" errorMessage="Введите 11 цифр"> [11, 11] </aui:validator>
            <aui:validator name="digits"/>
        </aui:input>

        <aui:input name="telephone_number" label="Номер мобильного телефона" value="<%=worker.getTelephone_number()%>"
                   required="true">
            <aui:validator name="rangeLength" errorMessage="Введите 11 цифр"> [11, 11] </aui:validator>
            <aui:validator name="digits"/>
        </aui:input>

        <aui:select name="banking_organizationID" showEmptyOption="true"
                    label="Банковская организация, в которой сотрудник получает заработную плату" required="true">
            <%
                List<Banking_organization> banking_organizationList = Banking_organizationLocalServiceUtil.getBanking_organizationList();
                for (Banking_organization _banking_organization : banking_organizationList) {
            %>
            <aui:option value="<%=_banking_organization.getBanking_organizationID()%>"
                        selected="<%=banking_organization.getName().equals(_banking_organization.getName())%>"><%=_banking_organization.getName()%>
            </aui:option>
            <%}%>
        </aui:select>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>
</aui:form>
