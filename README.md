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
    <p>Configuração utilizada para iniciar o projeto no Spring Initializr:</p>
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

    <h2>Endpoints</h2>
    <h3>GET /brinquedos</h3>
    <p>Retorna todos os brinquedos cadastrados no sistema.</p>
    <p>Exemplo de resposta:</p>
    <img src="https://github.com/gustavo-specxx/javaCheckpoint2/assets/117688531/21b34f16-0a26-480e-8fbd-810f5939d67e.png" alt="Exemplo de resposta GET">

    <h3>POST /brinquedos/adicionar</h3>
    <p>Cadastra um novo brinquedo no sistema.</p>
    <p>Exemplo de requisição:</p>
    <code>
    {
        "nome": "Bola de basquete",
        "tipo": "Esportivo",
        "classificacao": "Infantil",
        "tamanho": "Médio",
        "preco": 45
    }
    </code>
    <img src="https://github.com/gustavo-specxx/javaCheckpoint2/assets/117688531/64eb057d-dfb9-47f2-8764-aca0631486c1.png" alt="Exemplo de requisição POST">

    <h3>PUT /brinquedos/atualizar/{id}</h3>
    <p>Atualiza as informações de um brinquedo existente.</p>
    <p>Exemplo de requisição:</p>
    <code>
    {
        "nome": "Boneca de Pano",
        "tipo": "Brinquedo de Pano",
        "classificacao": "3+",
        "tamanho": "Pequeno",
        "preco": 59.99
    }
    </code>
    <img src="https://github.com/gustavo-specxx/javaCheckpoint2/assets/117688531/75cd3d63-d818-441e-800f-e53222715316.png" alt="Exemplo de requisição PUT">

    <h3>DELETE /brinquedos/excluir/{id}</h3>
    <p>Exclui um brinquedo do sistema pelo seu ID.</p>

    <h2>Execução do Projeto</h2>
    <ol>
        <li>Clone o repositório do projeto.</li>
        <li>Importe o projeto em sua IDE preferida (IntelliJ, Eclipse ou NetBeans).</li>
        <li>Atualize as dependências Maven, se necessário.</li>
        <li>Configure o banco de dados Oracle conforme as instruções.</li>
        <li>Execute o projeto.</li>
        <li>Utilize os endpoints listados acima para interagir com a API via Postman.</li>
    </ol>
</div>
