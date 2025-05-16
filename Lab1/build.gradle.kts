plugins {
    java
    war
    id("org.gretty") version "3.1.5"
}

gretty {
    servletContainer = "tomcat9"
    contextPath = "/"
    httpPort = 8080
}

version = "1.0-SNAPSHOT"
group = "ru.siailya"


java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")

    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
}