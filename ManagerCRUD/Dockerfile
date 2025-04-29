FROM maven:3.8.1-openjdk-17 as Build
COPY . .
RUN mvn package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY  --from=build /target/ManagerCRUD-0.0.1-SNAPSHOT.jar ManagerCRUD.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","ManagerCRUD.jar"]