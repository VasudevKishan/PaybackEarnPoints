package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.*;
import java.util.*;

public class BaseWebDriver {
	private static final ThreadLocal<String> currentScenario = new ThreadLocal<>();
	public WebDriver webDriver;
	private Properties prop;

	public static void setCurrentScenario(String currentScenario) {
		BaseWebDriver.currentScenario.set(currentScenario);
	}

	public static String getCurrentScenario() {
		return currentScenario.get();
	}

	public void initializeWebDriver() {
		prop = new Properties();
		// File file= new File(System.getProperty("user.dir") +
		// System.getProperty("file.seperator") + "Resources");
		FileInputStream fis;
		String fileSeparator = System.getProperty("file.separator");
		try {
//			fis = new FileInputStream(
//					new File("C:\\Users\\VASUDM\\eclipse-workspace\\Payback2\\Resources\\data.properties"));
//			
			//System.out.println(System.getProperty("user.dir") + fileSeparator + "Resources" + "data.properties");
			
			fis = new FileInputStream(new File(System.getProperty("user.dir") + fileSeparator + "Resources" + fileSeparator + "data.properties"));
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Properties not found");
		}

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + fileSeparator + "Resources" + fileSeparator + "chromedriver.exe");
			webDriver = new ChromeDriver(options);
		} else if (browserName.equals("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + fileSeparator + "Resources" + fileSeparator + "msedgedriver.exe");
			webDriver = new EdgeDriver(options);
		}

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\VASUDM\\Documents\\selenium\\chromedriver.exe");

		// webDriver=new EdgeDriver(options);
		webDriver.manage().window().maximize();
	}

	public void closeAllBrowserWindows() {
		webDriver.quit();
	}
}
