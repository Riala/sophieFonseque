import com.mysql.cj.util.StringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class fonction {
    private Connection conn = null;
    private PreparedStatement ptmt = null;
    private ResultSet rs = null ;

    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

    public boolean afficherFactureComCli(int id_com, int id_cli){
        try {
            String query = "SELECT nom, prix_vente, lot_de_fabrication" +
                            " FROM plat" +
                            " JOIN facturer ON facturer.id_plat = plat.id_plat" +
                            " WHERE id_commercial = " + id_com + " AND id_client = " + id_cli;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            String entete = "Nom du plat" + new String(new char[39]).replace("\0", " ") + " | prix de vente | lot de fabrication ";
            String line = new String(new char[entete.length()]).replace("\0", "-");
            System.out.println(entete + "\n" + line);
            while(rs.next()) {
                String nom_plat = rs.getString("nom");
                double prix_plat = rs.getDouble("prix_vente");
                double lot_fabric = rs.getDouble("lot_de_fabrication");
                String prix = Double.toString(arrondi(prix_plat, 2));
                System.out.println(nom_plat + new String(new char[50 - nom_plat.length()]).replace("\0", " ") + " | " + prix +  new String(new char[13 -  prix.length()]).replace("\0", " ")+ " | " + lot_fabric );
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
    public boolean afficherStocks(int id_recette){
        try {
            String query = "SELECT ingredient.nom, stock_ingredient.quantite, stock_ingredient.unite" +
                    " FROM recette" +
                    " JOIN composer ON recette.id_recette = composer.id_recette" +
                    " JOIN ingredient ON composer.id_ingredient = ingredient.id_ingredient" +
                    " JOIN stock_ingredient ON ingredient.id_ingredient = stock_ingredient.id_ingredient" +
                    " WHERE recette.id_recette = " + id_recette;
            conn = connectionFactory.getConnection();
            ptmt = conn.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery(query);
            String entete = "Nom de l'ingrédient" + new String(new char[31]).replace("\0", " ") + " | Quantité | Unité ";
            String line = new String(new char[entete.length()]).replace("\0", "-");
            System.out.println(entete + "\n" + line);
            while(rs.next()) {
                String nom_i = rs.getString("nom");
                double qte_i = rs.getDouble("quantite");
                String unite_i = rs.getString("unite");
                String quantite = Double.toString(arrondi(qte_i, 2));
                System.out.println(nom_i + new String(new char[50 - nom_i.length()]).replace("\0", " ") + " | " + quantite +  new String(new char[8 -  quantite.length()]).replace("\0", " ")+ " | " + unite_i );
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


}
