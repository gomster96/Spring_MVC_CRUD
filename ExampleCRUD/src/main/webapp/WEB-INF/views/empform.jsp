<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Employee</h1>
        <form method="post" action="save">
        	<input type="text" name="name" placeholder="input name"  />
        	<input type="text" name="salary" placeholder="input salary"  />
        	<input type="text" name="designation" placeholder="input designation"  />
        	<input type="submit" value="Save"/>
        </form> 
         