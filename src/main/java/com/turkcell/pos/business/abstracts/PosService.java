package com.turkcell.pos.business.abstracts;

import com.turkcell.pos.business.dtos.TransactionRequest;
import com.turkcell.pos.business.dtos.TransactionResponse;

public interface PosService {
    TransactionResponse transaction(TransactionRequest transactionRequest);
}
