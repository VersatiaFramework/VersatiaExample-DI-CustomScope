package dev.versatia.example.customscope

import dev.versatia.di.LocalBean

/** Inherits `@LocalBean`: every `@Service` class is a local bean. Annotations inherit through meta-annotations, transitively. */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
@LocalBean
annotation class Service
