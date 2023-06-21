import java.util.Scanner;

public class try_catch_finally {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * try {
         * int result = 10 / 0; // Деление на ноль, исключение ArithmeticException
         * System.out.println("Результат: " + result);
         * } catch (ArithmeticException e) {
         * System.out.println("Произошла ошибка: " + e.getMessage());
         * } finally {
         * System.out.println("Блок finally выполняется всегда");
         * }
         */
        // здесь использовали округление именно Math.round(), которое округляет числа,
        // до ближайшего целого
        double min = 0.1, max = 10.5, S, P, gipotenuza;
        double katet1 = (double) (Math.random() * ((max - min) + 1) + min);
        double katet2 = (double) (Math.random() * ((max - min) + 1) + min);
        System.out.println("Первый катет = " + katet1 + "\nВторой катет = " + katet2);
        gipotenuza = Math.sqrt((katet1 * katet1) + (katet2 * katet2));
        S = 0.5 * katet1 * katet2;
        P = katet1 + katet2 + gipotenuza;
        System.out.println(
                "Гипотенуза = " + gipotenuza + "\nS = " + S + "\nP = " + P);
        System.out.println("Округленные значения\nГипотенуза = " + Math.round(gipotenuza) + "\nS = " + Math.round(S)
                + "\nP = " + Math.round(P));

    }
}
