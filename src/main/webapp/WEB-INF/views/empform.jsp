<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <br><br>
  <center>
   <h1>Add New Employee </h1>
       <form:form method="post" action="save">    
      <table border="1" width="24%">
         <tr>    
          <td><center>First Name : </center></td>   
          <td><center><form:input path="firstName"  /></center></td>  
         </tr>    
         <tr>    
          <td><center>Last Name :</center></td>    
          <td><center><form:input path="lastName" /></center></td>  
         </tr>   
         <tr>    
          <td><center>Designation :</center></td>    
          <td><center><form:input path="designation" /></center></td>  
         </tr> 
         <tr></tr>  <tr></tr>  <tr></tr>  
         <tr>    
          <td colspan="2">      <center>
          <input type="submit" value="Save" /></center></td>    
         </tr>    
        </table>    
       </form:form>    
       </center>