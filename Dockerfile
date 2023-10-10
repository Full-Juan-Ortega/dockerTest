# Utiliza la imagen oficial de OpenJDK 17 como base
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo build.gradle y los archivos de configuración de Gradle
COPY build.gradle settings.gradle ./

# Copia la carpeta src con el código fuente
COPY src ./src

# Ejecuta la construcción de la aplicación con Gradle
RUN ./gradlew build

# Expone el puerto 8080 en el contenedor
EXPOSE 8080

# Define el comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "build/libs/dockerTest-0.0.1-SNAPSHOT.jar"]