package br.com.jlago.invest.business;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.jlago.invest.domain.Investimento;

@RequestScoped
public class InvestimentoBC {

	@Inject
	private TipoInvestimentoBC tipoInvestimentoBC;
	
	public List<Investimento> list(){
		List<Investimento> investimentos = new ArrayList<Investimento>();
		
		Investimento inv1 = new Investimento();
		inv1.setId(1L);
		inv1.setNome("Poupanca Reserva");
		inv1.setTipo(tipoInvestimentoBC.load(1L));
		investimentos.add(inv1);

		Investimento inv2 = new Investimento();
		inv2.setId(2L);
		inv2.setNome("Poupanca Casal");
		inv2.setTipo(tipoInvestimentoBC.load(1L));
		investimentos.add(inv2);

		Investimento inv3 = new Investimento();
		inv3.setId(3L);
		inv3.setNome("CDB Parana Banco");
		inv3.setTipo(tipoInvestimentoBC.load(2L));
		investimentos.add(inv3);
		
		return investimentos;
	}
	
}
