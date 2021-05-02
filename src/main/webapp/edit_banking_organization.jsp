<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.model.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--

  Created by IntelliJ IDEA.
  User: user
  Date: 26.04.2021
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>


<%
    long banking_organizationID = ParamUtil.getLong(request, "banking_organizationID");
    Banking_organization banking_organization = (banking_organizationID == 0)
            ? Banking_organizationLocalServiceUtil.createEntity()
            : Banking_organizationLocalServiceUtil.getBanking_organization(banking_organizationID);

%>
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/viewBanking_organization.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editBanking_organization" var="editBanking_organizationURL"/>

<aui:form action="<%= editBanking_organizationURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="banking_organizationID" type="hidden"
                   value="<%=banking_organization.getBanking_organizationID()%>"/>

        <% if (banking_organizationID != 0) {%>
        <aui:input name="name" label="Название банка" readonly="true" value="<%=banking_organization.getName()%>"
                   required="true"/>
        <% } else {%>
        <aui:input name="name" label="Название банка" value="<%=banking_organization.getName()%>" required="true"/>
        <%}%>


        <aui:input name="identification_code" label="БИК" value="<%=banking_organization.getIdentification_code()%>"
                   required="true">
            <aui:validator name="rangeLength" errorMessage="Введите 9 цифр"> [9, 9] </aui:validator>
            <aui:validator name="digits"/>
        </aui:input>

        <aui:input name="address" label="Адрес банка" value="<%=banking_organization.getAddress()%>" required="true"/>

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>

    <% if (banking_organizationID != 0) {
        List<Worker> workerListBanking = new ArrayList<Worker>();

        List<Worker> workerList = WorkerLocalServiceUtil.getWorkerList();
        for (Worker worker : workerList) {
            if (worker.getBanking_organizationID() == banking_organizationID)
                workerListBanking.add(worker);
        }%>

    <liferay-ui:search-container>
        <liferay-ui:search-container-results results="<%= workerListBanking %>"/>

        <liferay-ui:search-container-row
                className="ru.wartemw.staff_register.build_service.model.Worker"
                modelVar="worker">

            <liferay-ui:search-container-column-text name="ФИО">
                <%=worker.getSurname() + " " + worker.getName() + " " + worker.getPatronymic()%>
            </liferay-ui:search-container-column-text>

            <liferay-ui:search-container-column-text property="gender" name="Пол"/>
            <liferay-ui:search-container-column-text name="Дата рождения">
                <%
                    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                    String date_of_birth = dateFormat.format(worker.getDate_of_birth());
                %>
                <%=date_of_birth%>
            </liferay-ui:search-container-column-text>

        </liferay-ui:search-container-row>

        <liferay-ui:search-iterator/>
    </liferay-ui:search-container>
    <%}%>


    <%--    <%}%>--%>
</aui:form>
