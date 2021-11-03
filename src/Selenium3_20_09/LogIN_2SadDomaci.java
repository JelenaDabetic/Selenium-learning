package Selenium3_20_09;

public class LogIN_2SadDomaci extends LogIn_proveraDomaci {
	
	
	

		private String username;
		private String password;

		public LogIN_2SadDomaci () {
			this.username = "losiUsername";
			this.password = "losaSifra";
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

	
		
		public boolean logiNSad() {
			return login_proveraDomaci(username, password);
		}
		
	}

