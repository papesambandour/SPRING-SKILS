package com.cortech.soft.cortech.dao;

import com.cortech.soft.cortech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface UserDAO extends JpaRepository<User,Long> {
    public User findByEmail(String email);
    public User findByPhone(String phone);
    public List<User> findByFullNameContains(String fullName);
    public List<User> findByState(Integer state);
    @Query("SELECT u from User u where u.fullName = :q or u.email = :q or u.email like :q ")
    public List<User> search(@Param("q") String q);
}
