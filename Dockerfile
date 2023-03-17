FROM openjdk:17
ARG PORT=8080
ENV PORT=$PORT
EXPOSE $PORT
WORKDIR /app
COPY target/car-service-0.0.1-SNAPSHOT.jar ./cars.jar
ENTRYPOINT java -jar ./cars.jar