
    Sistema de Gerenciamento de Brinquedos
   O Sistema de Gerenciamento de Brinquedos é uma aplicação desenvolvida para uma empresa de brinquedos voltada para crianças até 12 anos. O objetivo do sistema é permitir o cadastro, consulta, atualização e exclusão de brinquedos através de uma interface web,     utilizando o framework Spring Boot e o banco de dados Oracle.

    
    
        RM 98660 - Leonardo Valentim de Souza
        RM 97714 - João Victor Leite Firmino
        RM 99618 - Gustavo dos Santos Correa
        RM 551201 - Lucas Cazzaro
        RM 99219 - Ronaldo Riyudi Noda
        
    

    Configuração do Spring Initializr
    Configuração utilizada para iniciar o projeto no Spring Initializr:


    Dependências
    
        Spring Web
        Spring Data JPA
        Oracle Driver
        Spring Boot DevTools
    

    Banco de Dados
    <p>O sistema utiliza o banco de dados Oracle para armazenar informações sobre os brinquedos. A configuração de acesso ao banco é feita através do arquivo <code>application.properties</code>.</p>

    Endpoints
    GET https://app-240822204808.azurewebsites.net/brinquedos/4
    etorna todos os brinquedos cadastrados no sistema.
    Exemplo de resposta:</p>
![image](https://github.com/user-attachments/assets/330ca27e-75c6-4d93-b977-5b7285372e17)

    POST /brinquedos/adicionar
    Cadastra um novo brinquedo no sistema.
    Exemplo de requisição:
    
    {
        "nome": "Bola de basquete",
        "tipo": "Esportivo",
        "classificacao": "Infantil",
        "tamanho": "Médio",
        "preco": 45
    }
![image](https://github.com/user-attachments/assets/1fa602aa-0248-4449-8d48-80f244da0177)

   
   

    PUT /brinquedos/atualizar/{id}
    Atualiza as informações de um brinquedo existente
    Exemplo de requisição
    <code>
    {
        "nome": "Boneca de Pano",
        "tipo": "Brinquedo de Pano",
        "classificacao": "3+",
        "tamanho": "Pequeno",
        "preco": 59.99
    }
  ![image](https://github.com/user-attachments/assets/3c572c3b-b192-4763-a561-08e103ab1a6d)

![image](https://github.com/user-attachments/assets/ebcfec3e-908b-403e-982e-fcdfa2575e44)


    DELETE /brinquedos/excluir/{id}
    exclui um brinquedo do sistema pelo seu ID
![image](https://github.com/user-attachments/assets/6a9bff16-5c5f-4b04-9da1-0b8bbfa1e348)

    Execução do Projeto
  
        Clone o repositório do projeto.</li>
        Importe o projeto em sua IDE preferida (IntelliJ, Eclipse ou NetBeans).
        Atualize as dependências Maven, se necessário.
        Configure o banco de dados Oracle conforme as instruções.
        Execute o projeto.
        Utilize os endpoints listados acima para interagir com a API via Postman.
![image](https://github.com/user-attachments/assets/ff194965-b035-47e1-b68a-12aa6345f3da)

