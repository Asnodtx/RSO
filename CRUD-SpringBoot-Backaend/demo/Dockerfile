# Dockerfile para Spring Boot Backend

# Usa Maven 3.9.9 con JDK 17 de Eclipse Temurin para construir la aplicación
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copiar los archivos necesarios para construir el proyecto
COPY pom.xml .
COPY src ./src

# Construir la aplicación
RUN mvn clean package -DskipTests

# Usar una imagen ligera de JDK 17 de Eclipse Temurin para ejecutar la aplicación
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copiar el archivo JAR generado desde la etapa de construcción
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Exponer el puerto 8080 para la API
EXPOSE 8081

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]

