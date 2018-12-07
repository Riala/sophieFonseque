public interface composerDao {
    public boolean createComposer(int id_recette, int id_ingredient, double quantite, String unite);
    public boolean createComposer(composer nv_composer);
    public boolean selectComposer(int id);
    public boolean selectComposer(composer cur_composer);
    public boolean updateComposer (int id_recette, int id_ingredient, double quantite, String unite);
    public boolean updateComposer(composer cur_composer);
    public boolean deleteComposerRecette (int id);
    public boolean deleteComposerIngredient (int id);
    public boolean deleteComposer(composer cur_composer);
}
