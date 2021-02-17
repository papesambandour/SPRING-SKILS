package com.cortech.soft.cortech.dao;
import com.cortech.soft.cortech.model.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource
public interface GroupeDAO extends JpaRepository<Groupe,Long> {
    public Groupe findByNameContains(String name);
    public List<Groupe> findByState(Integer state);
}
