package com.psm

import grails.transaction.Transactional

@Transactional
class ManagerService {
    Staff createNewStaff(Map staffMap){
      def newStaff = new Staff()

      newStaff.with {
        firstName = staffMap.firstName
        middleName = staffMap.middleName
        lastName = staffMap.lastName
        contactNumber = staffMap.contactNumber
        positionName = staffMap.positionName
        userName = staffMap.userName
        password = staffMap.password
        staffContact = staffMap.staffContact
        staffContactNum = staffMap.staffContactNum
        manager = staffMap.manager
        projectName = staffMap.projectName
        teamName = staffMap.teamName
      }
      newStaff.save()
    }

    Staff updateOldStaff(Map staffMap, params) {
      def updateStaff = Staff.get(params.id)

      updateStaff.with {
        firstName = staffMap.firstName
        middleName = staffMap.middleName
        lastName = staffMap.lastName
        contactNumber = staffMap.contactNumber
        staffContact = staffMap.staffContact
        staffContactNum = staffMap.staffContactNum
      }
      updateStaff.save()
    }
    def serviceMethod() {

    }
}
