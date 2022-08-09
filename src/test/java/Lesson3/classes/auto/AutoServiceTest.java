package Lesson3.classes.auto;

import org.junit.Assert;
import org.junit.Test;



public class AutoServiceTest {
    AutoService autoService = new AutoService();
    Auto[] autos = {
            new Auto("X6", "BMW", 5, "Automatic"),
            new Auto("Golf", "VW", 5, "Mechanic"),
            new Auto("W213", "Mersedes-E", 5, "Automatic"),
            new Auto("Camaro", "Chevrolet", 2, "Automatic"),
            new Auto("Z", "BMW", 2, "Automatic"),
            new Auto("W203", "Mersedes-C", 5, "Automatic"),
            new Auto("2101", "VAZ", 5, "Mechanic"),
            new Auto("W210", "Mersedes-E", 5, "Automatic"),
            new Auto("Octavia", "Shkoda", 5, "Automatic"),
            new Auto("525", "BMW", 5, "Automatic")
    };


    @Test
    public void getOnlyBmwCarsTest() {
        Assert.assertEquals(3, autoService.getOnlyBmwCars(autos).length);
    }

    @Test
    public void getOnlyMersedesECarsTest() {
        Assert.assertEquals(2, autoService.getOnlyMersedesECars(autos).length);
    }

    @Test
    public void getSportCarsTest() {
        Assert.assertEquals(2, autoService.getSportCars(autos).length);
    }

    @Test
    public void getOnlyAutomaticTypeCarsTest() {
        Assert.assertEquals(8, autoService.getOnlyAutomaticTypeCars(autos).length);
    }
}