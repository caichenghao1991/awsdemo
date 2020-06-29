FROM openjdk:8
EXPOSE 8761
ADD springbootdemo-0.01-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]