<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="container">
    <h1>Body of Proposal</h1>

    <p>The abstract and Sections I-A through VI should not exceed 3 single-spaced pages. Supporting documents or
        materials should be included as addenda. PROPOSALS SHOULD BE WRITTEN CLEARLY AND SIMPLY.</p>

    <form:form method="post" modelAttribute="bodyForm" class="labels-no-bold tall-textarea">
        <div class="form-group">
            <label for="procedures" class="required-field"><strong>II. PROCEDURES AND METHODS.</strong> (Indicate how the goals and objectives will be met. Include a
                discussion of the steps involved in the design, development and implementation of the project.)</label>
            <form:textarea  class="form-control" path="procedures" cssErrorClass="missing-error form-control" />
        </div>
        <div class="form-group">
            <label for="timeLine" class="required-field"><strong>III. TIME-LINE.</strong> (Provide a time frame for the completion of the project.)</label>
            <form:textarea  class="form-control" path="timeLine" cssErrorClass="missing-error form-control" />
        </div>
        <div class="form-group">
            <label for="evaluation" class="required-field"><strong>IV. EVALUATION AND DISSEMINATION.</strong> (Include a plan for evaluating or documenting outcomes as
                well as a plan for the dissemination of project results.)</label>
            <form:textarea  class="form-control" path="evaluation" cssErrorClass="missing-error form-control" />
        </div>
        <div class="form-group">
            <label for="budgetNarrative" class="required-field"><strong>V. PROVIDE A BUDGET NARRATIVE</strong> that clearly explains any budget items that are not
                self-explanatory, including justification for the number of hours requested (if any) as reassigned time or
                stipend.</label>
            <form:textarea  class="form-control" path="budgetNarrative" cssErrorClass="missing-error form-control" />
        </div>
        <div>
            <button type="submit" class="button-block pull-right">Next</button>
        </div>
    </form:form>
</div>