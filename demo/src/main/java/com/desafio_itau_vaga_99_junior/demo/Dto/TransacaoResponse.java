package com.desafio_itau_vaga_99_junior.demo.Dto;

import com.desafio_itau_vaga_99_junior.demo.Entity.TransacaoEntity;

import java.time.OffsetDateTime;

public record TransacaoResponse(
        TransacaoRequest transacao
){}
