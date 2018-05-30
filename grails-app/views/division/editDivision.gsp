<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>Create Division</h1>

	<g:form id="${divisionParamsInstanceEdit.id}">
		<g:textField name="divisionName" placeholder="Division Name" value="${divisionParamsInstanceEdit.divisionName}"></g:textField><br/>
		<g:textField name="firstName" placeholder="Chief Firstname" value="${divisionParamsInstanceEdit.chief.firstName}"></g:textField><br/>
		<g:textField name="middleName" placeholder="Chief Middlename" value="${divisionParamsInstanceEdit.chief.middleName}"></g:textField><br/>
		<g:textField name="lastName" placeholder="Chief Lastname" value="${divisionParamsInstanceEdit.chief.lastName}"></g:textField><br/>
		<g:actionSubmit value="Update Division" action="updateDivision"/>
	</g:form>
</body>
</html>