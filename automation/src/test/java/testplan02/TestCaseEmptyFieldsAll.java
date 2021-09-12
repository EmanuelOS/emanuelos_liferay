package testplan02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.Strings;

import static org.junit.Assert.assertEquals;
import static resources.Strings.requiredFieldEnUs;


public class TestCaseEmptyFieldsAll {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 2000);
        new TestCaseEmptyFieldsAll().testCaseEmptyFieldsAll();
    }

    @Test
    public void testCaseEmptyFieldsAll() {
        openForm();
        stepOne();
        closeWebDrive();
    }

    private void openForm() {
        driver.get(Strings.formUrl);
    }

    @Test
    private void stepOne() {
        submitForm();
        needRequiredFields();
    }

    private void submitForm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathSubmitForm)));
        driver.findElement(By.xpath(Strings.xpathSubmitForm)).submit();
    }

    @Test
    private void needRequiredFields() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathNameFieldRequired)));
        String nameRequired = driver.findElement(By.xpath(Strings.xpathNameFieldRequired)).getText();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathDateBirthFieldRequired)));
        String dateBirthRequired = driver.findElement(By.xpath(Strings.xpathDateBirthFieldRequired)).getText();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathReasonsFieldRequired)));
        String reasonsRequired = driver.findElement(By.xpath(Strings.xpathReasonsFieldRequired)).getText();
        verifyAlerts(nameRequired, dateBirthRequired, reasonsRequired);
    }

    @Test
    public void verifyAlerts(String nameRequired, String dateBirthRequired, String reasonsRequired) {
        assertEquals(requiredFieldEnUs, nameRequired);
        assertEquals(requiredFieldEnUs, dateBirthRequired);
        assertEquals(requiredFieldEnUs, reasonsRequired);
    }

    private void closeWebDrive() {
        driver.quit();
    }

}
