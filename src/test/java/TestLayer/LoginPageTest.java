package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	private LoginPage LoginPage;

	@BeforeTest
	public static void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateLoginFuctionality() {
		LoginPage = new LoginPage();

		LoginPage.loginFunctinality("Ajit", "Pawar", "9766681087", "Ajit@gmail.com", "Latur", "Pune", "Maharashtra",
				"413512", "INDIA", "Ajit123", "Ajit@123", "Ajit@123");

	}

}
