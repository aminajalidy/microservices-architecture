package com.microservices.microservicecommandes.repository;

import com.microservices.microservicecommandes.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}