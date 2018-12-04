public class fournisseur {
    private int id_fournisseur;
    private String nom_fournisseur;

    fournisseur(int id, String nom_fournisseur){
        this.id_fournisseur = id;
        this.nom_fournisseur = nom_fournisseur;
    }

    public int getId_fournisseur() {
        return id_fournisseur;
    }

    public void setId_fournisseur(int id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }

    public String getNom_fournisseur() {
        return nom_fournisseur;
    }

    public void setNom_fournisseur(String nom_fournisseur) {
        this.nom_fournisseur = nom_fournisseur;
    }
}
