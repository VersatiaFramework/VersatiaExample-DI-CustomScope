package com.github.marcoral.versatia.example.customscope

import com.github.marcoral.versatia.di.LocalBean
import java.util.logging.Logger

@Service
class UserService(logger: Logger) {
    init {
        logger.info("UserService created through @Service")
    }
}

@LocalBean
class Report(service: UserService, logger: Logger) {
    init {
        logger.info("Report got the ${service.javaClass.simpleName}")
    }
}
