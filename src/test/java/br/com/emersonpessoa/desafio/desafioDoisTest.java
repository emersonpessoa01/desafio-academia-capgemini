package br.com.emersonpessoa.desafio;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.emerson.desafio.DesafioDois;

public class desafioDoisTest {

    @Test
    public void desafioCerto() {
        DesafioDois a = new DesafioDois();
        assertEquals(0, a.desafio2("aA1!as"));
    }

    @Test
    public void desafioCertoSegundo() {
        DesafioDois a = new DesafioDois();
        assertEquals(3, a.desafio2("Ya3"));
    }

    @Test
    public void desafioErrado() {
        DesafioDois a = new DesafioDois();
        assertNotEquals(0, a.desafio2("aA1!a"));
    }
}