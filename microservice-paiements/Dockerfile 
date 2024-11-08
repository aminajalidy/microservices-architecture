FROM amazoncorretto:17
VOLUME /tmp
COPY target/microservice-paiements-0.0.1-SNAPSHOT.jar microservice-paiements.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/microservice-paiements.jar"]
