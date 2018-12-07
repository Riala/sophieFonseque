public interface stock_platDao {
    public boolean createStockPlat(int id, int quantite);
    public boolean createStockPlat(stock_plat nv_stock_plat);
    public boolean selectStockPlat(int id);
    public boolean selectStockPlat(stock_plat cur_stock_plat);
    public boolean updateStockPlat (int id, int quantite);
    public boolean updateStockPlat(stock_plat cur_stock_plat);
    public boolean deleteStockPlat (int id);
    public boolean deleteStockPlat(stock_plat cur_stock_plat);
}
