# MBA FIAP - 50ASO: Microcontainers
## Trabalho final - Professor José Castillo Lema

### Utilização da API: 

1º Fazer o clone do Para baixar a  
=> git clone https://github.com/ewertonvd/microcontainers-api-java-mysql.git


2º Criar um diretório local para sincronizar com o BD do container:
=> Exemplo "C:\tmp\db\mysql"

OBS: Caso o diretório criado seja diferente do citado no exemplo,
editar o arquivo ".env", que fica no raiz do projeto "microcontainers-api-java-mysql"
Alteração: nano .env
Ctrl + X para salvar 


3º - Entrar no diretório "microcontainers"
=> cd microcontainers

*E Fazer o build da aplicação, executando o comando:
=> mvn clean install  -Dmaven.test.skip=true 


5º Fazer o build do container:
=> docker build -t microcontainers .

6º Voltar um nível
=> cd ..
E subir o container, com o comando:
=> docker-compose up


7º Fazer as chamadas à API, utilizando o postman:

GET => http://localhost:4000
*Deve retornar a mensagem: Bem vindo a API Java com acesso ao BD MySQL - FIAP 50ASO: Microcontainers


GET => http://localhost:alunos
*Deve retornar uma lista com quatro alunos (rm, nome e email)

http://localhost:4000/alunos

----------------------------------------------------------------------------------------------------------- 
## SEGUNDA parte do trabalho - Docker Swarm:

A imagem foi disponibilizada no DockerHub através do link abaixo:

=> https://hub.docker.com/repository/docker/ewertonvd/api-java-mysql

1º Criar duas instâncias (Manager e Worker)

2º Realizar os passos do Lab4
=> https://github.com/josecastillolema/fiap/blob/master/bdt/microservices/lab04-docker-swarm.md 

3º Realizar os testes de chamada da api, via terminal utilizando "curl":

=> curl localhost:4000

e

=> curl localhost:4000/alunos

### Aluno: Ewerton Vieira Donati - RM: 342011