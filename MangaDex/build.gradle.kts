dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.github.bumptech.glide:glide:4.16.0") // TODO replace with Coil?
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
}
// use an integer for version numbers
version = 11


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Read Manga from MangaDex"
    authors = listOf("RowdyRushya")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1

    tvTypes = listOf("Other")

    requiresResources = true
    language = "en"

    // random cc logo i found
    iconUrl = "https://raw.githubusercontent.com/Rowdy-Avocado/Rowdycado-Extensions/master/logos/mangadex.png"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}