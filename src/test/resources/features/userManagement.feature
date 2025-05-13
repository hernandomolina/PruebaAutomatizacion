Feature: Administracion de usuarios en DemoQA

  Scenario: Buscar usuario por nombre
    Given que el usuario abre la página de web tables
    When escribe un nombre valido
    Then el registro se filtra en la tabla

  Scenario: Editar usuario existente
    Given que el usuario abre la página de web tables
    When el usuario hace clic en el botón edit
    And modifica el campo a editar en el registro
    And hace clic en Submit despues de editar
    Then el registro debe modificarse en la tabla

  Scenario: Eliminar un usuario de la tabla
    Given que el usuario abre la página de web tables
    When el usuario hace clic en el botón Delete
    Then el usuario debe desaparecer en la tabla





