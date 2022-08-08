package Lesson2.branchoperators.movie;

import org.junit.Assert;
import org.junit.Test;

public class MovieAccessServiceTest {
    @Test
    public void raitingRAccessTest() {
        String result = MovieAccessService.accessMovie(19);
        String expected = "Rating R. Access is allowed.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void raitingFAccessTest() {
        String result = MovieAccessService.accessMovie(22);
        String expected = "Rating F. Access is allowed.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fallAccessTest() {
        String result = MovieAccessService.accessMovie(15);
        String expected = "Access is denied";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void invalidAccessTest() {
        String result = MovieAccessService.accessMovie(-1);
        String expected = "Incorrect age, check the user with the given age";
        Assert.assertEquals(expected, result);
    }

}