package test;

import stack.Stack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void testEstaVazia() {
        Stack<Integer> pilha = new Stack<>();
        assertTrue(pilha.estaVazia(), "A pilha está vazia");
    }

    @Test
    public void testNaoEstaVazia() {
        Stack<Integer> pilha = new Stack<>();
        pilha.empilhar(1);
        assertFalse(pilha.estaVazia(), "A pilha não deve estar vazia após inserir um valor");
    }

    @Test
    public void testEmpilhar() {
        Stack<Integer> pilha = new Stack<>();
        pilha.empilhar(1);
        pilha.empilhar(2);
        assertEquals(2, pilha.tamanho(), "A pilha deve conter 2 valores.");
    }

    @Test
    public void testDesempilhar() throws Exception {
        Stack<Integer> pilha = new Stack<>();
        pilha.empilhar(1);
        pilha.empilhar(2);
        int valor = pilha.desempilhar();
        assertEquals(2, valor, "O elemento desempilhado deve ser 2.");
        assertEquals(1, pilha.tamanho(), "A pilha deve conter 1 elemento após desempilhar.");
    }

    @Test
    public void testExcecaoDesempilharPilhaVazia() {
        Stack<Integer> pilha = new Stack<>();
        Exception exception = assertThrows(Exception.class, () -> {
            pilha.desempilhar();
        });
        assertEquals("A pilha está vazia", exception.getMessage(), "Deve retornar: 'A pilha está vazia'");
    }
}
