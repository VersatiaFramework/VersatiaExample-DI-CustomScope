package com.github.marcoral.versatia.example.customscope

import com.github.marcoral.versatia.di.LocalBean

@Service
class UserService {
    init {
        log("created through @Service")
    }
}

@LocalBean
class Report(service: UserService) {
    init {
        log("got the ${service.javaClass.simpleName}")
    }
}
