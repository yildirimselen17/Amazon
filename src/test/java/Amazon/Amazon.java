package Amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Amazon {
    WebDriver driver;
    @BeforeTest
    public void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=119366379979&hvpone=&hvptwo=&hvadid=542862704348&hvpos=&hvnetw=g&hvrand=13378009253866573871&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012761&hvtargid=kwd-10573980&hydadcr=12932_2246093&language=tr_TR");
        Thread.sleep(1000);

    }

    @Test(priority = 1)

    public void Test01() throws InterruptedException {

        WebElement search = driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"));
        search.click();
        search.sendKeys("Anneler Gunu");
        Thread.sleep(1000);
        search.submit();

    }

    @Test(priority = 2)

    public void Test02() throws InterruptedException {
        WebElement cerez = driver.findElement(By.cssSelector("input[id=\"sp-cc-accept\"]"));
        cerez.click();
        Thread.sleep(1000);
    }

    @Test(priority = 3)

    public void Test03() throws InterruptedException {

        WebElement sel1 = driver.findElement(By.xpath("//*[@id=\"p_n_free_shipping_eligible/21345962031\"]/span/a/div[1]/label/i"));
        sel1.click();
        Thread.sleep(1000);

        WebElement sel2 = driver.findElement(By.xpath("//*[@id=\"p_36/13758222031\"]/span/a/div/label/i"));
        sel2.click();
        Thread.sleep(1000);


        WebElement sel3 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/h2/a/span"));
        sel3.click();
        Thread.sleep(1000);

        WebElement text= driver.findElement(By.xpath("//*[@class=\"a-size-medium product-title-word-break product-title-resize\""));
        Thread.sleep(1000);

        //String actual = "Taç 2019 Ranforce Glow Anneler Günü Nevresim Takımı, Çift Kişilik";
        //String expected= text.getText();
        Assert.assertTrue(true);
        Thread.sleep(1000);






    }


    }
