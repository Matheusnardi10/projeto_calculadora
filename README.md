# Projeto Calculadora — FinançApp

> Projeto acadêmico desenvolvido com foco em Qualidade de Software, Testes, Refatoração, Documentação e Versionamento.

> **Esta é a branch `main`: versão original do projeto.** A refatoração, o JavaDoc (`docs/`) e a documentação completa estão na branch [`Refatoracao`](https://github.com/Matheusnardi10/projeto_calculadora/tree/Refatoracao).

---

## 1. Identificação do Projeto

**Projeto:** Projeto Calculadora  
**Contexto:** FinançApp  
**Aluno:** Matheus Bau Nardi  
**RA:** 249221  
**Curso:** Análise e Desenvolvimento de Sistemas  
**Disciplina:** UX/UI e Testes de Software (Turma AS406TSN4)  
**Professor:** Daniel Ohata  
**Semestre:** 4º Semestre — 2026.2  

---

# 2. Visão Geral

O projeto consiste no desenvolvimento de um módulo de cálculos matemáticos básicos em Java para a startup fictícia **FinançApp**.

O módulo foi desenvolvido com o objetivo de ser utilizado futuramente em funcionalidades de controle financeiro, como:

- orçamento mensal;
- divisão de despesas;
- projeções financeiras;
- cálculos auxiliares.

Além do funcionamento correto das operações, o projeto aplica práticas de qualidade de software relacionadas a:

- testes;
- tratamento de erros;
- refatoração;
- documentação;
- versionamento;
- manutenção de código.

---

# 3. Problema

Durante o desenvolvimento da aplicação FinançApp, foi identificada a necessidade de criar um módulo matemático reutilizável.

Entretanto, a empresa definiu que o módulo não deveria apenas funcionar corretamente, mas também apresentar:

- código legível;
- testes executáveis;
- tratamento de falhas;
- documentação técnica;
- controle de versões;
- facilidade de manutenção.

O desafio consiste, portanto, em desenvolver uma solução funcional e ao mesmo tempo aplicar boas práticas de Engenharia de Software.

---

# 4. Objetivo

## 4.1 Objetivo Geral

Desenvolver uma calculadora em Java aplicando práticas de qualidade, testes, documentação, refatoração e versionamento.

## 4.2 Objetivos Técnicos

- implementar operações matemáticas básicas;
- tratar entradas inválidas;
- impedir divisão por zero;
- desenvolver testes unitários;
- refatorar o código sem alterar seu comportamento funcional (branch `Refatoracao`);
- documentar classes e métodos com JavaDoc (branch `Refatoracao`);
- gerar documentação HTML (branch `Refatoracao`);
- utilizar Git e GitHub;
- organizar commits e branches;
- manter documentação técnica no README.

---

# 5. Escopo Funcional

A aplicação oferece as seguintes operações:

| ID | Funcionalidade | Descrição | Status |
|---|---|---|---|
| RF01 | Soma | Soma dois números inteiros | ✅ |
| RF02 | Subtração | Subtrai dois números inteiros | ✅ |
| RF03 | Multiplicação | Multiplica dois números inteiros | ✅ |
| RF04 | Divisão | Divide dois números inteiros | ✅ |
| RF05 | Validação de divisão | Impede divisão por zero | ✅ |
| RF06 | Operação inválida | Trata operadores não suportados | ✅ |

---

# 6. Requisitos Não Funcionais

| ID | Categoria | Requisito |
|---|---|---|
| RNF01 | Qualidade | O código deve possuir organização e legibilidade |
| RNF02 | Testabilidade | As operações devem possuir testes executáveis (classe `TesteCalculadora`) |
| RNF03 | Manutenção | O código deve permitir refatoração sem alteração funcional |
| RNF04 | Documentação | Classes e métodos devem possuir JavaDoc (branch `Refatoracao`) |
| RNF05 | Versionamento | O projeto deve utilizar Git e GitHub |
| RNF06 | Confiabilidade | Erros não devem interromper inesperadamente a execução |

---

# 7. Tecnologias Utilizadas

| Tecnologia | Versão | Utilização |
|---|---|---|
| Java | 26 | Desenvolvimento |
| JDK | 26 | Compilação |
| Classe de teste com `main` | — | Testes (sem framework externo, conforme a aula) |
| Git | 2.56 | Controle de versão |
| GitHub | — | Repositório remoto |
| JavaDoc | — | Documentação (branch `Refatoracao`) |
| Visual Studio Code | — | Ambiente de desenvolvimento |

---

# 8. Estrutura do Projeto (branch `main`)

```text
projeto_calculadora/
│
├── src/
│   └── calculadora/
│       ├── Calculadora.java
│       └── TesteCalculadora.java
│
├── images/
│   └── testes/
│
├── README.md
└── .gitignore
```

---

# 9. Explicação das Operações

A classe `Calculadora` (pacote `calculadora`) possui o método principal `calc(int a, int b, String op)`, que recebe dois números inteiros e o símbolo da operação, e retorna o resultado em um atributo `r` (resultado).

| Operador | Operação | Exemplo |
|---|---|---|
| `+` | Soma | `2 + 3 = 5` |
| `-` | Subtração | `10 - 4 = 6` |
| `*` | Multiplicação | `3 * 5 = 15` |
| `/` | Divisão inteira | `8 / 2 = 4` |

## Tratamento de erros

| Situação | Comportamento |
|---|---|
| Divisão por zero | Exibe `Erro: divisao por zero, operação irregular` e retorna `0` |
| Operador inválido (ex.: `x`) | Exibe `Operacao invalida` e retorna `0` |

Nos dois casos o programa **não é interrompido**: o erro é informado por mensagem e o método retorna `0`.

---

# 10. Testes

Os testes estão na classe `TesteCalculadora` e cobrem: soma, subtração, multiplicação, divisão, divisão por zero e operação inválida.

| Entrada | Resultado esperado | Resultado obtido |
|---|---|---|
| `2 + 3` | `5` | `Resultado = 5` |
| `10 - 4` | `6` | `Resultado = 6` |
| `3 * 5` | `15` | `Resultado = 15` |
| `8 / 2` | `4` | `Resultado = 4` |
| `8 / 0` | Mensagem de erro e resultado `0` | `Erro: divisao por zero, operação irregular` / `Resultado = 0` |
| `5 x 5` | Mensagem de operação inválida e resultado `0` | `Operacao invalida` / `Resultado = 0` |

**Print da execução:**

![Execução dos testes — versão original](images/testes/teste_original.png)

---

# 11. Refatoração e Documentação

A refatoração (extração de métodos, melhoria de nomes, simplificação de condicionais e tratamento de erros com exceções), os comentários técnicos, o JavaDoc e a documentação HTML (`docs/index.html`) foram feitos na branch **`Refatoracao`**, junto com o README completo, que traz os testes da versão refatorada e os prints do JavaDoc.

Branch `Refatoracao`: https://github.com/Matheusnardi10/projeto_calculadora/tree/Refatoracao

---

# 12. Como Executar

Na raiz do projeto:

```text
javac -d bin src/calculadora/*.java
java -cp bin calculadora.TesteCalculadora
```

---

# 13. Versionamento

| Branch | Conteúdo |
|---|---|
| `main` | Versão original da calculadora e da classe de teste |
| `Refatoracao` | Versão refatorada, testes atualizados, JavaDoc e documentação |

Os commits seguem o padrão `tipo: descrição` (por exemplo, `feat`, `refactor`, `docs` e `chore`).

---

# 14. Link do Repositório

https://github.com/Matheusnardi10/projeto_calculadora
