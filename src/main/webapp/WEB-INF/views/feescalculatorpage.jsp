<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Admission Fees Calculator </center></h1>
<form:form method="POST" modelAttribute="admission" action="/result">
	<table>
		<tr>
			<td>Enter Admission ID</td><td><form:input path="admissionId" id="admissionId" /><form:errors path="admissionId" /></td>
		</tr>
		
		<tr>
			<td>Choose Department:</td><td><form:select path="deptName" id="deptName" items="${deptNameList }"></form:select></td> 
		</tr>
		
		<tr>
			<td>Hostel Preference:</td><td><form:select path="preferHostel" id="preferHostel" items="${preferenceList }" /></td>
		</tr>
		
		<tr>
			<td>Are you first graduate in your family:</td><td><form:select path="firstGraduateInfo" id="firstGraduateInfo" items="${graduateList }" /></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="CalculateFees" /></td><td><input type="reset" value="Cancel" />
		</tr>
	</table>

</form:form>


</body>
</html>	 	  	    	    	     	      	 	
