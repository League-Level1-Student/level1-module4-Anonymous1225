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
		frame.add(panel);
		frame.setVisible(true);
		Component compy= new Component();
		for (int i=0; i<3;i++) {
			int x = ran.nextInt(3);
			if(x==0) {
				compy=panel.add(createLabelImage("650938.png"));
			}
			if(x==1) {
				compy=createLabelImage("7.jpg");
			}
			if(x==2) {
				compy=panel.add(createLabelImage("bar.jpg"));
			}
		}
		panel.add(compy);
		
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