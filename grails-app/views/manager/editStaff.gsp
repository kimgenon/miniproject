<!DOCTYPE html>
<html>
<head>
  <title></title>
</head>
<body>
  <h1>Update Staff</h1>

  <g:form id="${staffParams.id}">
    <g:textField name="firstName" placeholder="Manager Firstname" value="${staffParams.firstName}"></g:textField><br/>
    <g:textField name="middleName" placeholder="Manager Middlename" value="${staffParams.middleName}"></g:textField><br/>
    <g:textField name="lastName" placeholder="Manager Lastname" value="${staffParams.lastName}"></g:textField><br/>
    <g:textField name="contactNumber" placeholder="Manager Lastname" value="${staffParams.contactNumber}"></g:textField><br/>
    <g:textField name="staffContact" placeholder="Manager Lastname" value="${staffParams.staffContact}"></g:textField><br/>
    <g:textField name="staffContactNum" placeholder="Manager Lastname" value="${staffParams.staffContactNum}"></g:textField><br/>
    <g:actionSubmit value="Update Staff" action="updateStaff"/>
  </g:form>
</body>
</html>