package com.psm

import grails.transaction.Transactional

@Transactional
class DivisionService {
	Division createNewDivision(Map divisionMap){
		def newDivision = new Division(chief: new Chief())

		newDivision.with {
			divisionName = divisionMap.divisionName
			chief.firstName = divisionMap.firstName
			chief.middleName = divisionMap.middleName
			chief.lastName = divisionMap.lastName
		}
		newDivision.save()
	}

	Division updateOldDivision(Map divisionMap, params){
		def newDivision = Division.get(params.id)
		newDivision.chief.with {
			division.divisionName = divisionMap.divisionName
			firstName = divisionMap.firstName
			middleName = divisionMap.middleName
			lastName = divisionMap.lastName
		}
		newDivision.save()
	}

	Project createNewProject(Map projectMap){
		def newProject = new Project()
		newProject.with {
			projectName = projectMap.projectName
			chief = projectMap.chief
		}
		newProject.save()
	}	

	Project updateOldProject(Map projectMap, params){
		def updateDivision = Project.get(params.id)
		updateDivision.with {
			projectName = projectMap.projectName
		}
		updateDivision.save()
	}


	// Manager createNewManager(Map managerMap){
	// 	def newManager = new Manager()
	// 	newManager.with {
	// 		firstName = managerMap.firstName
	// 		middleName = managerMap.middleName
	// 		lastName = managerMap.lastName
	// 		chief = managerMap.chief
	// 		// project = managerMap.project
	// 	}
	// 	newManager.save()
	// }

	Manager createNewManager(Map managerMap){
		def newManager = new Manager()
		newManager.with {
			firstName = managerMap.firstName
			middleName = managerMap.middleName
			lastName = managerMap.lastName
			projectName = managerMap.projectName
			teamName = managerMap.teamName
			chief = managerMap.chief
		}
		newManager.save()
	}

	Manager updateOldManager(Map managerMap, params){
		def updateManager = Manager.get(params.id)
		updateManager.with {
			firstName = managerMap.firstName
			middleName = managerMap.middleName
			lastName = managerMap.lastName
		}
		updateManager.save()
	}

	Team createNewTeam(Map teamMap){
		def newTeam = new Team()
		newTeam.with {
			teamName = teamMap.teamName
			chief = teamMap.chief
		}
		newTeam.save()
	}

	Team updateOldTeam(Map teamMap, params){
		def updateTeam = Team.get(params.id)
		updateTeam.with {
			teamName = teamMap.teamName
		}
		updateTeam.save()
	}
    def serviceMethod() {

    }
}
