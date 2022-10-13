package modeles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailLivraison {
    @Id
    @Column(name="no_livraison")
    private int noLivraison;
    @Column(name="no_commande")
    private int noCommande;
    @Column(name="no_article")
    private int noArticle;
    @Column(name="quantite_livrer")
    private int quantiteLivrer;

    public DetailLivraison() {
    }

    public DetailLivraison(int noLivraison, int noCommande, int noArticle, int quantiteLivrer) {
        this.noLivraison = noLivraison;
        this.noCommande = noCommande;
        this.noArticle = noArticle;
        this.quantiteLivrer = quantiteLivrer;
    }

    public int getNoLivraison() {
        return noLivraison;
    }

    public void setNoLivraison(int noLivraison) {
        this.noLivraison = noLivraison;
    }

    public int getNoCommande() {
        return noCommande;
    }

    public void setNoCommande(int noCommande) {
        this.noCommande = noCommande;
    }

    public int getNoArticle() {
        return noArticle;
    }

    public void setNoArticle(int noArticle) {
        this.noArticle = noArticle;
    }

    public int getQuantiteLivrer() {
        return quantiteLivrer;
    }

    public void setQuantiteLivrer(int quantiteLivrer) {
        this.quantiteLivrer = quantiteLivrer;
    }

    @Override
    public String toString() {
        return "DetailLivraison{" +
                "noLivraison=" + noLivraison +
                ", noCommande=" + noCommande +
                ", noArticle=" + noArticle +
                ", quantiteLivrer=" + quantiteLivrer +
                '}';
    }
}
