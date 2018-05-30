package com.psm

class Project {
	String projectName
	static belongsTo = [chief: Chief]
  String toString() { projectName }
    static constraints = {
      projectName nullable: false, unique: true
    }
}
