FROM openjdk:17-oracle
VOLUME /tmp
COPY target/*.jar config-server.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/config-server.jar"]