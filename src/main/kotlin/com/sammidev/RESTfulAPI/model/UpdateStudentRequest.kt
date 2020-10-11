package com.sammidev.RESTfulAPI.model

import java.util.*
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class UpdateStudentRequest(

        @field:NotBlank
        var nisn: String?,

        @field:NotBlank
        var name: String?,

        @field:NotBlank
        var gender: String?,

        @field:NotBlank
        var major: String?,

        @field:NotNull
        @field:Min(value = 100000)
        var spp: Long?,
        var updatedAt: Date?
)