@file:Suppress("UNUSED_VARIABLE")

tasks {
    val printVersion by creating {
        group = "CI"

        doFirst {
            println(versionFromProperties())
        }
    }
}