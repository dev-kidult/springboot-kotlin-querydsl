Springboot + kotlin + querydsl boilerplate
===
##### with simple example (h2database)
* step1 project init
    * init spring project in <https://start.spring.io/>
    * select gradle project , kotlin and other thing
    * add web, jpa, h2database(optional, if you other database want it, select other database) dependencies
* step2 querydsl setting
    * open `build.gradle.kts` file
    * add `kotlin("kapt") version "1.3.61"` in plugins block
    * add dependencies and add source generator code 
```text
  kapt("org.springframework.boot:spring-boot-configuration-processor")
  kapt("com.querydsl:querydsl-apt:4.2.2:jpa")
  implementation("com.querydsl:querydsl-jpa:4.2.2")
``` 
```text
sourceSets["main"].withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
    kotlin.srcDir("$buildDir/generated/source/kapt/main")
}
```
* step3 Let`s go developed