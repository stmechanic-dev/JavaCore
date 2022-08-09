package Lesson3.classes.auto;

/**
 * Сервис по работе с автомобилями
 */
public class AutoService {

    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ.
     */
    public Auto[] getOnlyBmwCars(Auto[] autos) {
        return getCarBrandArray(autos, "BMW");
    }

    /**
     * Данный метод возвращает автомобили марки Mersedes-E
     * @param autos все автомобили
     * @return массив автомобилей Mersedes-E.
     */
    public Auto[] getOnlyMersedesECars(Auto[] autos) {
        return getCarBrandArray(autos, "Mersedes-E");
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public Auto[] getSportCars(Auto[] autos) {
        int count = 0;
        for (Auto auto : autos) {
            if (auto.getSeats() == 2) {
                count++;
            }
        }

        Auto[] result = new Auto[count];
        int index = 0;

        for (Auto auto : autos) {
            if (auto.getSeats() == 2) {
                result[index++] = auto;
            }
        }
        return result;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getTransmission().equals("Automatic")) {
                count++;
            }
        }

        Auto[] result = new Auto[count];
        int index = 0;
        for (Auto auto : autos) {
            if (auto.getTransmission().equals("Automatic")) {
                result[index++] = auto;
            }
        }
        return result;
    }

    public Auto[] getCarBrandArray(Auto[] autos, String carBrand) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getCarBrand().equals(carBrand)) {
                count++;
            }
        }

        Auto[] result = new Auto[count];
        int index = 0;
        for (Auto auto : autos) {

            if (auto.getCarBrand().equals(carBrand)) {
                result[index++] = auto;
            }
        }
        return result;
    }
}
