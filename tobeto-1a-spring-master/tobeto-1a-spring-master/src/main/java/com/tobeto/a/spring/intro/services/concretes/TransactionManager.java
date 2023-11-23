package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Transaction;
import com.tobeto.a.spring.intro.repositories.TransactionRepository;
import com.tobeto.a.spring.intro.services.abstracts.TransactionService;
import com.tobeto.a.spring.intro.services.dtos.transaction.requests.AddTransactionRequest;
import org.springframework.stereotype.Service;

@Service

public class TransactionManager implements TransactionService {

    private TransactionRepository transactionRepository;

    public TransactionManager(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void add(AddTransactionRequest request) {

        Transaction transaction = new Transaction();
        transaction.setTransaction_name(request.getName());
        transactionRepository.save(transaction);


    }
}
