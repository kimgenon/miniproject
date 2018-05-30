<!DOCTYPE html>
<html>
<head>
  <title></title>
</head>
<body>
  <h1>Update Team</h1>

  <g:form id="${teamParams.id}">
    <g:textField name="teamName" placeholder="Team Name" value="${teamParams.teamName}"></g:textField><br/>
    <g:actionSubmit value="Update Team" action="updateTeam"/>
  </g:form>
</body>
</html>