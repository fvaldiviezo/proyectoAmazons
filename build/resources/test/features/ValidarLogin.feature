@regression
  Feature: Validaciones del login del sistema Odoo
    Esta funcionalidad validara todos los casos de iniciar sesion

    Scenario Outline: Valid que el usuario y clave sean incorrectos
      Given El usuario ingresa a la pagina de Odoo
      When Ingresa el usuario "<usuarios>" y clave "<pass>" y presiona el boton ingresar
      Then Verifica que muestra el mensaje "<MsjEsperado>"
      Examples:
        | usuarios                      | pass  | MsjEsperado           |
        | manuel.ruiz.chacchi@gmail.com | prueba | Wrong login/password |
