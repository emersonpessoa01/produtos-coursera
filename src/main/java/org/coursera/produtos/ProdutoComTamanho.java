package org.coursera.produtos;

public class ProdutoComTamanho extends Produto {
    private String tamanho;

    public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ProdutoComTamanho that = (ProdutoComTamanho) obj;
        return tamanho.equals(that.tamanho);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + tamanho.hashCode();
    }
}

