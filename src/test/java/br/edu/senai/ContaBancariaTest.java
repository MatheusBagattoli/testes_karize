package br.edu.senai;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaBancariaTest {

    private ContaBancaria contaBancaria;

    @BeforeEach
    void novaContaComSaldo() {
        contaBancaria = new ContaBancaria();
        System.out.println("[BeforeEach] Conta criada para teste");
    }

    @AfterEach
    void encerrarCadaTeste(){
        System.out.println("[AfterEach] Teste finalizado!");
    }

    @Test
    void verificarSaldoInicialDe100Reais(){
        ContaBancaria conta = new ContaBancaria("Matheus", 100);

        assertEquals(100, conta.getSaldo(), 000.1);
    }

    @Test
    void testarDepositarValor(){
        ContaBancaria conta = new ContaBancaria("Matheus", 100);

        conta.depositar(50);

        assertEquals(150, conta.getSaldo(), 000.1);
    }

    @Test
    void testarSacarValor(){
        ContaBancaria conta = new ContaBancaria("Matheus", 100);

        conta.sacar(70);

        assertEquals(30, conta.getSaldo(), 000.1);
    }

    @Test
    void tentarSacarMaisQueOSaldo(){
        ContaBancaria conta = new ContaBancaria("Matheus", 100);

        assertThrows(IllegalStateException.class, () -> {
            conta.sacar(200);
        });

        assertEquals(100, conta.getSaldo(), 000.1);
    }
}
