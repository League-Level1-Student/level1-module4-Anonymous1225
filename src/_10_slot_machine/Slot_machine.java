package _10_slot_machine;

import java.net.*;
import javax.swing.*;

public class Slot_machine {
	public static void main(String[] args) {
		Slot_machine bandit = new Slot_machine();
	}
	public void run() throws MalformedURLException {
		createLabelImage("650938.png");
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