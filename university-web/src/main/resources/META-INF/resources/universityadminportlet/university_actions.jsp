<%@include file="../init.jsp" %>

<%
    String mvcPath = ParamUtil.getString(request, "mvcPath");

    ResultRow row = (ResultRow) request
            .getAttribute("SEARCH_CONTAINER_RESULT_ROW");

    University university = (University) row.getObject();
%>

<liferay-ui:icon-menu>

    <portlet:renderURL var="editURL">
        <portlet:param name="universityId"
                       value="<%=String.valueOf(university.getUniversityId()) %>"/>
        <portlet:param name="mvcPath"
                       value="/universityadminportlet/edit_university.jsp"/>
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="Edit"
                     url="<%=editURL.toString() %>"/>

    <portlet:actionURL name="deleteUniversity" var="deleteURL">
        <portlet:param name="universityId"
                       value="<%= String.valueOf(university.getUniversityId()) %>"/>
    </portlet:actionURL>
    <liferay-ui:icon-delete url="<%=deleteURL.toString() %>"/>

    <c:if test="<%=UniversityModelPermission.contains(permissionChecker, university.getUniversityId(), ActionKeys.PERMISSIONS) %>">

        <liferay-security:permissionsURL
                modelResource="<%= University.class.getName() %>"
                modelResourceDescription="<%= university.getName() %>"
                resourcePrimKey="<%= String.valueOf(university.getUniversityId()) %>"
                var="permissionsURL"/>

        <liferay-ui:icon image="permissions" url="<%= permissionsURL %>"/>

    </c:if>

</liferay-ui:icon-menu>