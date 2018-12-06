import java.sql.*;

public class commercialDaoMysql {
    Connection conn = null;
    PreparedStatement ptmt = null;
    ResultSet rs = null ;
    public boolean createCommercial(int id, String nom, String prenom){
        try {
            String query = "INSERT INTO commercial VALUES (?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            ptmt.setString(2, nom);
            ptmt.setString(3, prenom);
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
    public boolean createCommercial(commercial nv_commercial){
        try {
            String query = "INSERT INTO commercial VALUES (?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_commercial.getId_commercial());
            ptmt.setString(2, nv_commercial.getNom_commercial());
            ptmt.setString(3, nv_commercial.getPrenom_commercial());
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
    public boolean selectCommercial(int id){
        try {
            String query = "SELECT * FROM commercial WHERE id_commerical = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_c = rs.getInt("id_commercial");
                String nom_c  = rs.getString("nom");
                String prenom_c = rs.getString("prenom");
                System.out.println("\n Numéro commercial : " + id_c + "\n Nom commercial : "	+ nom_c+ "\n Prenom commercial : "	+ prenom_c );
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
    public boolean selectCommercial(commercial cur_commercial){
        try {
            String query = "SELECT * FROM commercial WHERE id_commerical = " + cur_commercial.getId_commercial();
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_c = rs.getInt("id_commercial");
                String nom_c  = rs.getString("nom");
                String prenom_c = rs.getString("prenom");
                System.out.println("\n Numéro commercial : " + id_c + "\n Nom commercial : "	+ nom_c+ "\n Prenom commercial : "	+ prenom_c );
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
    public boolean updateCommercial (int id, String nom, String prenom){
        try {
            String query = "UPDATE commercial SET nom = '"+nom+"', prenom = '" + prenom + "' WHERE id_commercial= "+id;
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
    public boolean updateCommercial(commercial cur_commercial){
        try {
            String query = "UPDATE commercial SET nom = '"+cur_commercial.getNom_commercial()+"', prenom = '" + cur_commercial.getPrenom_commercial() + "' WHERE id_commercial= "+cur_commercial.getId_commercial();
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
    public boolean deleteCommercial (int id){
        try {
            String query = "DELETE FROM commercial WHERE id_commercial ="+id;
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
    public boolean deleteCommercial(commercial cur_commercial){
        try {
            String query = "DELETE FROM commercial WHERE id_commercial ="+cur_commercial.getId_commercial();
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
