// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    alias(libs.plugins.android.application) apply false
//    alias(libs.plugins.kotlin.compose) apply false
//    kotlin("jvm") version "1.8.10" apply false
//
//    id("com.android.library") version "8.2.2" apply false
//    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
//    id("com.google.dagger.hilt.android") version "2.50" apply false

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.hilt) apply false
}