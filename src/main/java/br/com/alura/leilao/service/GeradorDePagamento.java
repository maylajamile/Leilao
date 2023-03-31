package br.com.alura.leilao.service;

import java.time.Clock;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import br.com.alura.leilao.dao.PagamentoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Pagamento;

@Service
public class GeradorDePagamento {

	private PagamentoDao pagamentos;
	private Clock clock;
	
	public GeradorDePagamento(PagamentoDao pagamentos) {
		this.pagamentos = pagamentos;
		//this.clock = clock;
	}

	public void gerarPagamento(Lance lanceVencedor) {
//		LocalDate vencimento = LocalDate.now(clock).plusDays(1);
//		Pagamento pagamento = new Pagamento(lanceVencedor, vencimento);
//		this.pagamentos.salvar(pagamento);
	}

}
