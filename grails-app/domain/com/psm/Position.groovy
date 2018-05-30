package com.psm

class Position {
    String positionName
    String toString() { positionName }
    static constraints = {
      positionName nullable: false, unique: true
    }
}
