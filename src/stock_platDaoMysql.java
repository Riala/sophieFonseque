import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class stock_platDaoMysql {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;
    public boolean createStockPlat(int id, int quantite){
        try {
            String query = "INSERT INTO stock_plat VALUES (?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            ptmt.setInt(2, quantite);
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
    public boolean createStockPlat(stock_plat nv_stock_plat){
        try {
            String query = "INSERT INTO stock_plat VALUES (?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_stock_plat.getId_stockplat());
            ptmt.setInt(2, nv_stock_plat.getQuantite());
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
    public boolean selectStockPlat(int id){
        try {
            String query = "SELECT * FROM stock_plat WHERE id_stockplat = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while (rs.next()) {
                int id_sp = rs.getInt("id_ingredient");
                int qte_sp = rs.getInt("quantite");
                System.out.println("\n Numéro stock plat : " + id_sp + "\n Quantité : " + qte_sp);
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
    public boolean selectStockPlat(stock_plat cur_stock_plat){
        try {
            String query = "SELECT * FROM stock_plat WHERE id_stockplat = " + cur_stock_plat.getId_stockplat();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while (rs.next()) {
                int id_sp = rs.getInt("id_ingredient");
                int qte_sp = rs.getInt("quantite");
                System.out.println("\n Numéro stock plat : " + id_sp + "\n Quantité : " + qte_sp);
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
    public boolean updateStockPlat (int id, int quantite){
        try {
            String query = "UPDATE stock_plat SET quantite = " + quantite + " WHERE id_stockplat = "+id;
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
    public boolean updateStockPlat(stock_plat cur_stock_plat){
        try {
            int id = cur_stock_plat.getId_stockplat();
            int quantite = cur_stock_plat.getId_stockplat();
            String query = "UPDATE stock_plat SET quantite = " + quantite + " WHERE id_stockplat = "+id;
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
    public boolean deleteStockPlat (int id){
        try {
            String query = "DELETE FROM stock_plat WHERE id_stockplat ="+id;
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
    public boolean deleteStockPlat(stock_plat cur_stock_plat){
        try {
            String query = "DELETE FROM stock_plat WHERE id_stockplat ="+cur_stock_plat.getId_stockplat();
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
