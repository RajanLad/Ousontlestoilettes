import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
//    id("org.jetbrains.kotlin.plugin.compose") version "2.1.0" apply false
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.example.data"

    compileSdk = 36

    defaultConfig {
        minSdk = 34
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {

//    jvmToolchain(JavaVersion.VERSION_11) // Ensures KAPT, Kotlin compiler, and Gradle use the same JVM

        jvmToolchain(17) // Use system JDK 17
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
}

dependencies {

    implementation(project(":usecases"))
//
//    implementation("com.google.dagger:hilt-android:2.50")
//    kapt("com.google.dagger:hilt-compiler:2.50")
//
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}