FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/tp_Final-0.0.1.jar
COPY ${JAR_FILE} app_tp_Final.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_tp_Final.jar"]