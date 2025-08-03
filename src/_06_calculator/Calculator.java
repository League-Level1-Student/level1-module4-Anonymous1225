package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JTextField winnie;
	JTextField waffle;
	JButton gigi = new JButton("Add");
	JButton martha = new JButton("Subtract");
	JButton nugget = new JButton("Multiply");
	JButton pheobe = new JButton("Divide");
	public Calculator() {
		int op=0;
		winnie = new JTextField(5);
		waffle = new JTextField(5);
		JFrame beth = new JFrame();
		JPanel polly = new JPanel();
		beth.add(polly);
		polly.add(winnie);
		polly.add(gigi);
		polly.add(nugget);
		polly.add(pheobe);
		gigi.addActionListener(this);
		polly.add(martha);
		martha.addActionListener(this);
		nugget.addActionListener(this);
		pheobe.addActionListener(this);
		polly.add(waffle);
		beth.pack();
		beth.setVisible(true);

	}
	public  double add(double x, double y){
		double sum=x+y;
		return sum;
		
	}
	public  double multiply(double p1, double p2) {
		double answer=p1*p2;
		return answer;
	}
	public  double subtract(double x, double y) {
		double subber=y*-1;
		double answer=x+subber;
		return answer;
	}
	public double divide(double x, double y) {
		double quotient=x/y;
		return quotient;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == gigi){
			String v1=winnie.getText();
			String v2=waffle.getText();
			double dv1 = Double.parseDouble(v1);
			double dv2 = Double.parseDouble(v2);
			double sum= add(dv1,dv2);
			JOptionPane.showMessageDialog(null, sum);
		}
		if (buttonPressed == martha){
			String v1=winnie.getText();
			String v2=waffle.getText();
			double iv1 = Integer.parseInt(v1);
			double iv2 = Integer.parseInt(v2);
			double difference= subtract(iv1,iv2);
			JOptionPane.showMessageDialog(null,difference);
		}
		if (buttonPressed == nugget) {
			String v1=winnie.getText();
			String v2=waffle.getText();
			double iv1 = Double.parseDouble(v1);
			double iv2 = Double.parseDouble(v2);
			double product = multiply(iv1,iv2);
			
			JOptionPane.showMessageDialog(null,Math.round(product));
		}
		if (buttonPressed == pheobe) {
			String v1=winnie.getText();
			String v2=waffle.getText();
			double dv1 = Double.parseDouble(v1);
			double dv2 = Double.parseDouble(v2);
			double quotient = divide(dv1,dv2);
			JOptionPane.showMessageDialog(null,quotient);
		}
	}
}










