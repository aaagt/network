plugins {
    id("java")
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = "aaagt.network"
    version = "1.0-SNAPSHOT"
}
