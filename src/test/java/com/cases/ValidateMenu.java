package com.cases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import com.actions.Actions;
import com.base.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import com.codoid.products.exception.FilloException;
import com.pageObjects.VolvoHomePage;
import com.utils.Utils;

public class ValidateMenu extends Base {
	
	public WebDriver driver;
	public Actions actions;
	
	private Logger log = LogManager.getLogger(ValidateMenu.class.getName());
	private HashMap<String, String> data;

	@BeforeTest
	public void initialize() throws IOException, FilloException {
		
		driver = initializeDriver();
		log.info("Driver is initialized.");
		data = new Utils().getTestData("TC5");
		actions = new Actions(driver);
		
		
	}

	@Test
	public void clickMenu() throws InterruptedException {
		
		VolvoHomePage hp = new VolvoHomePage(driver);
		actions.navigateTo(prop.getProperty("url"));	
		Thread.sleep(5000);
		actions.click(hp.getMenuBtn());
		String actualTitle = hp.aboutVolvo().getText();
		String expectedTitle = data.get("Title");
		
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Successfully validated About Volvo Text");
		

	}


	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}
}
