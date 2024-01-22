package com.example.gestion.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaxeTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;
    private String description;
    private int tnbyear;
    private Double montantbase;

    @ManyToOne
    private Terrain terrain;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Taux taux;

}
