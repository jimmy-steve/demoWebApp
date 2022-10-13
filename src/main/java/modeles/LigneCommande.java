package modeles;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LigneCommande {
    @Id
    @Column(name="no_commande")
    private int noCommande;
    @Column(name="no_article")
    private int noArticle;
    private int quantite;

    public LigneCommande() {
    }

    public LigneCommande(int noCommande, int noArticle, int quantite) {
        this.noCommande = noCommande;
        this.noArticle = noArticle;
        this.quantite = quantite;
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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "noCommande=" + noCommande +
                ", noArticle=" + noArticle +
                ", quantite=" + quantite +
                '}';
    }
}
