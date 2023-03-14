FROM openjdk:17-alpine
MAINTAINER sabin.khatri
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} producer-service.jar
ENTRYPOINT ["java", "-jar", "/producer-service.jar"]
EXPOSE 9092