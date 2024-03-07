plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.compose")
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(compose.desktop.currentOs)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.LavishSwarnkar"
            artifactId = "lib3"
            version = "1.0"

            afterEvaluate {
                from(components["java"])
            }
        }
    }
}