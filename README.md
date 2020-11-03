# Quickstart para testes de API Rest com Rest-Assured

Foi utilizada API de simulação de reservasDocumentação da API utilizada para exemplo: <a href="https://restful-booker.herokuapp.com/apidoc/index.html">Booker</a>

<h3>Requisito para rodar o projeto:</h3>
Instalação do Apache Maven e configurção das variáveis de ambiente (Maven Home)
</br>
 - Fazer download do arquivo Binary <a href="https://maven.apache.org/download.cgi">Apache Maven</a></br>
 - Adicionar as variável de ambiente:</br>
   - Adicionar am variáveis do sistema MAVEN_HOME e o caminho de onde ficou a pasta Apache Maven.</br>
   - Adicionar dentro da váriavel Path o caminho da pasta bin do Maven.</br>
- Para verificar se a instação está correta executar no terminal o comando: mvn -v</br>

<h3>Dependências utilizadas no projeto (pasta pom.xml):</h3>

* JUnit - Framework de teste de software <a href="https://junit.org/junit5/">Junit</a> 

* Rest-Assured - Framework para a automatização de teste de API <a href="https://rest-assured.io/">Rest-Assured</a> 

* Hamcrest - Biblioteca para as asserções <a href="http://hamcrest.org/">Hamcrest</a> 

* Json - formato de troca de informações/dados entre sistemas <a href="www.json.org">Json</a> 

<h3>Comando para executar testes no terminal</h3> 

mvn test -Dtest=ReservaTeste
