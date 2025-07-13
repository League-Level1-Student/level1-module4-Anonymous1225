package _06_calculator;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import _05_fortune_teller.FortuneTeller;

public class CalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator calc = new Calculator();
		String x= JOptionPane.showInputDialog("enter a number");
		String y= JOptionPane.showInputDialog("enter another number");
		int xx = Integer.valueOf(x);
		int yy = Integer.valueOf(y);
		System.out.println(calc.add(xx,yy));
	}

}
