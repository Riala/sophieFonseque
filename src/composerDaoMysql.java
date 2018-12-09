import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class composerDaoMysql {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;
    public boolean createComposer(int id_recette, int id_ingredient, double quantite, String unite){
        try {
            String query = "INSERT INTO composer VALUES (?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id_recette);
            ptmt.setDouble(2, id_ingredient);
            ptmt.setDouble(3, quantite);
            ptmt.setString(4, unite);
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
    public boolean createComposer(composer nv_composer){
        try {
            String query = "INSERT INTO composer VALUES (?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_composer.getId_recette());
            ptmt.setDouble(2, nv_composer.getId_ingredient());
            ptmt.setDouble(3, nv_composer.getQuantite());
            ptmt.setString(4, nv_composer.getUnite());
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
    public boolean selectComposer(int id_recette){
        try {
            String query = "SELECT * FROM composer WHERE id_recette = " + id_recette;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_r = rs.getInt("id_facture");
                int id_i  = rs.getInt("montant");
                double qte_c = rs.getDouble("cout_livraison");
                String unit_c = rs.getString("id_commercial");
                System.out.println("\n Numéro recette : " + id_r + "\n Numéro ingrédient : "	+ id_i + "\n Quantité : "	+ qte_c + " "	+ unit_c + "\n");
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
    public boolean selectComposer(composer cur_composer){
            try {
                String query = "SELECT * FROM composer WHERE id_recette = " + cur_composer.getId_recette();
                conn = connectionFactory.getConnection();
                ptmt = conn.prepareStatement(query);
                ResultSet rs = ptmt.executeQuery(query);
                while(rs.next()) {
                    int id_r = rs.getInt("id_facture");
                    int id_i  = rs.getInt("montant");
                    double qte_c = rs.getDouble("cout_livraison");
                    String unit_c = rs.getString("id_commercial");
                    System.out.println("\n Numéro recette : " + id_r + "\n Numéro ingrédient : "	+ id_i + "\n Quantité : "	+ qte_c + " "	+ unit_c + "\n");
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
    public boolean updateComposer (int id_recette, int id_ingredient, double quantite, String unite){
        try {
            String query = "UPDATE composer SET quantite = "+quantite+", unite = " + unite + "WHERE id_recette = "+id_recette +" AND id_ingredient = " + id_ingredient;
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
    public boolean updateComposer(composer cur_composer){
        try {
            int id_recette = cur_composer.getId_recette();
            int id_ingredient = cur_composer.getId_ingredient();
            double quantite = cur_composer.getQuantite(); 
            String unite = cur_composer.getUnite();
            String query = "UPDATE composer SET quantite = "+quantite+", unite = " + unite + "WHERE id_recette = "+id_recette +" AND id_ingredient = " + id_ingredient;
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
    public boolean deleteComposerRecette (int id){
        try {
            String query = "DELETE FROM composer WHERE id_recette ="+id;
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
    public boolean deleteComposerIngredient (int id){
        try {
            String query = "DELETE FROM composer WHERE id_ingredient ="+id;
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
    public boolean deleteComposer(composer cur_composer){
        try {
            String query = "DELETE FROM composer WHERE id_ingredient ="+cur_composer.getId_ingredient();
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
