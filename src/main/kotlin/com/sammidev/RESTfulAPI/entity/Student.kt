package com.sammidev.RESTfulAPI.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "students")
data class Student(

        @Id
        val id: String,

        @Column(name = "nisn")
        val nisn: String,

        @Column(name = "name")
        val name: String,

        @Column(name = "gender")
        val gender: String,

        @Column(name = "major")
        val major: String,

        @Column(name = "spp")
        val spp: Long,

        @Column(name = "created_at")
        val createdAt: Date,

        @Column(name = "updated_at")
        val updatedAt: Date?
)