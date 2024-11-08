FROM amazoncorretto:17
VOLUME /tmp
COPY target/microservice-commandes-0.0.1-SNAPSHOT.jar microservice-commandes.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/microservice-commandes.jar"]
