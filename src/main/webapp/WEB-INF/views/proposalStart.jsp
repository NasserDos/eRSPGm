<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="eRSPG.model.User" %>
<%@ page import="eRSPG.Repository.UserImpl" %>
<jsp:useBean id="user" class="eRSPG.model.User"/>

<div class="container">
	<legend><h2 style="text-align:center;">RSPG Proposal Submission</h2></legend>

	<div class="text-center">
			<form action="start"
				  method="post" encrypt="text/plain">

				<label for="firstName" style="align-content: center"> First Name:&nbsp </label>
				<input id="firstName" type="text" name="firstName" style="align-self: center;" /><br /><br />


				<label for="lastName" style="alignment: center"> Last Name:&nbsp </label>
				<input id="lastName" type="text" name="lastName" value="" style="align-self: center;" /><br /><br />

				<label for="userEmail">Email:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
				<input id="userEmail" type="text" name="userEmail" value="" style="align-self: center;" /><br /><br />

				<label for="userPassword">Password:&nbsp&nbsp</label>
				<input id="userPassword" type="password" name="userPassword" value="" style="align-self: center;"/><br /><br />

				<%--<Button type="submit" class="btn my-btn" value="Submit" >Submit</Button>--%>
				<Button type="button" class="btn my-btn" value="start" onclick='window.location.href="<s:url value="start" />"' >Submit</Button>
			</form>
	</div>
</div>




