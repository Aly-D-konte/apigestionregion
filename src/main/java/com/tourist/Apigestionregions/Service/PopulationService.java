package com.tourist.Apigestionregions.Service;

import com.tourist.Apigestionregions.Model.Population;
import com.tourist.Apigestionregions.Model.Region;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PopulationService {
    Population Ajout(Population population);
    String  Supprimer(Long id);
    Population Modifier(Population population, Long id);
    List<Population> lister();

}
