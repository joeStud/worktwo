package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calculadoraPage {


    private AndroidDriver dvr;
    private WebDriverWait wait;

    @AndroidFindBy(xpath = "//*[@text='INTERÉS SIMPLE']")
    protected static AndroidElement btnSimple;
    @AndroidFindBy(xpath = "//*[@text='Valor Actual:']/following-sibling::android.view.View/android.widget.EditText")
    protected static AndroidElement txtValorActual;
    @AndroidFindBy(xpath = "//*[@text='Tasa de Interés:']/following-sibling::android.view.View/android.widget.EditText")
    protected static AndroidElement txtInteresActual;
    @AndroidFindBy(xpath = "//*[@text='Periodo:']/following-sibling::android.view.View/android.widget.EditText")
    protected static AndroidElement txtPeriodo;
    @AndroidFindBy(xpath = "//*[@text='CALCULAR']")
    protected static AndroidElement btnCalcular;
    @AndroidFindBy(xpath = "//*[@text='INTERÉS COMPUESTO']")
    protected static AndroidElement btnCompuesto;

    public calculadoraPage(AndroidDriver driver) {
        dvr = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, 30);
    }

    public void clickInteresSimple() {
        wait.until(ExpectedConditions.elementToBeClickable(btnSimple));
        btnSimple.click();
    }

    public void ingresarValorActual(String texto) {
        wait.until(ExpectedConditions.visibilityOf(txtValorActual));
        txtValorActual.setValue(texto);
    }

    public void ingresarInteresActual(String texto) {
        wait.until(ExpectedConditions.visibilityOf(txtInteresActual));
        txtInteresActual.setValue(texto);
    }

    public void ingresarPeriodo(String periodo) {
        wait.until(ExpectedConditions.visibilityOf(txtPeriodo));
        txtPeriodo.setValue(periodo);
    }

    public void clickCalcular() {
        wait.until(ExpectedConditions.visibilityOf(btnCalcular));
        btnCalcular.click();
    }

    public void clickInteresCompuesto() {
        btnCompuesto.click();
    }


}
