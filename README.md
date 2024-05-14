# Trabalho 1 - INE5418: Computação Distribuída

Este projeto consiste em uma aplicação distribuída para criação de usuários e envio de e-mails de boas-vindas. Cada serviço é executado separadamente, com seus próprios bancos de dados.
Como Executar

Para executar a aplicação, siga estas etapas:

1. Clone o repositório para o seu ambiente local.
2. Abra um terminal e navegue até o diretório `user`, abra outro terminal e navegue até o diretório `email`.
3. Execute o comando `mvn clean install`, em ambos os terminais, para construir os projetos.
4. Em seguida, em ambos os terminais, execute o comando `mvn spring-boot:run` para iniciar os serviços.
5. Após iniciar os serviços, navegue até o diretório `frontend`.
6. Execute o comando `npm install` para instalar o node_modules.
7. Execute o comando `npm install axios` para instalar a biblioteca axios.
8. Finalmente, execute o comando `npm run start` para iniciar o servidor de desenvolvimento e acessar a aplicação no navegador
   através da url `localhost:3000`.

Certifique-se de ter o Maven e o Node.js instalados em seu sistema antes de executar os comandos acima.

Observações

É necessário criar os dois bancos de dados postgres, `ms_user` para ser o banco de dados do serviço de usuário, e `ms_email` para ser o banco de dados do serviço de e-mail.
