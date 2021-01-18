package HW1;

public class HW1_5 {
    /*    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
    public static void main(String[] args) {
        System.out.println("5. Проверка числа: положительное или отрицательное:");

        PosNeg(0);
    }

    public static void PosNeg(int a) {
        boolean b = a >= 0;
        if (b == true) {
            System.out.println("Указанное число положительное: " + a);
        } else {
            System.out.println("Указанное число отрицательное: " + a);
        }
    }


}
