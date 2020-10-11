package com.sammidev.RESTfulAPI.controller

import com.sammidev.RESTfulAPI.model.CreateStudentRequest
import com.sammidev.RESTfulAPI.model.StudentResponse
import com.sammidev.RESTfulAPI.service.StudentService
import com.sammidev.model.WebResponse
import org.springframework.web.bind.annotation.*

@RestController
class StudentController(val studentService: StudentService) {

    @PostMapping(
            value    = ["/api/students"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createStudent(@RequestBody body: CreateStudentRequest): WebResponse<StudentResponse> {
        val studentResponse =  studentService.create(body)
        return WebResponse(
                code = 200,
                status = "OK",
                data = studentResponse
        )
    }

    @GetMapping(
            value    = ["/api/students/{student_nisn}"],
            produces = ["application/json"]
    )
    fun getStudent(@PathVariable("idStudent") nisn: String) : WebResponse<StudentResponse> {
        val studentResponse = studentService.get(nisn);
        return WebResponse(
                code = 200,
                status = "OK",
                data = studentResponse
        )
    }
}