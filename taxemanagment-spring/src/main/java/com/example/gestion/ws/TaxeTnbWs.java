package com.example.gestion.ws;

import com.example.gestion.bean.Taux;
import com.example.gestion.bean.TaxeTnb;
import com.example.gestion.service.TauxService;
import com.example.gestion.service.TaxeTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/taxeTnb")
public class TaxeTnbWs {
    @Autowired
    private TaxeTnbService taxeTnbService;

    @GetMapping("/findAll")
    public List<TaxeTnb> findAll() {
        return taxeTnbService.findAll();
    }

    @PostMapping("/save")
    public int save(@RequestBody TaxeTnb a) {
        return taxeTnbService.save(a);
    }

    @GetMapping("/findById/{id}")
    public Optional<TaxeTnb> findById(@PathVariable Long id) {
        return taxeTnbService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        taxeTnbService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public TaxeTnb update(@PathVariable Long id, @RequestBody TaxeTnb taxeTnb) {
        return taxeTnbService.updateTaxeTnb(id, taxeTnb);
    }
}
