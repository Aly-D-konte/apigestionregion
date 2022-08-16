package com.tourist.Apigestionregions.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import io.swagger.annotations.Api;
import lombok.*;

@Entity
@Table(name = "population")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Api

public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_population;
    private Long chiffre;
    private Long annee;




}
