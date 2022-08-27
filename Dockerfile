FROM openjdk:16
LABEL maintainer="pkg.net"
ADD target/myapp-docker.jar myapp-docker.jar

ENTRYPOINT ["java", "-jar","/myapp-docker.jar"]