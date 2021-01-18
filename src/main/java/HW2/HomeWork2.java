package HW2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
// Задача 1.
        System.out.println("1. Создание массива из 0 и 1:");
        int[] NullOne = {0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0};
        int Null = 0;
        int One = 0;

        System.out.println(Arrays.toString(NullOne));
        System.out.println("Количество чисел в массиве: " + NullOne.length);
        for (int i = 0; i < NullOne.length; i++) {
            if (NullOne[i] == 0) {
                NullOne[i] = 1;
                Null++;
            } else {
                NullOne[i] = 0;
                One++;
            }
        }
        System.out.println(Arrays.toString(NullOne));
        System.out.println("Колиество замен 0 на 1: " + Null);
        System.out.println("Колиество замен 1 на 0: " + One);

// Вопрос к преподавателю - как создание массива выделить в отельный метод?

        System.out.println(" ");

// Задача 2.
        System.out.println("2.  Заполнение массива от 0 до 21 с шагом в 3:");
        int[] Arr = new int[8];
        int a = 0;
        System.out.println(Arrays.toString(Arr));
        for (int i = 1; i < Arr.length; i++) {
            a += 3;
            Arr[i] = a;
        }
        System.out.println(Arrays.toString(Arr));
        System.out.println(" ");

// Задача 3.
        int[] Array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3.  В массиве " + Arrays.toString(Array) + " - числа меньше 6 умножить на 2:");
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < 6) {
                Array[i] *= 2;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(Array));
        System.out.println(" ");

// Задача 4.
        System.out.println("4. Заменить диагонали символами '1' ");
        System.out.println("Создание двумерного массива:");
        int[][] ArrayTwo = new int[4][4];
        for (int i = 0; i < ArrayTwo.length; i++) {
            for (int j = 0; j < ArrayTwo[i].length; j++) {
                System.out.print(ArrayTwo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Замена первой диагонали на '1':");
        for (int i = 0; i < ArrayTwo.length; i++) {
            for (int j = 0; j < ArrayTwo[i].length; j++) {
                if (i == j) {
                    ArrayTwo[i][j] = 1;
                }
                System.out.print(ArrayTwo[i][j] + " ");
            }
            System.out.println();
            System.out.println(" ");

// Задача 5.
            System.out.println("5. Найти min и max элементы массива: ");
            System.out.println(Arrays.toString(Array));
            int max = 0;
            int min = 2147483647;
            for (i = 0; i < Array.length; i++) {
                if (Array[i] > max) {
                    max = Array[i];
                }
            }
            for (i = 0; i < Array.length; i++) {
                if (Array[i] < min) {
                    min = Array[i];
                }
            }
            System.out.println("max: " + max);
            System.out.println("min: " + min);
        }
    }
}
//заготовка для задачи 4 второстепенной диагонали
//        System.out.println("Замена второй диагонали на '2':");
//        for (int i = 0; i < ArrayTwo.length; i++) {
//            for (int j = ArrayTwo[i].length; j < 0; j--) {
//                int n = ArrayTwo[i].length;
//                if (i == i && ) {
//                    ArrayTwo[i][j] = 1;
//                }
//                System.out.print(ArrayTwo[i][j] + " ");
//            }
//                System.out.println();
//            }
