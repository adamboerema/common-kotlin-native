# Muiltiplatform Kotlin Native project

Inspired by: https://github.com/JetBrains/kotlin-native/tree/master/samples/calculator

###Building with Kotlin native Requirements

Gradle plugin 4.6+ required
Configuration on demand must be turned off (Preferences -> Build, Execution, Development -> Compiler)

###Kotlin Native repo
https://github.com/JetBrains/kotlin-native

###Kotlin Native Sample projects
https://github.com/JetBrains/kotlin-native/tree/master/samples

###Konan Gradle Plugin
https://github.com/JetBrains/kotlin-native/blob/master/GRADLE_PLUGIN.md

###Common kotlin projects
https://kotlinlang.org/docs/reference/multiplatform.html
kotlin-platform-common to the common module
kotlin-stdlib-common to the common module
kotlin-platform-android to the android module

Modules using the common library should add expectedBy to their application level gradle files

    dependencies {
        // ... other dependencies here
        
        expectedBy project(":common")
    }


### iOS Framework

iOS is built using a custom run script in the target's framework Build Phase that activates
gradle's build process and compiles the needed framework files to the project files in Xcode


###Pitfalls

* Experimental and still in beta
* Requires Gradle 4.6+
* Kotlin multiplatform projects are somewhat finnicky to create (especially in AS)
* No real IDE support yet except for AppCode and CLion or Kotlin Native outside of gradle plugin
* iOS is unnatural folder structure. Has to be created within the root project (/root/ios/project.pbxproj). Manual manipulation may be required

### Gotchas

* Kotlin Konan plugin defaults to /src/main/kotlin. Srcdir will need to be set if this is not the case for the common module.


