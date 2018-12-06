public interface recetteDao {
    public boolean createRecette(int id, String nom);
    public boolean createRecette(ingredient nv_ingredient);
    public boolean selectRecette(int id);
    public boolean selectRecette(ingredient cur_ingredient);
    public boolean updateRecette (int id, String nom);
    public boolean updateRecette(ingredient cur_ingredient);
    public boolean deleteRecette (int id);
    public boolean deleteRecette(ingredient cur_ingredient);
}
