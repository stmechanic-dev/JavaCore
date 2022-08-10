package Lesson3.classes.zoo;

import org.junit.Assert;
import org.junit.Test;

public class ZooStatisticTest {
    ZooStatistic zooStatistic = new ZooStatistic();
    Zoo[] zoos = {
            new Zoo("Enotik", new Animal[45], 540),
            new Zoo("Pushistik", new Animal[94], 350),
            new Zoo("Peryshko", new Animal[118], 700),
            new Zoo("Laska", new Animal[22], 150),
            new Zoo("Kogotok", new Animal[153], 890),
            new Zoo("Kosmach", new Animal[58], 270),
            new Zoo("Klyk", new Animal[79], 330),

    };

    @Test
    public void averagePriceZooTicketTest() {
        Assert.assertEquals(461.4285714285714, zooStatistic.averagePriceZooTicket(zoos), 0.01);
    }

    @Test
    public void largestNumbersZooTest() {
        Assert.assertEquals("Kogotok", zooStatistic.largestNumbersZoo(zoos));
    }
}