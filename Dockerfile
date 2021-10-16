FROM openjdk:11
EXPOSE 8080
ADD target/droppyn-backend-0.0.1-SNAPSHOT.jar droppyn.jar
ENTRYPOINT ["java", "-jar","/droppyn.jar"]