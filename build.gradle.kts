// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven("F:/Android/workspace/HelloPlugin/plugin").isAllowInsecureProtocol = true
    }

    dependencies {
        classpath("com.snail.test:MyPlugin:1.0.0")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}