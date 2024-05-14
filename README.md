# Trabalho 1 - INE5418: Computação Distribuída

Este projeto consiste em uma aplicação distribuída para criação de usuários e envio de e-mails de boas-vindas. Cada serviço é executado separadamente, com seus próprios bancos de dados.
Como Executar

Para executar a aplicação, siga estas etapas:

    Clone o repositório para o seu ambiente local.
    Abra um terminal e navegue até os diretórios "user" e "email".
    Execute o comando mvn clean install para construir os projetos.
    Em seguida, execute o comando mvn spring-boot:run em cada diretório para iniciar os serviços.
    Após iniciar os serviços, navegue até o diretório "frontend".
    Execute o comando npm run build para compilar o frontend.
    Finalmente, execute o comando npm start para iniciar o servidor de desenvolvimento e acessar a aplicação no navegador.

Certifique-se de ter o Maven e o Node.js instalados em seu sistema antes de executar os comandos acima.
Observações

Certifique-se de configurar corretamente os parâmetros de conexão com os bancos de dados nos arquivos de configuração dos serviços "user" e "email".

Este projeto foi desenvolvido como parte do Trabalho 1 da disciplina INE5418 - Computação Distribuída.