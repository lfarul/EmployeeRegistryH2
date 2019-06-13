FROM java:8

# Add Maintainer Info
LABEL maintainer="lfarulewski@yahoo.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# The application's jar file
ARG JAR_FILE=target/thymeleaf-demo-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} thymeleaf-demo.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/thymeleaf-demo.jar"]
