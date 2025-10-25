

package _10_slot_machine;

import java.net.*;
import java.util.Random;

import javax.swing.*;

public class Slot_machine {
	public static void main(String[] args) {
		Slot_machine bandit = new Slot_machine();
	}
	public void run() throws MalformedURLException {
		Random ran = new Random();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		for (int i=0; i<3;i++) {
			int x = ran.nextInt(3);
			if(x==0) {
				createLabelImage("6509378.png");
			}
			if(x==1) {
				createLabelImage("7.jpg");
			}
		}
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
}