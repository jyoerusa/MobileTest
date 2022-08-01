import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo extends SimpleTest {
	
	public static void main (String args[]) throws MalformedURLException, InterruptedException
	{
	AndroidDriver<AndroidElement> driver =capabilities();
	//Thread.sleep(30000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
	//classname[@attributename='attribute value']
	driver.findElement(By.xpath("//android.widget.TextView[@text='Search']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Invoke Search']")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='io.appium.android.apis:id/txt_query_prefill']")).sendKeys("Jyothi");	
	//get text take text out of it verifying text
	String vtext = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).getText();
	
	System.out.println(vtext);
	
	
	}

	
}

