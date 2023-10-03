
object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.kotlinVersion}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompatVersion}" }
    val material by lazy { "com.google.android.material:material:${Versions.materialVersion}" }
    val constraintLayout by lazy {"androidx.constraintlayout:constraintlayout:${Versions.constraintVersion}"}
    val jUnit by lazy {"junit:junit:${Versions.junitVersion}"}
    val jUnitTest by lazy {"androidx.test.ext:junit:${Versions.junitTestVersion}"}
    val espresso by lazy {"androidx.test.espresso:espresso-core:${Versions.espressoVersion}"}
}