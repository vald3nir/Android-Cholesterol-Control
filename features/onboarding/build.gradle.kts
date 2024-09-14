plugins {
    alias(libs.plugins.toolkit.androidX.module)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.vald3nir.exams.onboarding"
}

dependencies {
    implementation(project(":shared-domain"))
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
}