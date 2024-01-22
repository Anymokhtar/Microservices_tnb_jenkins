package com.example.gestion.dao;

import com.example.gestion.bean.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedevableDao extends JpaRepository<Redevable,Long> {
    Redevable findByCin(String cin);
}
