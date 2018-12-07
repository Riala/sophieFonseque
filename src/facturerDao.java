public interface facturerDao {
    public boolean createFacturer(int id_facture, double montant, double cout_livraison, int id_commercial, int id_client, int id_plat);
    public boolean createFacturer(facturer nv_facturer);
    public boolean selectFacturer(int id);
    public boolean selectFacturer(facturer cur_facturer);
    public boolean updateFacturer (int id_facture, double montant, double cout_livraison, int id_commercial, int id_client, int id_plat);
    public boolean updateFacturer(facturer cur_facturer);
    public boolean deleteFacturer (int id);
    public boolean deleteFacturer(facturer cur_facturer);
}
