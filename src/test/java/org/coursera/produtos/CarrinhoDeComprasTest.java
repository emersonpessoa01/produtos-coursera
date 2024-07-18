package org.coursera.produtos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {

    @Test
    public void testAdicionaECalculaValorTotal() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Produto 1", "123", 10.0);
        ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", "124", 15.0, "M");

        carrinho.adicionaProduto(p1, 2);
        carrinho.adicionaProduto(p2, 3);

        assertEquals(65.0, carrinho.calculaValorTotal());
    }

    @Test
    public void testRemoveProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Produto 1", "123", 10.0);
        ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", "124", 15.0, "M");

        carrinho.adicionaProduto(p1, 2);
        carrinho.adicionaProduto(p2, 3);
        carrinho.removeProduto(p2, 1);

        assertEquals(50.0, carrinho.calculaValorTotal());
    }
}
