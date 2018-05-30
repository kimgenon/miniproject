package com.psm

class Team {  
    String teamName
    static belongsTo = [chief: Chief]
    String toString() { teamName }
    static constraints = {
      teamName nullable: false, unique: true
    }
}
