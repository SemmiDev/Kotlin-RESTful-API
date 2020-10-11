package com.sammidev.RESTfulAPI.model


import java.util.*

data class StudentResponse (

        val id: String,
        val nisn: String,
        val name: String,
        val gender: String,
        val major: String,
        val spp: Long,
        val createdAt: Date,
        val updatedAt: Date?
)
