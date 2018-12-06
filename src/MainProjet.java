import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainProjet {
    public static void main(String[] args){
        ingredient carrote = new ingredient(12, "Carrote", 1.25, 1);
        ingredientDaoMysql cur_ingredient = new ingredientDaoMysql();

        cur_ingredient.createIngredient(carrote);
        cur_ingredient.createIngredient(98, "Patate", 0.90, 2);

        cur_ingredient.selectIngredient(carrote);
        cur_ingredient.selectIngredient(98);

        carrote.setNom("banane");
        cur_ingredient.updateIngredient(carrote);
        cur_ingredient.updateIngredient(98, "Pomme de terre", 0.85, 3);

        cur_ingredient.selectIngredient(carrote);
        cur_ingredient.selectIngredient(98);

        cur_ingredient.deleteIngredient(98);
        cur_ingredient.deleteIngredient(carrote);

    }
}
