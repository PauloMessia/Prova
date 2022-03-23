#Author: paulo.messias@paulo.messias.com.br

Feature:  Atualizar Cadastro
  Eu como usuario quero acessar o site para atualizar cadastro
 

 
  Scenario: Entrar no site da empresa
    Given  que eu esteja no site da empresa 
  
    When preencher os dados 
 
    Then visualizo as informacoes