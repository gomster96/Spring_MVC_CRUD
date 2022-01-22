<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@page import="com.example.crud.beans.Emp" %>
<%
	Emp emp = (Emp)request.getAttribute("emp");
%>
        <h1>Edit Employee</h1>
        <form method="post" action="../editsave">
        	<input type="hidden" name="id" value="<%=emp.getId()%>"  />
        	<input type="text" name="name" value="<%=emp.getName()%>"  />
        	<input type="text" name="salary" value="<%=emp.getSalary()%>"  />
        	<input type="text" name="designation" value="<%=emp.getDesignation() %>"  />
        	<input type="submit" value="Edit Save"/>
        </form>  
           