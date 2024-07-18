FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/Notification-Service-0.0.1-SNAPSHOT.jar notification-service.jar
ENTRYPOINT ["java","-jar","/notification-service.jar"]