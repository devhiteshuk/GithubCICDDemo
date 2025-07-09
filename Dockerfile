FROM openjdk:11-jre-slim
LABEL authors="devhi"
EXPOSE 1601
COPY target/github-action-demo.jar /app/github-action-demo.jar
WORKDIR /app

ENTRYPOINT ["java", "-jar", "github-action-demo.jar"]