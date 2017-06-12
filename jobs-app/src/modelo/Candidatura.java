package modelo;

public class Candidatura {
	
	private String nomeCandidato;
	private String emailCandidato;
	private String miniApresentacaoCandidato;
	private String curriculoCandidato;
	
	public void candidatarvaga(Vaga vaga){
		
		vaga.ReceberCandidato(this);
	}

	public Candidatura(String nomeCandidato, String emailCandidato,
			String miniApresentacaoCandidato, String curriculoCandidato) {
		this.nomeCandidato = nomeCandidato;
		this.emailCandidato = emailCandidato;
		this.miniApresentacaoCandidato = miniApresentacaoCandidato;
		this.curriculoCandidato = curriculoCandidato;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getEmailcandidato() {
		return emailCandidato;
	}

	public void setEmailCandidato(String emailCandidato) {
		this.emailCandidato = emailCandidato;
	}

	public String getMiniApresentacaoCandidato() {
		return miniApresentacaoCandidato;
	}

	public void setMiniApresentacaoCandidato(String miniApresentacaoCandidato) {
		this.miniApresentacaoCandidato = miniApresentacaoCandidato;
	}

	public Object getCurriculoCandidato() {
		return curriculoCandidato;
	}

	public void setCurriculoCandidato(String curriculoCandidato) {
		this.curriculoCandidato = curriculoCandidato;
	}

}
