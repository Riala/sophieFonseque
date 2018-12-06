import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainProjet {
    public static void main(String[] args){
 /*       fournisseur mon_fournisseur = new fournisseur(98, "Maman dodue");
        fournisseurDaoMysql gestion_fournisseur = new fournisseurDaoMysql();
        gestion_fournisseur.createFournisseur(mon_fournisseur);
        gestion_fournisseur.createFournisseur(101, "L'allemand");

        gestion_fournisseur.selectFournisseur(1);
        gestion_fournisseur.selectFournisseur("L'allemand");
        gestion_fournisseur.selectFournisseur(mon_fournisseur);

        gestion_fournisseur.updateFournisseur(101, "L'allemand");
        mon_fournisseur.setNom_fournisseur("Papa dodu");
        gestion_fournisseur.updateFournisseur(mon_fournisseur);

        gestion_fournisseur.selectFournisseur(mon_fournisseur);
        gestion_fournisseur.selectFournisseur(101);

        gestion_fournisseur.deleteFournisseur(101);
        gestion_fournisseur.deleteFournisseur(mon_fournisseur);*/

/*        client mon_client = new client(100, "Carrefour", Date.valueOf("2018-01-01"));
        clientDaoMysql client_tmp = new clientDaoMysql();
        client_tmp.createClient(mon_client);
        client_tmp.createClient(98, "Le Micro", Date.valueOf("2017-01-01"));
        client_tmp.selectClient(Date.valueOf("2018-12-02"));
        client_tmp.selectClient(mon_client);
        client_tmp.selectClient(98);
        client_tmp.deleteClient(98);
        client_tmp.deleteClient(mon_client);*/

        commercial mon_commercial = new commercial(98, "Dupont", "Marcel");
        commercialDaoMysql gst_commercial = new commercialDaoMysql();
        gst_commercial.createCommercial(mon_commercial);
        gst_commercial.selectCommercial(1);
        gst_commercial.createCommercial(25, "toto", "tutu");
        gst_commercial.selectCommercial(mon_commercial);
        gst_commercial.selectCommercial(25);
        gst_commercial.updateCommercial(25, "tata", "titi");
        gst_commercial.selectCommercial(25);
    }
}
