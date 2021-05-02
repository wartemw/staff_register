<%@ page import="ru.wartemw.staff_register.build_service.model.Position_directory" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<% List<Position_directory> position_directoryList = Position_directoryLocalServiceUtil.getPosition_directoryList(); %>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="editPosition_organizationURL">
        <portlet:param name="mvcPath" value="/edit_position_organization.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= editPosition_organizationURL %>" value="Добавить должность"/>

</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= position_directoryList %>"
    />

    <liferay-ui:search-container-row
            className="ru.wartemw.staff_register.build_service.model.Position_directory"
            modelVar="position_directory"
    >
        <%
            boolean isWorkerConnect = WorkerLocalServiceUtil.getWorkerListFromPosition_directory(position_directory.getPosition_directoryID()).size() != 0;
        %>

        <liferay-ui:search-container-column-text>
            <portlet:renderURL var="viewPosition_directoryURL">
                <portlet:param name="position_directoryID"
                               value='<%=String.valueOf(position_directory.getPosition_directoryID())%>'/>
                <portlet:param name="mvcPath" value="/edit_position_organization.jsp"/>
            </portlet:renderURL>

            <portlet:actionURL name="deletePosition_organization" var="deletePosition_organizationURL">
                <portlet:param name="position_directoryID"
                               value='<%=String.valueOf(position_directory.getPosition_directoryID())%>'/>
            </portlet:actionURL>

            <portlet:actionURL name="changePosition_organizationArchivalStatus"
                               var="changePosition_organizationArchivalStatusURL">
                <portlet:param name="position_directoryID"
                               value='<%=String.valueOf(position_directory.getPosition_directoryID())%>'/>
            </portlet:actionURL>

            <liferay-ui:icon-menu message="">
                <% if (isWorkerConnect) {%>
                <liferay-ui:icon-delete message="изменить" url="<%= viewPosition_directoryURL %>"
                                        confirmation="Существует сотрудник(и) с данной должностью, все рано изменить?"/>
                <liferay-ui:icon-delete message="удалить" url="<%= deletePosition_organizationURL %>"
                                        confirmation="Существует сотрудник(и) с данной должностью, все рано удалить?"/>

                <%if (position_directory.getArchival_status()) {%>
                <liferay-ui:icon-delete message="С архива"
                                        url="<%=changePosition_organizationArchivalStatusURL%>"
                                        confirmation="Существует сотрудник(и) с данной должностью, все рано изменить?"/>
                <%} else {%>
                <liferay-ui:icon-delete message="В архив"
                                        url="<%=changePosition_organizationArchivalStatusURL%>"
                                        confirmation="Существует сотрудник(и) с данной должностью, все рано изменить?"/>
                <%}%>
                <%} else {%>
                <liferay-ui:icon message="изменить" url='<%=viewPosition_directoryURL%>'/>
                <liferay-ui:icon message="удалить" url="<%=deletePosition_organizationURL%>"/>
                <%if (position_directory.getArchival_status()) {%>
                <liferay-ui:icon message="С архива" url="<%=changePosition_organizationArchivalStatusURL%>"/>
                <%} else {%>
                <liferay-ui:icon message="В архив" url="<%=changePosition_organizationArchivalStatusURL%>"/>
                <%}%>

                <%}%>
            </liferay-ui:icon-menu>

        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text property="name" name="Название должности"/>
        <liferay-ui:search-container-column-text property="archival_status" name="Статус архивности"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>