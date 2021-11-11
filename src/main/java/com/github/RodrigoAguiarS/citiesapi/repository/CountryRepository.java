package com.github.RodrigoAguiarS.citiesapi.repository;

import com.github.RodrigoAguiarS.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
