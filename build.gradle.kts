plugins {
    kotlin("jvm") version "1.8.22"
}

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    // Framework oficial de extensiones Cloudstream
    implementation("com.github.recloudstream:cloudstream:extensions:master-SNAPSHOT")
}
