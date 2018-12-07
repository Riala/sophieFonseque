public class stock_ingredient {
    int id_ingredient;
    double quantite;
    String unite;

    public stock_ingredient(int id_ingredient, double quantite, String unite) {
        this.id_ingredient = id_ingredient;
        this.quantite = quantite;
        this.unite = unite;
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
