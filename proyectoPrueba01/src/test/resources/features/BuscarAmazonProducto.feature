@regression
  Feature: Validaciones que se busque un producto en amazons

    Scenario: Seleccionar producto por categoria y ordenado por ascendente los 5 primeros productos de amazons
      Given El usuario ingresa a la pagina de amazons
      When seleccionar la categoria Electronic y Buscar el producto Computers ybOrdenado por ascendente y seleccionar producto
      Then Y elegir el primer producto
