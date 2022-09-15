package Lesson3.classes.auto;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис по работе с автомобилями
 */
public class AutoService {

    /**
     * Данный метод возвращает автомобили указанной марки
     * @param autos все автомобили
     * @return список автомобилей указанной марки.
     */
    public List<Auto> getOnlyOneBrandCars(List<Auto> autos, String carBrand) {
        List<Auto> result = new ArrayList<>();
        for (Auto auto : autos) {
            if (auto.getCarBrand().equals(carBrand)) {
                result.add(auto);
            }
        }

        return result;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     *
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public List<Auto> getSportCars(List<Auto> autos) {
        List<Auto> result = new ArrayList<>();
        for (Auto auto : autos) {
            if (auto.getSeats() == 2) {
                result.add(auto);
            }
        }

        return result;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     *
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public List<Auto> getOnlyAutomaticTypeCars(List<Auto> autos) {
        List<Auto> result = new ArrayList<>();
        for (Auto auto : autos) {
            if (auto.getTransmission().equals("Automatic")) {
                result.add(auto);
            }
        }

        return result;
    }
}
