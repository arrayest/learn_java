plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/cn.hutool/hutool-all
    implementation("cn.hutool:hutool-all:5.8.27")
}

tasks.test {
    useJUnitPlatform()
}