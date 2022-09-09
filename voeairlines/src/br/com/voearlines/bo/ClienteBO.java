package br.com.voearlines.bo;

public class ClienteBO implements IValidacaoEmbarque {

	@Override
	public String validaIdade(int idade) {
		
		String r;
		if(idade < IValidacaoEmbarque.IDADEMIN) {
			r = "Embarque Não Autorizado";
		}else {
			r= "Boa Viagem!VoeAirlines Alcançando novos voos com você!";
		}
		return r;
	}

	
	}		

