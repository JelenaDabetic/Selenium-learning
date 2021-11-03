package Selenium3_20_09;



public class LogIn_1HappyDomaci extends LogIn_proveraDomaci{

	//Za domaci: Happy path klasa, Sad path klasa(proizvoljno netacan username/password) i u Mainu pozivate jednu ili drugu klasu.
	
	private String username;
	private String password;
	

	
	
	public LogIn_1HappyDomaci() {
		this.username="tomsmith";
		this.password="SuperSecretPassword!";
		
	}




	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean logiNHappy() {
		return login_proveraDomaci(username, password);
	}




	public static void run() {
		// TODO Auto-generated method stub
		
	}




	
}

	

