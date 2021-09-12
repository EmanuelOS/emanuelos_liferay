package testplan02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.Strings;

import static org.junit.Assert.assertEquals;


public class TestCaseEmptyFieldsNameBirth {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 2000);
        new TestCaseEmptyFieldsNameBirth().testCaseEmptyFieldsNameBirth();
    }

    @Test
    public void testCaseEmptyFieldsNameBirth() {
        openForm();
        initialSetup();
        stepOne();
        stepTwo();
        stepThree();
        closeWebDrive();
    }

    private void initialSetup() {
        enterValidName();
    }

    private void enterValidName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathNameField)));
        driver.findElement(By.xpath(Strings.xpathNameField)).sendKeys(Strings.validUserName);
    }

    private void openForm() {
        driver.get(Strings.formUrl);
    }

    @Test
    private void stepOne() {
        enterValidDateOfBirth();
    }

    private void enterValidDateOfBirth() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathDateBirthField)));
        driver.findElement(By.xpath(Strings.xpathDateBirthField)).sendKeys(Keys.HOME);
        driver.findElement(By.xpath(Strings.xpathDateBirthField)).sendKeys(Strings.validDateBirth);
    }

    private void stepTwo() {
        submitForm();
    }

    private void submitForm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathSubmitForm)));
        driver.findElement(By.xpath(Strings.xpathSubmitForm)).submit();
    }

    private void stepThree() {
        needRequiredFields();
    }

    @Test
    private void needRequiredFields() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathReasonsFieldRequired)));
        String reasonsRequired = driver.findElement(By.xpath(Strings.xpathReasonsFieldRequired)).getText();
        verifyAlerts(reasonsRequired);
    }

    @Test
    private void verifyAlerts(String reasonsRequired) {
        assertEquals(Strings.requiredFieldEnUs, reasonsRequired);
    }

    private void closeWebDrive() {
        driver.quit();
    }

}
