package modeles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client {
    @Id
    @Column(name = "no_client")
    private int noClient;
    @Column(name = "nom_client")
    private String nomClient;
    @Column(name = "no_telephone")
    private String noTelephone;


    public Client() {
    }

    public Client(int noClient, String nomClient, String noTelephone) {
        this.noClient = noClient;
        this.nomClient = nomClient;
        this.noTelephone = noTelephone;
    }

    public int getNoClient() {
        return noClient;
    }

    public void setNoClient(int noClient) {
        this.noClient = noClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getNoTelephone() {
        return noTelephone;
    }

    public void setNoTelephone(String noTelephone) {
        this.noTelephone = noTelephone;
    }

    @Override
    public String toString() {
        return "Client{" + "noClient=" + noClient + ", nomClient=" + nomClient + ", noTelephone=" + noTelephone + '}';
    }

}
