package com.turkcell.pos.api.controllers;

import com.turkcell.pos.business.abstracts.PosService;
import com.turkcell.pos.business.dtos.TransactionRequest;
import com.turkcell.pos.business.dtos.TransactionResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/pos")
public class PosController {
    private PosService posService;

    @PostMapping
    public ResponseEntity<TransactionResponse> getPos(@RequestBody TransactionRequest transactionRequest) {
        return new ResponseEntity<>(posService.transaction(transactionRequest), HttpStatus.OK);
    }

}
