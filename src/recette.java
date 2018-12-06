public class recette {
    int id_recette;
    String nom;

    public recette(int id_recette, String nom) {
        this.id_recette = id_recette;
        this.nom = nom;
    }

    public int getId_recette() {
        return id_recette;
    }

    public void setId_recette(int id_recette) {
        this.id_recette = id_recette;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
