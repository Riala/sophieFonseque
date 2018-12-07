public class composer {
    int id_recette;
    int id_ingredient;
    double quantite;
    String unite;

    public composer(int id_recette, int id_ingredient, double quantite, String unite) {
        this.id_recette = id_recette;
        this.id_ingredient = id_ingredient;
        this.quantite = quantite;
        this.unite = unite;
    }

    public int getId_recette() {
        return id_recette;
    }

    public void setId_recette(int id_recette) {
        this.id_recette = id_recette;
    }

    public int getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(int id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }
}
