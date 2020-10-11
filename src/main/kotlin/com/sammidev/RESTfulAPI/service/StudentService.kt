package com.sammidev.RESTfulAPI.service

import com.sammidev.RESTfulAPI.model.CreateStudentRequest
import com.sammidev.RESTfulAPI.model.StudentResponse

interface StudentService {
    fun create(createStudentRequest: CreateStudentRequest): StudentResponse
    fun get(id: String): StudentResponse
}