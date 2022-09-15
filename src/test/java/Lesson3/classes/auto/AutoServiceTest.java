package Lesson3.classes.auto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AutoServiceTest {
    AutoService autoService = new AutoService();
    List<Auto> autos = List.of(
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
    );

    @Test
    public void getOnlyOneMarkTest() {

        List<Auto> result = autoService.getOnlyOneBrandCars(autos, "BMW");
        List<Auto> expected = List.of(
                new Auto("X6", "BMW", 5, "Automatic"),
                new Auto("Z", "BMW", 2, "Automatic"),
                new Auto("525", "BMW", 5, "Automatic")
        );

        Assertions.assertEquals(3, result.size());
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    public void getSportCarsTest() {
        List<Auto> result = autoService.getSportCars(autos);
        List<Auto> expected = List.of(
                new Auto("Camaro", "Chevrolet", 2, "Automatic"),
                new Auto("Z", "BMW", 2, "Automatic")
        );

        Assertions.assertEquals(2, result.size());
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    public void getOnlyAutomaticTypeCarsTest() {
        List<Auto> result = autoService.getOnlyAutomaticTypeCars(autos);
        List<Auto> expected = List.of(
                new Auto("X6", "BMW", 5, "Automatic"),
                new Auto("W213", "Mersedes-E", 5, "Automatic"),
                new Auto("Camaro", "Chevrolet", 2, "Automatic"),
                new Auto("Z", "BMW", 2, "Automatic"),
                new Auto("W203", "Mersedes-C", 5, "Automatic"),
                new Auto("W210", "Mersedes-E", 5, "Automatic"),
                new Auto("Octavia", "Shkoda", 5, "Automatic"),
                new Auto("525", "BMW", 5, "Automatic")
        );

        Assertions.assertEquals(8, result.size());
        Assertions.assertIterableEquals(expected, result);
    }
}