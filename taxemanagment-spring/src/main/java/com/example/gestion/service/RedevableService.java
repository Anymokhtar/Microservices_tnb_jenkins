package com.example.gestion.service;

import com.example.gestion.bean.Redevable;
import com.example.gestion.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedevableService {
    @Autowired
    RedevableDao redevableDao;

    public int save(Redevable c)
    {
        if (c != null) {
            redevableDao.save(c);
            return 1;
        } else return -1;
    }

    public Redevable updateRedevable(Long id, Redevable redevable) {
        Redevable app = findById(id).get();
        app.setNom(redevable.getNom());
        app.setPrenom(redevable.getPrenom());
        redevableDao.save(app);
        return app;
    }
    public Optional<Redevable> findById(Long cId)
    {
        return redevableDao.findById(cId);
    }

    public void deleteById(Long cId)
    {
        redevableDao.deleteById(cId);
    }

    public void deleteAll() {
        redevableDao.deleteAll();
    }

    public List<Redevable> findAll()
    {
        return redevableDao.findAll();
    }
    public Redevable findByCin(String cin)
    {
        return redevableDao.findByCin(cin);
    }

}
