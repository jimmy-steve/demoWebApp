package modeles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article {
    @Id
    @Column(name="no_article")
    private int noArticle;
    private String description;
    @Column(name="prix_unitaire")
    private double prixUnitaire;
    @Column(name="quantite_en_stock")
    private int quantite;

    public Article() {
    }

    public Article(int noArticle, String description, double prixUnitaire, int quantite) {
        this.noArticle = noArticle;
        this.description = description;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    public int getNoArticle() {
        return noArticle;
    }

    public void setNoArticle(int noArticle) {
        this.noArticle = noArticle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Article{" +
                "noArticle=" + noArticle +
                ", description='" + description + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", quantite=" + quantite +
                '}';
    }
}
