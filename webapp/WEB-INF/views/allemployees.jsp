<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Employees</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h2>All Employees</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Salary</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.employeeName}</td>
                    <td>${employee.employeeAddress}</td>
                    <td>${employee.employeePhone}</td>
                    <td>${employee.employeeSalary}</td>
                    <td>
                        <a href='<c:url value="/editEmployee/${employee.id}" />' class="btn btn-primary btn-sm">Edit</a>
                        <a href='<c:url value="/deleteEmployee/${employee.id}" />' class="btn btn-danger btn-sm">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href='<c:url value="/showForm" />' class="btn btn-primary btn-sm mb-2">Add Customer Care Representative</a>
</body>
</html>
