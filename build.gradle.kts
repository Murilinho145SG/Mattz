plugins {
    id("java")
}

group = "com.murilinho145"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("net.dv8tion:JDA:5.0.0-beta.20")
}

tasks.test {
    useJUnitPlatform()
}