// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "7.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}