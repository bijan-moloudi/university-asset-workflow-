<%@include file="../init.jsp" %>

<%
    long universityId = ParamUtil.getLong(request, "universityId");

    University university = null;

    if (universityId > 0) {
        university = UniversityLocalServiceUtil.getUniversity(universityId);
    }
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/universityadminportlet/view.jsp"/>
</portlet:renderURL>

<portlet:actionURL name='<%= university == null ? "addUniversity" : "updateUniversity" %>' var="editUniversityURL"/>

<aui:form action="<%= editUniversityURL %>" name="fm">

    <aui:model-context bean="<%= university %>" model="<%= University.class %>"/>

    <aui:input type="hidden" name="universityId"
               value='<%= university == null ? "" : university.getUniversityId() %>'/>

    <aui:fieldset>
        <aui:input name="name"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button onClick="<%= viewURL %>" type="cancel"/>
    </aui:button-row>
</aui:form>