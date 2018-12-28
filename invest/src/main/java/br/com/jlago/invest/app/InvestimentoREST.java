package br.com.jlago.invest.app;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.jlago.invest.business.InvestimentoBC;
import br.com.jlago.invest.domain.Investimento;

@Path("/v1/investimentos")
@Produces(MediaType.APPLICATION_JSON)
public class InvestimentoREST {

//	@GET
//	public Response teste() {
//		return Response.status(200).build();
//	}
	
	@Inject
	private InvestimentoBC investimentoBC;
	
	@GET
	public Response getAll() {
//		InvestimentoBC investimentoBC = new InvestimentoBC();
		
		List<Investimento> investimentos = investimentoBC.list();
		return Response.ok().entity(investimentos).build();
	}
}
