package modeles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livraison {
    @Id
    @Column(name="no_livraison")
    private int noLivraison;
    @Column(name="date_livraison")
    private String dateLivraison;

    public Livraison() {
    }

    public Livraison(int noLivraison, String dateLivraison) {
        this.noLivraison = noLivraison;
        this.dateLivraison = dateLivraison;
    }

    public int getNoLivraison() {
        return noLivraison;
    }

    public void setNoLivraison(int noLivraison) {
        this.noLivraison = noLivraison;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Override
    public String toString() {
        return "Livraison{" +
                "noLivraison=" + noLivraison +
                ", dateLivraison='" + dateLivraison + '\'' +
                '}';
    }
}
