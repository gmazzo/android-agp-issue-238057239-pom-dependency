import org.gradle.kotlin.dsl.support.serviceOf

plugins {
    `local-publish`
}

val config = configurations.create("pomDependencies").attributes {
    attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.LIBRARY))
    attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling.EXTERNAL))
}
val component = serviceOf<SoftwareComponentFactory>()
    .adhoc("pom")
    .apply { addVariantsFromConfiguration(config) { mapToMavenScope("compile") } }

publishing {
    publications.register<MavenPublication>("default") {
        from(component)
    }
}

dependencies {
    add(config.name, project(":mylibrary"))
}
