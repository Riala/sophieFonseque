public interface commercialDao {
    public boolean createCommercial(int id, String nom, String prenom);
    public boolean createCommercial(commercial nv_commercial);
    public boolean selectCommercial(int id);
    public boolean selectCommercial(commercial cur_commercial);
    public boolean updateCommercial (int id, String nom, String prenom);
    public boolean updateCommercial(commercial cur_commercial);
    public boolean deleteCommercial (int id);
    public boolean deleteCommercial(commercial cur_commercial);
}
