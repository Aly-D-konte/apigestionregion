package com.tourist.Apigestionregions.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourist.Apigestionregions.Model.Population;
import org.springframework.stereotype.Repository;

@Repository
public interface PopulationRepository extends JpaRepository<Population, Long>{
    
}
