<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">

		<div class="breadcrumb flat">
			<a href="<s:url value='/proposal/department' />">Details</a>
			<a href="<s:url value='/proposal/detail/awardType' />" class="active">Award Type</a>
			<a href="<s:url value='/proposal/budget' />" >Budget</a>
			<a href="<s:url value='/proposal/body' />">Body</a>
			<a href="<s:url value='/proposal/bodyDetails' />">Body Details</a>
			<a href="<s:url value='/proposal/bodyQuestions' />">Questions</a>
			<a href="<s:url value='/proposal/upload' />">Upload</a>
		</div>
	<legend><h2 style="text-align:center;">Award Type</h2></legend>
	<form:form class="form-horizontal" method="post"
		modelAttribute="awardTypeForm">

		<div class="form-group">
			<label class="col-sm-3 control-label required-field">Are You Applying For:</label>

			<div class="col-sm-9">
				
				<c:if test='${semester == "Spring" || semester == "Fall"}'>
				<div class="checkbox">
					<label><form:checkbox path="awardTypes" value="1" />Research
						Grant (Fall and Spring)</label>
				</div>
				</c:if>
				
				<c:if test='${semester == "Spring" || semester == "Fall"}'>
				<div class="checkbox">
					<label><form:checkbox path="awardTypes" value="2" />Instructional
						Improvement Grant (Fall and Spring Semesters) The Signature of the
						College Curriculum
						Chair is required for instructional improvement proposals (for new
						or experimental courses)</label>
				</div>
				</c:if>
				
				<c:if test='${semester == "Spring" || semester == "Fall"}'>
				<div class="checkbox">
					<label><form:checkbox path="awardTypes" value="3" />Hemingway
						Faculty Vitality Grant (Fall semester, and mid-late Spring
						semester)</label>
				</div>
				</c:if>
				<c:if test='${semester == "Spring"}'>
				<div class="checkbox">
					<label><form:checkbox path="awardTypes" value="4" />Hemingway
						New Faculty Grant (Mid-late Spring semester)</label>
				</div>
				</c:if>
				
				<c:if test='${semester == "Spring"}'>
				<div class="checkbox">
					<label><form:checkbox path="awardTypes" value="5" />Hemingway
						Excellence Award (Early-mid Spring semester)</label>
				</div>
				</c:if>
				
				<c:if test='${semester == "Spring"}'>
				<div class="checkbox">
					<label><form:checkbox path="awardTypes" value="6" />Hemingway
						Collaborative Award (Early-mid Spring semester)</label>
				</div>
				</c:if>
				
				<c:if test='${semester == "Spring"}'>
				<div class="checkbox">
					<label><form:checkbox path="awardTypes" value="7" />Hemingway
						Adjunct Faculty Grant (Mid-late Spring 2012)</label>
				</div>
				</c:if>
				
			</div>
			<form:errors path="awardTypes" />
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label required-field">Project Type:</label>

			<div class="col-sm-9">
				<div class="radio">
					<label><form:radiobutton path="projectTypeID" value="1" />Travel
						to attend a workshop or conference (you must select Hemingway
						Vitality above)</label>
				</div>
				<div class="radio">
					<label><form:radiobutton path="projectTypeID" value="2" />Travel
						to present at a workshop or conference</label>
				</div>
				<div class="radio">
					<label><form:radiobutton path="projectTypeID" value="3" />Research,
						creative endeavor, or service-oriented project (materials,
						equipment, travel to collect data, etc.)</label>
				</div>
			</div>
			<form:errors path="projectTypeID" />
		</div>
		<%-- <div>
			<a class="pull-left" href="<s:url value='/proposal/detail' />">Previous</a>
			<button type="submit" class="btn my-btn pull-right">Next</button>
		</div> --%>
	
		<div>
			<button type="button" class="btn my-btn pull-left" onclick='window.location.href="<s:url value="/proposal/department" />"'>Previous</button>
           	<button type="button" class="btn my-btn pull-right" onclick='window.location.href="<s:url value="/proposal/budget" />"'>Next</button>
        </div>
        
		<%-- <div>
            <a class="btn my-btn pull-left" href='<s:url value="/proposal/budget" />'>Previous</a>
            <a class="btn my-btn pull-right" href='<s:url value="/proposal/department" />'>Next</a>
        </div> --%>
	</form:form>
</div>