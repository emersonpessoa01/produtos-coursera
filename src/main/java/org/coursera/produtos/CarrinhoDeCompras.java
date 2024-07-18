package org.coursera.produtos;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new HashMap<>();
    }

    public void adicionaProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public void removeProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            int quantidadeAtual = produtos.get(produto);
            if (quantidadeAtual <= quantidade) {
                produtos.remove(produto);
            } else {
                produtos.put(produto, quantidadeAtual - quantidade);
            }
        }
    }

    public double calculaValorTotal() {
        double total = 0;
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            total += entry.getKey().getPreco() * entry.getValue();
        }
        return total;
    }
}
