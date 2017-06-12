package modelo;

public class Empregador {
	
	private Empresa empresa;
	private String nomeEmpregador;
	private String telefoneEmpregador;
	private String email;
	private String senha;
	//Cria uma empresa e da um nome a ela.


	public Empregador(Empresa empresa, String nomeEmpregador, String telefoneEmpregador, String email, String senha) {
		this.empresa = empresa;
		this.nomeEmpregador = nomeEmpregador;
		this.telefoneEmpregador = telefoneEmpregador;
		this.email = email;
		this.senha = senha;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNome_empregador() {
		return nomeEmpregador;
	}

	public void setNome_empregador(String nome_empregador) {
		this.nomeEmpregador = nome_empregador;
	}

	public String getTelefone_empregador() {
		return telefoneEmpregador;
	}

	public void setTelefone_empregador(String telefone_empregador) {
		this.telefoneEmpregador = telefone_empregador;
	}

	public String getE_mail() {
		return email;
	}

	public void setE_mail(String e_mail) {
		this.email = e_mail;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
