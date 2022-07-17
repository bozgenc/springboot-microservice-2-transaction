package com.sha.springbootmicroservice2transaction.service;

import com.sha.springbootmicroservice2transaction.model.Transaction;
import com.sha.springbootmicroservice2transaction.repository.ITransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    private ITransactionRepository transactionRepository;

    public TransactionService(ITransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction saveTransaction(Transaction transaction){
        transaction.setTransactionDate(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transaction> listAllTransactionsOfUser(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }


}
