package HW1;

public class HW1_6 {
    /*    6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
 если число отрицательное, и вернуть false если положительное.
 */
    public static void main(String[] args) {
        System.out.println("6. Проверка числа: отрицательное (true) или положительное (false):");

        check (0);
    }

    public static void check(int a) {
        boolean b = a<=0;
        System.out.println(b);

    }
}