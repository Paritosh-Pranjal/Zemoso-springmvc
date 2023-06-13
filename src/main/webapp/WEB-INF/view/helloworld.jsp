<!DOCTYPE html>
<html>
    <head>
        <title>Input Form</title>
    </head>
Hello World of Spring!
<body>
<%
       String studentName = request.getParameter("studentName");
%>
    <h2>Student name: <%= studentName %></h2>

<br><br><br>

The message: <%= request.getAttribute("message") %>

</body>

</html>