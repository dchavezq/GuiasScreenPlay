#Author: dmchavez@bancolombia.com.co



Feature: traductor de google
  como usuario quiero ingresar al traductor de google
  a traducir palabras entre diferentes lenguajes

  Scenario: Traducir de Ingles a Espanol
    Given  que Marcela quiere usar el traductor de Google
    When ella traduce la palabra table de Ingles a Español
    Then ella deberia ver la palabra mesa en la pantalla

