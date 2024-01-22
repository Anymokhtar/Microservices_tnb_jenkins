package com.example.gestion.service;

import com.example.gestion.bean.Redevable;
import com.example.gestion.bean.Taux;
import com.example.gestion.dao.RedevableDao;
import com.example.gestion.dao.TauxDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TauxService {
    @Autowired
    TauxDao tauxDao;

    public <T extends Taux> T save(T taux) {
        return tauxDao.save(taux);
    }

    public Taux updateTaux(Long id, Taux taux) {
        Taux app = findById(id).get();
        app.setCategory(taux.getCategory());
        app.setMontant(taux.getMontant());
        tauxDao.save(app);
        return app;
    }
    public Optional<Taux> findById(Long cId)
    {
        return tauxDao.findById(cId);
    }

    public void deleteById(Long cId)
    {
        tauxDao.deleteById(cId);
    }

    public void deleteAll() {
        tauxDao.deleteAll();
    }

    public List<Taux> findAll()
    {
        return tauxDao.findAll();
    }
}
