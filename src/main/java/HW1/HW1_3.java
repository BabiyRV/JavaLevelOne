package HW1;
public class HW1_3 {
    public static void main(String[] args) {
/*    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.
 */
        System.out.println("3. Результатом вычисления примера a * (b + (c / d)) является:");
        System.out.println("Ответ: " + calculate(1.14f, 2.24f, 2.1f, 1.6f));
    }
    public static float calculate(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }


}
