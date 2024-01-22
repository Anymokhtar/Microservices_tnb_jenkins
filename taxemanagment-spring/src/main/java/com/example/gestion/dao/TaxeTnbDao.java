package com.example.gestion.dao;

import com.example.gestion.bean.TaxeTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeTnbDao extends JpaRepository<TaxeTnb, Long> {
}
