package _10_slot_machine;

import java.awt.Component;
import java.net.*;
import java.util.Random;

import javax.swing.*;

public class Slot_machine {
	public static void main(String[] args) throws MalformedURLException {
		Slot_machine bandit = new Slot_machine();
		bandit.run();
	}

	public void run() throws MalformedURLException {
		Random ran = new Random();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		int[] e = new int[3];
		int balance = 50;
		int bet = 0;
		frame.add(panel);
		for (int z = 0; z < 10; z++) {
			boolean ee = true;
			while (ee) {
				String bett = JOptionPane.showInputDialog("how much do you bet?");
				bet = Integer.valueOf(bett);
				if (bet > 0) {
					ee = false;
				} else {
					JOptionPane.showMessageDialog(null, "Has to be positive¯\\_(ツ)_/¯");
				}
				frame.setVisible(true);
			}
			for (int i = 0; i < 3; i++) {
				int x = ran.nextInt(3);
				if (x == 0) {
					panel.add(createLabelImage("650938.png"));
					e[i] = 1;
				}
				if (x == 1) {
					panel.add(createLabelImage("7.jpg"));
					e[i] = 2;
				}
				if (x == 2) {
					panel.add(createLabelImage("bar.jpg"));
					e[i] = 2;
				}
			}
			frame.pack();
			if (e[0] == e[1] && e[1] == e[2]) {
				JOptionPane.showMessageDialog(null, "You won!");
				balance += bet;
			} else {
				JOptionPane.showMessageDialog(null, "You lost D:");
				balance -= bet;
			}
			JOptionPane.showMessageDialog(null, "You balance is:" + balance);
			if(balance<0) {
				z=10;
			}
			panel.removeAll();
			frame.setVisible(false);
		}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}