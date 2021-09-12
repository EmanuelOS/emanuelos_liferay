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
import static resources.Strings.*;


public class TestCaseEmptyFieldsNameBirthReason {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Test
    public void testCaseEmptyFieldsNameBirthReason() throws InterruptedException {
        openForm();
        initialSetup();
        stepOne();
        stepTwo();
        stepThree();
        closeWebDrive();
    }

    private void openForm() {
        driver.get(Strings.formUrl);
    }

    private void initialSetup() {
        enterValidName();
        enterValidDateOfBirth();
    }

    private void enterValidName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathNameField)));
        driver.findElement(By.xpath(Strings.xpathNameField)).sendKeys(Strings.validUserName);
    }

    private void enterValidDateOfBirth() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathDateBirthField)));
        driver.findElement(By.xpath(Strings.xpathDateBirthField)).sendKeys(Keys.HOME);
        driver.findElement(By.xpath(Strings.xpathDateBirthField)).sendKeys(Strings.validDateBirth);
    }

    @Test
    private void stepOne() throws InterruptedException {
        enterValidReason();
    }

    private void enterValidReason() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathReasonField)));
        driver.findElement(By.xpath(xpathReasonField)).sendKeys(validReason);
    }

    private void stepTwo() {
        submitForm();
    }

    private void submitForm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathSubmitForm)));
        driver.findElement(By.xpath(Strings.xpathSubmitForm)).submit();
    }

    private void stepThree() {
        verifyFormSubmitted();
    }

    @Test
    private void verifyFormSubmitted() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathInformationSent)));
        String formSubmitted = driver.findElement(By.xpath(Strings.xpathInformationSent)).getText();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Strings.xpathInformationSentSuccessfully)));
        String formSubmittedSuccessfully = driver.findElement(By.xpath(Strings.xpathInformationSentSuccessfully)).getText();
        verifyAlerts(formSubmitted, formSubmittedSuccessfully);
    }

    @Test
    private void verifyAlerts(String formSubmitted, String formSubmittedSuccessfully) {
        assertEquals(requiredInformationSent, formSubmitted);
        assertEquals(requiredInformationSentSuccessfully, formSubmittedSuccessfully);
    }

    private void closeWebDrive() {
        driver.quit();
    }

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 2000);
        new TestCaseEmptyFieldsNameBirthReason().testCaseEmptyFieldsNameBirthReason();
    }

}
