# Atividade JUnit Básico

Projeto Maven para praticar testes unitários usando Java 17+ e JUnit 5.

## Estrutura

- `src/main/java/br/edu/senai/`: classes principais (`Calculadora`, `Portal`, `Usuario` e `Main`).
- `src/test/java/br/edu/senai/`: testes automatizados com JUnit 5.
- `pom.xml`: configuração Maven e dependência do JUnit.

## Como executar

1. Abra a pasta do projeto no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências.
3. Abra a pasta `src/test/java` e execute os testes pelas classes de teste; ou execute pelo terminal:

```bash
mvn test
```

O projeto usa Java 17 ou superior. O Maven precisa de acesso à internet na primeira execução para baixar o JUnit.

## Observação

O teste da sequência usa `assertArrayEquals(new int[]{1, 2, 3}, sequencia)`, pois `assertEquals(1, 2, 3)` não verifica o conteúdo do array.
