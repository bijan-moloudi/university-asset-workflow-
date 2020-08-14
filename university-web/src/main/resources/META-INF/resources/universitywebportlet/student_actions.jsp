<%@include file="../init.jsp"%>

<%
    String mvcPath = ParamUtil.getString(request, "mvcPath");

    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

    Student student = (Student) row.getObject();
%>

<liferay-ui:icon-menu>

    <c:if test="<%= UniversityStudentPermission.contains(permissionChecker, student.getStudentId(), ActionKeys.UPDATE) %>">
        <portlet:renderURL var="editURL">
            <portlet:param name="studentId"
                           value="<%= String.valueOf(student.getStudentId()) %>" />
            <portlet:param name="mvcPath" value="/universitywebportlet/edit_student.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="Edit"
                         url="<%=editURL.toString() %>" />
    </c:if>

    <c:if
            test="<%=UniversityStudentPermission.contains(permissionChecker, student.getStudentId(), ActionKeys.PERMISSIONS) %>">

        <liferay-security:permissionsURL
                modelResource="<%= Student.class.getName() %>"
                modelResourceDescription="<%= student.getName() %>"
                resourcePrimKey="<%= String.valueOf(student.getStudentId()) %>"
                var="permissionsURL" />

        <liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />

    </c:if>

    <c:if
            test="<%=UniversityStudentPermission.contains(permissionChecker, student.getStudentId(), ActionKeys.DELETE) %>">

        <portlet:actionURL name="deleteEntry" var="deleteURL">
            <portlet:param name="studentId"
                           value="<%= String.valueOf(student.getStudentId()) %>" />
            <portlet:param name="universityId"
                           value="<%= String.valueOf(student.getUniversityId()) %>" />
        </portlet:actionURL>

        <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />
    </c:if>

</liferay-ui:icon-menu>