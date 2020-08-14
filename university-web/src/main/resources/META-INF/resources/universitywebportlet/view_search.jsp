<%@include file="../init.jsp" %>

<%
    String keywords = ParamUtil.getString(request, "keywords");
    long universityId = ParamUtil.getLong(renderRequest, "universityId");
%>

<portlet:renderURL var="searchURL">
    <portlet:param name="mvcPath"
                   value="/universitywebportlet/view_search.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="viewURL">
    <portlet:param
            name="mvcPath"
            value="/universitywebportlet/view.jsp"/>
</portlet:renderURL>

<aui:form action="${searchURL}" name="fm">

    <liferay-ui:header backURL="${viewURL}" title="back"/>

    <div class="row">
        <div class="col-md-8">
            <aui:input inlineLabel="left" label="" name="keywords" placeholder="search-entries" size="256"/>
        </div>

        <div class="col-md-4">
            <aui:button type="submit" value="search"/>
        </div>
    </div>
</aui:form>

<%
    SearchContext searchContext = SearchContextFactory.getInstance(request);
    searchContext.setKeywords(keywords);
    searchContext.setAttribute("paginationType", "more");
    searchContext.setStart(0);
    searchContext.setEnd(10);
    Indexer<Student> indexer = IndexerRegistryUtil.getIndexer(Student.class);
    Hits hits = indexer.search(searchContext);

    List<Student> students = new ArrayList<Student>();

    for (int i = 0; i < hits.getDocs().length; i++) {
        Document doc = hits.doc(i);

        long studentId = GetterUtil
                .getLong(doc.get(Field.ENTRY_CLASS_PK));

        Student student = null;

        try {
            student = StudentLocalServiceUtil.getStudent(studentId);
        } catch (PortalException pe) {
            _log.error(pe.getLocalizedMessage());
        } catch (SystemException se) {
            _log.error(se.getLocalizedMessage());
        }

        students.add(student);
    }

    List<University> universities = UniversityLocalServiceUtil.getUniversities(scopeGroupId);

    Map<String, String> UniversityMap = new HashMap<String, String>();

    for (University university : universities) {
        UniversityMap.put(Long.toString(university.getUniversityId()), university.getName());
    }
%>

<liferay-ui:search-container delta="10"
                             emptyResultsMessage="no-student-were-found"
                             total="<%= students.size() %>">
    <liferay-ui:search-container-results results="<%= students %>"/>

    <liferay-ui:search-container-row
            className="ir.sain.university.model.Student"
            keyProperty="studentId" modelVar="student" escapedModel="<%=true%>">
        <liferay-ui:search-container-column-text name="university"
                                                 value="<%=UniversityMap.get(Long.toString(student.getUniversityId()))%>"/>

        <liferay-ui:search-container-column-text property="name"/>

        <liferay-ui:search-container-column-text property="phone"/>

        <liferay-ui:search-container-column-jsp
                path="/universitywebportlet/student_actions.jsp"
                align="right"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<%!
    private static Log _log = LogFactoryUtil.getLog("html.universitywebportlet.view_search_jsp");
%>