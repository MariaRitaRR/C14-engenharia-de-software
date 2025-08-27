package br.inatel.cdg.test;

import br.inatel.cdg.model.Fila;
import br.inatel.cdg.model.Pilha;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class FilaTeste {

    @Test
    public void testeFilaVazia()
    {
        Fila<Integer> fila = new Fila<Integer>();
        boolean vazia = fila.filaVazia();
        assertTrue(vazia);
    }

    @Test
    public void testeEnfileirar()
    {
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(10);
        assertEquals(1, fila.size());
    }

    @Test
    public void testeRemoverFila(){
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(10);
        fila.removerFila();
        assertEquals(0, fila.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testeRemoverFilaExeption()
    {
        Fila<Integer> fila = new Fila<>();
        fila.removerFila();
    }

    @Test
    public void testeRetornoRemocao()
    {
        Fila<Integer> fila = new Fila<>();
        int valor = 20;
        fila.enfileirar(valor);
        int retorno = fila.removerFila();
        assertEquals(valor, retorno);
    }

    @Test
    public void testeOrdemFila()
    {
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        int primeiro = fila.removerFila();
        assertEquals(1, primeiro);
    }

}
