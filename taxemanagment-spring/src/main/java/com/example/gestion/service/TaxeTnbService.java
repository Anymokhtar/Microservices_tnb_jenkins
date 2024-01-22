package com.example.gestion.service;

import com.example.gestion.bean.TaxeTnb;
import com.example.gestion.dao.TaxeTnbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxeTnbService {
    @Autowired
    TaxeTnbDao taxeTnbDao;

    public int save(TaxeTnb c)
    {
        if (c != null) {
            taxeTnbDao.save(c);
            return 1;
        } else return -1;
    }

    public TaxeTnb updateTaxeTnb(Long id, TaxeTnb taxeTnb) {
        TaxeTnb app = findById(id).get();
        app.setCategory(taxeTnb.getCategory());
        app.setTnbyear(taxeTnb.getTnbyear());
        app.setLabel(taxeTnb.getLabel());
        app.setDescription(taxeTnb.getDescription());
        app.setMontantbase(taxeTnb.getMontantbase());
        app.setRedevable(taxeTnb.getRedevable());
        app.setTerrain(taxeTnb.getTerrain());
        app.setTaux(taxeTnb.getTaux());
        taxeTnbDao.save(app);
        return app;
    }
    public Optional<TaxeTnb> findById(Long cId)
    {
        return taxeTnbDao.findById(cId);
    }

    public void deleteById(Long cId)
    {
        taxeTnbDao.deleteById(cId);
    }

    public void deleteAll() {
        taxeTnbDao.deleteAll();
    }

    public List<TaxeTnb> findAll()
    {
        return taxeTnbDao.findAll();
    }

    // calculer TaxeTnb
}
