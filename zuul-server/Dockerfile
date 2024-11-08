FROM amazoncorretto:17
VOLUME /tmp
COPY target/zuul-server-0.0.1-SNAPSHOT.jar zuul-server.jar
EXPOSE 9004
ENTRYPOINT ["java","-jar","/zuul-server.jar"]
