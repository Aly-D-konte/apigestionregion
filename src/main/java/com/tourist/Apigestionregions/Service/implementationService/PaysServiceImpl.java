package com.tourist.Apigestionregions.Service.implementationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tourist.Apigestionregions.Model.Pays;
import com.tourist.Apigestionregions.Repository.PaysRepository;
import com.tourist.Apigestionregions.Service.PaysService;
import org.springframework.stereotype.Service;

@Service
public class PaysServiceImpl implements PaysService{
    @Autowired
    PaysRepository paysRepository;
    @Override
    public Pays Ajout(Pays pays) {
        return this.paysRepository.save(pays);
    }

    @Override
    public Pays Modifier(Pays pays, Long id) {
        return this.paysRepository.findById(id).map(
                p ->{
                    p.setNom(p.getNom());
                    return this.paysRepository.save(p);
        }
        ).orElseThrow(()-> new RuntimeException("Pays non trouvé"));
    }

    @Override
    public List<Pays> Liste() {
        return this.paysRepository.findAll();
    }

    @Override
    public String Supprimer(Long id) {
         this.paysRepository.deleteById(id);
        return "Pays supprimer avec succès";
    }
}
