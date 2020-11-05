package controllers.util;

import play.data.validation.Constraints.Required;

public class DiscoDto {

	@Required
	public String titulo;

	public String artista;

	public Condicao condicao;

	public Boolean gravado = false;

}
