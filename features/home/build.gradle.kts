plugins {
    alias(libs.plugins.toolkit.androidX.module)
}

android {
    namespace = "com.vald3nir.exams.home"
}

dependencies {
    implementation(project(":shared_domain"))
}