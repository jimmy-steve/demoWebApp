package modeles.module;

public class User {

    private String nom;
    private String motDePasse;

    public User(String nom, String motDePasse) {
        this.nom = nom;
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "User{" + "nom=" + nom + ", motDePasse=" + motDePasse + '}';
    }


}
