plugins {
    id("com.android.application")
}

android {
    namespace = "com.ginkel.hashit"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ginkel.hashit"
        minSdk = 14
        targetSdk = 35
        versionCode = 25
        versionName = "1.7.2"
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
}

dependencies {
    implementation(files("../lib/commons-codec-1.4.jar"))
}
