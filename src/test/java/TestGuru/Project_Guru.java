package TestGuru;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Project_Guru {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void launchBrowser() {
        // Set the correct system property key and the path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\Chrome Driver_Sel\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Configure explicit wait (adjust timeout as needed)
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 0)
    public void openGuru() {
        driver.get("https://demo.guru99.com/telecom/index.html");
    }

    @Test(priority = 1)
    public void clickSelenium() {
        WebElement seleniumLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[1]/a")));
        seleniumLink.click();
    }

    @Test(priority = 2)
    public void clickInsurance() {
        WebElement insuranceLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[2]/a")));
        insuranceLink.click();
    }

    @Test(priority = 3)
    public void clickAgile() {
        WebElement agileLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[4]/a")));
        agileLink.click();
    }

    @Test(priority = 4)
    public void clickBank() {
        WebElement bankLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[5]/a")));
        bankLink.click();
    }

    @Test(priority = 5)
    public void clickSecurity() {
        WebElement securityLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[6]/a")));
        securityLink.click();
    }

    @Test(priority = 6)
    public void clickTelecom() {
        WebElement telecomLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[8]/a")));
        telecomLink.click();
    }

    @Test(priority = 7)
    public void clickPayment() {
        WebElement paymentLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[7]/a")));
        paymentLink.click();
    }

    @Test(priority = 8)
    public void clickNewtours() {
        WebElement newtoursLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[10]/a")));
        newtoursLink.click();
    }

    @Test(priority = 9)
    public void clickSEO() {
        WebElement seoLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[11]/a")));
        seoLink.click();
    }

    @Test(priority = 10)
    public void tc16() {
        // Click Telecom from navbar
        WebElement telecomLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[8]/a")));
        telecomLink.click();

        // Click Add Customer from navbar
        WebElement addCustomerLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[6]/a")));
        addCustomerLink.click();

        // Click the "Add Customer" link in main section
        WebElement addCustomerMain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='one']/div/div[1]/div[1]/h3/a")));
        addCustomerMain.click();

        // Select the "Done" radio button
        WebElement doneRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[1]/label")));
        doneRadio.click();

        // Select the "Pending" radio button (if needed)
        WebElement pendingRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[2]/label")));
        pendingRadio.click();
    }

    @Test(priority = 11)
    public void resetCustomerForm() {
        // Select "Done" radio button
        WebElement doneRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[1]/label")));
        doneRadio.click();

        // Fill in the customer form fields
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fname']")));
        firstName.clear();
        firstName.sendKeys("Sanjay");

        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lname']")));
        lastName.clear();
        lastName.sendKeys("Ramaswamy");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email']")));
        email.clear();
        email.sendKeys("Sanjay@gmail.com");

        // Scroll down if necessary
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");

        WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("addr")));
        address.clear();
        address.sendKeys("Sanjay house kollam munroe 695339");

        WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='telephoneno']")));
        phoneNumber.clear();
        phoneNumber.sendKeys("9956596941");

        // Click the Reset button for the customer form
        WebElement resetButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[9]/ul/li[2]/input")));
        resetButton.click();
    }

    @Test(priority = 12)
    public void submitCustomerForm() {
        // Select "Done" radio button
        WebElement doneRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[1]/label")));
        doneRadio.click();

        // Fill in the customer form fields
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fname']")));
        firstName.clear();
        firstName.sendKeys("Sanjay");

        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lname']")));
        lastName.clear();
        lastName.sendKeys("Ramaswamy");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email']")));
        email.clear();
        email.sendKeys("Sanjay@gmail.com");

        WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("addr")));
        address.clear();
        address.sendKeys("Sanjay house kollam munroe 695339");

        WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='telephoneno']")));
        phoneNumber.clear();
        phoneNumber.sendKeys("9956596941");

        // Click the Submit button for the customer form
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[9]/ul/li[1]/input")));
        submitButton.click();
    }

    @Test(priority = 13)
    public void goHome() {
        WebElement homeLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div/ul/li/a")));
        homeLink.click();
    }

    @Test(priority = 14)
    public void addTariffPlanReset() {
        // Navigate to tariff plan section via navbar if necessary
        WebElement telecomLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar-brand-centered']/ul/li[6]/a")));
        telecomLink.click();

        // Click "Add Tariff Plan"
        WebElement addTariffPlan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='one']/div/div[3]/div[1]/h3/a")));
        addTariffPlan.click();

        // Fill in tariff plan fields
        WebElement monthlyRent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rental1']")));
        monthlyRent.clear();
        monthlyRent.sendKeys("50");

        WebElement freeLocal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='local_minutes']")));
        freeLocal.clear();
        freeLocal.sendKeys("100");

        WebElement freeIntMinutes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inter_minutes']")));
        freeIntMinutes.clear();
        freeIntMinutes.sendKeys("160");

        WebElement smsPack = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sms_pack']")));
        smsPack.clear();
        smsPack.sendKeys("300");

        WebElement localPerMinCharge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='minutes_charges']")));
        localPerMinCharge.clear();
        localPerMinCharge.sendKeys("20");

        WebElement intPerMinCharge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inter_charges']")));
        intPerMinCharge.clear();
        intPerMinCharge.sendKeys("6");

        WebElement smsCharge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sms_charges']")));
        smsCharge.clear();
        smsCharge.sendKeys("1");

        // Click the Reset button for tariff plan
        WebElement resetButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[36]/ul/li[2]/input")));
        resetButton.click();
    }

    @Test(priority = 15)
    public void submitTariffPlan() {
        // Click "Add Tariff Plan" again if needed
        WebElement addTariffPlan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='one']/div/div[3]/div[1]/h3/a")));
        addTariffPlan.click();

        // Fill in tariff plan fields again
        WebElement monthlyRent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rental1']")));
        monthlyRent.clear();
        monthlyRent.sendKeys("50");

        WebElement freeLocal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='local_minutes']")));
        freeLocal.clear();
        freeLocal.sendKeys("100");

        WebElement freeIntMinutes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inter_minutes']")));
        freeIntMinutes.clear();
        freeIntMinutes.sendKeys("160");

        WebElement smsPack = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sms_pack']")));
        smsPack.clear();
        smsPack.sendKeys("300");

        WebElement localPerMinCharge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='minutes_charges']")));
        localPerMinCharge.clear();
        localPerMinCharge.sendKeys("20");

        WebElement intPerMinCharge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inter_charges']")));
        intPerMinCharge.clear();
        intPerMinCharge.sendKeys("6");

        WebElement smsCharge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sms_charges']")));
        smsCharge.clear();
        smsCharge.sendKeys("1");

        // Click the Submit button for tariff plan
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[36]/ul/li[1]/input")));
        submitButton.click();

        // Return home after submission
        WebElement homeLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/ul/li/a")));
        homeLink.click();
    }

    @Test(priority = 16)
    public void addTariffToCustomer() {
        // Click the "Add Tariff to Customer" link
        WebElement tariffLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='one']/div/div[1]/div[2]/h3/a")));
        tariffLink.click();

        // Enter the customer ID (using By.id with the actual id value)
        WebElement customerIdField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_id")));
        customerIdField.clear();
        customerIdField.sendKeys("635622");

        // Click the submit button for tariff addition
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[6]/input")));
        submitButton.click();

        // Click the proceed/confirm button if present
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div[2]/input")));
        proceedButton.click();

        // Navigate home
        WebElement homeLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/ul/li/a")));
        homeLink.click();
    }

    @Test(priority = 17)
    public void payBilling() {
        // Click the "Pay Billing" link
        WebElement payBillingLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='one']/div/div[3]/div[2]/h3/a")));
        payBillingLink.click();

        // Enter the customer ID for billing
        WebElement customerIdField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='customer_id']")));
        customerIdField.clear();
        customerIdField.sendKeys("635622");

        // Click the submit button for billing
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/form/div/div[6]/input")));
        submitButton.click();
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
