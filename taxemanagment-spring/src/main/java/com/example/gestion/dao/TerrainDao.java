package com.example.gestion.dao;

import com.example.gestion.bean.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerrainDao extends JpaRepository<Terrain,Long> {
}
