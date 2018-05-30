package com.psm

class Manager {
	String firstName
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
