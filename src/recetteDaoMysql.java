import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class recetteDaoMysql {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;
    public boolean createRecette(int id, String nom){
        try {
            String query = "INSERT INTO recette VALUES (?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            ptmt.setString(2, nom);
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
    public boolean createRecette(recette nv_recette){
        try {
            String query = "INSERT INTO recette VALUES (?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_recette.getId_recette());
            ptmt.setString(2, nv_recette.getNom());
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
    public boolean selectRecette(int id){
        try {
            String query = "SELECT * FROM recette WHERE id_recette = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_r = rs.getInt("id_recette");
                String nom_r  = rs.getString("nom");
                System.out.println("\n Numéro recette : " + id_r + "\n Nom recette : "	+ nom_r);
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
    public boolean selectRecette(recette cur_recette){
        try {
            String query = "SELECT * FROM recette WHERE id_recette = " + cur_recette.getId_recette();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_r = rs.getInt("id_recette");
                String nom_r  = rs.getString("nom");
                System.out.println("\n Numéro recette : " + id_r + "\n Nom recette : "	+ nom_r);
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
    public boolean updateRecette (int id, String nom){
        try {
            String query = "UPDATE recette SET nom = '"+nom+"' WHERE id_recette = "+id;
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
    public boolean updateRecette(recette cur_recette){
        try {
            String query = "UPDATE recette SET nom = '"+ cur_recette.getNom() +"' WHERE id_recette = "+ cur_recette.getId_recette();
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
    public boolean deleteRecette (int id){
        try {
            String query = "DELETE FROM recette WHERE id_recette ="+id;
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
    public boolean deleteRecette(recette cur_recette){
        try {
            String query = "DELETE FROM recette WHERE id_recette ="+cur_recette.getId_recette();
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
