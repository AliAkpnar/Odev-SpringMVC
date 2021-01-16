    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  


<%@ page pageEncoding="UTF-8" %>

	<h1>Person Enrollment List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Surname</th><th>Blood Group</th><th>Mobile Phone</th><th>Address</th><th>Update</th><th>Delete</th></tr>
    <c:forEach var="person" items="${list}">
    <tr>
    <td>${person.id}</td>
    <td>${person.personName}</td>
    <td>${person.surname}</td>
    <td>${person.bloodGroup}</td>
    <td>${person.mobilePhone}</td>
    <td>${person.address}</td>
    <td><a href="KisiEkelemeFormu/${person.id}">Edit</a></td>
    <td><a href="deleteemp/${person.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="KisiEkelemeFormu">Add New Enrollment</a>