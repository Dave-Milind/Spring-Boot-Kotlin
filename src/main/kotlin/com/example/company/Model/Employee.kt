package com.example.company.Model

data class Employee(var name:String?=null, var age:Int?=null, var skillList:List<Skill>)

data class Skill(var name:String?=null, var level:Int?=null)


