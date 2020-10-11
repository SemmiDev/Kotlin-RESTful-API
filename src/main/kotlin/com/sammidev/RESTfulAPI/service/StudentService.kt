package com.sammidev.RESTfulAPI.service

import com.sammidev.RESTfulAPI.model.CreateStudentRequest
import com.sammidev.RESTfulAPI.model.ListStudentRequest
import com.sammidev.RESTfulAPI.model.StudentResponse
import com.sammidev.RESTfulAPI.model.UpdateStudentRequest

interface StudentService {
    fun create(createStudentRequest: CreateStudentRequest): StudentResponse
    fun get(id: String): StudentResponse
    fun update(id: String, updateStudentRequest: UpdateStudentRequest): StudentResponse
    fun delete(id: String)
    fun list(listStudentRequest: ListStudentRequest) : List<StudentResponse>
}