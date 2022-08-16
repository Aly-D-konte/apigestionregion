package com.tourist.Apigestionregions.Service.implementationService;

import java.util.List;

import lombok.AllArgsConstructor;

import com.tourist.Apigestionregions.Model.Region;
import com.tourist.Apigestionregions.Repository.RegionRepository;
import com.tourist.Apigestionregions.Service.RegionService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService {

private final RegionRepository regionRepository;
    @Override
    public Region Ajout(Region region) {
    
        return this.regionRepository.save(region);
    }



  /*  @Override
    public Region AfficherbyId(Region region, Integer id) {
        // TODO Auto-generated method stub
        return null;
    }*/

    @Override
    public String Supprimer(Long id) {
        // TODO Auto-generated method stub
      this.regionRepository.deleteById(id);
      return "Supprimer avec succès";
    }

    @Override
    public Region Modifier(Region region, Long id) {
        // TODO Auto-generated method stub
        return regionRepository.findById(id).map(
                r->{
                    r.setCodeRegion(region.getCodeRegion());
                    r.setNom(region.getNom());
                    r.setLangue(region.getLangue());
                    r.setDomaine_activite(region.getDomaine_activite());
                    r.setSuperficie(region.getSuperficie());
                    return regionRepository.save(r);

                }
        ).orElseThrow(()-> new RuntimeException("Region non trouvé"));
    }

    @Override
    public List<Region> lister() {
        return this.regionRepository.findAll();
    }


    //Region sans pays
    @Override
    public List<Object[]> RegionSansPays(){
        return regionRepository.RegionSansPays();
    }
}
