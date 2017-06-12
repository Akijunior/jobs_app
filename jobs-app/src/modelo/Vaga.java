package modelo;

import java.util.ArrayList;

public class Vaga {
	
	private String dataLancamentoVaga;
	private String descricaoVaga;
	private String nomeVaga;
	private String salarioVaga;
	private boolean vagaPreenchida = false;
	private boolean vagaRemota = false;

	private ArrayList<Candidatura> candidatosConcorrendo = new ArrayList<Candidatura>();


	public Vaga(String dataLancamentoVaga, String descricaoVaga, String nomeVaga,
			String salarioVaga, boolean vagaPreenchida, boolean vagaRemota,
			ArrayList<Candidatura> candidatosConcorrendo) {
		
		this.dataLancamentoVaga = dataLancamentoVaga;
		this.descricaoVaga = descricaoVaga;
		this.nomeVaga = nomeVaga;
		this.salarioVaga = salarioVaga;
		this.vagaPreenchida = vagaPreenchida;
		this.vagaRemota = vagaRemota;
		this.candidatosConcorrendo = candidatosConcorrendo;
	}

	public String getDataLancamentoVaga() {
		return dataLancamentoVaga;
	}

	public void setDataLancamentoVaga(String dataLancamentoVaga) {
		this.dataLancamentoVaga = dataLancamentoVaga;
	}

	public String getDescricaoVaga() {
		return descricaoVaga;
	}

	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public String getSalarioVaga() {
		return salarioVaga;
	}

	public void setSalarioVaga(String salarioVaga) {
		this.salarioVaga = salarioVaga;
	}

	public boolean isVagaPreenchida() {
		return vagaPreenchida;
	}

	public void setVagaPreenchida(boolean vagaPreenchida) {
		this.vagaPreenchida = vagaPreenchida;
	}

	public boolean isVagaRemota() {
		return vagaRemota;
	}

	public void setVagaRemota(boolean vagaRemota) {
		this.vagaRemota = vagaRemota;
	}

	public ArrayList<Candidatura> getCandidatosConcorrendo() {
		return candidatosConcorrendo;
	}

	public void setCandidatosConcorrendo(ArrayList<Candidatura> candidatosConcorrendo) {
		this.candidatosConcorrendo = candidatosConcorrendo;
	}

	public void MostrarCandidatos(){
		
		for (Candidatura candidato : candidatosConcorrendo) {
			
			System.out.println("\nNome do candidato: " + candidato.getNomeCandidato());
			System.out.println("\nSua Mini Descri��o: " + candidato.getMiniApresentacaoCandidato());
		}
		

	}
	
	public void ReceberCandidato(Candidatura candidatura) {
		
		this.candidatosConcorrendo.add(candidatura);
		
	}
	

}
