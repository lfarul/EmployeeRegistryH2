FROM openjdk:11-jre-slim
COPY ./target/thymeleaf-demo-0.0.1-SNAPSHOT.jar /usr/src/thymeleafdemo/
WORKDIR /usr/src/thymeleafdemo
EXPOSE 9000
ENTRYPOINT ["java","-jar","thymeleaf-demo-0.0.1-SNAPSHOT.jar"]

#alpine:latest
