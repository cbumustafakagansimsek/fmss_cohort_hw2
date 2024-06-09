```mvn -v```
- Apache Maven 3.9.0 (9b58d2bad23a66be161c4664ef21ce219c2c8584)
Maven home: C:\Program Files\apache-maven-3.9.0
Java version: 21.0.1, vendor: Eclipse Adoptium, runtime: C:\Program Files\Eclipse Adoptium\jdk-21.0.1.12-hotspot
Default locale: en_US, platform encoding: UTF-8
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

```mvn -h```
- Help for maven commands

```mvn clean```
-  It ensures that the target folder created during the compilation of the project is
   deleted.

- [INFO] Scanning for projects...
[INFO]
[INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
[INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ fmss_cohort_hw2 ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.252 s
[INFO] Finished at: 2024-06-10T00:17:22+03:00
[INFO] ------------------------------------------------------------------------

```mvn validate ```
- It deletes the target file of the project and then scans for the bad
  parts.

- [INFO] Scanning for projects...
  [INFO]
  [INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
  [INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
  [INFO]   from pom.xml
  [INFO] --------------------------------[ jar ]---------------------------------
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time:  0.099 s
  [INFO] Finished at: 2024-06-10T00:18:55+03:00
  [INFO] ------------------------------------------------------------------------

```mvn compile```

- [INFO] Scanning for projects...
  [INFO]
  [INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
  [INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
  [INFO]   from pom.xml
  [INFO] --------------------------------[ jar ]---------------------------------
  [INFO]
  [INFO] --- resources:3.3.0:resources (default-resources) @ fmss_cohort_hw2 ---
  [INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\resources
  [INFO]
  [INFO] --- compiler:3.10.1:compile (default-compile) @ fmss_cohort_hw2 ---
  [INFO] Changes detected - recompiling the module!
  [INFO] Compiling 27 source files to C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\target\classes
  [INFO] /C:/Users/musta/Desktop/FMSS Patika/hw2/fmss_cohort_hw2/src/main/java/org/example/service/impl/BillServiceImpl.java: C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\java\org\example\service\impl\BillServiceImpl.java uses or overrides a deprecated API.
  [INFO] /C:/Users/musta/Desktop/FMSS Patika/hw2/fmss_cohort_hw2/src/main/java/org/example/service/impl/BillServiceImpl.java: Recompile with -Xlint:deprecation for details.
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time:  2.330 s
  [INFO] Finished at: 2024-06-10T00:20:51+03:00
  [INFO] ------------------------------------------------------------------------

```mvn test```

- [INFO] Scanning for projects...
  [INFO]
  [INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
  [INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
  [INFO]   from pom.xml
  [INFO] --------------------------------[ jar ]---------------------------------
  [INFO]
  [INFO] --- resources:3.3.0:resources (default-resources) @ fmss_cohort_hw2 ---
  [INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\resources
  [INFO]
  [INFO] --- compiler:3.10.1:compile (default-compile) @ fmss_cohort_hw2 ---
  [INFO] Changes detected - recompiling the module!
  [INFO] Compiling 27 source files to C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\target\classes
  [INFO] /C:/Users/musta/Desktop/FMSS Patika/hw2/fmss_cohort_hw2/src/main/java/org/example/service/impl/BillServiceImpl.java: C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\java\org\example\service\impl\BillServiceImpl.java uses or overrides a deprecated API.
  [INFO] /C:/Users/musta/Desktop/FMSS Patika/hw2/fmss_cohort_hw2/src/main/java/org/example/service/impl/BillServiceImpl.java: Recompile with -Xlint:deprecation for details.
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time:  2.330 s
  [INFO] Finished at: 2024-06-10T00:20:51+03:00
  [INFO] ------------------------------------------------------------------------
  musta@DESKTOP-L68151K MINGW64 ~/Desktop/FMSS Patika/hw2/fmss_cohort_hw2 (main)

```mvn test```

- Builds the project and runs the test classes

- [INFO] Scanning for projects...
[INFO]
[INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
[INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.3.0:resources (default-resources) @ fmss_cohort_hw2 ---
[INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\resources
[INFO]
[INFO] --- compiler:3.10.1:compile (default-compile) @ fmss_cohort_hw2 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.3.0:testResources (default-testResources) @ fmss_cohort_hw2 ---
[INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\test\resources
[INFO]
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ fmss_cohort_hw2 ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.0.0-M8:test (default-test) @ fmss_cohort_hw2 ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.0.0-M8/maven-surefire-common-3.0.0-M8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.0.0-M8/maven-surefire-common-3.0.0-M8.pom (6.5 kB at 8.6 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.0.0-M8/surefire-api-3.0.0-M8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.0.0-M8/surefire-api-3.0.0-M8.pom (3.4 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.0.0-M8/surefire-logger-api-3.0.0-M8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.0.0-M8/surefire-logger-api-3.0.0-M8.pom (3.6 kB at 47 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.0.0-M8/surefire-shared-utils-3.0.0-M8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.0.0-M8/surefire-shared-utils-3.0.0-M8.pom (4.1 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.0.0-M8/surefire-extensions-api-3.0.0-M8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.0.0-M8/surefire-extensions-api-3.0.0-M8.pom (3.6 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.0.0-M8/surefire-booter-3.0.0-M8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.0.0-M8/surefire-booter-3.0.0-M8.pom (4.3 kB at 51 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.0.0-M8/surefire-extensions-spi-3.0.0-M8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.0.0-M8/surefire-extensions-spi-3.0.0-M8.pom (1.8 kB at 22 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.0.0-M8/maven-surefire-common-3.0.0-M8.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.0.0-M8/surefire-api-3.0.0-M8.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.0.0-M8/surefire-logger-api-3.0.0-M8.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.0.0-M8/surefire-extensions-api-3.0.0-M8.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.0.0-M8/surefire-booter-3.0.0-M8.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.0.0-M8/maven-surefire-common-3.0.0-M8.jar (307 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.0.0-M8/surefire-extensions-spi-3.0.0-M8.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.0.0-M8/surefire-logger-api-3.0.0-M8.jar (14 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.0.0-M8/surefire-shared-utils-3.0.0-M8.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.0.0-M8/surefire-extensions-api-3.0.0-M8.jar (26 kB at 73 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.0.0-M8/surefire-extensions-spi-3.0.0-M8.jar (8.2 kB at 22 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.0.0-M8/surefire-booter-3.0.0-M8.jar (118 kB at 274 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.0.0-M8/surefire-api-3.0.0-M8.jar (171 kB at 370 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.0.0-M8/surefire-shared-utils-3.0.0-M8.jar (2.1 MB at 2.1 MB/s)
[INFO] No tests to run.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.463 s
[INFO] Finished at: 2024-06-10T00:22:06+03:00
[INFO] ------------------------------------------------------------------------

```mvn package```

- It tests the project and if there are no errors, it packs the compiled
  code in the project. (JAR, WAR or EAR)

- [INFO] Scanning for projects...
  [INFO]
  [INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
  [INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
  [INFO]   from pom.xml
  [INFO] --------------------------------[ jar ]---------------------------------
  [INFO]
  [INFO] --- resources:3.3.0:resources (default-resources) @ fmss_cohort_hw2 ---
  [INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\resources
  [INFO]
  [INFO] --- compiler:3.10.1:compile (default-compile) @ fmss_cohort_hw2 ---
  [INFO] Nothing to compile - all classes are up to date
  [INFO]
  [INFO] --- resources:3.3.0:testResources (default-testResources) @ fmss_cohort_hw2 ---
  [INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\test\resources
  [INFO]
  [INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ fmss_cohort_hw2 ---
  [INFO] No sources to compile
  [INFO]
  [INFO] --- surefire:3.0.0-M8:test (default-test) @ fmss_cohort_hw2 ---
  [INFO] No tests to run.
  [INFO]
  [INFO] --- jar:3.3.0:jar (default-jar) @ fmss_cohort_hw2 ---
  [INFO] Building jar: C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\target\fmss_cohort_hw2-1.0-SNAPSHOT.jar
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time:  1.179 s
  [INFO] Finished at: 2024-06-10T00:25:12+03:00
  [INFO] ------------------------------------------------------------------------

```mvn verify```

- It packages the project and then checks the validity of those packages.

- [INFO] Scanning for projects...
[INFO]
[INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
[INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.3.0:resources (default-resources) @ fmss_cohort_hw2 ---
[INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\resources
[INFO]
[INFO] --- compiler:3.10.1:compile (default-compile) @ fmss_cohort_hw2 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.3.0:testResources (default-testResources) @ fmss_cohort_hw2 ---
[INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\test\resources
[INFO]
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ fmss_cohort_hw2 ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.0.0-M8:test (default-test) @ fmss_cohort_hw2 ---
[INFO] No tests to run.
[INFO]
[INFO] --- jar:3.3.0:jar (default-jar) @ fmss_cohort_hw2 ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.223 s
[INFO] Finished at: 2024-06-10T00:25:37+03:00
[INFO] ------------------------------------------------------------------------

```mvn install```

- After verifying the project, it uploads it to the local repository.

- [INFO] Scanning for projects...
  [INFO]
  [INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
  [INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
  [INFO]   from pom.xml
  [INFO] --------------------------------[ jar ]---------------------------------
  [INFO]
  [INFO] --- resources:3.3.0:resources (default-resources) @ fmss_cohort_hw2 ---
  [INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\resources
  [INFO]
  [INFO] --- compiler:3.10.1:compile (default-compile) @ fmss_cohort_hw2 ---
  [INFO] Nothing to compile - all classes are up to date
  [INFO]
  [INFO] --- resources:3.3.0:testResources (default-testResources) @ fmss_cohort_hw2 ---
  [INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\test\resources
  [INFO]
  [INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ fmss_cohort_hw2 ---
  [INFO] No sources to compile
  [INFO]
  [INFO] --- surefire:3.0.0-M8:test (default-test) @ fmss_cohort_hw2 ---
  [INFO] No tests to run.
  [INFO]
  [INFO] --- jar:3.3.0:jar (default-jar) @ fmss_cohort_hw2 ---
  [INFO]
  [INFO] --- install:3.1.0:install (default-install) @ fmss_cohort_hw2 ---
  [INFO] Installing C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\pom.xml to C:\Users\musta\.m2\repository\org\example\fmss_cohort_hw2\1.0-SNAPSHOT\fmss_cohort_hw2-1.0-SNAPSHOT.pom
  [INFO] Installing C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\target\fmss_cohort_hw2-1.0-SNAPSHOT.jar to C:\Users\musta\.m2\repository\org\example\fmss_cohort_hw2\1.0-SNAPSHOT\fmss_cohort_hw2-1.0-SNAPSHOT.jar
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time:  1.204 s
  [INFO] Finished at: 2024-06-10T00:27:19+03:00
  [INFO] ------------------------------------------------------------------------

```mvn deploy```

- [INFO] Scanning for projects...
[INFO]
[INFO] --------------------< org.example:fmss_cohort_hw2 >---------------------
[INFO] Building fmss_cohort_hw2 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.3.0:resources (default-resources) @ fmss_cohort_hw2 ---
[INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\main\resources
[INFO]
[INFO] --- compiler:3.10.1:compile (default-compile) @ fmss_cohort_hw2 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.3.0:testResources (default-testResources) @ fmss_cohort_hw2 ---
[INFO] skip non existing resourceDirectory C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\src\test\resources
[INFO]
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ fmss_cohort_hw2 ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.0.0-M8:test (default-test) @ fmss_cohort_hw2 ---
[INFO] No tests to run.
[INFO]
[INFO] --- jar:3.3.0:jar (default-jar) @ fmss_cohort_hw2 ---
[INFO]
[INFO] --- install:3.1.0:install (default-install) @ fmss_cohort_hw2 ---
[INFO] Installing C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\pom.xml to C:\Users\musta\.m2\repository\org\example\fmss_cohort_hw2\1.0-SNAPSHOT\fmss_cohort_hw2-1.0-SNAPSHOT.pom
[INFO] Installing C:\Users\musta\Desktop\FMSS Patika\hw2\fmss_cohort_hw2\target\fmss_cohort_hw2-1.0-SNAPSHOT.jar to C:\Users\musta\.m2\repository\org\example\fmss_cohort_hw2\1.0-SNAPSHOT\fmss_cohort_hw2-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- deploy:3.0.0:deploy (default-deploy) @ fmss_cohort_hw2 ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.225 s
[INFO] Finished at: 2024-06-10T00:27:59+03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-deploy-plugin:3.0.0:deploy (default-deploy) on project fmss_cohort_hw2: Deployment failed: repository element was not specified in the POM inside distributionManagement element or in -DaltDeploymentRepository=id::url parameter -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException

```mvn site```

- Produces documentation of the project.