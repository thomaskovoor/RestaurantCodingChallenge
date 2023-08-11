package com.thomas.RestaurantChallenge;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class ApiController {
@RequestMapping("/country")
    public List<Country> displayCountry(){
       return Arrays.asList(
               new Country("India",1),
               new Country("Australia",14),
               new Country("Brazil",30),
               new Country("Canada",37),
               new Country("Indonesia",94),
               new Country("New Zealand",148),
               new Country("Phillipines",162),
               new Country("Qatar",166),
               new Country("Singapore",184),
               new Country("South Africa",189),
               new Country("Sri Lanka",191),
               new Country("Turkey",208),
               new Country("UAE",214),
               new Country("United Kingdom",215),
               new Country("United States",216)
       );

    }



}
