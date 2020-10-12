package com.sammidev.RESTfulAPI.auth

import com.sammidev.RESTfulAPI.error.UnauthorizedException
import com.sammidev.RESTfulAPI.repository.ApiKeyRepository
import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor
import java.lang.Exception

@Component
class ApiKeyInterceptor (val apiKeyRepository: ApiKeyRepository): WebRequestInterceptor {
    override fun preHandle(request: WebRequest) {
        val apiKey = request.getHeader("X-Api-Key")
        if (apiKey == null) {
            throw UnauthorizedException()
        }

        if (!apiKeyRepository.existsById(apiKey)) {
            throw UnauthorizedException()
        }

        // valid
    }

    override fun postHandle(p0: WebRequest, p1: ModelMap?) {
        // nothing
    }

    override fun afterCompletion(p0: WebRequest, p1: Exception?) {
        // nothing
    }
}