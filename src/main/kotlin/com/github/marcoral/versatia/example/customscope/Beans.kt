package com.github.marcoral.versatia.example.customscope

import com.github.marcoral.versatia.di.LocalBean

@Service
class UserService(plugin: CustomScopePlugin) {
    init {
        plugin.logger.info("UserService created through @Service")
    }
}

@LocalBean
class Report(service: UserService, plugin: CustomScopePlugin) {
    init {
        plugin.logger.info("Report got the ${service.javaClass.simpleName}")
    }
}
