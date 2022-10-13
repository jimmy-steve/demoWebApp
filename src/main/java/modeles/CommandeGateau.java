package modeles;

public class CommandeGateau {
    private String nom;
    private String prenom;
    private String adresse;
    private String theme;
    private String glacage;
    private double prix;

    public CommandeGateau() {
    }

    public CommandeGateau(String nom, String prenom, String adresse, String theme, String glacage, double prix) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.theme = theme;
        this.glacage = glacage;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getGlacage() {
        return glacage;
    }

    public void setGlacage(String glacage) {
        this.glacage = glacage;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "CommandeGateau{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", theme='" + theme + '\'' +
                ", glacage='" + glacage + '\'' +
                ", prix=" + prix +
                '}';
    }
}
