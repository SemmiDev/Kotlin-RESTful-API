package com.sammidev.RESTfulAPI.service.impl

import com.sammidev.RESTfulAPI.entity.Student
import com.sammidev.RESTfulAPI.error.NotFoundException
import com.sammidev.RESTfulAPI.model.CreateStudentRequest
import com.sammidev.RESTfulAPI.model.ListStudentRequest
import com.sammidev.RESTfulAPI.model.StudentResponse
import com.sammidev.RESTfulAPI.model.UpdateStudentRequest
import com.sammidev.RESTfulAPI.repository.StudentRepository
import com.sammidev.RESTfulAPI.service.StudentService
import org.springframework.stereotype.Service
import com.sammidev.RESTfulAPI.validation.ValidationUtils
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import java.util.*
import java.util.stream.Collector
import java.util.stream.Collectors

@Service
class StudentServiceImpl(val studentRepository: StudentRepository,
                         val validationUtils: ValidationUtils) : StudentService {

    override fun create(createStudentRequest: CreateStudentRequest): StudentResponse {
       validationUtils.validate(createStudentRequest)

        val student = Student(
                id        = createStudentRequest.id!!,
                nisn      = createStudentRequest.nisn!!,
                name      = createStudentRequest.name!!,
                gender    = createStudentRequest.gender!!,
                major     = createStudentRequest.major!!,
                spp       = createStudentRequest.spp!!,
                createdAt = Date(),
                updatedAt = null
        )

        studentRepository.save(student)
        return StudentResponse(
                id     = student.id,
                nisn   = student.nisn,
                name   = student.name,
                gender = student.gender,
                major  = student.major,
                spp    = student.spp,
                createdAt = student.createdAt,
                updatedAt = student.updatedAt
        )

    }

    override fun get(id: String): StudentResponse {
        val student = findProductByIdOrThrowNotFound(id)
        return convertStudentToStudentResponse(student!!)
    }

    override fun update(id: String, updateStudentRequest: UpdateStudentRequest): StudentResponse {
        val student = findProductByIdOrThrowNotFound(id)
        validationUtils.validate(student!!)
        student.apply {
            nisn  = updateStudentRequest.nisn!!
            name  = updateStudentRequest.name!!
            gender  = updateStudentRequest.gender!!
            major = updateStudentRequest.major!!
            spp   = updateStudentRequest.spp!!
            updatedAt = Date()
        }

        studentRepository.save(student)
        return convertStudentToStudentResponse(student)
    }

    override fun delete(id: String) {
        val student =  findProductByIdOrThrowNotFound(id)
        studentRepository.delete(student!!)
    }

    override fun list(listStudentRequest: ListStudentRequest): List<StudentResponse> {
        val page = studentRepository.findAll(PageRequest.of(listStudentRequest.page, listStudentRequest.size))
        val students: List<Student> = page.get().collect(Collectors.toList())
        return students.map { convertStudentToStudentResponse(it) }
    }

    private fun findProductByIdOrThrowNotFound(id: String): Student? {
        val student = studentRepository.findByIdOrNull(id)
        if (student == null) {
            throw NotFoundException()
        }else {
            return student
        }
    }

    private fun convertStudentToStudentResponse(student: Student) : StudentResponse{
        return StudentResponse(
                id     = student.id,
                nisn   = student.nisn,
                name   = student.name,
                gender = student.gender,
                major  = student.major,
                spp    = student.spp,
                createdAt = student.createdAt,
                updatedAt = student.updatedAt
        )
    }
}