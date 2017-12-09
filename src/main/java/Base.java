/**
 * @author Andrey Strelnikov
 * My second programm
 */

import java.util.Random;

public class Base {
    public static void main(String[] args) {
        //Генератор случайных чисел
        Random random = new Random();
        //Задаем длину массива
        int array[] = new int[20];
        //заполняем массив случайными числами и вывдоим результат на экран
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
            System.out.println(+i + " элимент массива = " + array[i]);
        }
        // Поиск Максимально отрицательного элимента
        int k = 0;
        int min = 0;
        int max = -10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min && array[i] > max) {
                max = array[i];
                k = i;
            }
        }
        System.out.println("Максимально отрицательный элемент = " + max + " Его индекс = " + k);

        // Поиск минимально положительного элимента
        int b = 0;
        int min1 = 0;
        int max1 = 10;
        for (int a = 0; a < array.length; a++) {
            if (array[a] > min1 && array[a] < max1) {
                max1 = array[a];
                b=a;
            }
        }
        System.out.println("Минимально положительный элемент = " + max1 + " Его индекс = "+b);
        //Меняем местами элименты
        array[k]= max1;
        array[b]= max;
        System.out.println("Индекс = "+k +" Элимент = " +array[k]);
        System.out.println("Индекс = "+b +" Элимент = " +array[b]);

        }
    }
}
