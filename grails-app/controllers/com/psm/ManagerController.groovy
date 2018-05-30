package com.psm

class ManagerController {
    def managerService
    def index() { }

    def manageTeam() {
      def getManagerParamsForView = Manager.get(params.id)
      def getPositionList = Position.list()
      def getManagerId = Manager.findById(params.id)
      def getStaffList = Staff.where {
        manager == getManagerId
      }

      println getStaffList
      [managerParamsInstanceView: getManagerParamsForView, getPositionInstance: getPositionList, getStaffListInstance: getStaffList]
    }

    def saveStaff(StaffActionCommand stfCmd) {
      if (stfCmd.hasErrors()) {
        render 'Error'
      } else {
          def getManagerId = Manager.findById(params.id)

          def getStaffMap = [:]

          getStaffMap = [
            firstName: params.firstName,
            middleName: params.middleName,
            lastName: params.lastName,
            contactNumber: params.contactNumber.toInteger(),
            positionName: Position.get(params.positionName),
            staffContact: params.staffContact,
            userName: params.userName,
            password: params.password,
            staffContactNum: params.staffContactNum.toInteger(),
            manager: getManagerId,
            projectName: Project.get(params.projectName),
            teamName: Team.get(params.teamName)
          ]

          def saveStaff = managerService.createNewStaff(getStaffMap)
      }
    }

    def editStaff() {
      def getStaffParamsForView = Staff.get(params.id)
      [staffParams: getStaffParamsForView]
      // println getStaffParamsForView
    }

    def updateStaff(StaffActionCommand stfCmd) {
      if (stfCmd.hasErrors()) {
        render 'Error'
      } else {
          def getStaffMap = [:]

          getStaffMap = [
            firstName: params.firstName,
            middleName: params.middleName,
            lastName: params.lastName,
            contactNumber: params.contactNumber.toInteger(),
            staffContact: params.staffContact,
            staffContactNum: params.staffContactNum.toInteger()
          ]

          def updateStaff = managerService.updateOldStaff(getStaffMap, params)
      }
    }
}

class StaffActionCommand {
    String firstName
    String middleName
    String lastName
    int contactNumber
    String staffContact
    int staffContactNum
    Position positionName
    Project projectName
    Team teamName
    static belongsTo = [manager: Manager]
    static constraints = {
      firstName nullable: false
      middleName nullable: true
      lastName nullable: false
      contactNumber nullable: false, unique: true
      staffContact nullable: false, unique: true
      staffContactNum nullable: false, unique: true
    }
}