package com.psm

class Division {
	String divisionName
	static hasOne = [chief: Chief]
    static constraints = {
      divisionName nullable: false, unique: true
    }
}
