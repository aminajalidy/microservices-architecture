package com.microservices.microserviceproduits.repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.microservices.microserviceproduits.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
