public class facturer {
    private int id_facture;
    private int id_commercial;
    private int id_client ;
    private int id_plat ;
    private double montant;
    private double cout_livraison;

    public facturer(int id_facture, double montant, double cout_livraison, int id_commercial, int id_client, int id_plat) {
        this.id_facture = id_facture;
        this.id_commercial = id_commercial;
        this.id_client = id_client;
        this.id_plat = id_plat;
        this.montant = montant;
        this.cout_livraison = cout_livraison;
    }

    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

    public int getId_commercial() {
        return id_commercial;
    }

    public void setId_commercial(int id_commercial) {
        this.id_commercial = id_commercial;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_plat() {
        return id_plat;
    }

    public void setId_plat(int id_plat) {
        this.id_plat = id_plat;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getCout_livraison() {
        return cout_livraison;
    }

    public void setCout_livraison(double cout_livraison) {
        this.cout_livraison = cout_livraison;
    }
}
