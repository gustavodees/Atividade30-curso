# Calculadora de Retângulo em Java

Este projeto fornece um programa simples em Java para calcular a área, o perímetro e a diagonal de um retângulo.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o ponto de entrada do programa e a interação com o usuário.
* `model/Retangulo.java`: Define a classe `Retangulo`, que representa um retângulo e contém métodos para os cálculos.

## Como Usar

1.  **Salve os arquivos:** Salve o código fornecido nos respectivos caminhos de arquivo:
    * Crie uma pasta chamada `principal`. Dentro dela, crie um arquivo chamado `Main.java`.
    * Crie uma pasta chamada `model`. Dentro dela, crie um arquivo chamado `Retangulo.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto (aquele que contém as pastas `principal` e `model`) e compile os arquivos Java usando o compilador Java:

    ```bash
    javac principal/Main.java model/Retangulo.java
    ```

3.  **Execute o programa:** Após a compilação bem-sucedida, execute a classe `Main` a partir do terminal:

    ```bash
    java principal.Main
    ```

4.  **Entrada:** O programa solicitará que você digite a altura e a largura do retângulo. Digite os valores e pressione Enter.

5.  **Saída:** O programa exibirá a área, o perímetro e a diagonal calculados do retângulo.

## Explicação do Código

### `model/Retangulo.java`

Este arquivo define a classe `Retangulo`, que representa um retângulo.

* **Atributos:**
    * `largura` (private double): Representa a largura do retângulo.
    * `altura` (private double): Representa a altura do retângulo.
* **Construtores:**
    * `Retangulo()`: Construtor padrão que inicializa a largura e a altura como 0.
    * `Retangulo(double largura, double altura)`: Construtor que permite definir a largura e a altura iniciais do retângulo.
* **Getters e Setters:** Fornece métodos públicos para acessar e modificar os atributos `largura` e `altura`.
    * `getLargura()`: Retorna a largura do retângulo.
    * `getAltura()`: Retorna a altura do retângulo.
    * `setAltura(double altura)`: Define a altura do retângulo.
    * `setLargura(double largura)`: Define a largura do retângulo.
* **Métodos para Cálculos:**
    * `getArea()`: Calcula e retorna a área do retângulo (largura \* altura).
    * `getPerimetro()`: Calcula e retorna o perímetro do retângulo (2 \* (altura + largura)).
    * `getDiagonal()`: Calcula e retorna a diagonal do retângulo usando o teorema de Pitágoras (√(largura² + altura²)).

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria uma instância da classe `Retangulo`.
    2.  Cria um objeto `Scanner` para ler a entrada do usuário.
    3.  Solicita ao usuário que digite a altura e a largura do retângulo.
    4.  Lê os valores de entrada usando o `Scanner` e define a `altura` e a `largura` do objeto `Retangulo`.
    5.  Chama os métodos `getArea()`, `getPerimetro()` e `getDiagonal()` do objeto `Retangulo` para calcular os respectivos valores.
    6.  Imprime a área, o perímetro e a diagonal calculados no console.
    7.  Fecha o objeto `Scanner` para liberar recursos.
