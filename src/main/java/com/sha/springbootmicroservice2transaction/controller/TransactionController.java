package com.sha.springbootmicroservice2transaction.controller;

import com.sha.springbootmicroservice2transaction.model.Transaction;
import com.sha.springbootmicroservice2transaction.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction){
       return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteTransaction(@PathVariable  Long id) {
        transactionService.deleteTransaction(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> findAllTransactionsOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(transactionService.listAllTransactionsOfUser(userId));
    }


}
