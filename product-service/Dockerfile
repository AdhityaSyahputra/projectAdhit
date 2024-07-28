FROM openjdk:17-slim
RUN apt-get update && apt-get install -y redis-tools
VOLUME /tmp
COPY target/Product-Service-0.0.1-SNAPSHOT.jar product-service.jar
COPY ./src/main/resources/application-dev.properties /app/src/main/resources/application-dev.properties
ENTRYPOINT ["java","-jar","/product-service.jar"]