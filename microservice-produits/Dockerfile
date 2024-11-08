FROM amazoncorretto:17
VOLUME /tmp
COPY target/microservice-produits-0.0.1-SNAPSHOT.jar microservice-produits.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/microservice-produits.jar"]
