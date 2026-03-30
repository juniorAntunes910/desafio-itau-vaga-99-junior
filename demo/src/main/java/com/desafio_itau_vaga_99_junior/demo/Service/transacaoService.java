package com.desafio_itau_vaga_99_junior.demo.Service;


import com.desafio_itau_vaga_99_junior.demo.Dto.transacaoRequest;
import com.desafio_itau_vaga_99_junior.demo.Dto.transacaoResponse;
import com.desafio_itau_vaga_99_junior.demo.Entity.transacaoEntity;
import com.desafio_itau_vaga_99_junior.demo.repository.transacaoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.OffsetDateTime;

@Service
@AllArgsConstructor
public class transacaoService {
    private transacaoRepository transacaoRepository;


    @Transactional
    public transacaoResponse postTransacao(transacaoRequest dto){
        transacaoEntity transacao = new transacaoEntity();

        //Validações Valores
        if(dto.valor() < 0){
            throw new RuntimeException("422 Unprocessable Entity: Valor da transação negativo ");
        }
        transacao.setValor(dto.valor());

        //Validações DataHora
        OffsetDateTime dataAtual = OffsetDateTime.now();
        if(dto.dataHora().isAfter(dataAtual)){
            throw new RuntimeException("422 Unprocessable Entity: A data não pode ser no futuro");
        }
        if(!dto.dataHora().equals(dataAtual)){
            throw new RuntimeException("Unprocessable Entity: A data é diferente da data Atual");
        }

        transacao.setDataHora(dto.dataHora());
        transacaoEntity salvo = transacaoRepository.save(transacao);

        return new transacaoResponse(salvo);
    }

}
