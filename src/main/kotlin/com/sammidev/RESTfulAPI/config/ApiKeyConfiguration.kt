package com.sammidev.RESTfulAPI.config

import com.sammidev.RESTfulAPI.entity.ApiKey
import com.sammidev.RESTfulAPI.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeyConfiguration(val apiKeyRepository: ApiKeyRepository) : ApplicationRunner{

    val apiKey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if(!apiKeyRepository.existsById(apiKey)) {
            val entity = ApiKey(id = apiKey)
            apiKeyRepository.save(entity)
        }
    }
}