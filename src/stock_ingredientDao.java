public interface stock_ingredientDao {
    public boolean createStockIngredient(int id, double quantite, String unite);
    public boolean createStockIngredient(stock_ingredient nv_stock_ingredient);
    public boolean selectStockIngredient(int id);
    public boolean selectStockIngredient(stock_ingredient cur_stock_ingredient);
    public boolean updateStockIngredient (int id, double quantite, String unite);
    public boolean updateStockIngredient(stock_ingredient cur_stock_ingredient);
    public boolean deleteStockIngredient (int id);
    public boolean deleteStockIngredient(stock_ingredient cur_stock_ingredient);
}
