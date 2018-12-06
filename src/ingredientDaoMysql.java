import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ingredientDaoMysql {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;
    public boolean createIngredient(int id, String nom, double prix_achat, int id_fournisseur){
        try {
            String query = "INSERT INTO ingredient VALUES (?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            ptmt.setString(2, nom);
            ptmt.setDouble(3, prix_achat);
            ptmt.setInt(4, id_fournisseur);
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
    public boolean createIngredient(ingredient nv_ingredient){
        try {
            String query = "INSERT INTO ingredient VALUES (?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_ingredient.getId_ingredient());
            ptmt.setString(2, nv_ingredient.getNom());
            ptmt.setDouble(3, nv_ingredient.getPrix_achat());
            ptmt.setInt(4, nv_ingredient.getId_fournisseur());
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
    public boolean selectIngredient(int id){
        try {
            String query = "SELECT * FROM ingredient WHERE id_ingredient = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_i = rs.getInt("id_ingredient");
                String nom_i  = rs.getString("nom");
                double prix_i = rs.getFloat("prix_achat");
                int id_f = rs.getInt("id_fournisseur");
                System.out.println("\n Numéro ingrédient : " + id_i + "\n Nom ingrédient: "	+ nom_i + "\n Prix d'achat : "	+ prix_i+ "\n Numéro fournisseur : "	+ id_f);
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
    public boolean selectIngredient(ingredient cur_ingredient){
        try {
            String query = "SELECT * FROM ingredient WHERE id_ingredient = " + cur_ingredient.getId_ingredient();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_i = rs.getInt("id_ingredient");
                String nom_i  = rs.getString("nom");
                double prix_i = rs.getFloat("prix_achat");
                int id_f = rs.getInt("id_fournisseur");
                System.out.println("\n Numéro ingrédient : " + id_i + "\n Nom ingrédient: "	+ nom_i + "\n Prix d'achat : "	+ prix_i+ "\n Numéro fournisseur : "	+ id_f);
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
    public boolean updateIngredient (int id, String nom, double prix_achat, int id_fournisseur){
        try {
            String query = "UPDATE ingredient SET nom = '"+nom+"', prix_achat = " + prix_achat + ", id_fournisseur = " + id_fournisseur + " WHERE id_ingredient = "+id;
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
    public boolean updateIngredient(ingredient cur_ingredient){
        {
            try {
                int id = cur_ingredient.getId_ingredient();
                int id_fournisseur = cur_ingredient.getId_fournisseur();
                String nom = cur_ingredient.getNom();
                double prix_achat = cur_ingredient.getPrix_achat();
                String query = "UPDATE ingredient SET nom = '"+nom+"', prix_achat = " + prix_achat + ", id_fournisseur = " + id_fournisseur + " WHERE id_ingredient = "+id;
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
    public boolean deleteIngredient (int id){
        try {
            String query = "DELETE FROM ingredient WHERE id_ingredient ="+id;
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
    public boolean deleteIngredient(ingredient cur_ingredient){
        try {
            String query = "DELETE FROM ingredient WHERE id_ingredient ="+ cur_ingredient.getId_ingredient();
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
