package com.sammidev.RESTfulAPI.repository

import com.sammidev.RESTfulAPI.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String>{}