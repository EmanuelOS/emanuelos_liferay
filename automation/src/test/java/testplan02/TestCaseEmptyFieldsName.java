package testplan02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.Strings;

import static org.junit.Assert.assertEquals;


public class TestCaseEmptyFieldsName {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 2000);
        new TestCaseEmptyFieldsName().testCaseEmptyFieldsName();
    }

    @Test
    public void testCaseEmptyFieldsName() {
        openForm();
        stepOne();
        stepTwo();
        StepThree();
        closeWebDrive();
    }

    private void openForm() {
        driver.get(Strings.formUrl);
    }

    @Test
    private void stepOne() {
        enterValidName();
    }

    private void enterValidName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathNameField)));
        driver.findElement(By.xpath(Strings.xpathNameField)).sendKeys(Strings.validUserName);
    }

    private void stepTwo() {
        submitForm();
    }

    private void submitForm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathSubmitForm)));
        WebElement submitButton = driver.findElement(By.xpath(Strings.xpathSubmitForm));
        submitButton.submit();
    }

    private void StepThree() {
        needRequiredFields();
    }

    @Test
    private void needRequiredFields() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathDateBirthFieldRequired)));
        String dateBirthRequired = driver.findElement(By.xpath(Strings.xpathDateBirthFieldRequired)).getText();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathReasonsFieldRequired)));
        String reasonsRequired = driver.findElement(By.xpath(Strings.xpathReasonsFieldRequired)).getText();
        verifyAlerts(dateBirthRequired, reasonsRequired);
    }

    @Test
    private void verifyAlerts(String dateBirthRequired, String reasonsRequired) {
        assertEquals(Strings.requiredFieldEnUs, dateBirthRequired);
        assertEquals(Strings.requiredFieldEnUs, reasonsRequired);
    }

    private void closeWebDrive() {
        driver.quit();
    }

}
