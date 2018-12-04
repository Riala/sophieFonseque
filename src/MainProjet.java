import java.sql.Connection;

public class MainProjet {
    public static void main(String[] args){
        fournisseur mon_fournisseur = new fournisseur(98, "Maman dodue");
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
        gestion_fournisseur.deleteFournisseur(mon_fournisseur);
    }
}
