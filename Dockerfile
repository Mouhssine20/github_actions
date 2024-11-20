FROM openjdk:17-oracle
EXPOSE 8080
COPY target/github_actions.jar github_actions.jar
ENTRYPOINT ["java","-jar", "github_actions.jar"]