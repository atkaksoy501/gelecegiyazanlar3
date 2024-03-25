package com.turkcell.pos.business.concretes;

import com.turkcell.pos.business.abstracts.PosService;
import com.turkcell.pos.business.dtos.TransactionRequest;
import com.turkcell.pos.business.dtos.TransactionResponse;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PosManager implements PosService {
    @Override
    public TransactionResponse transaction(TransactionRequest transactionRequest) {
        Random random = new Random();
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setTransactionResult(random.nextBoolean());
        return transactionResponse;
    }
}
