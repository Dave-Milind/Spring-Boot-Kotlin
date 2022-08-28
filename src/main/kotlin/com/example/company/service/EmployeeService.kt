package com.example.company.service

import com.example.company.entity.Employee
import com.example.company.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeService {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    fun getAllEmployees(): List<Employee> {

        return employeeRepository.findAll()
    }
}