public interface commercialDao {
    public boolean createCommercial(int id, String nom);
    public boolean createCommercial(commercial nv_commercial);
    public boolean selectCommercial(int id);
    public boolean selectCommercial(String nom);
    public boolean selectCommercial(commercial cur_commercial);
    public boolean updateCommercial (int id, String nom);
    public boolean updateCommercial(commercial cur_commercial);
    public boolean deleteCommercial (int id, String nom);
    public boolean deleteCommercial (int id);
    public boolean deleteCommercial (String nom);
    public boolean deleteCommercial(commercial cur_commercial);
}
