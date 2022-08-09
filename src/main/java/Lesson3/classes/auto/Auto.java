package Lesson3.classes.auto;

public class Auto {
    private String model;
    private String carBrand;
    private int seats;
    private String transmission;

    public Auto(String model, String carBrand, int seats, String transmission) {
        this.model = model;
        this.carBrand = carBrand;
        this.seats = seats;
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
