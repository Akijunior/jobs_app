
public class Candidato {
	
	private String nome_candidato;
	private String e_mail_candidato;
	private String mini_apresentacao_candidato;
	private Object curriculo_candidato;
	
	public void Candidatar_a_Vaga(Vaga vaga){
		
		vaga.Receber_Candidato(this);
	}

	
	
	
	public String getNome_candidato() {
		return nome_candidato;
	}

	public void setNome_candidato(String nome_candidato) {
		this.nome_candidato = nome_candidato;
	}

	public String getE_mail_candidato() {
		return e_mail_candidato;
	}

	public void setE_mail_candidato(String e_mail_candidato) {
		this.e_mail_candidato = e_mail_candidato;
	}

	public String getMini_apresentacao_candidato() {
		return mini_apresentacao_candidato;
	}

	public void setMini_apresentacao_candidato(String mini_apresentacao_candidato) {
		this.mini_apresentacao_candidato = mini_apresentacao_candidato;
	}

	public Object getCurriculo_candidato() {
		return curriculo_candidato;
	}

	public void setCurriculo_candidato(Object curriculo_candidato) {
		this.curriculo_candidato = curriculo_candidato;
	}
	
	

}
