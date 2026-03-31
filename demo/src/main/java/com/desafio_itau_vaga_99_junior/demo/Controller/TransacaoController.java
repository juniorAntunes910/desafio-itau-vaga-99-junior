package com.desafio_itau_vaga_99_junior.demo.Controller;

import com.desafio_itau_vaga_99_junior.demo.Dto.TransacaoRequest;
import com.desafio_itau_vaga_99_junior.demo.Dto.TransacaoResponse;
import com.desafio_itau_vaga_99_junior.demo.Service.TransacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    private TransacaoService transacaoService = new TransacaoService();

    @PostMapping()
    public ResponseEntity<TransacaoResponse> postTransaction(@RequestBody TransacaoRequest dto){
            return ResponseEntity.ok(transacaoService.postTransacao(dto));
    }
}
