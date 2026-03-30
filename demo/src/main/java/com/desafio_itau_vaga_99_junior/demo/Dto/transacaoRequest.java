package com.desafio_itau_vaga_99_junior.demo.Dto;

import java.time.OffsetDateTime;

public record transacaoRequest(
        double valor,
        OffsetDateTime dataHora
) {
}
