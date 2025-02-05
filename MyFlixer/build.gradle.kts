import org.jetbrains.kotlin.konan.properties.Properties

dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// use an integer for version numbers
version = 7


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Watch movies and series from Flixerz"
    authors = listOf("RowdyRushya,Phisher98")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1

    tvTypes = listOf("Movies", "TV Series")

    requiresResources = true
    language = "en"

    // random cc logo i found
    iconUrl = "https://myflixerz.to/images/group_1/theme_7/logo.png?v=0.1"
}

android {
    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())
        android.buildFeatures.buildConfig=true
        buildConfigField("String", "WASMAPI", "\"${properties.getProperty("WASMAPI")}\"")
        buildConfigField("String", "Proxy", "\"${properties.getProperty("Proxy")}\"")
    }
}
