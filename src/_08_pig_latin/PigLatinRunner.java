package _08_pig_latin;

import javax.swing.JOptionPane;

public class PigLatinRunner {
	public static void main(String[] args) {
		PigLatinTranslator bruh = new PigLatinTranslator();
		Pig_gui gui = new Pig_gui();
		String initial = JOptionPane.showInputDialog("Say Something!");
		String hiii = bruh.translateEnglishToPigLatin(initial);
		JOptionPane.showMessageDialog(null, hiii);
	}
}