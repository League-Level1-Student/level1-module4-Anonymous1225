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
	JButton Polly = new JButton("Subtract");
	public Calculator() {
		int op=0;
		winnie = new JTextField();
		waffle = new JTextField();
		JFrame beth = new JFrame();
		JPanel polly = new JPanel();


		beth.add(polly);
		polly.add(winnie);
		polly.add(gigi);
		polly.add(waffle);
		gigi.addActionListener(this);
		polly.add(martha);
		martha.addActionListener(this);
		beth.pack();
		beth.setVisible(true);

	}
	public  int add(int x, int y){
		int sum=x+y;
		return sum;
		
	}
	public  int multiply(int p1, int p2) {
		int answer=0;
		for(int i = 0; i < p2; i++) {
			add(answer, p1);
		}
		return answer;
	}
	public  int subtract(int x, int y) {
		int subber=y*-1;
		int answer=x+subber;
		return answer;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(gigi)){
			System.out.println("HIIIIII");
			String v1=winnie.getText();
			String v2=waffle.getText();
			int iv1 = Integer.parseInt(v1);
			int iv2 = Integer.parseInt(v2);
			int sun= add(iv1,iv2);
			System.out.println(sun);
		}
	}
}










