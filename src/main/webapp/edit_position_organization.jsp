<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.model.*" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>

<%
    long position_directoryID = ParamUtil.getLong(request, "position_directoryID");

    Position_directory position_directory = (position_directoryID == 0)
            ? Position_directoryLocalServiceUtil.createEntity()
            : Position_directoryLocalServiceUtil.getPosition_directory(position_directoryID);
%>
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/viewPosition_directory.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editPosition_organization" var="editPosition_organizationURL"/>

<aui:form action="<%= editPosition_organizationURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="position_directoryID" type="hidden" value="<%=position_directory.getPosition_directoryID()%>"/>
        <aui:input name="archival_status" type="hidden" value="<%=position_directory.getArchival_status()%>"/>

        <aui:input name="name" label="Название должности" value="<%=position_directory.getName()%>" required="true"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>
</aui:form>
