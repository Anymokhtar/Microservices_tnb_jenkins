package com.example.gestion.ws;

import com.example.gestion.bean.Taux;
import com.example.gestion.service.TauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/taux")
public class TauxWs {
    @Autowired
    private TauxService tauxService;

    @GetMapping("/findAll")
    public List<Taux> findAll() {
        return tauxService.findAll();
    }

    @PostMapping("/save")
    public <T extends Taux> T save(@RequestBody T taux) {

        return tauxService.save(taux);
    }


    @GetMapping("/findById/{id}")
    public Optional<Taux> findById(@PathVariable Long id) {
        return tauxService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        tauxService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Taux update(@PathVariable Long id, @RequestBody Taux taux) {
        return tauxService.updateTaux(id, taux);
    }
}
