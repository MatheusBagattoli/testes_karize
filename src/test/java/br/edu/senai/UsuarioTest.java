package br.edu.senai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsuarioTest {

    @Test
    void deveGuardarNomeELogin() {
        Usuario usuario = new Usuario("Maria", "maria@maria");

        assertEquals("Maria", usuario.getNome());
        assertEquals("maria@maria", usuario.getLogin());
    }
}
