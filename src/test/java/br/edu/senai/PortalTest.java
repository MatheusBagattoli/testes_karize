package br.edu.senai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortalTest {

    @Test
    void deveEntrarComCredenciaisCorretas() {
        Portal portal = new Portal();

        assertTrue(portal.entrar("ana", "1234"));
        assertNotNull(portal.getUsuarioLogado());
        assertEquals("Ana", portal.getUsuarioLogado().getNome());
    }

    @Test
    void naoDeveEntrarComSenhaIncorreta() {
        Portal portal = new Portal();

        assertFalse(portal.entrar("ana", "senha-errada"));
        assertNull(portal.getUsuarioLogado());
    }

    @Test
    void naoDeveEntrarComLoginIncorreto() {
        Portal portal = new Portal();

        assertFalse(portal.entrar("usuario-inexistente", "1234"));
        assertNull(portal.getUsuarioLogado());
    }

    @Test
    void deveEncerrarSessaoAoSair() {
        Portal portal = new Portal();
        portal.entrar("ana", "1234");

        portal.sair();

        assertNull(portal.getUsuarioLogado());
    }

    @Test
    void tentativaInvalidaDeveEncerrarSessaoAnterior() {
        Portal portal = new Portal();
        portal.entrar("ana", "1234");

        assertFalse(portal.entrar("ana", "senha-errada"));
        assertNull(portal.getUsuarioLogado());
    }
}
