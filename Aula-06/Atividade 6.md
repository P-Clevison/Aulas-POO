# Exercício: Sistema de Controle de Funcionários em uma Empresa (pair programming)

## Objetivo:
Você deve desenvolver um sistema simples para gerenciar diferentes tipos de funcionários em uma empresa.
Requisitos:

1. Crie uma classe abstrata Funcionario com os seguintes atributos:

    - nome (String)
    - salario_base (float)
    - Um método abstrato calcular_salario() que retorna o salário final.

2. Crie duas subclasses de Funcionario:

    **FuncionarioCLT:**
    - Possui um atributo adicional beneficio (float).
    - O salário final é salario_base + beneficio.

    **FuncionarioPJ:**
    - Possui um atributo adicional horas_trabalhadas (int) e valor_hora (float).
    - O salário final é horas_trabalhadas * valor_hora.

3. Crie uma classe Departamento que possui:

    - nome (String)
    - Duas variáveis de funcionários (composição).
    - Um método exibir_salarios() que imprime o nome e o salário final de cada funcionário do departamento (usando polimorfismo).

4. No método principal (main):
    - Crie um objeto da classe Departamento.
    - Instancie ao menos dois funcionários de tipos diferentes.
    - Chame o método exibir_salarios() para mostrar os salários calculados.