<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body>
<h2>Add Employee</h2>
        
<form:form modelAttribute="employee" action="/Week14/addEmployee" method="post">
    <form:hidden path="id" />
    <form:label path="employeeName">Name:</form:label>
    <form:input path="employeeName" /><br>

    <form:label path="employeeAddress">Address:</form:label>
    <form:input path="employeeAddress" /><br>

    <form:label path="employeePhone">Phone:</form:label>
    <form:input path="employeePhone" /><br>

    <form:label path="employeeSalary">Salary:</form:label>
    <form:input path="employeeSalary" /><br>

    <button type="submit">Submit</button>
</form:form>

<a href="/Week14/employees">Back to Employees</a>
</body>
</html>
