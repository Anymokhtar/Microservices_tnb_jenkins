package com.example.gestion.dao;

import com.example.gestion.bean.Taux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxDao extends JpaRepository<Taux , Long> {
}
