FROM openjdk:11
EXPOSE 8080
ADD target/droppyn.jar droppyn.jar
ENTRYPOINT ["java", "-jar","/droppyn.jar"]