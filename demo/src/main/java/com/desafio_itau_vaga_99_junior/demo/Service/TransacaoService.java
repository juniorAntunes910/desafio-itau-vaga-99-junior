package com.desafio_itau_vaga_99_junior.demo.Service;


import com.desafio_itau_vaga_99_junior.demo.Dto.TransacaoRequest;
import com.desafio_itau_vaga_99_junior.demo.Dto.TransacaoResponse;
import com.desafio_itau_vaga_99_junior.demo.Entity.TransacaoEntity;
import com.desafio_itau_vaga_99_junior.demo.repository.TransacaoRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class TransacaoService {
    private TransacaoRepository transacaoRepository = new TransacaoRepository();


    public TransacaoResponse postTransacao(TransacaoRequest dto) {
        if (dto.valor() < 0) {
            // Você lança a exceção nativa do Spring passando o status e tchau
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        if (dto.dataHora().isAfter(OffsetDateTime.now())) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        TransacaoResponse response = new TransacaoResponse(dto);
        return response;
    }
}
