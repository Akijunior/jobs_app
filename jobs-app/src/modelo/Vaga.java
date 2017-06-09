import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Vaga {
	
	private String data_lancamento_vaga;
	private String descricao_vaga;
	private String nome_vaga;
	private String salario_vaga;
	private boolean vaga_preenchida = false;
	private boolean vaga_remota = false;

	private ArrayList<Candidato> candidatos_concorrendo = new ArrayList<Candidato>();
	
	
	public void Mostrar_Candidatos(){
		
		for (Candidato candidato : candidatos_concorrendo) {
			
			System.out.println("\nNome do candidato: " + candidato.getNome_candidato());
			System.out.println("\nSua Mini Descrição: " + candidato.getMini_apresentacao_candidato());
		}
		

	}
	
	public void Receber_Candidato(Candidato candidato) {
		
		this.candidatos_concorrendo.add(candidato);
		
	}
	

}
