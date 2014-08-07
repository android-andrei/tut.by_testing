package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Login extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.sign_in();
		logger.step(3);
		home_page.enter_login("andrei.internet");
		logger.step(4);
		home_page.enter_password("9664069");
		logger.step(5);
		home_page.sign_in_btn();
		logger.step(6);
		home_page.signAssert("Андрей Пульша");
		logger.step(7);
	}

}
