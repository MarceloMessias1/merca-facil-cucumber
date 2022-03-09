#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Minha Conta mercafacil	
  Como usuário quero confirmar acesso invalido
  
  Background:
    Given que eu esteja no site "https://mercafacil.com/" 

  Scenario: minha conta
    When clico no botao minha conta
    And  preencho usuario
    And  preencho senha
    And  clico em acessar
    Then usuario invalido
