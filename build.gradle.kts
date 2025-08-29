plugins {
    kotlin("jvm") version "1.8.22"
}

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    // Usa el framework de extensiones correcto
    implementation("com.github.recloudstream:cloudstream:extensions:master-SNAPSHOT")
}
