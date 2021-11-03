package Selenium3_20_09;

import java.util.Scanner;

public class LogIn_proveraDomaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner scan = new Scanner(System.in);

		LogIn_1HappyDomaci happy = new LogIn_1HappyDomaci();
		LogIN_2SadDomaci sad = new LogIN_2SadDomaci();
		String input = "";

		System.out.println("Happy or sad?");
		input = scan.nextLine();
		
	
		switch (input.toLowerCase()) {
		case "happy":
			LogIn_1HappyDomaci.run();
			break;
		case "sad":
			LogIN_2SadDomaci.run();
			break;
		default:
			System.out.println("Pogresan unos");
			break;
		}
		
	}

	
	public boolean login_proveraDomaci(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login_proveraDomaci1(String username, String password) {
//		// TODO Auto-generated method stub
		return false;
	}
//
}
