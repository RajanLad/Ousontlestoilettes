import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("jvm")
}

kotlin {
    jvmToolchain(17) // Match app module JVM
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17) // Generate bytecode for Java 17
    }
}

dependencies {
    // Business logic only, pure Kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}
//android {
//    namespace = "com.example.data"
//
//    compileSdk = 36
//
//    defaultConfig {
//        minSdk = 34
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles("consumer-rules.pro")
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
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//}

