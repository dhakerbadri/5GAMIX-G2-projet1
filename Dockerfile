FROM eclipse-temurin:17
WORKDIR /app
COPY target/gestion-station-ski-1.0.jar /app/gs.jar
ENTRYPOINT ["java", "-jar", "gs.jar"]
EXPOSE 8089