plugins {
    alias(libs.plugins.toolkit.androidX.module)
}

android {
    namespace = "com.vald3nir.my_exams.shared_domain"
}

dependencies {
    api(project(":toolkit:androidX"))
    api(project(":toolkit:helpers"))
}