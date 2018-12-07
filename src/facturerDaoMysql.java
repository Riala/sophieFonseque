import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class facturerDaoMysql {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;
    public boolean createFacturer(int id_facture, double montant, double cout_livraison, int id_commercial, int id_client, int id_plat){
        try {
            String query = "INSERT INTO facturer VALUES (?,?,?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id_facture);
            ptmt.setDouble(2, montant);
            ptmt.setDouble(3, cout_livraison);
            ptmt.setInt(4, id_commercial);
            ptmt.setInt(5, id_client);
            ptmt.setInt(6, id_plat);
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
    public boolean createFacturer(facturer nv_facturer){
        try {
            String query = "INSERT INTO facturer VALUES (?,?,?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_facturer.getId_facture());
            ptmt.setDouble(2, nv_facturer.getMontant());
            ptmt.setDouble(3, nv_facturer.getCout_livraison());
            ptmt.setInt(4, nv_facturer.getId_commercial());
            ptmt.setInt(5, nv_facturer.getId_client());
            ptmt.setInt(6, nv_facturer.getId_plat());
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
    public boolean selectFacturer(int id){
        try {
            String query = "SELECT * FROM facturer WHERE id_facture = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_facture");
                double montant_f  = rs.getDouble("montant");
                double coutLivr_f = rs.getDouble("cout_livraison");
                int id_com = rs.getInt("id_commercial");
                int id_cli = rs.getInt("id_client");
                int id_plat = rs.getInt("id_plat");
                System.out.println("\n Numéro facture : " + id_f + "\n Montant : "	+ montant_f + "\n Coût livraison : "	+ coutLivr_f+ "\n Numéro commercial : "	+ id_com+ "\n Numéro client : "	+ id_cli+ "\n Numéro plat : "	+ id_plat);
            }
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
    public boolean selectFacturer(facturer cur_facturer){
        try {
            String query = "SELECT * FROM facturer WHERE id_facture = " + cur_facturer.getId_facture();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_facture");
                double montant_f  = rs.getDouble("montant");
                double coutLivr_f = rs.getDouble("cout_livraison");
                int id_com = rs.getInt("id_commercial");
                int id_cli = rs.getInt("id_client");
                int id_plat = rs.getInt("id_plat");
                System.out.println("\n Numéro facture : " + id_f + "\n Montant : "	+ montant_f + "\n Coût livraison : "	+ coutLivr_f+ "\n Numéro commercial : "	+ id_com+ "\n Numéro client : "	+ id_cli+ "\n Numéro plat : "	+ id_plat);
            }
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
    public boolean updateFacturer (int id_facture, double montant, double cout_livraison, int id_commercial, int id_client, int id_plat){
        try {
            String query = "UPDATE facturer SET montant = "+montant+", cout_livraison = " + cout_livraison + ", id_commercial = " + id_commercial + ", id_client = " + id_client + ", id_plat = " + id_plat + "WHERE id_ingredient = "+id_facture;
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
    public boolean updateFacturer(facturer cur_facturer){
        try {
            int id_facture = cur_facturer.getId_facture();
            double montant = cur_facturer.getMontant();
            double cout_livraison = cur_facturer.getCout_livraison();
            int id_commercial = cur_facturer.getId_commercial();
            int id_client = cur_facturer.getId_client();
            int id_plat = cur_facturer.getId_plat();
            String query = "UPDATE facturer SET montant = "+montant+", cout_livraison = " + cout_livraison + ", id_commercial = " + id_commercial + ", id_client = " + id_client + ", id_plat = " + id_plat + "WHERE id_ingredient = "+id_facture;
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
    public boolean deleteFacturer (int id){
        try {
            String query = "DELETE FROM facturer WHERE id_facture ="+id;
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
    public boolean deleteFacturer(facturer cur_facturer){
        try {
            String query = "DELETE FROM facturer WHERE id_facture ="+cur_facturer.getId_facture();
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
