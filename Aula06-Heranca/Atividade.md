# Prática sobre Herança
## Mostrar a criação e implantação do projeto abaixo
1. Criar o projeto Universidade
2. Criar a classe Pessoa com os métodos necessários e os seguintes requisitos:
    - nome
    - cpf
    - exibirDados()
3. Criar interface chamada Autenticavel com os seguintes métodos:
    - autenticar()
    - mudarSenha()
4. Criar a classe Aluno, filha de Pessoa, com os métodos necessários e os seguintes requisitos:
    - matricula
    - autenticar() (deve verificar se o parâmetro senha possui mais de 8 caracteres)
        * String senha = "qwert12345";
        * int tamanho = senha.length();
5. Criar a classe Professor, filha de Pessoa, com os métodos necessários e os seguintes requisitos:
    - departamento
    - autenticar() (deve exibir a mensagem: Acesso de professor concedido)
6. Criar a classe Monitor, filha de Aluno, com os métodos necessários e os seguintes requisitos:
    - disciplina
