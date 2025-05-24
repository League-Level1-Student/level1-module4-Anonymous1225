package _03_typing_tutor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;
public class Typing_tutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
	Random ran = new Random();
	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String hi= String.valueOf(generateRandomLetter());
		String currentLetter = hi;
		for (int i=1; i<25; i++) {
			 hi = String.valueOf(generateRandomLetter());
			 currentLetter = currentLetter+hi;
		}
		JOptionPane.showMessageDialog(null, "Let's practice typing! Remember to turn off Caps Lock");
		String answer=JOptionPane.showInputDialog("Copy this exact string of character: "+currentLetter);
		if (answer.equals(currentLetter)) {
			JOptionPane.showMessageDialog(null, "You got it right");
		}
		else {
			JOptionPane.showMessageDialog(null, "Try again.");
		}
	}
	public void run() {
		
	}
	public char generateRandomLetter(){
		char ranletter= (char)ran.nextInt(97,123);
		return (ranletter);
	}
}
