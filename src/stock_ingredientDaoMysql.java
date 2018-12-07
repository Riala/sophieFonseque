import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class stock_ingredientDaoMysql {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;
    public boolean createStockIngredient(int id, double quantite, String unite){
        try {
            String query = "INSERT INTO ingredient VALUES (?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            ptmt.setDouble(2, quantite);
            ptmt.setString(3, unite);
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e)  {
            return false;
        }finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public boolean createStockIngredient(stock_ingredient nv_stock_ingredient){
        try {
            String query = "INSERT INTO ingredient VALUES (?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_stock_ingredient.getId_ingredient());
            ptmt.setDouble(2, nv_stock_ingredient.getQuantite());
            ptmt.setString(3, nv_stock_ingredient.getUnite());
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e)  {
            return false;
        }finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public boolean selectStockIngredient(int id) {
        try {
            String query = "SELECT * FROM stock_ingredient WHERE id_ingredient = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while (rs.next()) {
                int id_si = rs.getInt("id_ingredient");
                double qte_si = rs.getDouble("quantite");
                String unite_si = rs.getString("unite");
                System.out.println("\n Numéro stock ingrédient : " + id_si + "\n Quantité : " + qte_si + "\n Unité " + unite_si);
            }
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public boolean selectStockIngredient(stock_ingredient cur_stock_ingredient){
        try {
            String query = "SELECT * FROM stock_ingredient WHERE id_ingredient = " + cur_stock_ingredient.getId_ingredient();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while (rs.next()) {
                int id_si = rs.getInt("id_ingredient");
                double qte_si = rs.getDouble("quantite");
                String unite_si = rs.getString("unite");
                System.out.println("\n Numéro stock ingrédient : " + id_si + "\n Quantité : " + qte_si + "\n Unité " + unite_si);
            }
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public boolean updateStockIngredient (int id, double quantite, String unite){
        try {
            String query = "UPDATE stock_ingredient SET quantite = "+quantite+", unite = '" + unite + "' WHERE id_ingredient = "+id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e)  {
            return false;
        }finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public boolean updateStockIngredient(stock_ingredient cur_stock_ingredient){
        try {
            int id = cur_stock_ingredient.getId_ingredient();
            double quantite = cur_stock_ingredient.getQuantite();
            String unite = cur_stock_ingredient.getUnite();
            String query = "UPDATE stock_ingredient SET quantite = "+quantite+", unite = '" + unite + "' WHERE id_ingredient = "+id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e)  {
            return false;
        }finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public boolean deleteStockIngredient (int id){
        try {
            String query = "DELETE FROM stock_ingredient WHERE id_ingredient ="+id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e)  {
            return false;
        }finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public boolean deleteStockIngredient(stock_ingredient cur_stock_ingredient){
        try {
            String query = "DELETE FROM stock_ingredient WHERE id_ingredient ="+cur_stock_ingredient.getId_ingredient();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e)  {
            return false;
        }finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
