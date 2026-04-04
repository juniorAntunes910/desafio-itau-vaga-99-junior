package com.desafio_itau_vaga_99_junior.demo.repository;

import com.desafio_itau_vaga_99_junior.demo.Dto.TransacaoResponse;
import com.desafio_itau_vaga_99_junior.demo.Entity.TransacaoEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransacaoRepository {
    private static List<TransacaoResponse> listTransacao = new ArrayList<>();

    public static void addList(TransacaoResponse transacaoResponse){
        listTransacao.add(transacaoResponse);
    }
    public  void apagarList(){
        listTransacao.clear();
    }
    public List<TransacaoResponse> retornaLista(){
        return listTransacao;
    }
}

/*/
