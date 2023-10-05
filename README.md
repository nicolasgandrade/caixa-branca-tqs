# Testes de Caixa Branca - TQS (Testes e Qualidade de Software)

## Descrição
Esse repositório apresenta a atividade de Testes de Caixa Branca da disciplina de
Testes e Qualidade de Software.

## Atividade

### Problemas encontrados
#### Classe `User`:
1. Documentação pobre
   1. Não há documentação do código, a não ser poucos comentários dispersos.
   2. Os comentários escritos no código não possuem padrão de formatação.
   3. Os comentários escritos no código são desnecessários.
2. Nomenclatura de variáveis ruim
   1. O nome das variáveis não descreve bem suas funções desta. Exemplo: Exceptions
são chamadas de `e`, o que dificultaria a busca por tratamento de erros no código;
3. Legibilidade prejudicada
   1. Há falta de quebras de linha.
   2. O fechamento de chaves é mal posicionado (ex: linhas 16, 32, 33 e 34).
   3. Não há ordem definida para declaração de métodos e propriedades na classe.
   4. Não há padrão definido a respeito sobre os espaçamentos entre as variáveis e
suas respectivas atribuições de valores (ex: em certo momento a atribuição de
valor à variável é feita com espaço - `(ln: 23) sql += "...` - e depois sem
espaçamento - `(ln: 24) sql +="...`).
4. Tratamento de erros mal feitos
   1. Os tratamentos de erros são inexistentes: Apesar de ser escrito o `catch`
no código, ele não é utilizado corretamente, pois não há bloco de código dentro
do tratamento `catch`.
5. Arquitetura inconsistente
   1. Não há respeito à ordem de declaração entre propriedades e métodos da classe.
6. Conexões abertas
   1. As conexões com o banco não foram fechadas.

## Grafo de fluxo de controle
Abaixo, seguem a imagem do código numerado e, em seguida, o grafo de fluxo de controle.
![fluxo-v2](https://github.com/nicolasgandrade/caixa-branca-tqs/assets/82426254/b23b48f9-0646-4a7f-a654-fe0d8143b395)
![grafo-fluxo-v2](https://github.com/nicolasgandrade/caixa-branca-tqs/assets/82426254/b7da5e09-892b-448e-8768-666df20ac53a)

### Cálculo de Complexidade ciclomática:
Seguindo a fórmula da complexidade ciclomática dada por $CC=A-V+2$, sendo A as arestas, V os vértices (ou nós), temos no caso anterior a complexidade descrita por $CC=20-16+2$, ou seja, 6.

### Caminhos
1. Caminho 1 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 13; 14; 15; 16;
2. Caminho 2 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 13; 14; 15; 16;
3. Caminho 3 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 14; 15; 16;
4. Caminho 4 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 14; 15; 16;
5. Caminho 5 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 14; 15; 16;
6. Caminho 6 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 14; 15; 16;
7. Caminho 7 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 16;
8. Caminho 8 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 16;
9. Caminho 9 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 16;
10. Caminho 10 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 13; 16;
11. Caminho 11 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 13; 16;
12. Caminho 12 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 13; 16;

<hr>
Última atualização: 05/10/23
Nicolas Sol Guerrero de Andrade Frederico - 212118
