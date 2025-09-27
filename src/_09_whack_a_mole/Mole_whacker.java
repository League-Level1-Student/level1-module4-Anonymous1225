package _09_whack_a_mole;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.*;
public class Mole_whacker implements ActionListener {
	Random ran = new Random();
	Date TAS = new Date();
	int X= ran.nextInt(23)+1;
	JButton [] Bobs = new JButton[24];
	int C=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mole_whacker().run();	
	}
	void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		for (int i=0; i<Bobs.length;i++) {
			Bobs[i]=new JButton();
			Bobs[i].addActionListener(this);
			Bobs[i].setText("Hole!");
			panel.add(Bobs[i]);
		}
		frame.add(panel);
		for (int i=0; i<Bobs.length; i++) {
			panel.add(Bobs[i]);
		}
		frame.setSize(300,300);
		Bobs[X].setText("Mole!");
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if (buttonPressed==(Bobs[X])){
			Bobs[X].setText("Hole!");
			X=ran.nextInt(24);
			Bobs[X].setText("Mole!");
			C+=1;
			if (C%10==0) {
				endGame(TAS,10);
				TAS = new Date();
			}
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    float time = timeAtEnd.getTime()-timeAtStart.getTime();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " seconds per mole.");
	}
}