package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	WebDriver driver;

	public void abrirWebSite(String appUrl, String descrisao) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void clico_no_botao_minha_conta(String valor) {
		driver.findElement(By.xpath(valor)).click();
	}

	public void preencho_usuario(String dado, String caminho) {
		driver.findElement(By.xpath(caminho)).sendKeys(dado);
	}

	public void preencho_senha(String dado, String caminho) {
		driver.findElement(By.xpath(caminho)).sendKeys(dado);
//testanto git
	}
	
	public void clico_em_acessar(String valor) {
		driver.findElement(By.xpath(valor)).click();
	}

	public void waitUntil() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}

	public void fecharWebSite() {
		driver.quit();
	}

	public void salvascreenShot(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./ScreenShots/" + fileName + ".png"));

		try {
		} catch (AssertionError e) {
			String message = e.getMessage();
			// do whatever you want with e
			System.out.println(message);
		}
	}
}