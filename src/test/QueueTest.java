package test;

import org.junit.Before;
import org.junit.Test;
import queue.Queue;
import stack.Stack;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class QueueTest {

    private Queue<Integer> fila;

    @Before
    public void init() {
        this.fila = new Queue<>();
    }

    @Test
    public void testFilaVazia() {
        assertTrue(fila.estaVazia());
    }

    @Test
    public void testNaoEstaVazia() {
        Queue<Integer> fila = new Queue<>();
        fila.enfileirar(1);
        assertFalse(fila.estaVazia(), "A fila não deve estar vazia após inserir um valor");
    }

    @Test
    public void testNumElementosNaFila() {
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);
        fila.enfileirar(10);

        assertEquals(10, fila.tamanho());
    }

    @Test
    public void testEnfileirar() {
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        assertEquals(3, fila.tamanho());
    }

    @Test
    public void testDesenfileirar() throws Exception {
        fila.enfileirar(10);
        fila.enfileirar(100);
        fila.enfileirar(1000);
        fila.enfileirar(0);

        fila.desenfileirar();
        int retorno = fila.desenfileirar();

        assertEquals(100, retorno);
    }

    @Test(expected = java.lang.Exception.class)
    public void testDesenfileirarFilaVazia() throws Exception {
        fila.desenfileirar();
    }
}
