package br.main.code;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContentDriver {

	static WebDriver driver;
	static String Url = "https://www.google.com.br/";

	@Before
	public void beforePage() {
		driver = new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();

	}

	@After
	public void afterPage() {
		driver.close();

	}

	// Metodos get para envio de informações
	public static WebDriver getDriver() {
		return driver;
	}

	public static String getUrl() {
		return Url;
	}

}
