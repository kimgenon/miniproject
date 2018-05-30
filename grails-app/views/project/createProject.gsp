<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>Create Project</h1>

	<g:form controller="division" action="saveProject">
		<g:textField name="projectName" placeholder="Project Name"></g:textField><br/>
%{-- 		<g:hiddenField name="chief.id" value="${params.id}" />	 --}%	
		<g:actionSubmit value="Create Project"/>
	</g:form>
</body>
</html>