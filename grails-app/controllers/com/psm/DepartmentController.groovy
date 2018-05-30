package com.psm

class DepartmentController {
	def divisionService

	def createDivision() { }
    
    def index() { }

    def saveDivision() {

    	def getDivisionMap = [:]

    	getDivisionMap = [
    		divisionName: params.divisionName,
    		firstName: params.firstName,
    		middleName: params.middleName,
    		lastName: params.middleName
    	]

    	def saveDivision = divisionService.createNewDivision(getDivisionMap)

   		if (saveDivision) {
   		 	render 'Successfully Added!'
   		 } else {
   		 	render 'Might have an error!'
   		 }
    }
}
