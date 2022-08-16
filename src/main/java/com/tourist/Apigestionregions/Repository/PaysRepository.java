package com.tourist.Apigestionregions.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourist.Apigestionregions.Model.Pays;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long>{
    
}
