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
        var nisn: String,

        @Column(name = "name")
        var name: String,

        @Column(name = "gender")
        var gender: String,

        @Column(name = "major")
        var major: String,

        @Column(name = "spp")
        var spp: Long,

        @Column(name = "created_at")
        var createdAt: Date,

        @Column(name = "updated_at")
        var updatedAt: Date?
)