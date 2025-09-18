plugins {
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.example.basic"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.basic"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.retrofit.api)
    implementation(libs.retrofit.converter)
    implementation(libs.kotlin.coroutines.core)
    implementation(libs.kotlin.coroutines.android)
    implementation(libs.androidx.compose.icons.extended)
    implementation(libs.compose.cloudy)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    ksp(libs.room.compiler)
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.glide)
    ksp(libs.glide.compiler)
    implementation(libs.lottie)
    implementation(libs.moshi)
    implementation(libs.moshi.kotlin)
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)
    implementation(libs.work.runtime.ktx)
    implementation(libs.coil)
    implementation(libs.datastore)
    implementation(libs.datastore.preferences)
    implementation(libs.paging.runtime)
    implementation(libs.paging.common)
    implementation(libs.paging.compose)
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.androidx.compose)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)
    implementation(libs.timber)
    implementation(libs.exoplayer.core)
    implementation(libs.exoplayer.ui)
    implementation(libs.motionlayout)
    implementation(libs.animated.drawable)
    implementation(libs.recyclerview.animators)
    implementation(libs.androidx.compose.animation)
    implementation(libs.androidx.compose.animation.core)
}