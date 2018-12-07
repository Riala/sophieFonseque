public class stock_plat {
    private int id_stockplat, quantite;

    public stock_plat(int id_stockplat, int quantite) {
        this.id_stockplat = id_stockplat;
        this.quantite = quantite;
    }

    public int getId_stockplat() {
        return id_stockplat;
    }

    public void setId_stockplat(int id_stockplat) {
        this.id_stockplat = id_stockplat;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
