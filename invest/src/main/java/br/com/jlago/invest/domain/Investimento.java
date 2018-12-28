package br.com.jlago.invest.domain;

public class Investimento {
	private Long id;
	private String nome;
	private TipoInvestimento tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoInvestimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoInvestimento tipo) {
		this.tipo = tipo;
	}

}
