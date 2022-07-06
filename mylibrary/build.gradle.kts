plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    `local-publish`
}

android {
    namespace = "com.example.mylibrary"
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }

    publishing {
        multipleVariants("all") {
            allVariants()
            withSourcesJar()
        }
    }
}

dependencies {
    api("com.squareup.okhttp3:okhttp:4.10.0")
}

publishing {
    publications.register<MavenPublication>("default") {
        afterEvaluate { from(components["all"]) }
    }
}
