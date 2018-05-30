<!DOCTYPE html>
<html>
<head>
  <title></title>
</head>
<body>
  <h1>Update Project</h1>

  <g:form id="${projectParams.id}">
    <g:textField name="projectName" placeholder="Project Name" value="${projectParams.projectName}"></g:textField><br/>
    <g:actionSubmit value="Update Project" action="updateProject"/>
  </g:form>
</body>
</html>