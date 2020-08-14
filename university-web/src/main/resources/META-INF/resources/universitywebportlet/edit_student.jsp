<%@include file="../init.jsp" %>

<%

    long studentId = ParamUtil.getLong(renderRequest, "studentId");

    Student student = null;
    if (studentId > 0) {
        student = StudentLocalServiceUtil.getStudent(studentId);
    }

    long universityId = ParamUtil.getLong(renderRequest, "universityId");

%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/universitywebportlet/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addStudent" var="addStudentURL"></portlet:actionURL>

<aui:form action="<%= addStudentURL %>" name="<portlet:namespace />fm">

    <aui:model-context bean="<%= student %>" model="<%= Student.class %>"/>

    <aui:fieldset>

        <aui:input name="name"/>
        <aui:input name="phone"/>
        <aui:input name="studentId" type="hidden"/>
        <aui:input name="universityId" type="hidden"
                   value='<%= student == null ? universityId : student.getUniversityId() %>'/>

    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

    </aui:button-row>
</aui:form>