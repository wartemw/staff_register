<%@ page import="ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.model.Banking_organization" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<% List<Banking_organization> banking_organizationList = Banking_organizationLocalServiceUtil.getBanking_organizationList(); %>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="editbanking_organizationURL">
        <portlet:param name="mvcPath" value="/edit_banking_organization.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= editbanking_organizationURL %>" value="Добавить банковские данные"/>

</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results results="<%= banking_organizationList %>"/>

    <liferay-ui:search-container-row
            className="ru.wartemw.staff_register.build_service.model.Banking_organization"
            modelVar="banking_organization"
    >

        <liferay-ui:search-container-column-text>
            <portlet:renderURL var="viewBanking_organizationURL">
                <portlet:param name="banking_organizationID"
                               value='<%=String.valueOf(banking_organization.getBanking_organizationID())%>'/>
                <portlet:param name="mvcPath" value="/edit_banking_organization.jsp"/>
            </portlet:renderURL>

            <portlet:actionURL name="deleteBanking_organization" var="deleteBanking_organizationURL">
                <portlet:param name="banking_organizationID"
                               value='<%=String.valueOf(banking_organization.getBanking_organizationID())%>'/>
            </portlet:actionURL>

            <liferay-ui:icon-menu message="">
                <liferay-ui:icon iconCssClass="icon-edit" message="" url='<%=viewBanking_organizationURL%>'/>
            </liferay-ui:icon-menu>
            <liferay-ui:icon-menu message="">
                <liferay-ui:icon iconCssClass="icon-trash" message="" url="<%=deleteBanking_organizationURL%>"/>
            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text name="Название банка" property="name"/>
        <liferay-ui:search-container-column-text name="БИК" property="identification_code"/>
        <liferay-ui:search-container-column-text name="Адрес" property="address"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>