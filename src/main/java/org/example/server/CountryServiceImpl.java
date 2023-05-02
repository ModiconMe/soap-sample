package org.example.server;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.server.CountryService")
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository = new CountryRepository();

    @Override
    public Country findByName(String name) {
        return countryRepository.findCountry(name);
    }

}
