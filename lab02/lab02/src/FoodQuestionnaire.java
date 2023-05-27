import javax.swing.*;
public class FoodQuestionnaire {

    public static void main(String[] args){
        String food;
        String message;
        food = JOptionPane.showInputDialog("What food would you like to eat?");

        message = "Great Choice! You can never go wrong with " + food + ".";
        JOptionPane.showMessageDialog(null, message);
    }
}
