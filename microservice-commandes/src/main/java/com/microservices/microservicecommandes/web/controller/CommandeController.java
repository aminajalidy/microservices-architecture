package com.microservices.microservicecommandes.web.controller;


import com.microservices.microservicecommandes.dao.CommandesDao;
import com.microservices.microservicecommandes.model.Commande;
import com.microservices.microservicecommandes.web.exceptions.CommandeNotFoundException;
import com.microservices.microservicecommandes.web.exceptions.ImpossibleAjouterCommandeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CommandeController {

    @Autowired
    CommandesDao commandesDao;

    @PostMapping (value = "/commandes")
    public ResponseEntity<Commande> ajouterCommande(@RequestBody Commande commande){

        Commande nouvelleCommande = commandesDao.save(commande);

        if(nouvelleCommande == null) throw new ImpossibleAjouterCommandeException("Impossible d'ajouter cette commande");

        return new ResponseEntity<Commande>(commande, HttpStatus.CREATED);
    }

    @GetMapping(value = "/commandes/{id}")
    public Optional<Commande> recupererUneCommande(@PathVariable int id){

        Optional<Commande> commande = commandesDao.findById(id);

        if(!commande.isPresent()) throw new CommandeNotFoundException("Cette commande n'existe pas");

        return commande;
    }

    /*
     * Permet de mettre à jour une commande existante.
     * save() mettra à jours uniquement les champs renseignés dans l'objet commande reçu. Ainsi dans ce cas, comme le champs date dans "commande" n'est
     * pas renseigné, la date précédemment enregistrée restera en place
     **/
    @PutMapping(value = "/commandes")
    public void updateCommande(@RequestBody Commande commande) {

        commandesDao.save(commande);
    }
}