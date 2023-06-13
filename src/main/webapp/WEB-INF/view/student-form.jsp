<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />

        <br><br>

        Country:

        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>

        <br><br>

        Favorite language:
        <form:radiobutton path="favoriteLanguage" value="Java" label="Java" />
        <form:radiobutton path="favoriteLanguage" value="C++" label="C++" />
        <form:radiobutton path="favoriteLanguage" value="PHP" label="PHP" />
        <form:radiobutton path="favoriteLanguage" value="Ruby" label="Ruby" />

        <br><br>

        Operating System:
        <form:checkbox path="operatingSystems" value="Linux" label="Linux" />
        <form:checkbox path="operatingSystems" value="Mac" label="Mac" />
        <form:checkbox path="operatingSystems" value="Windows" label="Windows" />



        <br><br>



		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
