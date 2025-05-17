package _03_typing_tutor;

import java.util.Random;

public class Tutor_typer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

}
