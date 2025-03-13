## Implementa a interface **Comparable** em Java para ordenar objetos de uma classe personalizada. A aplicação do **Comparable** permite que os objetos sejam ordenados com base em um critério específico definido no método **compareTo()**.

## Funcionalidade

O objetivo desse módulo é demonstrar a ordenação de objetos de uma classe personalizada utilizando a interface **Comparable**. No exemplo, uma classe **Produto** foi criada com atributos como **nome** e **preço**. A interface **Comparable** foi implementada para que a lista de objetos da classe **Produto** fosse ordenada com base no preço dos produtos.

### Como Funciona

1. **Implementação da interface Comparable**: A classe **Produto** implementa a interface **Comparable** e sobrescreve o método **compareTo()**.
2. **Critério de ordenação**: O método **compareTo()** compara os objetos de acordo com o preço.
3. **Ordenação da lista**: Utilizamos o método **Collections.sort()** para ordenar a lista de objetos, que aplica o critério definido em **compareTo()**.
