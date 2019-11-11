package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        //When
        europe.addCountry(new Country("Europe1", new BigDecimal("1")));
        europe.addCountry(new Country("Europe2", new BigDecimal("10")));
        europe.addCountry(new Country("Europe3", new BigDecimal("100")));
        africa.addCountry(new Country("Africa1", new BigDecimal("1000")));
        africa.addCountry(new Country("Africa2", new BigDecimal("10000")));
        africa.addCountry(new Country("Africa3", new BigDecimal("100000")));
        asia.addCountry(new Country("Asia1", new BigDecimal("1000000")));
        asia.addCountry(new Country("Asia2", new BigDecimal("10000000")));
        asia.addCountry(new Country("Asia3", new BigDecimal("100000000")));

        //Then
        Assert.assertEquals(new BigDecimal("111111111"), world.getPeopleQuantity());
    }
}
