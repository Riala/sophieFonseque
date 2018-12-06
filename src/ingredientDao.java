public interface ingredientDao {
    public boolean createIngredient(int id, String nom, double prix_achat, int id_fournisseur);
    public boolean createIngredient(ingredient nv_ingredient);
    public boolean selectIngredient(int id);
    public boolean selectIngredient(ingredient cur_ingredient);
    public boolean updateIngredient (int id, String nom, double prix_achat, int id_fournisseur);
    public boolean updateIngredient(ingredient cur_ingredient);
    public boolean deleteIngredient (int id);
    public boolean deleteIngredient(ingredient cur_ingredient);
}
