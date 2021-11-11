package com.github.RodrigoAguiarS.citiesapi;

import com.github.RodrigoAguiarS.citiesapi.countries.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @GetMapping
    public List<Country> countries(){
        return
    }
}
