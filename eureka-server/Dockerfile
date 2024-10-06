FROM openjdk:17-oracle
VOLUME /tmp
COPY target/*.jar eureka-server.jar
EXPOSE 8762
ENTRYPOINT ["java","-jar","/eureka-server.jar"]