package com.tourist.Apigestionregions.Controller;

import com.tourist.Apigestionregions.Model.Pays;
import com.tourist.Apigestionregions.Service.PaysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pays")
@AllArgsConstructor

@Api(value = "hello", description = "Sample hello world application")
public class PaysController {
    @Autowired
    PaysService paysService;

    @ApiOperation(value = "My App Service get test1 API")
    @PostMapping("/add")
    public Pays Ajout(@RequestBody Pays pays){
        return  this.paysService.Ajout(pays);
    }

    @ApiOperation(value = "My App Service get test1 API")
    @PutMapping("/update/{id}")
    public Pays Modifier(@RequestBody Pays pays, @PathVariable Long id){
        System.out.println("Pays modifier avec succès");
        return  this.paysService.Modifier(pays, id);
    }

    @ApiOperation(value = "My App Service get test1 API")
    @DeleteMapping("/delete/{id}")
    public String Supprimer(@PathVariable Long id){
        this.paysService.Supprimer(id);
        return "Pays supprimer avec succès";
    }

    @ApiOperation(value = "My App Service get test1 API")
    @GetMapping("/liste")
    public List<Pays> lister(){
        return  this.paysService.Liste();
    }
}
