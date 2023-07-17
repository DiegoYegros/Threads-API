# Use a base image that includes both OpenJDK and Maven
FROM maven:3.8.2-openjdk-17 as build

# Set the working directory in the Docker image
WORKDIR /app

# Copy the pom.xml file into the Docker image
COPY pom.xml .

# Copy the source code into the Docker image
COPY src ./src

# Run mvn install to build the jar file
RUN mvn install

# Use a base image that includes just OpenJDK for the runtime image
FROM openjdk:17-jdk-alpine as runtime

# Set the working directory in the Docker image
WORKDIR /app

# Copy the jar file from the build image to the runtime image
COPY --from=build /app/target/*.jar app.jar

# Set the startup command to execute the jar
CMD ["java", "-jar", "app.jar"]
