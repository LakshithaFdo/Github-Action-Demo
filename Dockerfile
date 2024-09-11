# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot jar file into the container
COPY target/*.jar /app/springbootgithubaction.jar

# Expose the port your application will run on
EXPOSE 8081

# Run the jar file
CMD ["java", "-jar", "springbootgithubaction.jar"]
