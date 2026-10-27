package br.edu.senai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void deveRetornarSoma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.somar(2, 3));
    }

    @Test
    void deveRetornarSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.subtrair(10, 5));
    }

    @Test
    void deveRetornarMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4.0, calculadora.multiplicar(2, 2), 0.001);
    }

    @Test
    void deveRetornarDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.5, calculadora.dividir(5, 2), 0.001);
    }

    @Test
    void naoDeveDeixarDividirPorZero() {
        Calculadora calculadora = new Calculadora();

        IllegalArgumentException erro = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0)
        );

        assertEquals("Não é possível dividir por zero.", erro.getMessage());
    }

    @Test
    void deveConferirSeEParOuImpar() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.ehPar(4));
        assertFalse(calculadora.ehPar(5));
    }

    @Test
    void deveGerarSequenciaCorreta() {
        Calculadora calculadora = new Calculadora();
        int[] sequencia = calculadora.gerarSequencia();

        assertArrayEquals(new int[]{1, 2, 3}, sequencia);
    }
}
