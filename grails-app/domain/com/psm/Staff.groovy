package com.psm

class Staff {
    String firstName
    String middleName
    String lastName
    int contactNumber
    String userName
    String password
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
