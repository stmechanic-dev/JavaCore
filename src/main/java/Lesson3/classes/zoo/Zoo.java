package Lesson3.classes.zoo;

public class Zoo {
    private String name;
    private Animal[] animals;
    private double ticketPrice;

    public Zoo(String name, Animal[] animals, double tiketPrice) {
        this.name = name;
        this.animals = animals;
        this.ticketPrice = tiketPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public double getTiketPrice() {
        return ticketPrice;
    }

    public void setTiketPrice(double tiketPrice) {
        this.ticketPrice = tiketPrice;
    }
}
