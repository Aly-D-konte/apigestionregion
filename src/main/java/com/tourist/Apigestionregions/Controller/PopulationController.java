package com.tourist.Apigestionregions.Controller;

import com.tourist.Apigestionregions.Model.Population;
import com.tourist.Apigestionregions.Model.Region;
import com.tourist.Apigestionregions.Service.PopulationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(value = "hello", description = "Sample hello world application")
@RestController
@RequestMapping("/api/population")
@AllArgsConstructor
public class PopulationController {

    @Autowired
    PopulationService populationService;

    @ApiOperation(value = "My App Service get test1 API")
    @RequestMapping("/add")
    public Population Ajouter( Population population){

        return this.populationService.Ajout(population);
    }


    @ApiOperation(value = "My App Service get test1 API")
    @GetMapping("/liste")
    public List<Population> lister(){
        return this.populationService.lister();
    }

    @ApiOperation(value = "My App Service get test1 API")
    @PutMapping("/update/{id}")
    public Population Modifier(@RequestBody Population population, @PathVariable Long id){
        System.out.println("Population modifier avec succès");
        return  this.populationService.Modifier(population, id);
    }
    @ApiOperation(value = "My App Service get test1 API")
    @DeleteMapping("/delete/{id}")
    public String supprimer(@PathVariable Long id){
        this.populationService.Supprimer(id);
        return "Population supprimer avec succès";
    }



}
