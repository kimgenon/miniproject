package com.psm

class ProjectController {
	def projectService

	def createProject() { }
    def index() { }

    def saveProject() {
        def newProject = new Project(params)
        def chief = Chief.findById(params.id)
        chief.addToProjects(newProject)
        chief.save(failOnError: true)
     //    def chiefInstance = Chief.get(params.id)
    	// def getProjectMap = [:]

    	// getProjectMap = [
    	// 	projectName: params.projectName,
    	// 	// chief: params.chiefId
    	// ]

    	// def saveProject = projectService.createNewProject(getProjectMap, chiefInstance.id)
    	// if (saveProject) {
    	// 	render 'Passed'
    	// }
    }
}
