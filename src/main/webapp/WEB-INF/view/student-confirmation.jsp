<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>

<html>
<head>
	<title>Student Confirmation</title>
</head>
    <body>



        the student is : ${student.firstName}

        <%
               String studentFName = request.getParameter("firstName");
        %>
                <h2>Student name: <%= studentFName %></h2>

        <%
               String studentLName = request.getParameter("lastName");
        %>
                <h2>Student name: <%= studentLName %></h2>

        <%
                String countryname = request.getParameter("country");
        %>
                <h2>Student Country: <%= countryname %></h2>

        <br><br>

                Favorite Language : ${student.favoriteLanguage}
        <br><br>
        Operating Systems:

        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>
        </ul>


    </body>
</html>
