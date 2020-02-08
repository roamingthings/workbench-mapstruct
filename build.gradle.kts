plugins {
    `java-library`
}

group = "de.roamingthings"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.12")
    implementation("org.mapstruct:mapstruct:1.3.1.Final")

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.0")
    testImplementation("org.assertj:assertj-core:3.15.0")

    annotationProcessor("org.mapstruct:mapstruct-processor:1.3.1.Final")
    annotationProcessor("org.projectlombok:lombok:1.18.12")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    test {
        testLogging.showExceptions = true
    }
}
