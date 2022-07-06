plugins {
    id("com.android.application") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
}

allprojects {
    group = "com.example.myapplication"
    version = "0.0.1"
}

tasks.register<Delete>("publishToLocal") {
    delete("$rootDir/repo")
    allprojects {
        plugins.withId("local-publish") {
            finalizedBy(tasks.named("publishAllPublicationsToLocalRepository"))
        }
    }
}
