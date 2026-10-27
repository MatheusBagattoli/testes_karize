package br.edu.senai;

/** Representa os dados de um usuário. */
public class Usuario {
    private final String nome;
    private final String login;

    public Usuario(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }
}
