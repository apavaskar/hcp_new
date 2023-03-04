import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.6-SNAPSHOT"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "com.squer"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-jooq")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.redisson:redisson-spring-boot-starter:3.18.0")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jooq:jooq:3.17.5")
	implementation("org.liquibase:liquibase-core")
	implementation("org.springdoc:springdoc-openapi-ui:1.6.12")
	implementation("io.jsonwebtoken:jjwt:0.9.1")
	implementation("com.google.code.gson:gson:2.10")
	implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
	implementation("org.apache.commons", "commons-email", "1.5")
	implementation("org.apache.velocity", "velocity", "1.7")
	compileOnly("org.projectlombok:lombok")
	runtimeOnly("org.postgresql:postgresql:42.5.0")
	runtimeOnly("org.jooq:jooq-codegen:3.17.5")
	runtimeOnly("org.jooq:jooq-meta-extensions-liquibase:3.17.5")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	implementation("org.jasypt:jasypt:1.9.2")
	implementation("commons-codec:commons-codec:1.15")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.reflections:reflections:0.10.2")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}


//task<JavaExec>("mapper")  {
//	classpath = sourceSets.main.get().runtimeClasspath + sourceSets.main.get().compileClasspath
//	main = "com.squer.prorpel.utils.codeGenerator.CodeGenerator"
//	args = listOf("com.squer.prorpel.common.domain.Document","/Users/megha/new-propel/roche-backend/src")
//}
//
//task<JavaExec>("dbLog")  {
//	classpath = sourceSets.main.get().runtimeClasspath + sourceSets.main.get().compileClasspath
//	main = "com.squer.prorpel.utils.codeGenerator.DbLogGenerator"
//	args = listOf("com.squer.prorpel.common.domain.Document")
//}
