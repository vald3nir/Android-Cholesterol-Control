plugins {
    alias(libs.plugins.toolkit.androidX.module)
}

android {
    namespace = "com.vald3nir.exams.onboarding"
}

dependencies {
    implementation(project(":shared_domain"))
}