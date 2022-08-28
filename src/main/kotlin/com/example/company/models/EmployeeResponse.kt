package com.example.company.models

import com.example.company.entity.Employee

class EmployeeResponse(employee: Employee) {

    var employee_id: Long
    var employee_name: String?
    var mobile_number: String?
    var email_id: String?
    var project_assigned: String?


    init {
        employee_id = employee.employeeId
        employee_name = employee.employeeName
        mobile_number = employee.mobileNumber
        email_id = employee.emailId
        project_assigned = employee.projectAssigned
    }


}