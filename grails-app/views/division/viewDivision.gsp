<!DOCTYPE html>
<html>
<head>
	<title></title>
   <link rel="stylesheet" href="../../css/bootstrap.css">
   <link rel="stylesheet" href="../css/bootstrap-responsive.css"> 
</head>
<body><center>
	<h1>Manage Division</h1>
	Division: <b>${divisionParamsInstanceView.divisionName}</b> <br/>
	Division Chief: <b>${divisionParamsInstanceView.chief.firstName} ${divisionParamsInstanceView.chief.middleName} ${divisionParamsInstanceView.chief.lastName}</b> <br/>

		
	<h3>Division Projects</h3>
	<g:form controller="division" id="${divisionParamsInstanceView.chief.id}">
	    <div class="form-group">
        <label for="projectName">Project Name</label>
        <g:textField name="projectName" placeholder="Project Name" class="form-control"></g:textField>
      </div>
		<g:actionSubmit value="Create Project" action="saveProject"/>
	</g:form><br />
	<table cellpadding="5" cellspacing="8" border="3">
		<thead>
			<tr>
				<td>Project Name</td>
				<td>Action</td>
			</tr>
		</thead>
			<g:each var="projectList" in="${getProjectInstance}">
		<tbody>
			<tr>
				<td>${projectList.projectName}</td>
				<td><g:link action="editProject" id="${projectList.id}">Edit</g:link></td>
			</tr>
		</tbody>
			</g:each>
	</table>
	<h3>Division Teams</h3>
	<g:form controller="division" id="${divisionParamsInstanceView.chief.id}">
		<g:textField name="teamName" placeholder="Team Name"></g:textField><br/>
		<g:actionSubmit value="Create Team" action="saveTeam"/>
	</g:form><br />
	<table cellpadding="5" cellspacing="8" border="3">
		<thead>
			<tr>
				<td>Team Name</td>
				<td>Action</td>
			</tr>
		</thead>
			<g:each var="teamList" in="${getTeamInstance}">
		<tbody>
			<tr>
				<td>${teamList.teamName}</td>
				<td><g:link action="editTeam" id="${teamList.id}">Edit</g:link></td>
			</tr>
		</tbody>
			</g:each>
	</table>
<h3>Project Managers</h3>
	<g:form controller="division" id="${divisionParamsInstanceView.chief.id}">
		<g:textField name="firstName" placeholder="Firstname"></g:textField><br/>
		<g:textField name="middleName" placeholder="Middlename"></g:textField><br/>
		<g:textField name="lastName" placeholder="Lastname"></g:textField><br/>
		<g:select name="teamName" id="teamName" from="${getTeamInstance}" value="${getTeamInstance.id}" noSelection="${['null':'Select Team...']}" optionKey="id" /><br/>		
		<g:select name="projectName" id="projectName" from="${getProjectInstance}" value="${getProjectInstance.id}" noSelection="${['null':'Select Project...']}" optionKey="id" /><br/>
		<g:actionSubmit value="Create Manager" action="saveManager"/>
	</g:form><br />
	<table cellpadding="5" cellspacing="8" border="3">
		<thead>
			<tr>
				<td>Project Manager</td>
				<td>Assigned Project</td>
				<td>Handled Team</td>
				<td>Action</td>
			</tr>
		</thead>
			<g:each var="managerList" in="${getManagerInstance}">
		<tbody>
			<tr>
				<td>${managerList.firstName} ${managerList.middleName} ${managerList.lastName}</td>
				<td>${managerList.projectName}</td>
				<td>${managerList.teamName}</td>
				<td><g:link action="editManager" id="${managerList.id}">Edit</g:link> <g:link action="">View</g:link> <g:link controller="manager" action="manageTeam" id="${managerList.id}">Manage</g:link></td>
			</tr>
		</tbody>
			</g:each>
	</table>
</body>
</html>