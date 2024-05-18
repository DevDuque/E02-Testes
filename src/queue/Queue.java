package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> fila;

    public Queue() {
        this.fila = new ArrayList<>();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public int tamanho() {
        return fila.size();
    }

    public void enfileirar(Trem elemento) {
        fila.add(elemento);
    }

    public Trem desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A fila está vazia!");
        }
        return fila.remove(0);
    }
}

