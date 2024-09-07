buildscript {
    dependencies {
        classpath(libs.android.gradlePlugin)
        classpath(libs.google.services)
        classpath(libs.firebase.appdistribution.gradle)
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.safeNavigator) apply false
    alias(libs.plugins.serialization) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}