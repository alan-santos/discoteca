package controllers.util;

import java.util.ArrayList;
import java.util.List;

public class OptionsGen {
	
	public List<String> condicoes (){
		
		List<String> condicoes = new ArrayList<String>();
		for(Condicao c:  Condicao.values()) {
			
			//condicoes.add(c.name(), c.descricao);
		}
		return condicoes;
		
	}
	

}
