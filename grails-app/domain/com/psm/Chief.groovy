package com.psm

class Chief {
	String firstName
	String middleName
	String lastName
	Division division
	static hasMany = [manager: Manager, project: Project, team: Team]
    static constraints = {
      firstName nullable: false
      middleName nullable: true
      lastName nullable: false
    }
}
