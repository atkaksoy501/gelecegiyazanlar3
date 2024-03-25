package com.turkcell.pos.business.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionRequest {
    @NotNull
    @Size(min = 15, max = 16)
    private String cardNumber;
    @NotNull
    @Size(min = 3, max = 30)
    private String cardHolderName;
    @NotNull
    @Size(min = 3, max = 4)
    private String cvv;
    @NotNull
    @Size(min = 5, max = 5)
    private String expirationDate;
    @NotNull
    private double amount;
}
