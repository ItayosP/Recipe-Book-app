import javax.swing.*;

import java.awt.Color;
import java.util.ArrayList;


public class Name {

    public static JFrame frame;
    public static ArrayList<Recipe> recipes = new ArrayList<>();

    public static void main(String[] args) {
        frame = new JFrame();

        //closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //size
        frame.setSize(1200, 800);
        frame.setLayout(null);

        //background color
        frame.getContentPane().setBackground(new Color(0xffcba4));

        //title
        frame.setTitle("Recipe Book App");

        //Add  new recipe button
        JButton addButton = new JButton("Add new recipe");

        addButton.setSize(240, 50);
        addButton.setLocation(600 - 120, 25);

        addButton.setBackground(new Color(0xfffdd0));

        addButton.addActionListener((e) -> {
            AddRecipeWindow window = new AddRecipeWindow();

        });

        frame.add(addButton);

        /*
        Recipe recipe1 = new Recipe("Pasta");
        recipes.add(recipe1);

        Recipe recipe2 = new Recipe("Egg");
        recipes.add(recipe2);

        updateRecipes();
        */
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
            button.setBackground(new Color(0xfffdd0));
            frame.add(button);
        }
        frame.repaint();
    }

}



class AddRecipeWindow extends JFrame {

    public JTextField nameField;
    public JTextArea ingredients;
    public JTextArea instructions;
    
    AddRecipeWindow() {

        setSize(1000, 500);
        setLayout(null);

        nameField = new JTextField();
        nameField.setBounds(400, 50, 200, 20);
        add(nameField);
        
        JLabel nameLabel = new JLabel("Enter Recipe Name: ");
        nameLabel.setBounds(150, 50, 120, 20);
        add(nameLabel);
        
        setVisible(true);
    }

}