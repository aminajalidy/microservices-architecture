FROM amazoncorretto:17
VOLUME /tmp
COPY target/config-server-0.0.1-SNAPSHOT.jar config-server.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/config-server.jar"]
