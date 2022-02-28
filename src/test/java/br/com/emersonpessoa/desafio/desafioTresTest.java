package br.com.emersonpessoa.desafio;

import org.junit.jupiter.api.Test;

import br.com.emerson.desafio.DesafioTres;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class desafioTresTest {

    @Test
    void desafioCerto() {
        DesafioTres desafio = new DesafioTres();
        assertEquals(3, desafio.desafio3("ifailuhkqq"));
    }

    @Test
    void desafioCertoSegundo() {
        DesafioTres desafio = new DesafioTres();
        assertEquals(2, desafio.desafio3("ovo"));
    }

    @Test
    void desafioErrado() {
        DesafioTres desafio = new DesafioTres();
        assertNotEquals(3, desafio.desafio3("ovo"));
    }
}