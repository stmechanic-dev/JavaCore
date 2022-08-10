package Lesson3.classes.zoo;

public class ZooStatistic {

    public double averagePriceZooTicket(Zoo[] zoos) {
        double sum = 0.0;
        for (Zoo zoo : zoos) {
           sum = sum + zoo.getTiketPrice();
        }
        return sum / zoos.length;
    }

    public String largestNumbersZoo(Zoo[] zoos) {
        String nameOfZoo = zoos[0].getName();
        int count = 0;
        for (Zoo zoo : zoos) {
            if (zoo.getAnimals().length > count) {
                nameOfZoo = zoo.getName();
                count = zoo.getAnimals().length;
            }
        }

        return nameOfZoo;
    }
}
