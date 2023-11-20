1. Implementação de métodos em Árvore Binária de Pesquisa

Tendo em vista a implementação disponível, acrescente na classe BinarySearchTree os métodos abaixos seguindo as instruções dos comentários javadoc:

/**
* Método minNode()
* método que busca o menor valor existente na árvore
* @param defina a necessidade de parâmetros de acordo com a sua implementação
* @return valor do menor nodo da árvore
*/
public int minNode() {}
 
 
/**
* Método maxNode()
* método que busca o maior valor existente na árvore
* @param defina a necessidade de parâmetros de acordo com a sua implementação
* @return valor do maior nodo da árvore
*/
public int maxNode() {}
 
 
/**
* Método countLeaves()
* método que conta os nodos folha de uma árvore binária
* @param defina a necessidade de parâmetros de acordo com a sua implementação
* @return valor inteiro correspondente a quantidade de nodos folha
*/
public int countLeaves() {}

 
/**
* Método sumBetween()
* método soma os valores de uma sequência de nodos (não incluindo os valores dos nodos de início e fim)
* @param start valor que corresponde ao nodo de início
* @param end valor que corresponde ao nodo de fim
* @param defina outros caso haja necessidade na sua implementação
* @return valor inteiro correspondente a quantidade de nodos folha
*/
public int countBetween(int start, int end) {}

===============================

2. Implementação de balanceamento de Árvore Binária de Pesquisa

Escolher uma das árvores possíveis para serem estudadas são, obrigatoriamente: Árvores AVL ou Árvores rubro-negras (Red-Black Tree).

Após o entendimento do funcionamento da árvore, é preciso implementá-la. A implementação pode ser uma adaptação de uma implementação pronta, mas deve seguir o padrão trabalhado em aula, isto é, deve ser implementada uma árvore binária de pesquisa balanceada para armazenar números inteiros. O TAD também deve seguir o padrão de TAD visto em aula para árvores binárias, sendo obrigatório que a classe da árvore tenha os seguintes métodos:

    Adicionar elementos na árvore: void add(obj);
    Retornar o pai de um elemento: obj getParent(obj);
    Limpar o conteúdo da árvore: void clear();
    Verificar se um elemento está armazenado na árvore ou não: boolean contains(obj);
    Verificar qual é a altura da árvore: int height();
    Verificar quantos elementos tem na árvore: int size();
    Verificar se a árvore está vazia ou não: boolean isEmpty();
    Retornar os elementos da árvore em uma lista usando diferentes caminhamentos (métodos preOrder(), inOrder(), posOrder());
    Apresentar a visualização da árvore usando a classe TreeFormatter.

Para a implementação dos métodos acima será preciso incluir outros métodos necessários para o correto funcionamento da árvore e para que ela fique balanceada. Após a implementação de todos os métodos, é obrigatório analisar e incluir como comentário a notação O para os métodos add, contains, height e clone.

Testar a árvore de pesquisa implementada de acordo com as instruções fornecidas

Além da implementação da classe da árvore, é preciso implementar um método main que instancie a árvore implementada e chame os seus métodos para verificar o seu correto funcionamento. Para isto, é obrigatório ter os seguintes comandos no método main:

    Instanciar a árvore implementada;
    Incluir os números 1, 2, 3, 4, 5, 6, 7, 8, 9, nesta ordem, na árvore;
    Apresentar a visualizacão da árvore;
    Apresentar a altura da árvore;
    Limpar o conteúdo da árvore;
    Incluir os números 9, 8, 7, 6, 5, 4, 3, 2, 1, nesta ordem, na árvore;
    Apresentar o conteúdo da árvore usando um caminhamento central;
