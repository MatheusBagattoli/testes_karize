package br.edu.senai;

/** Classe simples usada para praticar testes unitários com JUnit. */
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public int[] gerarSequencia() {
        return new int[]{1, 2, 3};
    }
}
