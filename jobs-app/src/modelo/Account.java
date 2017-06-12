package modelo;
public class Account {

    private String usuario;
    private String senha;
    private Empresa empresa;

    public Account(String usuario, String senha, Empresa empresa) {
        this.usuario = usuario;
        this.senha = senha;
        this.empresa = empresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}

