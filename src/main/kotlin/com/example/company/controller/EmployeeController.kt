package com.example.company.controller

import com.example.company.entity.Employee
import com.example.company.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/employee/")
class EmployeeController {

    @Autowired
    lateinit var employeeService: EmployeeService


    @GetMapping("get-all-employees")
    fun getAllEmployees(): List<Employee> {

        return employeeService.getAllEmployees()
    }


    @GetMapping("/get-dummy-employee")
    fun getEmployee(): Employee {

        return Employee(
            employeeId = 900,
            employeeName = "Damon salvatore",
            emailId = "damon@somedomain.com",
            mobileNumber = "0909090984"
        )

    }
}