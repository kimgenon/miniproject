<!DOCTYPE html>
<html>
<head>
  <title></title>
</head>
<body>
  <h1>Update Manager</h1>

  <g:form id="${managerParams.id}">
    <g:textField name="firstName" placeholder="Manager Firstname" value="${managerParams.firstName}"></g:textField><br/>
    <g:textField name="middleName" placeholder="Manager Middlename" value="${managerParams.middleName}"></g:textField><br/>
    <g:textField name="lastName" placeholder="Manager Lastname" value="${managerParams.lastName}"></g:textField><br/>
    <g:actionSubmit value="Update Manager" action="updateManager"/>
  </g:form>
</body>
</html>