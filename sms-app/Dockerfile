FROM maven:3.8.6-openjdk-8-slim as build
COPY . .
RUN mvn -f pom.xml clean package

FROM openjdk:8-jdk-alpine
COPY --from=build target/sms-app-1.0.0.jar sms-app-1.0.0.jar
ENTRYPOINT ["java","-jar","/sms-app-1.0.0.jar"]