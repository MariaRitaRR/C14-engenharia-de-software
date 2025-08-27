package br.inatel.cdg.model;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Fila <T> {

    List<T> elementos = new ArrayList<T>();
    int tamanho = 0;

    public int size ()
    {
        return tamanho;
    }

    public T removerFila()
    {
        if(filaVazia())
        {
            throw new NoSuchElementException("Fila está vazia");
        }
        T elemento = elementos.remove(0);
        tamanho--;
        return elemento;
    }

    public void enfileirar(T elemento)
    {
        elementos.add(elemento);
        tamanho++;
    }

    public boolean filaVazia()
    {
        return tamanho == 0;
    }
}
