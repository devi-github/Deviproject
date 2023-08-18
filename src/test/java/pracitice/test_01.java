package pracitice;

import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class test_01 {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver x=new ChromeDriver();
	  x.get("http://www.google.co.in");
	  Thread.sleep(50000);
	  x.close();
		}

	}


