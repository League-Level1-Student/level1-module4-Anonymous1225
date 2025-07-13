package _06_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JTextField winnie;
	JTextField waffle;
	public Calculator() {
		int op=0;
		winnie = new JTextField();
		waffle = new JTextField();
		JFrame beth = new JFrame();
		JPanel polly = new JPanel();
		JButton gigi = new JButton("Add");
		JButton martha = new JButton("Subtract");

		beth.add(polly);
		polly.add(winnie);
		polly.add(gigi);
		polly.add(waffle);
		gigi.addActionListener(e->System.out.println(add(iv1,iv2)));
		polly.add(martha);
		martha.addActionListener(e-> System.out.println(subtract(iv1,iv2)));
		beth.pack();
		beth.setVisible(true);

	}
	public static int add(int x, int y){
		String v1=winnie.getText();
		String v2=waffle.getText();
		int iv1 = Integer.parseInt(v1);
		int iv2 = Integer.parseInt(v2);
		int sum=x+y;
		return sum;
		
	}
	public static int multiply(int p1, int p2) {
		int answer=0;
		for(int i = 0; i < p2; i++) {
			add(answer, p1);
		}
		return answer;
	}
	public static int subtract(int x, int y) {
		int subber=y*-1;
		int answer=x+subber;
		return answer;
	}
}
