import javax.swing.*;

public class Debug3 {
    public static void main(String[] args){
        String firstName = JOptionPane.showInputDialog("Enter your first name: ");
        String age = JOptionPane.showInputDialog("Enter your age: ");

        JOptionPane.showMessageDialog(null, "My name is " + firstName + " and I am " + age + " years old");
    }
}
