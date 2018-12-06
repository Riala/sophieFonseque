import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;

public class platDaoMysql {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;

    public boolean createPlat(int id_plat, String nom, int portion, double prix_vente, Date date_de_production, Date date_de_limite_conso, int lot_de_fabrication, double cout_revient, int id_stockplat, int id_recette){
        try {
            String query = "INSERT INTO plat VALUES (?,?,?,?,?,?,?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id_plat);
            ptmt.setString(2, nom);
            ptmt.setInt(3, portion);
            ptmt.setDouble(4, prix_vente);
            ptmt.setDate(5, date_de_production);
            ptmt.setDate(6, date_de_limite_conso);
            ptmt.setInt(7, lot_de_fabrication);
            ptmt.setDouble(8, cout_revient);
            ptmt.setInt(9, id_stockplat);
            ptmt.setInt(10, id_recette);
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
    public boolean createPlat(plat nv_plat){
        try {
            String query = "INSERT INTO plat VALUES (?,?,?,?,?,?,?,?,?,?)";
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, nv_plat.getId_plat());
            ptmt.setString(2, nv_plat.getNom());
            ptmt.setInt(3, nv_plat.getPortion());
            ptmt.setDouble(4, nv_plat.getPrix_vente());
            ptmt.setDate(5, nv_plat.getDate_de_production());
            ptmt.setDate(6, nv_plat.getDate_de_limite_conso());
            ptmt.setInt(7, nv_plat.getLot_de_fabrication());
            ptmt.setDouble(8, nv_plat.getCout_revient());
            ptmt.setInt(9, nv_plat.getId_stockplat());
            ptmt.setInt(10, nv_plat.getId_recette());
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
    public boolean selectPlat(int id){
        try {
            String query = "SELECT * FROM plat WHERE id_plat = " + id;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            while(rs.next()) {
                int id_p = rs.getInt("id_plat");
                String nom_p  = rs.getString("nom");
                int portion_p = rs.getInt("portion");
                double prix_p = rs.getDouble("prix_vente");
                Date date_prod = rs.getDate("date_de_production");
                Date date_lim = rs.getDate("date_de_limite_conso");
                int lot_p  = rs.getInt("lot_de_fabrication");
                double cout_p = rs.getDouble("cout_revient");
                int id_stock = rs.getInt("id_stockplat");
                int id_recette = rs.getInt("id_recette");
                System.out.println("\n Numéro plat : " + id_p + "\n Nom plat : "	+ nom_p + "\n Portion : "	+ portion_p + "\n Prix vente : "	+ prix_p);
                System.out.println("Date de production : " + + "\n Nom plat : "	+ nom_p + "\n Portion : "	+ portion_p + "\n Prix vente : "	+ prix_p);
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
    public boolean selectPlat(plat cur_plat);
    public boolean updatePlat (int id_plat, String nom, int portion, double prix_vente, Date date_de_production, Date date_de_limite_conso, int lot_de_fabrication, double cout_revient, int id_stockplat,int id_recette);
    public boolean updatePlat(plat cur_plat);
    public boolean deletePlat (int id);
    public boolean deletePlat(plat cur_plat);
}
