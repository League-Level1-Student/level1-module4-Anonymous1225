package _05_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        String how=begin();
        
    }

    static String begin() {
        // Welcome the user. Give them a hint for the secret location.
    	JOptionPane.showMessageDialog(null,"Hey, watcha lookin' at, I'll let ya' in on somethin'.");
    	String choice = JOptionPane.showInputDialog("Here's what I can do for you");

    	
    	System.out.println("choice = " + choice);
    	return choice;
    }
}
