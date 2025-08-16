package _08_pig_latin;

import javax.swing.*;

public class Pig_gui {
	static JFrame Framing;
	static JPanel Perjury;
	static JButton Battery;
	static JButton Blackmail;
	static JButton Bombing;
	static JTextField Fraud;
	static JTextField Forgery;
	public static void gui() {
		Framing = new JFrame();
		Perjury = new JPanel();
		Battery = new JButton();
		Blackmail = new JButton();
		Bombing = new JButton();
		Fraud = new JTextField();
		Forgery = new JTextField();
		Framing.add(Perjury);
		Perjury.add(Battery);
		Perjury.add(Blackmail);
		Perjury.add(Bombing);
		Perjury.add(Fraud);
		Perjury.add(Forgery);
		Framing.setVisible(true);
		Blackmail.setText(">>>");
		
	}
}
