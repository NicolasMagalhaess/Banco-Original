#Author: nickf.mag@hotmail.com

@tag
Feature: Abertura de Conta
  Eu como usuario quero entrar no site para fazer o cadastro da conta

  @positivo
  Scenario: Solicitacao
    Given que eu entre no site
    And clicar em abrir conta
    When preencho os dados
    Then solicitacao e enviada
