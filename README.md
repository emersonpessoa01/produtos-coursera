# Tarefa avaliada por colega: Diferentes tipos de produto

<p>Crie uma classe chamada Produto que deve possuir um nome, um código e um preço. Sobrescreva os métodos equals() e hashCode() de Object (veja seção sobre esses métodos), de forma a serem considerados iguais instancias de Produto que possuam o mesmo código.</p>

<p>Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. Essa classe deve possuir uma informação adicional de tamanho. Um exemplo seria o tamanho de uma roupa ou a numeração de um calçado. Método equals() e hashCode() devem ser sobrescritos de forma que um produto com mesmo código e tamanhos diferentes são considerados diferentes.</p>

<p>Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap cada produto adicionado no carrinho e sua respectiva quantidade. O método adicionaProduto() deve receber a instancia do produto e a quantidade. Caso o produto já exista no HashMap, a quantidade deve ser somada a que já existe no carrinho. Deve haver também um método removeProduto() que também recebe a instancia do produto e a quantidade a ser removida. Observe que produtos de tamanhos diferentes devem ser considerados como produtos diferentes no carrinho. O carrinho deve possuir um método que calcula o valor total da compra.</p>

<p>Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras. Os testes de cada classe devem ser colocados em classes separadas e devem estar em um diretório de código diferente das classes de produção.</p>


<details><summary>Visão geral dos critérios de avaliação</summary>
Serão verificados se os itens pedidos no enunciado foram cumpridos. Procure entregar um código organizado pois isso também será avaliado. 
</details>

<details><summary>Métodos Equals e hashCode</summary>
O método equals() é utilizado para a comparação de objetos. Ele é definido na classe Object e pode ser sobrescrito em qualquer classe que possua uma lógica diferente. 
  
O método hashCode() também é definido na classe Object e retorna o código hash de um objeto, que é utilizado em várias classes que implementam estruturas de dados. Ele precisa obedecer a seguinte regra: quando o método equals() retornar true, o retorno de hashCode() desses objetos precisa ser igual. Mas se o retorno do hashCode() for igual, não  necessariamente os objetos são iguais, ou seja, o equals() pode retornar  true ou false.   

É importante respeitar essa regra para que algumas classes como HashSet e HashMap funcionem corretamente!
