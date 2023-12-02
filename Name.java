import javax.swing.*;
import java.util.ArrayList;


public class Name {

    public static JFrame frame;
    public static ArrayList<Recipe> recipes = new ArrayList<>();

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setLayout(null);

        //Add  new recipe button
        JButton addButton = new JButton("Add new recipe");

        addButton.setSize(240, 50);
        addButton.setLocation(600 - 120, 25);

        frame.add(addButton);

        Recipe recipe1 = new Recipe("Pasta");
        recipes.add(recipe1);
        Recipe recipe2 = new Recipe("Egg");
        recipes.add(recipe2);

        updateRecipes();

        frame.setVisible(true);
        
    }

    private static void updateRecipes() {

        int index = 0;
        int buttonSpacing = 75;

        for (Recipe recipe : recipes) {
            JButton button = new JButton(recipe.name);
            button.setSize(220, 50);
            button.setLocation(600 - 110, 100 + index * buttonSpacing);
            index += 1;
            frame.add(button);
        }
        frame.repaint();
    }

}