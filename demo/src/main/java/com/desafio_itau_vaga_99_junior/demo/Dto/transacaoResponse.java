package com.desafio_itau_vaga_99_junior.demo.Dto;

import com.desafio_itau_vaga_99_junior.demo.Entity.transacaoEntity;

import java.time.OffsetDateTime;

public record transacaoResponse (
        transacaoEntity transacao
){}
