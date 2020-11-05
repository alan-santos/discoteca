package controllers.util;

public enum Condicao {

	A("Novo"), B("Bem Conservado"), C("Desgastado"), D("Riscado"), E("Desgastado e Riscado");

	public String descricao;

	private Condicao(String d) {
		descricao = d;
	}

}
