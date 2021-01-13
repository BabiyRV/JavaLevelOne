package HW1;

public class HW1_7 {
    /*    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
 Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
 */
    public static void main(String[] args) {
        System.out.println("7. Приветствие");

        privetstvie("Роман");
    }

    public static void privetstvie(String a) {
        System.out.println("Привет, " + a);
    }
}
