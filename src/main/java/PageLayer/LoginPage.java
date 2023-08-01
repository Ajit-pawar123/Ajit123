package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class LoginPage extends BaseClass {
	

	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastname;
	@FindBy(name = "phone")
	private WebElement phone;
	@FindBy(name = "userName")
	private WebElement username;
	@FindBy(name = "address1")
	private WebElement address1;
	@FindBy(name = "city")
	private WebElement city;
	@FindBy(name = "state")
	private WebElement state;
	@FindBy(name = "postalCode")
	private WebElement postalCode;
	@FindBy(name = "country")
	private WebElement country;
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(name = "confirmPassword")
	private WebElement confirmPassword;
	@FindBy(name = "submit")
	private WebElement submit;
	@FindBy(xpath = "//a[text()=' sign-in ']")
	private WebElement SingUp;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginFunctinality(String fname, String lname, String Monile, String user, String Address, String City,
			String State, String PostalNo, String countri, String Email, String pass, String Cpass) {
		UtilsClass.SendKeys(firstname, fname);
		UtilsClass.SendKeys(lastname, lname);
		UtilsClass.SendKeys(phone, Monile);
		UtilsClass.SendKeys(username, user);
		UtilsClass.SendKeys(address1, Address);
		UtilsClass.SendKeys(city, City);
		UtilsClass.SendKeys(state, State);
		UtilsClass.SendKeys(postalCode, PostalNo);

		UtilsClass.Country(country, countri);
		UtilsClass.SendKeys(email, Email);
		UtilsClass.SendKeys(password, pass);
		UtilsClass.SendKeys(confirmPassword, Cpass);

		UtilsClass.Click(submit);

		UtilsClass.Click(SingUp);

		UtilsClass.SendKeys(username, Email);
		 //User=username.getText();
		UtilsClass.SendKeys(password, Cpass);
		///String Pass=password.getText();
		UtilsClass.Click(submit);

	}

}
