package com.example.company.controller

import com.example.company.Model.Employee
import com.example.company.Model.Skill
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/employee/")
class EmployeeController {

    @GetMapping("/getemployee")
    fun getEmployee():Employee{

        return Employee(
            "Damon",
            surname = "Salvatore",
            age = 28,
            skillList = listOf(Skill("Flying", 1), Skill("Biting", 3), Skill("Dancing", 3))
        )
    }
}