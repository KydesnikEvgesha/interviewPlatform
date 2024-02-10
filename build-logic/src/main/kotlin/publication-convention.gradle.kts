plugins {
    id("org.gradle.maven-publish")
}

publishing {
    publications.withType<MavenPublication> {
        versionFromProperties { version ->
            this.version = version
        }
    }
}