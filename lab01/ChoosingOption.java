package javabasics;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
    	//sua yes_option thanh yes_no_option
        int option = JOptionPane.showConfirmDialog(null, 
                "Do you want to change to the first class ticket?", 
                "Choose an option", 
                JOptionPane.YES_NO_OPTION);

        if(option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: yes");
        } else if(option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: no");
        }

        System.exit(0);
    }
}
