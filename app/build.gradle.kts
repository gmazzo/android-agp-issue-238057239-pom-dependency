plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("$group:mylibrarypom:$version")
    implementation("$group:mylibrary:$version")

    implementation("com.google.android.material:material:1.6.1")
}
