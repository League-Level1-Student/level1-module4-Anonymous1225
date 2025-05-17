package _03_typing_tutor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Typing_tutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
	}
	public void run() {
		
	}
}
