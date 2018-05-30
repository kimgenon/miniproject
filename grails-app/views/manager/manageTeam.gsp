<!DOCTYPE html>
<html>
<head>
  <title></title>
   <link rel="stylesheet" href="../../css/bootstrap.css">
   <link rel="stylesheet" href="../css/bootstrap-responsive.css"> 
</head>
<body><center>
  <h1>Manage Team</h1>
  Team Leader: <b>${managerParamsInstanceView.firstName} ${managerParamsInstanceView.middleName} ${managerParamsInstanceView.lastName}</b> <br/>
  Team Name: <b>${managerParamsInstanceView.teamName}</b> <br/>
  Team Project: <b>${managerParamsInstanceView.projectName}</b> 

    
  <h3>Team Staffs</h3>
  <g:form controller="manager" id="${managerParamsInstanceView.id}">
    <g:textField name="firstName" placeholder="Staff Firstname"></g:textField><br/>
    <g:textField name="middleName" placeholder="Staff Middlename"></g:textField><br/>
    <g:textField name="lastName" placeholder="Staff Lastname"></g:textField><br/>
    <g:textField name="contactNumber" placeholder="Staff Contact Number"></g:textField><br/>
    <g:select name="positionName" id="positionName" from="${getPositionInstance}" noSelection="${['null':'Select Position...']}" optionKey="id" /><br/>
    <g:textField name="userName" placeholder="Username"></g:textField><br/>
    <input type="password" name="password" placeholder="Password"><br/>
    <g:textField name="staffContact" placeholder="Staff Emergency Contact"></g:textField><br/>
    <g:textField name="staffContactNum" placeholder="Contact Number"></g:textField><br/>
    <input type="hidden" name="teamName" value="${managerParamsInstanceView.teamName.id}">
    <input type="hidden" name="projectName" value="${managerParamsInstanceView.projectName.id}">
    <g:actionSubmit value="Create Staff" action="saveStaff"/>
  </g:form><br />
  <table cellpadding="5" cellspacing="8" border="3">
    <thead>
      <tr>
        <td>Staff Name</td>
        <td>Staff Position</td>
        <td>Staff Contact Number</td>
        <td>Staff Team</td>
        <td>Staff Project</td>
        <td>Action</td>
      </tr>
    </thead>
      <g:each var="staffList" in="${getStaffListInstance}">
    <tbody>
      <tr>
        <td>${staffList.firstName} ${staffList.middleName} ${staffList.lastName}</td>
        <td>${staffList.positionName}</td>
        <td>${staffList.contactNumber}</td>
        <td>${staffList.teamName}</td>
        <td>${staffList.projectName}</td>
        <td><g:link action="editStaff" id="${staffList.id}">Edit</g:link> <g:link action="editStaff" id="${staffList.id}">View</g:link></td>
      </tr>
    </tbody>
      </g:each>
  </table>
</body>
</html>