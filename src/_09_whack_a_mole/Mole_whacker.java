package _09_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mole_whacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton [] Bobs = new JButton[24];
		frame.setVisible(true);
		for (int i=0; i<Bobs.length;i++) {
			Bobs[i]=new JButton();
			Bobs[i].addActionListener(null);
			panel.add(Bobs[i]);
		}
		frame.add(panel);
		for (int i=0; i<Bobs.length; i++) {
			panel.add(Bobs[i]);
		}
		frame=new JFrame();
		frame.setSize(300,300);
		int X= ran.nextInt(23)+1;
		Bobs[X].setText("Mole!");
	}

}
