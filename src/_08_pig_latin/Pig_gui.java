package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game_tools.Sound;

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
		Fraud = new JTextField(20);
		Forgery = new JTextField(30);
		Framing.add(Perjury);
		Perjury.add(Fraud);
		Perjury.add(Blackmail);
		Perjury.add(Bombing);
		Perjury.add(Forgery);
		Perjury.add(Battery);
		Framing.setVisible(true);
		Blackmail.setText(">>>");
		Bombing.setText("<<<");
		Battery.setText("Speak");
		Battery.addActionListener(this);
		Blackmail.addActionListener(this);
		Bombing.addActionListener(this);
		Framing.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(Blackmail)) {
			String eng = Fraud.getText();
			String pig = PigLatinTranslator.translateEnglishToPigLatin(eng);
			Forgery.setText(pig);
		}
		if (buttonPressed.equals(Battery)) {
			Sound.speak(Forgery.getText());
		}
		if (buttonPressed.equals(Bombing)) {
			String pig = Forgery.getText();
			String eng = PigLatinTranslator.translatePigLatinToEnglish(pig);
			Fraud.setText(eng);
		}
	}
}