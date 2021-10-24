$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BuscarAmazonProducto.feature");
formatter.feature({
  "line": 2,
  "name": "Validaciones que se busque un producto en amazons",
  "description": "",
  "id": "validaciones-que-se-busque-un-producto-en-amazons",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2970629300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Seleccionar producto por categoria y ordenado por ascendente los 5 primeros productos de amazons",
  "description": "",
  "id": "validaciones-que-se-busque-un-producto-en-amazons;seleccionar-producto-por-categoria-y-ordenado-por-ascendente-los-5-primeros-productos-de-amazons",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "El usuario ingresa a la pagina de amazons",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "seleccionar la categoria Electronic y Buscar el producto Computers ybOrdenado por ascendente y seleccionar producto",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Y elegir el primer producto",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarProducto.elUsuarioIngresaALaPaginaDeAmazons()"
});
formatter.result({
  "duration": 4451591400,
  "status": "passed"
});
formatter.match({
  "location": "BuscarProducto.seleccionarLaCategoriaElectronicYBuscarElProductoComputersYbOrdenadoPorAscendenteYSeleccionarProducto()"
});
formatter.result({
  "duration": 1491088900,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ci class\u003d\"nav-icon\"\u003e\u003c/i\u003e is not clickable at point (250, 30). Other element would receive the click: \u003cselect aria-describedby\u003d\"searchDropdownDescription\" class\u003d\"nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown\" data-nav-digest\u003d\"eLdESk5hiOGGQnk0N8RQ6jGNNhs\u003d\" data-nav-selected\u003d\"0\" id\u003d\"searchDropdownBox\" name\u003d\"url\" style\u003d\"display: block;\" tabindex\u003d\"0\" title\u003d\"Buscar en\"\u003e...\u003c/select\u003e\n  (Session info: chrome\u003d95.0.4638.54)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-3RPEMLHQ\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.54, chrome: {chromedriverVersion: 95.0.4638.17 (a9d0719444d4b..., userDataDir: C:\\Users\\manue\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50296}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 441ed5c0ff62ae3f52b86adccea266d9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat pageobjects.HomeAmazon.ClickCbxCategoria(HomeAmazon.java:47)\r\n\tat steps.BuscarProducto.seleccionarLaCategoriaElectronicYBuscarElProductoComputersYbOrdenadoPorAscendenteYSeleccionarProducto(BuscarProducto.java:36)\r\n\tat ✽.When seleccionar la categoria Electronic y Buscar el producto Computers ybOrdenado por ascendente y seleccionar producto(BuscarAmazonProducto.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BuscarProducto.yElegirElPrimerProducto()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1425694600,
  "status": "passed"
});
formatter.uri("ValidarLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Validaciones del login del sistema Odoo",
  "description": "Esta funcionalidad validara todos los casos de iniciar sesion",
  "id": "validaciones-del-login-del-sistema-odoo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Valid que el usuario y clave sean incorrectos",
  "description": "",
  "id": "validaciones-del-login-del-sistema-odoo;valid-que-el-usuario-y-clave-sean-incorrectos",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "El usuario ingresa a la pagina de Odoo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Ingresa el usuario \"\u003cusuarios\u003e\" y clave \"\u003cpass\u003e\" y presiona el boton ingresar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verifica que muestra el mensaje \"\u003cMsjEsperado\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "validaciones-del-login-del-sistema-odoo;valid-que-el-usuario-y-clave-sean-incorrectos;",
  "rows": [
    {
      "cells": [
        "usuarios",
        "pass",
        "MsjEsperado"
      ],
      "line": 10,
      "id": "validaciones-del-login-del-sistema-odoo;valid-que-el-usuario-y-clave-sean-incorrectos;;1"
    },
    {
      "cells": [
        "manuel.ruiz.chacchi@gmail.com",
        "prueba",
        "Wrong login/password"
      ],
      "line": 11,
      "id": "validaciones-del-login-del-sistema-odoo;valid-que-el-usuario-y-clave-sean-incorrectos;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1398534200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Valid que el usuario y clave sean incorrectos",
  "description": "",
  "id": "validaciones-del-login-del-sistema-odoo;valid-que-el-usuario-y-clave-sean-incorrectos;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "El usuario ingresa a la pagina de Odoo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Ingresa el usuario \"manuel.ruiz.chacchi@gmail.com\" y clave \"prueba\" y presiona el boton ingresar",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verifica que muestra el mensaje \"Wrong login/password\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 679390400,
  "status": "passed"
});
});