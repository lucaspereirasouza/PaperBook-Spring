# Paperbook [Em progresso]
## Aplicação de cadastro de categoria fullstack com Springboot (Com utilização de docker)

Conteudo necessarios:
SpringToolSuite para eclipse [Fundamental]
Docker/Docker Desktop [Recomendado a versão desktop]


é necessario a instalação do docker MySQL para a conexão do springboot com o banco de dados

comando para executar: <br>
docker run --name MySQLSpringBoot -e MYSQL_ROOT_PASSWORD=123@senac -p 3306:3306 -d mysql:latest
listar todos os containers:
-a, --all Show all containers
Docker ps -a

## Importação de data (Os arquivos estão no diretório /BancoDeDados/ )
![Importação de data](/imgREADME/DataImport.png)
![Importação de data parte 2:](/imgREADME/DataImport2.png)

## Diagrama
![Diagrama do banco](/imgREADME/DiagramaBanco.png)

#### Caso voce tenha a versão desktop, utilize o arquivo MAKE localizado [Em progresso...]

## Spring boot suite
após a instalação do spring boot suite para eclipse importe o arquivo e configure o application.properties localizado em /src/main/resources/
![Application.Properties](/imgREADME/applicationproperties)
