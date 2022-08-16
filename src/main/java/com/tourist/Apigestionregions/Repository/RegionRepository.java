package com.tourist.Apigestionregions.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourist.Apigestionregions.Model.Region;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region , Long>{

    @Query(value = "SELECT id, codeRegion, domaine_activite, langue FROM region, population", nativeQuery = true)
    List<Object[]> RegionSansPays();
}
