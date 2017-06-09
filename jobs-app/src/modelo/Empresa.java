package modelo;

import java.util.ArrayList;

public class Empresa {
	
	private String nomeEmmpresa;
	private String descricaoEmpresa;
	private String siteEmpresa;
	private Cidade cidadeEmpresa;

	private ArrayList<Vaga> vagasDisponiveis = new ArrayList<Vaga>();

	public Empresa(String nomeEmmpresa, String descricaoEmpresa, String siteEmpresa, Cidade cidadeEmpresa, ArrayList<Vaga> vagasDisponiveis) {
		this.nomeEmmpresa = nomeEmmpresa;
		this.descricaoEmpresa = descricaoEmpresa;
		this.siteEmpresa = siteEmpresa;
		this.cidadeEmpresa = cidadeEmpresa;
		this.vagasDisponiveis = vagasDisponiveis;
	}

	public String getNomeEmmpresa() {
		return nomeEmmpresa;
	}

	public void setNomeEmmpresa(String nomeEmmpresa) {
		this.nomeEmmpresa = nomeEmmpresa;
	}

	public String getDescricaoEmpresa() {
		return descricaoEmpresa;
	}

	public void setDescricaoEmpresa(String descricaoEmpresa) {
		this.descricaoEmpresa = descricaoEmpresa;
	}

	public String getSiteEmpresa() {
		return siteEmpresa;
	}

	public void setSiteEmpresa(String siteEmpresa) {
		this.siteEmpresa = siteEmpresa;
	}

	public Cidade getCidadeEmpresa() {
		return cidadeEmpresa;
	}

	public void setCidadeEmpresa(Cidade cidadeEmpresa) {
		this.cidadeEmpresa = cidadeEmpresa;
	}

	public ArrayList<Vaga> getVagasDisponiveis() {
		return vagasDisponiveis;
	}

	public void setVagasDisponiveis(ArrayList<Vaga> vagasDisponiveis) {
		this.vagasDisponiveis = vagasDisponiveis;
	}
}
