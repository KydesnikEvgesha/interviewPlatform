plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "interview-platform"

dependencyResolutionManagement {
    versionCatalogs {
        create("lib") {
            from(files("gradle/catalogs/lib.versions.toml"))
        }
    }
}
