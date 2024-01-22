package com.example.gestion.ws;

import com.example.gestion.bean.Redevable;
import com.example.gestion.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/redevable")
public class RedevableWs {
    @Autowired
    private RedevableService redevableService;

    @GetMapping("/findAll")
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }

    @PostMapping("/save")
    public int save(@RequestBody Redevable a) {
        return redevableService.save(a);
    }

    @GetMapping("/findById/{id}")
    public Optional<Redevable> findById(@PathVariable Long id) {
        return redevableService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        redevableService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Redevable update(@PathVariable Long id, @RequestBody Redevable redevable) {
        return redevableService.updateRedevable(id, redevable);
    }

    @GetMapping("/findByCin/{cin}")
    public Redevable findByCin(@PathVariable String cin) {
        return redevableService.findByCin(cin);
    }
}
