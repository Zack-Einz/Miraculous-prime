plugins {
    kotlin("jvm") version "1.8.22"
}

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.recloudstream:cloudstream:pre-release")
}
