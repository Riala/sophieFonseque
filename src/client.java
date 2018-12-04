import java.util.Date;

public class client {
    private int id_client;
    private String nom_client;
    private Date date_premier_achat;

    client(int id, String nom, Date achat){
        this.id_client = id;
        this.nom_client = nom;
        this.date_premier_achat = achat;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public Date getDate_premier_achat() {
        return date_premier_achat;
    }

    public void setDate_premier_achat(Date date_premier_achat) {
        this.date_premier_achat = date_premier_achat;
    }
}
