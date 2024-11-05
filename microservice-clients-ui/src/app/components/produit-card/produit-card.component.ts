import { Component, Input } from '@angular/core';
import { MICROSERVICE_PRODUITS_API_URL } from 'src/app/constants';

@Component({
  selector: 'app-produit-card',
  templateUrl: './produit-card.component.html',
  styleUrls: ['./produit-card.component.css'],
  standalone: true
})
export class ProduitCardComponent {
  urlImage = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXI5tg7VncOcsfNZPZ61NFVTkXRXoM7w7KRg&s';

  @Input() titre: string = 'Smartphone XYZ';
  @Input() image: string = this.urlImage;
  @Input() description: string = 'Le Smartphone XYZ dispose d\'un écran AMOLED 6,5 pouces, d\'une caméra 108MP, et d\'une batterie de 5000mAh pour une expérience incroyable. Idéal pour les amateurs de technologie.';
  @Input() prix: string = '799.99'; // Exemple de prix pour un smartphone
  @Input() id: string = '12345'; // Exemple d'identifiant unique

  handleDeleteProduit() {
    fetch(MICROSERVICE_PRODUITS_API_URL+`/produits/${this.id}`, {
      method: 'DELETE',
      headers: {
        'Content-Type': 'application/json'
      },
    })
      .then(response => {
        if (!response.ok) {
          throw new Error('Erreur lors de la requête.');
        }
        return response.json();
      })
      .then(data => {
        alert('Produit supprimé avec succès !');
        console.log('Réponse du serveur:', data);
        window.location.reload();
      })
      .catch(error => {
        alert('Erreur lors de la suppression du produit !');
        console.error('Erreur lors de la suppression du produit:', error);
      });
  }

}
