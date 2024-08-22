
<div class="container">
    <h1>Sistema de Gerenciamento de Brinquedos</h1>
    <p>O Sistema de Gerenciamento de Brinquedos é uma aplicação desenvolvida para uma empresa de brinquedos voltada para crianças até 12 anos. O objetivo do sistema é permitir o cadastro, consulta, atualização e exclusão de brinquedos através de uma interface web, utilizando o framework Spring Boot e o banco de dados Oracle.</p>

<h2>Equipe</h2>
<ul>
    <li>RM 98660 - Leonardo Valentim de Souza</li>
    <li>RM 97714 - João Victor Leite Firmino</li>
    <li>RM 99618 - Gustavo dos Santos Correa</li>
    <li>RM 551201 - Lucas Cazzaro</li>
    <li>RM 99219 - Ronaldo Riyudi Noda</li>
    <li>RM 99985 - Felipe Batista Gregorio</li>
</ul>

<h2>Configuração do Spring Initializr</h2>
<img src="https://github.com/gustavo-specxx/javaCheckpoint2/assets/117688531/cb2aa541-53ec-4fac-b49c-740fc8b9d72c.png" alt="Configuração do Spring Initializr">

<h2>Dependências</h2>
<ul>
    <li>Spring Web</li>
    <li>Spring Data JPA</li>
    <li>Oracle Driver</li>
    <li>Spring Boot DevTools</li>
</ul>

<h2>Banco de Dados</h2>
<p>O sistema utiliza o banco de dados Oracle para armazenar informações sobre os brinquedos. A configuração de acesso ao banco é feita através do arquivo <code>application.properties</code>.</p>
iniciar o projeto e abrir a azure
![image](https://github.com/user-attachments/assets/f3c24a38-3d93-4c87-97cc-31ccaf7a85c9)
clicar no link
abre a seguinte pagina
![image](https://github.com/user-attachments/assets/9b4825b3-559a-4703-8c68-7faf592c83a9)


<h2>Endpoints</h2>
<h3>GET https://app-java4.azurewebsites.net/brinquedos </h3>
<p>Retorna todos os brinquedos cadastrados no sistema.</p>
<img src="![image](https://github.com/user-attachments/assets/c4fc19d1-6661-4aa5-b150-bcfdc7da6bab)
" alt="Exemplo de resposta GET">

<h3>POST https://app-java4.azurewebsites.net/brinquedos/adicionar</h3>
<p>Cadastra um novo brinquedo no sistema.</p>
<img src=![image](https://github.com/user-attachments/assets/64eb057d-dfb9-47f2-8764-aca0631486c1)
alt="Exemplo de requisição POST">
<p>Exemplo JSON:</p>
<code>
    {
        "nome": "Bola de basquete",
        "tipo": "Esportivo",
        "classificacao": "Infantil",
        "tamanho": "Médio",
        "preco": 45
    }
    PUT https://app-java4.azurewebsites.net/brinquedos/atualizar/9
    atualiza um existente
    ![image](https://github.com/user-attachments/assets/75cd3d63-d818-441e-800f-e53222715316)

    Obter um brinquedo por ID (GET https://app-java4.azurewebsites.net/brinquedos/4)

URL: http://localhost:8081/brinquedos/{id}
Método: GET
Descrição: Retorna um brinquedo específico pelo seu ID.

</code>

<h2>Execução do Projeto</h2>
<ol>
    <li>Clone o repositório do projeto.</li>
    <li>Importe o projeto em sua IDE preferida.</li>
    <li>Caso necessário, atualize as dependências Maven.</li>
    <li>Execute o projeto.</li>
    <li>Execute os endpoints acima no postman.</li>
</ol>
<img src="https://github.com/gustavo-specxx/javaCheckpoint2/assets/117688531/21b34f16-0a26-480e-8fbd-810f5939d67e.png" alt="Execução do Projeto">
</div>
</body>
</html>
