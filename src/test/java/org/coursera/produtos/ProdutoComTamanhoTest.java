package org.coursera.produtos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoComTamanhoTest {

    @Test
    public void testEquals() {
        ProdutoComTamanho p1 = new ProdutoComTamanho("Produto 1", "123", 10.0, "M");
        ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", "123", 15.0, "M");
        ProdutoComTamanho p3 = new ProdutoComTamanho("Produto 3", "123", 20.0, "L");
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
    }

    @Test
    public void testHashCode() {
        ProdutoComTamanho p1 = new ProdutoComTamanho("Produto 1", "123", 10.0, "M");
        ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", "123", 15.0, "M");
        ProdutoComTamanho p3 = new ProdutoComTamanho("Produto 3", "123", 20.0, "L");
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1.hashCode(), p3.hashCode());
    }
}

