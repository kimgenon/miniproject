package com.psm

import grails.transaction.Transactional

@Transactional
class ProjectService {
	Project createNewProject(Map projectMap){
		// def newProject = new Project()
		// def chief = Chief.findById(params.id)
		// newProject.with {
		// 	projectName = projectMap.projectName
		// 	// chiefId = projectMap.chief.toString()
		// }
		// chief.addToProjects(newProject)
		// chief.save()
		def getChiefId = Chief.findById(params.id)
		if (chief) {
				def newProject = new Project(chief: getChiefId)
				newProject.with {
					projectName = projectMap.projectName
				}
				newProject.save()
		}
	}
    def serviceMethod() {

    }
}
