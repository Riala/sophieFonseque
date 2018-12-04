import java.util.List;

public interface fournisseurDao {
    public boolean createFournisseur(int id, String nom);
    public boolean createFournisseur(fournisseur nv_fournisseur);
    public boolean selectFournisseur(int id);
    public boolean selectFournisseur(String nom);
    public boolean selectFournisseur(fournisseur cur_fournisseur);
    public boolean updateFournisseur (int id, String nom);
    public boolean updateFournisseur(fournisseur cur_fournisseur);
    public boolean deleteFournisseur (int id, String nom);
    public boolean deleteFournisseur (int id);
    public boolean deleteFournisseur (String nom);
    public boolean deleteFournisseur(fournisseur cur_fournisseur);
}
