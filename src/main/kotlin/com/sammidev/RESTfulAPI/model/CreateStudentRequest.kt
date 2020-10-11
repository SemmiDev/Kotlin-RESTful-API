package com.sammidev.RESTfulAPI.model

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class CreateStudentRequest(

        @field:NotBlank
        val id: String?,

        @field:NotBlank
        val nisn: String?,

        @field:NotBlank
        val name: String?,

        @field:NotBlank
        val gender: String?,

        @field:NotBlank
        val major: String?,

        @field:NotNull
        @field:Min(value = 100000)
        val spp: Long?
)