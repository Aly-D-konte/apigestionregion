package com.tourist.Apigestionregions.Service.implementationService;


import org.springframework.beans.factory.annotation.Autowired;

import com.tourist.Apigestionregions.Model.Population;
import com.tourist.Apigestionregions.Repository.PopulationRepository;
import com.tourist.Apigestionregions.Service.PopulationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopulationServiceImpl implements PopulationService {
@Autowired
PopulationRepository populationRepository;
    @Override
    public Population Ajout(Population population) {
        // TODO Auto-generated method stub
        return populationRepository.save(population);
    }

    @Override
    public String Supprimer(Long id) {
        this.populationRepository.deleteById(id);
        return "Population supprimer avec succès";
    }

    @Override
    public Population Modifier(Population population, Long id) {
        return populationRepository.findById(id).map(
                p->{
                    p.setChiffre(p.getChiffre());

                    return populationRepository.save(p);

                }
        ).orElseThrow(()-> new RuntimeException("Region non trouvé"));
    }

    @Override
    public List<Population> lister() {
        return this.populationRepository.findAll();
    }

}
