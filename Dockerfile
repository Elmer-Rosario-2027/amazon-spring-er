FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY target/amazon-1.0.jar amazon-1.0.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","amazon-1.0.jar"]
