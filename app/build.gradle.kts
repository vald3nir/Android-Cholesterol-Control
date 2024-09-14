plugins {
    alias(libs.plugins.toolkit.androidX.application)
}

android {
    namespace = "com.vald3nir.my_exams"
    defaultConfig {
        applicationId = "com.vald3nir.my_exams"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":shared-domain"))
    implementation(project(":features:home"))
    implementation(project(":features:onboarding"))
}