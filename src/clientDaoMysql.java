import java.sql.*;

public class clientDaoMysql {
    Connection conn = null;
    PreparedStatement ptmt = null;
    ResultSet rs = null ;
    public boolean createClient(int id, String nom, Date date_premier_achat){
        try {
            String query = "INSERT INTO fournisseur VALUES (?,?,?)";
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
            String query = "INSERT INTO fournisseur VALUES (?,?, ?)";
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
                System.out.println("\n Numéro fournisseur : " + id_c + "\n Nom fournisseur : "	+ nom_c+ "\n Date de premier achat : "	+ date_premier_achat );
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
    public boolean selectClient(String nom);
    public boolean selectClient(String nom);
    public boolean selectClient(Date date_premier_achat);
    public boolean updateClient (int id, String nom,Date date_premier_achat);
    public boolean updateClient(client cur_client);
    public boolean deleteClient (int id, String nom,Date date_premier_achat);
    public boolean deleteClient (int id);
    public boolean deleteClient (String nom);
    public boolean deleteClient (Date date_premier_achat);
    public boolean deleteClient(client cur_client);
}
