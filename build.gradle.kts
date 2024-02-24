plugins {
  id("java")
  id("org.springframework.boot") version "3.2.3"
  id("io.spring.dependency-management") version "1.1.4"
}

group = "org.example"
version = "0.1.0"

repositories {
  mavenCentral()
}

dependencies {
  compileOnly("org.projectlombok:lombok")
  annotationProcessor("org.projectlombok:lombok")
  implementation("com.google.guava:guava:33.0.0-jre")

  implementation("org.springframework.boot:spring-boot-starter-web")

  testImplementation(platform("org.junit:junit-bom:5.10.2"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testImplementation("org.mockito:mockito-core:2.1.0")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

configurations {
  compileOnly {
    extendsFrom(configurations.annotationProcessor.get())
  }
}

java {
  sourceCompatibility = JavaVersion.VERSION_21
  targetCompatibility = JavaVersion.VERSION_21
}

tasks.withType<Test> {
  useJUnitPlatform()
}

springBoot {
  mainClass = "org.example.SpringBootTemplateApplication"
}