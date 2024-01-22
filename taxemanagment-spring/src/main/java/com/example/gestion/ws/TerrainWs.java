package com.example.gestion.ws;

import com.example.gestion.bean.TaxeTnb;
import com.example.gestion.bean.Terrain;
import com.example.gestion.service.TaxeTnbService;
import com.example.gestion.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/terrain")
public class TerrainWs {

    @Autowired
    private TerrainService terrainService;

    @GetMapping("/findAll")
    public List<Terrain> findAll() {
        return terrainService.findAll();
    }

    @PostMapping("/save")
    public <S extends Terrain> S save(@RequestBody S entity) {
        return terrainService.save(entity);
    }

    @GetMapping("/findById/{id}")
    public Optional<Terrain> findById(@PathVariable Long id) {
        return terrainService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        terrainService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Terrain update(@PathVariable Long id, @RequestBody Terrain terrain) {
        return terrainService.updateTerrain(id, terrain);
    }

}
