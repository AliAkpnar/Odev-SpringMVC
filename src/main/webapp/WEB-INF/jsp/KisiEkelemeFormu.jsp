<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page pageEncoding="UTF-8" %>


		<h1>Add Person</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>Name : </td>
          <td><form:input path="personName"  /></td>
         </tr>  
         <tr>  
          <td>Surname :</td>
          <td><form:input path="surname" /></td>
         </tr> 
         <tr>  
          <td>Blood Group :</td>
          <td><form:input path="bloodGroup" /></td>
         </tr>
         <tr>
           <td>Mobile Phone :</td>
           <td><form:input path="mobilePhone" /></td>
           </tr>
         <tr>
         <tr>
             <td>Address :</td>
             <td><form:input path="address" /></td>
         </tr>
          <tr>
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
