import java.sql.*;

public class clientDaoMysql {
    Connection conn = null;
    PreparedStatement ptmt = null;
    ResultSet rs = null ;
    public boolean createClient(int id, String nom, Date date_premier_achat){
        try {
            String query = "INSERT INTO client VALUES (?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            ptmt.setString(2, nom);
            ptmt.setDate(3, date_premier_achat);
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
            String query = "INSERT INTO client VALUES (?,?, ?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_client.getId_client());
            ptmt.setString(2, nv_client.getNom_client());
            ptmt.setDate(3, nv_client.getDate_premier_achat());
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
                int id_c = rs.getInt("id_client");
                String nom_c  = rs.getString("nom");
                Date date_premier_achat = rs.getDate("date_de_premier_achat");
                System.out.println("\n Numéro client : " + id_c + "\n Nom client : "	+ nom_c+ "\n Date de premier achat : "	+ date_premier_achat );
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
            String query = "SELECT * FROM client WHERE nom = '" + nom + "'";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_c = rs.getInt("id_client");
                String nom_c  = rs.getString("nom");
                Date date_premier_achat = rs.getDate("date_de_premier_achat");
                System.out.println("\n Numéro client : " + id_c + "\n Nom client : "	+ nom_c+ "\n Date de premier achat : "	+ date_premier_achat );
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
    public boolean selectClient(Date d){
        try {
            String query = "SELECT * FROM client WHERE date_premier_achat = '" + d + "'";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_c = rs.getInt("id_client");
                String nom_c  = rs.getString("nom");
                Date date_premier_achat = rs.getDate("date_de_premier_achat");
                System.out.println("\n Numéro client : " + id_c + "\n Nom client : "	+ nom_c+ "\n Date de premier achat : "	+ date_premier_achat );
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
    public boolean selectClient(client c){
        try {
            String query = "SELECT * FROM client WHERE id_client = " + c.getId_client();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_c = rs.getInt("id_client");
                String nom_c  = rs.getString("nom");
                Date date_premier_achat = rs.getDate("date_de_premier_achat");
                System.out.println("\n Numéro client : " + id_c + "\n Nom client : "	+ nom_c+ "\n Date de premier achat : "	+ date_premier_achat );
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
    public boolean updateClient (int id, String nom,Date date_premier_achat){
        try {
            String query = "UPDATE client SET nom = '"+nom+"', date_de_premier_achat = '" + date_premier_achat + "' WHERE id_client= "+id;
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
            int id = cur_client.getId_client();
            String nom = cur_client.getNom_client();
            Date date_premier_achat = cur_client.getDate_premier_achat();
            String query = "UPDATE client SET nom = '"+nom+"', date_de_premier_achat = '" + date_premier_achat + "' WHERE id_client= "+id;
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
    public boolean deleteClient (int id, String nom,Date date_premier_achat){
        try {
            String query = "DELETE FROM client WHERE id_client = "+id ;
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
            String query = "DELETE FROM client WHERE nom ='"+nom+"'";
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
    public boolean deleteClient (Date date_premier_achat){
        try {
            String query = "DELETE FROM client WHERE date_premier_achat ='"+date_premier_achat+"'";
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
