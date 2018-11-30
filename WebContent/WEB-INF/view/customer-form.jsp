<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css"/>
		  
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
		  
	<style type="text/css">
		.error {
			color.red;
		}
		table {
			width: 50%;
			border-collapse: collapse;
			border-spacing: 0px;
		}
		table td {
			border: 1px solid #565454;
			padding: 20px;
		}
	</style>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Customer Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save Customer</h3>
		
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			
			<!-- associate data with customer id -->
			<form:hidden path="id"/>
			
			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td>
							<form:input path="firstName" />	<br />
							<form:errors path="firstName" cssClass="error"/>
						</td>
						
					</tr>
					
					<tr>
						<td><label>Last Name:</label></td>
						<td>
							<form:input path="lastName" /> <br />
							<form:errors path="lastName" cssClass="error"/>
						</td>
						
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td>
							<form:input path="email" /> <br />
							<form:errors path="email" cssClass="error"/>
						</td>
						
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>					
				
				</tbody>
			</table>
			
		</form:form>
		
		<div style="clear; both"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	</div>

</body>

</html>