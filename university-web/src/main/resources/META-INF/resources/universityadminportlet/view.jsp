<%@include file="../init.jsp" %>
<liferay-ui:success key="universityAdded" message="university-added" />
<liferay-ui:success key="universityUpdated" message="university-updated" />
<liferay-ui:success key="universityDeleted" message="university-deleted" />



<aui:button-row cssClass="university-admin-buttons">
    <portlet:renderURL var="addUniversityRndURL">
        <portlet:param name="mvcPath"
                       value="/universityadminportlet/edit_university.jsp"/>
        <portlet:param name="redirect" value="<%= "currentURL" %>"/>
    </portlet:renderURL>

    <aui:button onClick="<%= addUniversityRndURL.toString() %>"
                value="Add University"/>
</aui:button-row>

<liferay-ui:search-container
        total="<%= UniversityLocalServiceUtil.getUniversityCount(scopeGroupId) %>">
    <liferay-ui:search-container-results
            results="<%= UniversityLocalServiceUtil.getUniversities(scopeGroupId,
            searchContainer.getStart(), searchContainer.getEnd()) %>"/>

    <liferay-ui:search-container-row
            className="ir.sain.university.model.University" modelVar="university">

        <liferay-ui:search-container-column-text property="name"/>

        <liferay-ui:search-container-column-jsp
                align="right"
                path="/universityadminportlet/university_actions.jsp"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

