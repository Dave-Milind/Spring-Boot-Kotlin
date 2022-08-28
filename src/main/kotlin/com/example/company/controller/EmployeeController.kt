package com.example.company.controller

import com.example.company.entity.Employee
import com.example.company.models.EmployeeResponse
import com.example.company.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.function.Consumer

@RestController
@RequestMapping("/api/employee/")
class EmployeeController {

    @Autowired
    lateinit var employeeService: EmployeeService


    @GetMapping("get-all-employees")
    fun getAllEmployees(): List<EmployeeResponse> {


        //the below manipulation before returning is simply done to avoid exposing our database/entity fields to user
        val responseList: ArrayList<EmployeeResponse> = ArrayList()
        employeeService.getAllEmployees().forEach(Consumer { employee ->

            responseList.add(EmployeeResponse(employee))

        })

        return responseList
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