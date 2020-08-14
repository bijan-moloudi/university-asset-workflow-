<%@ include file="../init.jsp" %>
<liferay-ui:success key="studentAdded" message="student-added"/>
<liferay-ui:success key="studentDeleted" message="student-deleted"/>

<%
    long universityId = Long.valueOf((Long) renderRequest.getAttribute("universityId"));
%>

<%-- for search --%>
<portlet:renderURL var="searchURL">
    <portlet:param name="mvcPath"
                   value="/universitywebportlet/view_search.jsp" />
</portlet:renderURL>

<aui:form action="${searchURL}" name="fm">

    <div class="row">
        <div class="col-md-8">
            <aui:input inlineLabel="left" label="" name="keywords" placeholder="search-entries" size="256" />
        </div>

        <div class="col-md-4">
            <aui:button type="submit" value="search" />
        </div>
    </div>

</aui:form>

<%-- end search portion--%>



<aui:button-row cssClass="university-buttons">
    <c:if test='<%= UniversityPermission.contains(permissionChecker, scopeGroupId, "ADD_STUDENT") %>'>
        <portlet:renderURL var="addStudentURL">
            <portlet:param name="mvcPath" value="/universitywebportlet/edit_student.jsp"/>
            <portlet:param name="universityId"
                           value="<%=String.valueOf(universityId)%>"/>
        </portlet:renderURL>
        <aui:button onClick="<%=addStudentURL.toString()%>" value="Add Student"></aui:button>
    </c:if>
</aui:button-row>

<liferay-ui:search-container total="<%=StudentLocalServiceUtil.getStudentsCount()%>">
    <liferay-ui:search-container-results
            results="<%=StudentLocalServiceUtil.getStudents(scopeGroupId.longValue(),
                    universityId, searchContainer.getStart(),
                    searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ir.sain.university.model.Student" modelVar="student">

        <liferay-ui:search-container-column-text property="name"/>

        <liferay-ui:search-container-column-text property="phone"/>

        <liferay-ui:search-container-column-jsp
                align="right"
                path="/universitywebportlet/student_actions.jsp"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>

</liferay-ui:search-container>