# DesafioControleFluxo

Este projeto foi desenvolvido como parte de um exercício de aprendizado em Controle de Fluxo e depuração de código no Java. Ele implementa um sistema que utiliza conceitos como exceções personalizadas, entrada de dados via terminal e laços de repetição.

---

## Objetivo

### Criar um programa em Java que:
1. Receba dois números inteiros como parâmetros via terminal.
2. Realize a validação e execute uma contagem com base nos parâmetros fornecidos.
3. Lance uma exceção customizada caso os parâmetros sejam inválidos.

---

## Estrutura do Projeto

### Diretórios e Arquivos
- **src:** Pasta contendo os arquivos-fonte do projeto.
  - `Contador.java`: Implementação da lógica principal.
  - `ParametrosInvalidosException.java`: Classe de exceção personalizada.
- **bin:** Pasta contendo os arquivos compilados.

---

## Funcionalidades

- **Entrada de Dados:** Recebe dois números inteiros via terminal.
- **Validação:** 
  - O primeiro número deve ser menor que o segundo.
  - Caso contrário, uma exceção personalizada `ParametrosInvalidosException` é lançada.
- **Contagem e Impressão:** Calcula o número de interações e imprime os números incrementados no console.
- **Exceções Personalizadas:** A classe `ParametrosInvalidosException` é usada para validar e tratar erros de negócio.

---
## Tecnologias Utilizadas
**Java**: Linguagem de programação usada no projeto.

**IDE**: IntelliJ IDEA para desenvolvimento.

**Git**: Controle de versão.
