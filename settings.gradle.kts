pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("$rootDir/repo") { name = "Local" }
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"

include(
    ":app",
    ":mylibrary",
    ":mylibrarypom"
)
