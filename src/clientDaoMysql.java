import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clientDaoMysql {
    Connection conn = null;
    PreparedStatement ptmt = null;
    ResultSet rs = null ;
    public boolean createClient(int id, String nom){
        try {
            String query = "INSERT INTO client VALUES (?,?)";
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
    public boolean createClient(client nv_client){
        try {
            String query = "INSERT INTO client VALUES (?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_client.getId_client());
            ptmt.setString(2, nv_client.getNom_client());
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
    public boolean selectClient(int id){
        try {
            String query = "SELECT * FROM client WHERE id_client = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_client");
                String nom_f = rs.getString("nom_client");
                System.out.println("\n Numéro client : " + id_f + "\n Nom client : "	+ nom_f );
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
    public boolean selectClient(String nom){
        try {
            String query = "SELECT * FROM client WHERE nom_client = " + nom;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_client");
                String nom_f = rs.getString("nom_client");
                System.out.println("\n Numéro founisseur : " + id_f + "\n Nom client : "	+ nom_f );
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
    public boolean selectClient(client cur_client){
        try {
            String query = "SELECT * FROM client WHERE id_client = " + cur_client.getId_client();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_f = rs.getInt("id_client");
                String nom_f = rs.getString("nom_client");
                System.out.println("\n Numéro founisseur : " + id_f + "\n Nom client : "	+ nom_f );
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
    public boolean updateClient (int id, String nom){
        try {
            String query = "UPDATE client SET nom_client = '"+nom+"' WHERE id_client= "+id;
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
    public boolean updateClient(client cur_client){
        try {
            String query = "UPDATE client SET nom_client = '"+cur_client.getNom_client()+"' WHERE id_client = "+cur_client.getId_client();
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
    public boolean deleteClient (int id, String nom){
        try {
            String query = "DELETE FROM client WHERE id_client ="+id+"AND nom_client = '" + nom + "'";
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
    public boolean deleteClient (int id){
        try {
            String query = "DELETE FROM client WHERE id_client ="+id;
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
    public boolean deleteClient (String nom){
        try {
            String query = "DELETE FROM client WHERE nom_client ='"+nom+"'";
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
    public boolean deleteClient(client cur_client){
        try {
            String query = "DELETE FROM client WHERE id_client ="+cur_client.getId_client();
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
