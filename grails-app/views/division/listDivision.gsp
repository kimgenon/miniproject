<!DOCTYPE html>
<html>
<head>
	<title></title>
   <link rel="stylesheet" href="../css/bootstrap.css">
   <link rel="stylesheet" href="../css/bootstrap-responsive.css"> 
</head>
<body>
	<h1>Division List</h1>

	<a href="createDivision.gsp">Add New Division</a>
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">Division</th>
				<th scope="col">Division Chief</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
			<g:each var="divisionList" in="${divisionListInstance}">
		<tbody>
			<tr>
				<td>${divisionList.divisionName}</td>
				<td>${divisionList.chief.firstName} ${divisionList.chief.middleName} ${divisionList.chief.lastName}</td>
				<td><g:link action="editDivision" id="${divisionList.id}">Edit</g:link> <g:link action="" id="">View</g:link> <g:link action="viewDivision" id="${divisionList.id}">Manage</g:link></td>
			</tr>
		</tbody>
			</g:each>
	</table>
</body>
</html>