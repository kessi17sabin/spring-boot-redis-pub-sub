FROM openjdk:17-alpine
MAINTAINER sabin.khatri
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} consumer-service.jar
ENTRYPOINT ["java", "-jar", "/consumer-service.jar"]
EXPOSE 9091