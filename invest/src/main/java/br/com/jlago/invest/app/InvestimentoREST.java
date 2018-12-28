package br.com.jlago.invest.app;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.jlago.invest.app.dto.InvestimentoDTO;
import br.com.jlago.invest.business.InvestimentoBC;
import br.com.jlago.invest.domain.Investimento;

@Path("/v1/investimentos")
@Produces(MediaType.APPLICATION_JSON)
public class InvestimentoREST {
	
	@Inject
	private InvestimentoBC investimentoBC;
	
	@GET
	public Response getAll() {
		List<Investimento> investimentos = investimentoBC.list();
		return Response.ok().entity(investimentos).build();
	}
	
	@POST
	public Response salvar(InvestimentoDTO investimento) {
		//TODO: guardar em memoria
		return Response.ok().build();
	}
}
