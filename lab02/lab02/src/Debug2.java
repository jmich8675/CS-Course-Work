import javax.swing.*;

public class Debug2 {
    public static void main(String[] args){
        int days = 19;
        int weeks = 3;
        int month = 8;

        double average = (days + weeks + month) / 8.0;
        JOptionPane.showMessageDialog(null, "The average is: "+ average);
    }
}
