package com.cortech.soft.cortech.dao;

import com.cortech.soft.cortech.model.GroupeSmsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface GroupeSmsTransactionDAO extends JpaRepository<GroupeSmsTransaction,Long> {
    public List<GroupeSmsTransaction> findByTextContains(String text);
    public GroupeSmsTransaction findByText(String text);
    public List<GroupeSmsTransaction> findByState(Integer state);
}
