package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRCTCPage {
	
	
    //declaration
	@FindBy(xpath = "//a[.=' BUSES ']")
	private WebElement busesLink;
	
	@FindBy(xpath = "//input[@id='departFrom']")
	private WebElement departure;
	
	@FindBy(xpath = "//input[@id='goingTo']")
	private WebElement goingTo;
	
	@FindBy(xpath = "//input[@id='departDate']")
	private WebElement departureDate;
	
	@FindBy(xpath = "//button[.='Search Bus ']")
	private WebElement searchBus;
	
	@FindBy(xpath = "//h4[.='Departure Time']/ancestor::div[@class='heading-02-wrap']//label[.='After 6 pm']")
	private WebElement depAfter6pm;
	
	//initialization
	public IRCTCPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//utilization
	public WebElement getBusesLink() {
		return busesLink;
	}

	public WebElement getDepAfter6pm() {
		return depAfter6pm;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getGoingTo() {
		return goingTo;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getSearchBus() {
		return searchBus;
	}
	
	//businessLogic
	public void clickBusesLink()
	{
		busesLink.click();
	}
	
	
	
}
