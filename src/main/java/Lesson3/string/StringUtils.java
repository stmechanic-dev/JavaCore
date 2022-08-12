package Lesson3.string;

public class StringUtils {

    /**
     * Данный метод находит саммую длинную строку в массиве и возвращает объект представленный из
     * размера данной строки и её значении
     * @param strings массив строк
     * @return самая большая строка в верхнем регистре
     */
    public static BigString getTheBiggestStringFromArray(String[] strings) {

        if (strings == null || strings.length == 0) {
            return null;
        }

        BigString bigString = new BigString();
        for (String string : strings) {
            if (string.length() > bigString.getLength()) {
                bigString.setLength(string.length());
                bigString.setValue(string);
            }
        }
        return bigString;
    }
}
