package com.tourist.Apigestionregions.Controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.Apigestionregions.Model.Region;
import com.tourist.Apigestionregions.Service.RegionService;



@Api(value = "hello", description = "Sample hello world application")
@RestController
@RequestMapping("/api/region")
@AllArgsConstructor
public class RegionController {

    @Autowired
    RegionService regionService;

    @ApiOperation(value = "My App Service get test1 API")
    @PostMapping("/add")
    public Region Ajout(@RequestBody Region region){
        
        return this.regionService.Ajout(region);
    }

    @ApiOperation(value = "My App Service get test1 API")
    @GetMapping("/liste")
    public List<Region> lister(){
        return this.regionService.lister();
    }

    @ApiOperation(value = "My App Service get test1 API")
    @PutMapping("/update/{id}")
    public Region Modifier(@RequestBody Region region,@PathVariable Long id){
        System.out.println("Modifier avec succès");
        return   this.regionService.Modifier(region,id);
       
    }

    @ApiOperation(value = "My App Service get test1 API")
    @DeleteMapping("/delete/{id}")
    public String supprimer(@PathVariable Long id){
        this.regionService.Supprimer(id);
       return "Supprimer avec succès";
    }

    @ApiOperation(value = "My App Service get test1 API")
    @GetMapping("/SansPays")
    public List<Object[]> SansPays(){
        return  regionService.RegionSansPays();
    }




}
