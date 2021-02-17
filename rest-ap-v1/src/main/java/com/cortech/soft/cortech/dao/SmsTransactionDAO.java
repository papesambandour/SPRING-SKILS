package com.cortech.soft.cortech.dao;

import com.cortech.soft.cortech.model.SmsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface SmsTransactionDAO extends JpaRepository<SmsTransaction,Long> {
    public SmsTransaction findByTextContains(String text);
    public List<SmsTransaction> findBySmsTo(String smsTo);
    public List<SmsTransaction> findByStatusCode(String statusCode);
    public List<SmsTransaction> findByProvider (String provider);
    public List<SmsTransaction> findByState(Integer state);
    public List<SmsTransaction> findByStatut(Integer statut);
}
