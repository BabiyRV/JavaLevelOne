package HW1;

public class HW1_4 {
    public static void main(String[] args) {

        /*    4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
           если да – вернуть true, в противном случае – false.
         */
        System.out.println("4. Сумма двух чисел в пределах от 10 до 20 (да - true, нет - false):");
        sravnenie(5, 12);
    }

    public static void sravnenie(int a, int b) {
        int с = a + b;
        boolean check = с >= 10 && с <= 20;
        System.out.println(check);
    }

}



