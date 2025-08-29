plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.miraculous"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
    }
}

repositories {
    google()
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    // Cloudstream core
    implementation("com.github.recloudstream:cloudstream:pre-release")
}
