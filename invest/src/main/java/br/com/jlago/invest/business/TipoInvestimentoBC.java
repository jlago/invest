package br.com.jlago.invest.business;

import java.util.ArrayList;
import java.util.List;

import br.com.jlago.invest.domain.TipoInvestimento;

public class TipoInvestimentoBC {

	public List<TipoInvestimento> list() {
		List<TipoInvestimento> tipos = new ArrayList<TipoInvestimento>();

		TipoInvestimento tipo1 = new TipoInvestimento();
		tipo1.setId(1L);
		tipo1.setNome("POUPANCA");
		tipo1.setDescricao("");
		tipos.add(tipo1);

		TipoInvestimento tipo2 = new TipoInvestimento();
		tipo2.setId(2L);
		tipo2.setNome("CDB");
		tipo2.setDescricao("");
		tipos.add(tipo2);

		return tipos;
	}

	public TipoInvestimento load(Long id) {
		//TODO: otimizar
		return list().stream().filter(tipo -> tipo.getId().equals(id)).findFirst().get();
	}

}
