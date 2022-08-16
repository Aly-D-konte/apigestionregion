package com.tourist.Apigestionregions.Service;

import java.util.List;

import com.tourist.Apigestionregions.Model.Pays;
import com.tourist.Apigestionregions.Model.Region;
import org.springframework.stereotype.Service;


public interface PaysService  {
    Pays Ajout(Pays pays);
    Pays  Modifier(Pays pays, Long id);
    List<Pays> Liste();
    String Supprimer(Long id);




}
