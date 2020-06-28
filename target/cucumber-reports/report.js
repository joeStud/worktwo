$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/interes.feature");
formatter.feature({
  "name": "Calculando el interes Simple",
  "description": "    calcular los interes simples o compuestos",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@calcular"
    }
  ]
});
formatter.scenario({
  "name": "Calcular el interes simple",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calcular"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que debe ingresa a la opcion de interes",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.calcularDefinition.queDebeIngresaALaOpcionDeInteres()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa el valor actual \"1000\"",
  "keyword": "And "
});
formatter.match({
  "location": "definitions.calcularDefinition.seIngresaElValorActual(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa la tasa de interes \"10\"",
  "keyword": "And "
});
formatter.match({
  "location": "definitions.calcularDefinition.seIngresaLaTasaDeInteres(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa el periodo \"12\"",
  "keyword": "And "
});
formatter.match({
  "location": "definitions.calcularDefinition.seIngresaElPeriodo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingrese todos los campos ingresar al app",
  "keyword": "When "
});
formatter.match({
  "location": "definitions.calcularDefinition.seIngreseTodosLosCamposIngresarAlApp()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});