package com.tourist.Apigestionregions.Service;

import com.tourist.Apigestionregions.Model.Region;

import java.util.List;

public interface RegionService {
    Region  Ajout(Region region);
    String  Supprimer(Long id);
    Region  Modifier(Region region, Long id);
    List<Region> lister();
    List<Object[]> RegionSansPays();
    
}
