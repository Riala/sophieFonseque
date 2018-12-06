public class ingredient {
    private int id_ingredient;
    private String nom;
    private double prix_achat;
    private int id_fournisseur;

    public ingredient(int id_ingredient, String nom, double prix_achat, int id_fournisseur) {
        this.id_ingredient = id_ingredient;
        this.nom = nom;
        this.prix_achat = prix_achat;
        this.id_fournisseur = id_fournisseur;
    }

    public void setId_ingredient(int id_ingredient) {
        this.id_ingredient = id_ingredient;
    }
    public int getId_ingredient() {
        return id_ingredient;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setPrix_achat(double prix_achat) {
        this.prix_achat = prix_achat;
    }
    public double getPrix_achat() {
        return prix_achat;
    }
    public void setId_fournisseur(int id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }
    public int getId_fournisseur() {
        return id_fournisseur;
    }

}
