package com.sha.springbootmicroservice2transaction.repository;
import java.util.List;
import com.sha.springbootmicroservice2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByUserId(Long userId);
}
