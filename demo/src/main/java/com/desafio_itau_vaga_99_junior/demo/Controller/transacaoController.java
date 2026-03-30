package com.desafio_itau_vaga_99_junior.demo.Controller;

import com.desafio_itau_vaga_99_junior.demo.Dto.transacaoRequest;
import com.desafio_itau_vaga_99_junior.demo.Dto.transacaoResponse;
import com.desafio_itau_vaga_99_junior.demo.Service.transacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class transacaoController {
    private transacaoService transacaoService;

    @PostMapping()
    public ResponseEntity<transacaoResponse> postTransaction(@RequestBody transacaoRequest dto){
        return ResponseEntity.ok(transacaoService.postTransacao(dto));
    }
}
