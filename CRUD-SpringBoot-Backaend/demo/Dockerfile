FROM openjdk:23-jdk-slim

# Crea un grupo y un usuario
RUN groupadd spring && useradd -g spring -m spring

USER spring

WORKDIR /app

# Especifica el nombre exacto del archivo JAR
COPY --chown=spring:spring target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]

