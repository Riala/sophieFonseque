import java.sql.Date;
public class plat {
    private int id_plat;
    private int id_recette;
    private int id_stockplat;
    private int portion;
    private double cout_revient;
    private double prix_vente;
    private Date date_de_limite_conso;
    private Date date_de_production;
    private int lot_de_fabrication;
    private String nom;

    public plat(int id_plat, int id_recette, int id_stockplat, int portion, double cout_revient, double prix_vente, Date date_de_limite_conso, Date date_de_production, int lot_de_fabrication, String nom) {
        this.id_plat = id_plat;
        this.id_recette = id_recette;
        this.id_stockplat = id_stockplat;
        this.portion = portion;
        this.cout_revient = cout_revient;
        this.prix_vente = prix_vente;
        this.date_de_limite_conso = date_de_limite_conso;
        this.date_de_production = date_de_production;
        this.lot_de_fabrication = lot_de_fabrication;
        this.nom = nom;
    }

    public int getId_plat() {
        return id_plat;
    }

    public void setId_plat(int id_plat) {
        this.id_plat = id_plat;
    }

    public int getId_recette() {
        return id_recette;
    }

    public void setId_recette(int id_recette) {
        this.id_recette = id_recette;
    }

    public int getId_stockplat() {
        return id_stockplat;
    }

    public void setId_stockplat(int id_stockplat) {
        this.id_stockplat = id_stockplat;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public double getCout_revient() {
        return cout_revient;
    }

    public void setCout_revient(double cout_revient) {
        this.cout_revient = cout_revient;
    }

    public double getPrix_vente() {
        return prix_vente;
    }

    public void setPrix_vente(double prix_vente) {
        this.prix_vente = prix_vente;
    }

    public Date getDate_de_limite_conso() {
        return date_de_limite_conso;
    }

    public void setDate_de_limite_conso(Date date_de_limite_conso) {
        this.date_de_limite_conso = date_de_limite_conso;
    }

    public Date getDate_de_production() {
        return date_de_production;
    }

    public void setDate_de_production(Date date_de_production) {
        this.date_de_production = date_de_production;
    }

    public int getLot_de_fabrication() {
        return lot_de_fabrication;
    }

    public void setLot_de_fabrication(int lot_de_fabrication) {
        this.lot_de_fabrication = lot_de_fabrication;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
