This is a CI/CD project integrating such technologies as GitHub, Jenkins, Docker, Spring Boot, Maven, Tomcat and  H2.

After each commit Jenkins pulls a web application, compiles it, runs Unit test, packages to .jar file, builds Docker and Google images, pushes Docker image to Docker Hub and runs a web app in docker container.


