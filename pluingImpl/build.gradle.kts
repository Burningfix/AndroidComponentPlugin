@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = AppConfig.compileSdkVersion
    buildToolsVersion = AppConfig.buildToolsVersion
    ndkVersion = AppConfig.ndkVersion

    defaultConfig {
        resourceConfigurations.addAll(arrayOf("zh", "en"))
        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        consumerProguardFiles("consumer-rules.pro")
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KotlinConstants.kotlin_version}")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation( "androidx.core:core-ktx:1.9.0")
}
