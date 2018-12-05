import java.util.Date;

public interface clientDao {
    public boolean createClient(int id, String nom, Date date_premier_achat);
    public boolean createClient(client nv_client);
    public boolean selectClient(int id);
    public boolean selectClient(String nom);
    public boolean selectClient(client cur_client);
    public boolean updateClient (int id, String nom);
    public boolean updateClient(client cur_client);
    public boolean deleteClient (int id, String nom);
    public boolean deleteClient (int id);
    public boolean deleteClient (String nom);
    public boolean deleteClient(client cur_client);
}
