# jobs_app
Atividade C


#Componentes 
	Luiz Junior
	Guilherme Rodrigues
	Ermeson Sousa 
	Fabiano Santana
	Marcos Paulo
##
# Descricao conceitual do  problema



                Empresa tem uma lista vagasDisponiveis(Vaga),
                        nomeEmpresa,descricaoEmpresa,siteEmpresa,cidade(enum),site,logotipo,tem um contato(Contato). 
                        E um Metodo
                        cadastrarVaga
                Account 
                    tem uma empresa(Empresa)
                    tem um usuario,tem uma senha;            
                Contato
                        tem nome,telefone,email;
                Vaga tem uma lista de candidatosConcorrendo(Candidato),
                         dataLançamentoVaga,descricaoVaga,nomeVaga,salarioVaga,
                         tem um metodo receberCandidato(Candidato),vagaPreenchida,vagaRemota.
                
                Candidato 
                        tem uma lista de vagas(Vaga) 
                        tem nomeCandidato,email,
                        miniApresentacao,curriculoCandidato
                        tem um metodo candidatarVaga
                Candidatura
                        tem uma data, statusCandidatura
