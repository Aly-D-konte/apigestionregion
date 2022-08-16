package com.tourist.Apigestionregions.Model;

import javax.persistence.*;

import io.swagger.annotations.Api;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Entity
@Table(name = "pays")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Api
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pays;
    private String nom;



}
