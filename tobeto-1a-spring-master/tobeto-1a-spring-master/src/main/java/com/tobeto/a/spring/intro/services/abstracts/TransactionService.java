package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.transaction.requests.AddTransactionRequest;

public interface TransactionService {
    void add(AddTransactionRequest request);
}
