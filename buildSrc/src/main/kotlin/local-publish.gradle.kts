plugins {
    `maven-publish`
}

publishing {
    repositories {
        maven("$rootDir/repo") { name = "Local" }
    }
}
