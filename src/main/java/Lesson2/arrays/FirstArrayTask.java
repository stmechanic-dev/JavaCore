package Lesson2.arrays;

public class FirstArrayTask {
    /**
     * Данный метод должен возвращать количество четных чисел в массиве, массив передается в параметрах метода
     * четные числа - это те числа, которые делятся на 2 без остатка
     * @param array массив чисел
     * @return количество четных чисел в массиве
     */
    public static int getCountEvenNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
