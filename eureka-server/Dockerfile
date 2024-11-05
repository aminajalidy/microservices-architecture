FROM amazoncorretto:17
VOLUME /tmp
COPY target/*.jar /eureka/eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","eureka-server.jar"]
