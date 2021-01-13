package HW1;

public class HW1_8 {
    /*    8.	*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
    public static void main(String[] args) {
        System.out.println("8. Проверка года на високосность:");

        year(2000);
    }

    public static void year(int a) {

        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println(a + " год - високосный");
        } else {
            if (a % 100 == 0 && a % 400 == 0) {
                System.out.println(a + " год - високосный");
            } else {
                System.out.println(a + " год - не високосный");
            }
        }
    }
}