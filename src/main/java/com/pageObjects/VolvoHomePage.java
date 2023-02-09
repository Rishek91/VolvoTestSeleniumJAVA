package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VolvoHomePage {
	
	public WebDriver driver;
	
	public VolvoHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here
	private By pagetitle = By.xpath("//button[@id='nav:topNavCarMenu']");
	//private By menuBtn = By.cssSelector("a[id='menu-toggle']");
	private By menuBtn = By.xpath("//em[@class='_SN-cs _SN-eg _SN-eh _SN-ei _SN-ek _SN-em _SN-en _SN-ep _SN-er _SN-es _SN-eu _SN-ew _SN-ex _SN-ez _SN-fb _SN-ge _SN-i _SN-is _SN-it _SN-iu _SN-iv _SN-iw _SN-ix _SN-kj _SN-kk _SN-kl']");
	private By aboutvolvo = By.xpath("//em[contains(text(),'About Volvo')]");
	private By login = By.cssSelector("a[href*='login']");
	private By title = By.cssSelector("h1");
	private By footer = By.cssSelector("footer");
	private By AcceptAlert =By.xpath("//button[@id='onetrust-accept-btn-handler']");
	
	
	
	// All methods should be defined here
	public WebElement getMenuBtn() {
		return driver.findElement(menuBtn);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement aboutVolvo() {
		return driver.findElement(aboutvolvo);
	}
	
	public WebElement getTitle() {
		return driver.findElement(pagetitle);
	}
	
	public WebElement getFooter() {
		return driver.findElement(footer);
	}
	public WebElement AcceptOKAlert() {
		return driver.findElement(AcceptAlert);
	}

}
