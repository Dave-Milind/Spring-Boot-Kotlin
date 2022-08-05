# Spring-Boot-Kotlin

Useful commands in spring boot:

1) To run project, either use play button or this command:

.\mvnw spring-boot:run

.\mvnw clean spring-boot:run (this one will regenerate/recompile all files in target folder)

2) to run jar file from terminal/cmd:

java -jar yourJarFileName.jar

to run jar file on specific port number:

java -Dserver.port=8080 -jar yourJarFileName.jar
