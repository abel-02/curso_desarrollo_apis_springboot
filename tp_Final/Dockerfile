FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/tp_final_ventas.jar
COPY ${JAR_FILE} app_tp_final_ventas.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_tp_final_ventas.jar"]