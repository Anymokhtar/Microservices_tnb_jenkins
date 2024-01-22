package com.example.gestion.service;

import com.example.gestion.bean.TaxeTnb;
import com.example.gestion.bean.Terrain;
import com.example.gestion.dao.TaxeTnbDao;
import com.example.gestion.dao.TerrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerrainService {
    @Autowired
    TerrainDao terrainDao;

    public <S extends Terrain> S save(S entity) {
        return terrainDao.save(entity);
    }

    public Terrain updateTerrain(Long id, Terrain terrain) {
        Terrain app = findById(id).get();
        app.setCategory(terrain.getCategory());
        app.setNom(terrain.getNom());
        app.setSurface(terrain.getSurface());
        app.setRedevable(terrain.getRedevable());
        app.setDescription(terrain.getDescription());
        terrainDao.save(app);
        return app;
    }
    public Optional<Terrain> findById(Long cId)
    {
        return terrainDao.findById(cId);
    }

    public void deleteById(Long cId)
    {
        terrainDao.deleteById(cId);
    }

    public void deleteAll() {
        terrainDao.deleteAll();
    }

    public List<Terrain> findAll()
    {
        return terrainDao.findAll();
    }

}
