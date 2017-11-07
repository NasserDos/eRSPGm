<%--
  Created by IntelliJ IDEA.
  User: Andrew
  Date: 10/23/2017
  Time: 6:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/bootstrap-theme.min.css"/>"/>
    <%-- <link rel="stylesheet" type="text/css" href="<s:url value="/css/home.css"/>" /> --%>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/form-styles.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/breadcrumb.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/navbar.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/button-design.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/admin.css"/>"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="<s:url value="/js/jquery-2.1.4.min.js"/>"></script>
    <title>eRSPG</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"/>

<div class="wrapper">

    <nav id="sidebar" class="sidebar">
        <!-- Sidebar Header -->
        <div class="sidebar-header">
            <h3>Chairman Dashboard</h3>
        </div>

        <!-- Sidebar Links -->
        <ul class="list-unstyled components">
            <li><a class="btn my-btn" type="button" onclick="window.location.href = '/eRSPG/admin/home'" value="Admin">Home</a>
            </li>
            <li><a class="btn my-btn" type="button">Manage Committee</a></li>
            <li><a class="btn my-btn" type="button" href="#">Proposals</a></li>
            <li class="active"><a class="btn my-btn" type="button"
                                  onclick="window.location.href = '/eRSPG/admin/makeAnnouncement'" value="Announcement">Make
                Announcement</a></li>
        </ul>
    </nav>

    <!-- Page Content -->
    <div id="content" class="main">

        <div class="col-md-6 col-md-offset-3 text-center">

            <form:form method="post" action="/eRSPG/admin/makeAnnouncement" modelAttribute="announcement">
                <div class="input-group-lg">
                    <form:input path="title" class="form-control" id="title" placeholder="Title" />
                </div>

                <div class="input-group-lg">
                    ​<form:textarea path="message" style="resize: none" id="message" rows="5" cols="80" />
                </div>

                <br>

                <div class="form-actions">
                    <input type="submit"
                           class="btn btn-success" value="Save">
                </div>

            </form:form>

        </div>


    </div>
</div>

<jsp:include page="/WEB-INF/views/footer.jsp"/>
</body>
</html>