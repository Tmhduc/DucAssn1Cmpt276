FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/ducassn1-0.0.1-SNAPSHOT.jar ducassn1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ducassn1.jar"]