<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.Position_directoryLocalServiceUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.model.Position_directory" %>
<%@ page import="ru.wartemw.staff_register.build_service.model.Banking_organization" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.Banking_organizationLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="ru.wartemw.staff_register.build_service.model.Worker" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.wartemw.staff_register.build_service.service.WorkerLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<%

    boolean sorted = ParamUtil.getBoolean(request, "sorted");

    List<Worker> workerList = WorkerLocalServiceUtil.getWorkerList();

    ArrayList<Worker> workerArrayList = new ArrayList<Worker>(workerList);

    boolean sortedFIO = ParamUtil.getBoolean(request, "sortedFIO");
    String vio = ParamUtil.getString(request, "vio");

    Date date_of_birthIn = ParamUtil.getDate(request, "date_of_birthIn", new SimpleDateFormat("yyyy-MM-dd"));
    Date date_of_birthTo = ParamUtil.getDate(request, "date_of_birthTo", new SimpleDateFormat("yyyy-MM-dd"));

    request.setAttribute("date_of_birthIn", date_of_birthTo);
    request.setAttribute("date_of_birthTo", date_of_birthTo);

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String date_of_birthInString = dateFormat.format(date_of_birthIn);
    String date_of_birthToString = dateFormat.format(date_of_birthTo);

    if (sorted) {
        List<Worker> workerSortList = new ArrayList<Worker>();

        for (Worker worker : workerArrayList) {
            Date date_of_birth = worker.getDate_of_birth();

            if (date_of_birth.after(date_of_birthIn) && date_of_birth.before(date_of_birthTo))
                workerSortList.add(worker);

            if (date_of_birth.equals(date_of_birthIn) || date_of_birth.equals(date_of_birthTo))
                workerSortList.add(worker);
        }

        workerArrayList.clear();
        workerArrayList.addAll(workerSortList);
    }

    if (sortedFIO) {
        List<Worker> workerSortList = new ArrayList<Worker>();

        /*String[] vioSplit = vio.split(" ");
        if (vioSplit.length == 1) {

        }else if(vioSplit.length == 2) {

        }else if (vioSplit.length == 3) {

        }*/
/*        String surname = vioSplit[0];
        String name = vioSplit[1];
        String patronymic = vioSplit[2];*/

        for (Worker worker : workerArrayList) {
            if (worker.getSurname().toLowerCase().contains(vio.toLowerCase())
                    || worker.getName().toLowerCase().contains(vio.toLowerCase())
                    || worker.getPatronymic().toLowerCase().contains(vio.toLowerCase())) {
                workerSortList.add(worker);
            }
        }

        workerArrayList.clear();
        workerArrayList.addAll(workerSortList);
    }
%>

<aui:row cssClass="guestbook-buttons">

    <aui:column>
        <aui:button-row>
            <portlet:renderURL var="editWorkerURL">
                <portlet:param name="mvcPath" value="/edit_worker.jsp"/>
            </portlet:renderURL>

            <aui:button onClick="<%= editWorkerURL %>" value="Добавить пользователя"/>
        </aui:button-row>
    </aui:column>
    <aui:column>
        <portlet:renderURL var="viewWorkerURL">
            <portlet:param name="mvcPath" value="/viewWorker.jsp"/>
        </portlet:renderURL>

        <aui:form action="<%=viewWorkerURL%>" name="<portlet:namespace />fm">
            <p>Фильтр по по дате рождения</p>
            <aui:input type="hidden" name="sorted" value="true"/>
            <aui:input name="date_of_birthIn" label="от" inlineLabel="left" class="aui-date-picker"
                       type="date" value="<%=date_of_birthInString%>"/>
            <aui:input name="date_of_birthTo" label="до" inlineLabel="left" class="aui-date-picker"
                       type="date" value="<%=date_of_birthToString%>"/>

            <aui:button id="sortButton" type="submit" value="Сортировать"/>
        </aui:form>

    </aui:column>

    <aui:column>
        <portlet:renderURL var="viewWorkerURL">
            <portlet:param name="mvcPath" value="/viewWorker.jsp"/>
        </portlet:renderURL>

        <aui:form action="<%=viewWorkerURL%>" name="<portlet:namespace />fm">
            <p>Фильтр по по дате рождения</p>
            <aui:input type="hidden" name="sortedFIO" value="true"/>
            <aui:input name="vio" label="ФИО" inlineLabel="left" value="<%=vio%>"/>

            <aui:button id="sortButton" type="submit" value="Сортировать"/>
        </aui:form>

    </aui:column>
</aui:row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= workerArrayList %>"
    />

    <liferay-ui:search-container-row
            className="ru.wartemw.staff_register.build_service.model.Worker"
            modelVar="worker"
    >

        <liferay-ui:search-container-column-text>
            <portlet:renderURL var="viewURL">
                <portlet:param name="workerID" value='<%=String.valueOf(worker.getWorkerID())%>'/>
                <portlet:param name="mvcPath" value="/edit_worker.jsp"/>
            </portlet:renderURL>

            <portlet:actionURL name="deleteWorker" var="deleteEntryURL">
                <portlet:param name="workerID" value='<%=String.valueOf(worker.getWorkerID())%>'/>
            </portlet:actionURL>

            <portlet:actionURL name="changeWorkerArchivalStatus" var="changeWorkerArchivalStatusURL">
                <portlet:param name="workerID" value='<%=String.valueOf(worker.getWorkerID())%>'/>
            </portlet:actionURL>

            <liferay-ui:icon-menu message="">
                <liferay-ui:icon iconCssClass="icon-edit" message="" url='<%=viewURL%>'/>
            </liferay-ui:icon-menu>
            <liferay-ui:icon-menu message="">
                <liferay-ui:icon iconCssClass="icon-trash" message="" url="<%=deleteEntryURL%>"/>
            </liferay-ui:icon-menu>
            <liferay-ui:icon-menu message="">
                <liferay-ui:icon iconCssClass='<%=worker.getArchival_status() ? "icon-lock" : "icon-unlock"%>'
                                 message="" url="<%=changeWorkerArchivalStatusURL%>"/>
            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text name="ФИО">
            <%=worker.getSurname() + " " + worker.getName() + " " + worker.getPatronymic()%>
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text property="gender" name="Пол"/>
        <liferay-ui:search-container-column-text name="Дата рождения">
            <%
                String date_of_birth = dateFormat.format(worker.getDate_of_birth());
            %>
            <%=date_of_birth%>
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text name="Должность">
            <%
                Position_directory position_directory = Position_directoryLocalServiceUtil.getPosition_directory(worker.getPosition_directoryID());
            %>
            <%=position_directory.getName()%>
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text name="Дата трудоустройства">
            <%
                String date_of_employment = dateFormat.format(worker.getDate_of_employment());
            %>
            <%=date_of_employment%>
        </liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-text property="salary_level" name="Уровень зарплаты"/>
        <liferay-ui:search-container-column-text property="work_number" name="Номер рабочего телефона"/>
        <liferay-ui:search-container-column-text property="telephone_number" name="Номер мобильного телефона"/>
        <liferay-ui:search-container-column-text name="Банковская организация">
            <%
                Banking_organization banking_organization = Banking_organizationLocalServiceUtil.getBanking_organization(worker.getBanking_organizationID());
            %>
            <%=banking_organization.getName()%>
        </liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-text property="archival_status" name="Статус архивности"/>


    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>
