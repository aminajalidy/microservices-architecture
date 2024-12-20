package com.microservices.microservicecommandes.controller;

import com.microservices.microservicecommandes.model.Commande;
import com.microservices.microservicecommandes.model.Message;
import com.microservices.microservicecommandes.repository.CommandeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CommandeController {

    @Autowired
    CommandeRepository commandeRepository;

    @CrossOrigin
    @PostMapping("/api/commandes/ajouter")
    @ResponseBody
    public ResponseEntity<?> ajouterCommande(@RequestBody Commande commande) {
        if (commande == null) {
            Message message = new Message("La commande ne peut pas être nulle");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }

        Commande nouvelleCommande = commandeRepository.save(commande);

        return new ResponseEntity<>(nouvelleCommande, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/api/commandes")
    @ResponseBody
    public ResponseEntity<?> commandes() {
        List<Commande> listeCommandes = commandeRepository.findAll();
        if (listeCommandes.isEmpty()) {
            Message message = new Message("Aucune commande n'a été trouvée");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(listeCommandes, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/api/commandes/{id}")
    @ResponseBody
    public ResponseEntity<?> recupererUneCommande(@PathVariable("id") int id) {
        Optional<Commande> commande = commandeRepository.findById((long) id);
        if (commande.isPresent()) {
            return new ResponseEntity<>(commande.get(), HttpStatus.OK);
        } else {
            Message message = new Message("Cette commande avec l'ID " + id + " n'existe pas");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        }
    }
}