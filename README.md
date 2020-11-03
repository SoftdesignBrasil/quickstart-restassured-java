# Quickstart para testes de API Rest com Rest-Assured

Foi utilizada API de simulação de reservasDocumentação da API utilizada para exemplo: <a href="https://restful-booker.herokuapp.com/apidoc/index.html">Booker</a>

Instalação do Apache Maven e configurção das variáveis de ambiente (Maven Home)
<a href="https://maven.apache.org/download.cgi">Apache Maven</a>

<h3>Dependências do projeto:</h3>

* JUnit - Framework de teste de software <a href="https://junit.org/junit5/">Junit</a> 

* Rest-Assured - Framework para a automatização de teste de API <a href="https://rest-assured.io/">Rest-Assured</a> 

* Hamcrest - Biblioteca para as asserções <a href="http://hamcrest.org/">Hamcrest</a> 

* Json - formato de troca de informações/dados entre sistemas <a href="www.json.org">Json</a> 

<h3>Comando para executar testes no terminal</h3> 

mvn test -Dtest=ReservaTeste
