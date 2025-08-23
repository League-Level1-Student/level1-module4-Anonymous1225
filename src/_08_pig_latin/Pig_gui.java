package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Pig_gui implements ActionListener {
	JFrame Framing;
	JPanel Perjury;
	JButton Battery;
	JButton Blackmail;
	JButton Bombing;
	JTextField Fraud;
	JTextField Forgery;
	public void gui() {
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
		Bombing.setText("<<<");
		Forgery.setText("Speak");
		Battery.addActionListener(this);
		Blackmail.addActionListener(this);
		Bombing.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(Blackmail)) {
			
		}
		if (buttonPressed.equals(Battery)) {
			
		}
		if (buttonPressed.equals(Bombing)) {
			
		}
	}
}