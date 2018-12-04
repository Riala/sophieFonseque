import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class fournisseurDaoMysql {
    Connection conn = null;
    PreparedStatement ptmt = null;
    ResultSet rs = null ;
    public boolean createFournisseur(int id, String nom){
        try {
            String query = "INSERT INTO fournisseur VALUES (?,?)";
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
    public boolean createFournisseur(fournisseur nv_fournisseur){
        try {
            String query = "INSERT INTO fournisseur VALUES (?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_fournisseur.getId_fournisseur());
            ptmt.setString(2, nv_fournisseur.getNom_fournisseur());
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
    public boolean selectFournisseur(int id){
        try {
            String query = "SELECT * FROM fournisseur WHERE id_fournisseur = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_fournisseur");
                String nom_f = rs.getString("nom_fournisseur");
                System.out.println("\n Numéro fournisseur : " + id_f + "\n Nom fournisseur : "	+ nom_f );
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
    public boolean selectFournisseur(String nom){
        try {
            String query = "SELECT * FROM fournisseur WHERE nom_fournisseur = " + nom;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_fournisseur");
                String nom_f = rs.getString("nom_fournisseur");
                System.out.println("\n Numéro founisseur : " + id_f + "\n Nom fournisseur : "	+ nom_f );
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
    public boolean selectFournisseur(fournisseur cur_fournisseur){
        try {
            String query = "SELECT * FROM fournisseur WHERE id_fournisseur = " + cur_fournisseur.getId_fournisseur();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_fournisseur");
                String nom_f = rs.getString("nom_fournisseur");
                System.out.println("\n Numéro founisseur : " + id_f + "\n Nom fournisseur : "	+ nom_f );
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
    public boolean updateFournisseur (int id, String nom){
        try {
            String query = "UPDATE fournisseur SET nom_fournisseur = '"+nom+"' WHERE id_fournisseur= "+id;
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
    public boolean updateFournisseur(fournisseur cur_fournisseur){
        try {
            String query = "UPDATE fournisseur SET nom_fournisseur = '"+cur_fournisseur.getNom_fournisseur()+"' WHERE id_fournisseur = "+cur_fournisseur.getId_fournisseur();
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
    public boolean deleteFournisseur (int id, String nom){
        try {
            String query = "DELETE FROM fournisseur WHERE id_fournisseur ="+id+"AND nom_fournisseur = '" + nom + "'";
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
    public boolean deleteFournisseur (int id){
        try {
            String query = "DELETE FROM fournisseur WHERE id_fournisseur ="+id;
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
    public boolean deleteFournisseur (String nom){
        try {
            String query = "DELETE FROM fournisseur WHERE nom_fournisseur ='"+nom+"'";
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
    public boolean deleteFournisseur(fournisseur cur_fournisseur){
        try {
            String query = "DELETE FROM fournisseur WHERE id_fournisseur ="+cur_fournisseur.getId_fournisseur();
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
