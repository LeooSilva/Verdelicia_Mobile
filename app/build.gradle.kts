plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") // Adicione o plugin Kotlin
}

android {
    namespace = "com.example.startup_verdelicia"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.startup_verdelicia"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        jvmTarget = "1.8" // Certifique-se de que a versão do Kotlin seja consistente
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.activity:activity:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Adicione a dependência Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.22") // Mantido apenas essa
}
