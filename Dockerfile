FROM eclipse-temurin:17
WORKDIR /app
COPY target/gestion-station-ski-1.0.jar /app/GestionStationSkiApplication.jar
ENTRYPOINT ["java", "-jar", "GestionStationSkiApplication.jar"]
EXPOSE 8089