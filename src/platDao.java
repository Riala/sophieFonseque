import java.sql.Date;

public interface platDao {
    public boolean createPlat(int id_plat, String nom, int portion, double prix_vente, Date date_de_production, Date date_de_limite_conso, int lot_de_fabrication, double cout_revient, int id_stockplat, int id_recette);
    public boolean createPlat(plat nv_plat);
    public boolean selectPlat(int id);
    public boolean selectPlat(plat cur_plat);
    public boolean updatePlat (int id_plat, String nom, int portion, double prix_vente, Date date_de_production, Date date_de_limite_conso, int lot_de_fabrication, double cout_revient, int id_stockplat,int id_recette);
    public boolean updatePlat(plat cur_plat);
    public boolean deletePlat (int id);
    public boolean deletePlat(plat cur_plat);
}
