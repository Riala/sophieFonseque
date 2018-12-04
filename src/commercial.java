public class commercial {
    private int id_commercial;
    private String nom_commercial;
    private String prenom_commercial;

    commercial(int id, String nom, String prenom){
        this.id_commercial = id;
        this.nom_commercial = nom;
        this.prenom_commercial= prenom;
    }

    public int getId_commercial() {
        return id_commercial;
    }

    public void setId_commercial(int id_commercial) {
        this.id_commercial = id_commercial;
    }

    public String getNom_commercial() {
        return nom_commercial;
    }

    public void setNom_commercial(String nom_commercial) {
        this.nom_commercial = nom_commercial;
    }

    public String getPrenom_commercial() {
        return prenom_commercial;
    }

    public void setPrenom_commercial(String prenom_commercial) {
        this.prenom_commercial = prenom_commercial;
    }
}

