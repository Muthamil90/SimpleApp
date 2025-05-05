FROM openjdk:17
ADD target/test-0.0.1-SNAPSHOT.jar /
CMD java -jar test-0.0.1-SNAPSHOT.jar
EXPOSE 8080