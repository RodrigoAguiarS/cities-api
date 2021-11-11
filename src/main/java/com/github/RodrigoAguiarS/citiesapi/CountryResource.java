package com.github.RodrigoAguiarS.citiesapi;

import com.github.RodrigoAguiarS.citiesapi.countries.Country;
import com.github.RodrigoAguiarS.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.print.Pageable;



@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    public CountryResource(CountryRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll((org.springframework.data.domain.Pageable) page);
    }
}
