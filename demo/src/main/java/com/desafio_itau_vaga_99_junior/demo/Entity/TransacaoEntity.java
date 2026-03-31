package com.desafio_itau_vaga_99_junior.demo.Entity;

import java.time.OffsetDateTime;

public class TransacaoEntity {
    private Long id;
    private double valor;
    private OffsetDateTime dataHora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}


