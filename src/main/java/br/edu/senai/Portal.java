package br.edu.senai;

/** Portal fictício para praticar testes de autenticação e sessão. */
public class Portal {
    private final Usuario cadastrado = new Usuario("Ana", "ana");
    private Usuario usuarioLogado;

    public boolean entrar(String login, String senha) {
        // Cada tentativa começa sem uma sessão anterior.
        usuarioLogado = null;

        if ("ana".equals(login) && "1234".equals(senha)) {
            usuarioLogado = cadastrado;
            return true;
        }
        return false;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void sair() {
        usuarioLogado = null;
    }
}
