FROM eclipse-temurin:17
LABEL authors="devhi"
EXPOSE 1601
WORKDIR /app
COPY target/github-action-demo.jar /app/github-action-demo.jar

ENTRYPOINT ["java", "-jar", "github-action-demo.jar"]