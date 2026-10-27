package br.edu.senai;

/** Ponto de entrada opcional; os exercícios principais são executados pelos testes. */
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("2 + 3 = " + calculadora.somar(2, 3));
    }
}
