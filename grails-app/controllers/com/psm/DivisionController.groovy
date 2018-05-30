package com.psm

class DivisionController {
	def divisionService

	def createDivision() { }
    
    def index() { 
    	redirect (action: 'listDivision')
    }

    def saveDivision(DivisionActionCommand  divCmd) {
      if (divCmd.hasErrors()) {
        render 'Error'
      } else {
          def getDivisionMap = [:]

            getDivisionMap = [
              divisionName: params.divisionName,
              firstName: params.firstName,
              middleName: params.middleName,
              lastName: params.lastName
            ]

            def saveDivision = divisionService.createNewDivision(getDivisionMap)

            if (saveDivision) {
              redirect (action: 'index')
            } else {
              render 'Might have an error!'
            }  
      }
    	
    }

    def updateDivision(DivisionActionCommand  divCmd) {
      if (divCmd.hasErrors()) {
        render 'Error'
      } else {
          def getDivisionMap = [:]

          getDivisionMap = [
            divisionName: params.divisionName,
            firstName: params.firstName,
            middleName: params.middleName,
            lastName: params.lastName
          ]  
     
          def updateDivision = divisionService.updateOldDivision(getDivisionMap, params)

          if (updateDivision) {
            redirect (action: 'listDivision')
          } else {
            render 'Might have an error!'
          }    
      }
    }

    def listDivision() {
    	def getDivisionList = Division.list()
    	[divisionListInstance: getDivisionList]

    }

    def editDivision() {
    	def getDivisionParamsForEdit = Division.get(params.id)
    	[divisionParamsInstanceEdit: getDivisionParamsForEdit]
    }

    def viewDivision() {
    	def getDivisionParamsForView = Division.get(params.id)
      def getChiefId =  Chief.findById(params.id)
      def getProjectList = Project.where {
        chief == getChiefId
      }
      def getManagerList = Manager.where {
        chief == getChiefId
      }
      def getTeamList = Team.where {
        chief == getChiefId
      }
    	[divisionParamsInstanceView: getDivisionParamsForView, getProjectInstance: getProjectList, getManagerInstance: getManagerList, getTeamInstance: getTeamList]
    }

    def saveProject(ProjectActionCommand proCmd) {
      if (proCmd.hasErrors()) {
        render 'Error'
      } else {
         def getChiefId =  Chief.findById(params.id)
         if (getChiefId) {
            def getProjectMap = [:]

            getProjectMap = [
              projectName: params.projectName,
              chief: getChiefId
            ]
         println getProjectMap
         def saveProject = divisionService.createNewProject(getProjectMap)

         }
      }
      //respond view: 'viewDivision'
    }

    def editProject() {
      def getProjectParamsForEdit = Project.get(params.id)
      [projectParams: getProjectParamsForEdit]
    }

    def updateProject(ProjectActionCommand proCmd) {
      if (proCmd.hasErrors()) {
        render 'Error'
      } else {
          def getProjectMap = [:]

          getProjectMap = [
            projectName: params.projectName
          ]

          def updateProject = divisionService.updateOldProject(getProjectMap, params)
      }
    }

    def saveManager(ManagerActionCommand manCmd) {
      if (manCmd.hasErrors()) {
        render 'Error'
      } else {
          def getChiefId =  Chief.findById(params.id)
          // if (getChiefId) {
          println getChiefId
              def getManagerMap = [:]

              getManagerMap = [
                firstName: params.firstName,
                middleName: params.middleName,
                lastName: params.lastName,
                projectName: Project.get(params.projectName),
                teamName: Team.get(params.teamName),
                chief: getChiefId
              ]
          println getManagerMap
           def saveManager = divisionService.createNewManager(getManagerMap)
      }
            // }
    }

    def editManager() {
      def getManagerParamsForEdit = Manager.get(params.id)
      [managerParams: getManagerParamsForEdit]

    }

    def updateManager(ManagerActionCommand manCmd) {
      if (manCmd.hasErrors()) {
        render 'Error'
      } else {
          def getManagerMap = [:]

          getManagerMap = [
            firstName: params.firstName,
            middleName: params.middleName,
            lastName: params.lastName,
          ]

          def updateManager = divisionService.updateOldManager(getManagerMap, params)
      }
    }

    def saveTeam(TeamActionCommand teamCmd) {
      if (teamCmd.hasErrors()) {
        render 'Error'
      } else {
          def getChiefId =  Chief.findById(params.id)
          def getTeamMap = [:]

          getTeamMap = [
            teamName: params.teamName,
            chief: getChiefId
          ]
          println getTeamMap
          def saveTeam = divisionService.createNewTeam(getTeamMap)
      }
    }

    def editTeam() {
      def getTeamParamsForEdit = Team.get(params.id)
      [teamParams: getTeamParamsForEdit]
    }

    def updateTeam(TeamActionCommand teamCmd) {
      if (teamCmd.hasErrors()) {
        render 'Error'
      } else {
          def getTeamMap = [:]

          getTeamMap = [
            teamName: params.teamName
          ]

          def updateTeam = divisionService.updateOldTeam(getTeamMap, params)
      }
    }
    // def getProjectDetailsInstance() {
    //   def getProjectDetailsInstance = Project.get(params.id)
    //   [getProjectDetails: getProjectDetailsInstance]
    // }

    // def getProjectListInstance() {
    //   // def getChiefIdList =  Chief.findById(params.id)
    //   // def getProjectListInstance = Project.where {
    //   //   chief == getChiefIdList
    //   // }
    //   def getProjectListInstance = Project.findAll([sort:"projectName", order: "asc"])
    //  [getProjectListInstance: getProjectListInstance]
    // }

    // def getProjectList() {
    //   def getProject = Project.list()
    //   [getProject: getProject]
    // }
}

class DivisionActionCommand{
  String divisionName
  static hasOne = [chief: Chief]
    static constraints = {
      importFrom Chief
      divisionName nullable: false, unique: true
    }
}

class ProjectActionCommand{
  String projectName
  static belongsTo = [chief: Chief]
  String toString() { projectName }
    static constraints = {
      projectName nullable: false, unique: true
    }
}

class TeamActionCommand{
  String teamName
  static belongsTo = [chief: Chief]
  String toString() { teamName }
  static constraints = {
    teamName nullable: false, unique: true
  }
}

class ManagerActionCommand{ String firstName
  String middleName
  String lastName
  static belongsTo = [chief: Chief]
  Project projectName
  Team teamName
  static hasMany = [staff: Staff]
    static constraints = {
      firstName nullable: false
      middleName nullable: true
      lastName nullable: false
    }
}