plugins {
    kotlin("jvm") version "1.8.10" // or latest Kotlin version
}

//android {
//    namespace = "com.example.usecases"
//    compileSdk {
//        version = release(36)
//    }
//
//    defaultConfig {
//        applicationId = "com.example.usecases"
//        minSdk = 24
//        targetSdk = 36
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0") // Coroutines for background work
    testImplementation(libs.junit)
}