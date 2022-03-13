plugins {
    java
    id("com.adarshr.test-logger") version "3.0.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.assertj:assertj-core:3.22.0")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
