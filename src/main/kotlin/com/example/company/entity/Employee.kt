package com.example.company.entity

import javax.persistence.*

@Entity
@Table(name = "employee")
data class Employee(

    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    var employeeId: Long = 0,

    @Column(name = "employee_name")
    var employeeName: String? = null,

    @Column(name = "mobile_number")
    var mobileNumber: String? = null,

    @Column(name = "email_id")
    var emailId: String? = null,

    @Column(name = "project_assigned")
    var projectAssigned: String? = null

)