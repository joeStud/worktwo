package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.calculadoraPage;

public class calcularDefinition {

    calculadoraPage calcular;

    public calcularDefinition() {
        calcular = new calculadoraPage(Hooks.driver);
    }

    @Given("que debe ingresa a la opcion de interes")
    public void queDebeIngresaALaOpcionDeInteres() {
        calcular.clickInteresSimple();
    }


    @And("se ingresa el valor actual {string}")
    public void seIngresaElValorActual(String vactual) {
        calcular.ingresarValorActual(vactual);
    }

    @And("se ingresa la tasa de interes {string}")
    public void seIngresaLaTasaDeInteres(String tinteres) {
        calcular.ingresarInteresActual(tinteres);
    }

    @And("se ingresa el periodo {string}")
    public void seIngresaElPeriodo(String periodo) {
        calcular.ingresarPeriodo(periodo);
    }

    @When("se ingrese todos los campos ingresar al app")
    public void seIngreseTodosLosCamposIngresarAlApp() {
        calcular.clickCalcular();
    }
}
