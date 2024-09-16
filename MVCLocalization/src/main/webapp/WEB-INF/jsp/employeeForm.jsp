<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
</head>
<body>
	<h2><spring:message code="employee.form.title"/></h2>
	<form:form method="post" action="addEmployee" commandName="employee">

		<table>
			<tr>
				<td><spring:message code="employee.form.firstName"/></td>
				<td><input type="text" name="firstName"/></td>
			</tr>
			
			<tr>
				<td><spring:message code="employee.form.lastName"/></td>
				<td><input type="text" name="lastName"/></td>
			</tr>
			
			<tr>
				<td><spring:message code="employee.form.departmentName"/></td>
				<td><input type="text" name="department"/></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="<spring:message code="employee.form.submit"/>"/></td>
			</tr>
		</table>

	</form:form>
</body>
</html>