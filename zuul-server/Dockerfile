FROM amazoncorretto:17
VOLUME /tmp
COPY target/*.jar zuul-server.jar
EXPOSE 9004
ENTRYPOINT ["java","-jar","/zuul-server.jar"]