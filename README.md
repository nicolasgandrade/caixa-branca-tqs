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


<hr>
Nicolas Sol Guerrero de Andrade Frederico - 212118