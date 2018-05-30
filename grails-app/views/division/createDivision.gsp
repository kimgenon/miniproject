<!DOCTYPE html>
<html>
<head>
	<title>
  </title>
  <meta charset="utf-8">
   <link rel="stylesheet" href="../css/bootstrap.css">
   <link rel="stylesheet" href="../css/bootstrap-responsive.css"> 
</head>
<body>
	<center><h1>Create Division</h1></center>

	<g:form>
    <div class="form-group" align="center">
      <div class="form-group">
        <label for="divisionName">Division Name</label>
        <g:textField name="divisionName" placeholder="Division Name" class="form-control"></g:textField>
      </div>
      <div class="form-group">
        <label for="firstName">First Name</label>
        <g:textField name="firstName" placeholder="Chief Firstname" class="form-control"></g:textField>
      </div>
      <div class="form-group">
        <label for="middleName">Middle Name</label>
        <g:textField name="middleName" placeholder="Chief Middlename" class="form-control"></g:textField>
      </div>
      <div class="form-group">
        <label for="lasstName">Last Name</label>
        <g:textField name="lastName" placeholder="Chief Lastname" class="form-control"></g:textField>
      </div>
      <g:actionSubmit value="Create Division" action="saveDivision" class="btn btn-primary"/>
    </div>

		
%{-- 		<g:textField name="firstName" placeholder="Chief Firstname"></g:textField><br/>
		<g:textField name="middleName" placeholder="Chief Middlename"></g:textField><br/>
		<g:textField name="lastName" placeholder="Chief Lastname"></g:textField><br/>
		<g:actionSubmit value="Create Division" action="saveDivision"/> --}%
	</g:form>



</body>
</html>