package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Mole  implements ActionListener{
	public void gui(){
		Random ran = new Random();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton [] Bobs = new JButton[24];
		for (int i=0; i<Bobs.length;i++) {
			Bobs[i]=new JButton();
		}
		frame.add(panel);
		for (int i=0; i<Bobs.length; i++) {
			panel.add(Bobs[i]);
			Bobs[i].addActionListener(this);;
		}
		int X= ran.nextInt(23)+1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
