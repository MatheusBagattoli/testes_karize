package br.edu.senai;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = 100;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor a ser depositado não deve ser menor ou igual a zero!");
        }

        saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor a ser sacado não pode ser menor ou igual a zero!");
        }
        if (valor > saldo){
            throw new IllegalStateException("Valor para saque indisponível");
        }

       saldo -= valor;
    }




}
