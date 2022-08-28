package com.example.company

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = ["com.example.company.controller", "com.example.company.service"])
@EntityScan("com.example.company.entity")
@EnableJpaRepositories("com.example.company.repository")
class CompanyApplication

fun main(args: Array<String>) {
	runApplication<CompanyApplication>(*args)
}
