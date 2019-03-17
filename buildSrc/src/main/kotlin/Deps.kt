object Versions {
  val kotlinVersion = "1.3.21"
  val jacksonVersion = "2.9.8"
  val kotlinCoroutinesVersion = "1.1.1"
  val okhttpVersion = "3.14"
  val moshiVersion = "1.7.0"
  val oksocialOutputVersion = "4.26.0"
  val jettyVersion = "9.4.15.v20190215"
  val rsocketVersion = "0.12.1-RC3-SNAPSHOT"
}

object Deps {
  val activation = "javax.activation:activation:1.1.1"
  val airline2 = "com.github.rvesse:airline:2.6.0"
  val byteunits = "com.jakewharton.byteunits:byteunits:0.9.1"
  val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutinesVersion}"
  val coroutinesJdk8 = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.kotlinCoroutinesVersion}"
  val coroutinesReactive = "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:${Versions.kotlinCoroutinesVersion}"
  val coroutinesReactor = "org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${Versions.kotlinCoroutinesVersion}"
  val guava = "com.google.guava:guava:27.1-jre"
  val jacksonAfterburner = "com.fasterxml.jackson.module:jackson-module-afterburner:${Versions.jacksonVersion}"
  val jacksonCbor = "com.fasterxml.jackson.dataformat:jackson-dataformat-cbor:${Versions.jacksonVersion}"
  val jacksonCore = "com.fasterxml.jackson.core:jackson-core:${Versions.jacksonVersion}"
  val jacksonDatabind = "com.fasterxml.jackson.core:jackson-databind:${Versions.jacksonVersion}"
  val jacksonJdk8 = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:${Versions.jacksonVersion}"
  val jacksonJsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${Versions.jacksonVersion}"
  val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jacksonVersion}"
  val jacksonParams = "com.fasterxml.jackson.module:jackson-module-parameter-names:${Versions.jacksonVersion}"
  val jacksonYaml = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:${Versions.jacksonVersion}"
  val jettyJttp2 = "org.eclipse.jetty.http2:http2-http-client-transport:${Versions.jettyVersion}"
  val jfreesvg = "org.jfree:jfreesvg:3.3"
  val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:5.4.0"
  val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:5.4.0"
  val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlinVersion}"
  val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
  val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlinVersion}"
  val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlinVersion}"
  val okio = "com.squareup.okio:okio:2.2.2"
  val oksocialOutput = "com.baulsupp:oksocial-output:${Versions.oksocialOutputVersion}"
  val rsocketCore = "io.rsocket:rsocket-core:${Versions.rsocketVersion}"
  val rsocketLocal = "io.rsocket:rsocket-transport-local:${Versions.rsocketVersion}"
  val rsocketNetty = "io.rsocket:rsocket-transport-netty:${Versions.rsocketVersion}"
  val slf4jApi = "org.slf4j:slf4j-api:1.8.0-beta4"
  val slf4jJdk14 = "org.slf4j:slf4j-jdk14:1.8.0-beta4"
  val svgSalamander = "com.kitfox.svg:svg-salamander:1.0"
  val ztExec = "org.zeroturnaround:zt-exec:1.10"
}
