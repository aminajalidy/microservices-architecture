# Utilisez l'image de base Amazon Corretto 17
FROM amazoncorretto:17
# Configure un volume temporaire
VOLUME /tmp
# Copie le fichier .jar généré dans l'image
COPY target/microservice-produits.jar app.jar
# Exposez le port sur lequel le service écoute
EXPOSE 8080
# Commande pour démarrer l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]
