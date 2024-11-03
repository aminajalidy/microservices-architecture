FROM openjdk:17-oracle
VOLUME /tmp
COPY target/*.jar /eureka/eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","eureka-server.jar"]
