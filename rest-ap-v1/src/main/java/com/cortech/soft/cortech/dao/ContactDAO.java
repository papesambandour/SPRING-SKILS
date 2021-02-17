package com.cortech.soft.cortech.dao;

import com.cortech.soft.cortech.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ContactDAO extends JpaRepository<Contact,Long> {
    public Contact findByFullName(String fullName);
    public Contact findByAndAddress(String address);
    public Contact findByPhone(String phone);
    public List<Contact> findByPhoneStartsWith(String phone);
    public List<Contact> findByFullNameContains(String fullName);
    public List<Contact> findByAddressContains(String address);
    public List<Contact> findByState(Integer state);
    @Query("SELECT c from Contact c where c.fullName like :q or c.phone like :q or c.address like :q ")
    public List<Contact> search(@Param("q") String q);
}
