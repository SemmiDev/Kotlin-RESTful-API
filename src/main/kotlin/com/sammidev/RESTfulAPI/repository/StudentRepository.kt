package com.sammidev.RESTfulAPI.repository

import com.sammidev.RESTfulAPI.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, String> {

}