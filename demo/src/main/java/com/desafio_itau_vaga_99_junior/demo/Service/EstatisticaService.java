package com.desafio_itau_vaga_99_junior.demo.Service;

import com.desafio_itau_vaga_99_junior.demo.Dto.TransacaoResponse;
import com.desafio_itau_vaga_99_junior.demo.repository.TransacaoRepository;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class EstatisticaService {
    private TransacaoRepository repository;
    public DoubleSummaryStatistics retornaEstatistica(){
        List<TransacaoResponse> transacaoResponses = repository.retornaLista();
        OffsetDateTime limite = OffsetDateTime.now().minusSeconds(60);
            return repository.retornaLista().stream()
                .filter(r -> r.transacao().dataHora().isAfter(limite))
                .mapToDouble(r -> r.transacao().valor())
                .summaryStatistics();
    }
}
