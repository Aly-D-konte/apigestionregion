package com.tourist.Apigestionregions.Model;

import javax.persistence.*;

import io.swagger.annotations.Api;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="REGION")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Api

public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="CODEREGION") // le mapping entre les tables dans la base de données et l'attribut codeRégion
    private String codeRegion;

    @Column(name="NOM")
    private String nom;

    @Column(name="DOMAINE_ACTIVITE")
    private String domaine_activite;

    @Column(name="SUPERFICIE")
    private String superficie;

    @Column(name="LANGUE")
    private String langue;

    @ManyToMany
    private List<Population> populationList = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "id_pays")
    private Pays pays;


}
