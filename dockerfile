# Use an official Eclipse Temurin runtime as a parent image
FROM eclipse-temurin:17-jdk

# Install necessary packages, including Xvfb
RUN apt-get update && \
    apt-get install -y xvfb x11-utils && \
    rm -rf /var/lib/apt/lists/*

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variable
ENV DISPLAY=:99

# Run Xvfb and then your application
CMD ["sh", "-c", "Xvfb :99 -screen 0 1024x768x16 & java -jar target/national-tsa-0.0.1.jar"]
