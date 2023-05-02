package org.example;

import org.example.soap.generated.Country;
import org.example.soap.generated.CountryService;
import org.example.soap.generated.CountryServiceImplService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {

    CountryServiceImplService service = new CountryServiceImplService();
    CountryService countryService = service.getCountryServiceImplPort();

    @Test
    public void givenCountryService_whenCountryIndia_thenCapitalIsNewDelhi() {
        Country india = countryService.findByName("India");
        System.out.println(india);
        assertEquals("New Delhi", india.getCapital());
    }
}
