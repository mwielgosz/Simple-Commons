import org.gradle.kotlin.dsl.libs

plugins {
    alias(libs.plugins.android).apply(false)
    alias(libs.plugins.composeCompiler).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.ksp).apply(false)
    alias(libs.plugins.parcelize).apply(false)
    alias(libs.plugins.library).apply(false)
    alias(libs.plugins.kotlinSerialization).apply(false)
}

tasks.register<Delete>("clean") {
    delete {
        layout.buildDirectory.asFile
    }
}
