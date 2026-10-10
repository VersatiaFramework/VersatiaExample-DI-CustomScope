    # VersatiaExample-DI-CustomScope

    A scope annotation of your own, `@Service`, that inherits `@LocalBean`: one declaration, no runtime code.

    Part of the [Versatia examples](https://github.com/VersatiaFramework/VersatiaExamples); documentation: [Defining your own scope](https://versatiaframework.github.io/VersatiaDocs/docs/internals/enhancements#defining-your-own-scope).

    **Start with** [`Service.kt`](src/main/kotlin/com/github/marcoral/versatia/example/customscope/Service.kt).

    ## What the log shows

    ```
    [UserService] created through @Service
[Report] got the UserService
    ```


## Things to try

- Open the generated descriptor: `UserService` is sent to `LocalBeanEnhancementProcessor`, the
  processor of the inherited scope, while the element records `@Service` as the annotation that
  produced it.
- Make `@Service` inherit `@ExposeSingleton` instead: every service is now shared with other plugins.

## Building

Requires JDK 21 and VersatiaAPI in your local Maven repository (`./gradlew publishToMavenLocal`
in its checkout); running it requires a Paper 1.21.4 server with VersatiaCore installed.

```bash
./gradlew build
```

To have the JAR copied to your server after every build, copy `local.properties.example` to
`local.properties` and set `pluginsDir`. The generated descriptor is in
`build/generated/ksp/main/kotlin`; open it to see exactly what the runtime executes.
