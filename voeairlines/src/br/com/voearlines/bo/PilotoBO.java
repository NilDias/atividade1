package br.com.voearlines.bo;



public class PilotoBO implements IValidadeDecolar {

	@Override
	public boolean validadeDecolar(boolean piloto) {
	
		String p;
		if(piloto = IValidadeDecolar.NOMEPILOTO != null) {
			p = "Voo Autorizado";
		}else {
			p= "Voo Cancelado!";
		}
		
		return false;
	}

	
	

		
	
}
