import java.util.Scanner;

public class section_10 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        /*
         * раздел 10: Наиболее используемые функции
         * библиотеки Math. Работа со случайными числами
         */
        exercise10_1(); // задача 10.1
        exercise10_2(); // задача 10.2
        exercise10_3(); // задача 10.3
        exercise10_4(); // задача 10.4
        exercise10_5(); // задача 10.5
        exercise10_6(); // задача 10.6
        exercise10_7(); // задача 10.7
        exercise10_8(); // задача 10.8
        exercise10_9(); // задача 10.9
        exercise10_10(); // задача 10.10
        exercise10_11(); // задача 10.11
        exercise10_12(); // задача 10.12
        exercise10_13(); // задача 10.13
        exercise10_14(); // задача 10.14
        exercise10_15(); // задача 10.15
        exercise10_16(); // задача 10.16
        exercise10_17(); // задача 10.17
        exercise10_18(); // задача 10.18
        exercise10_19(); // задача 10.19
        exercise10_20(); // задача 10.20
        exercise10_21(); // задача 10.21
        exercise10_22(); // задача 10.22
    }

    public static void exercise10_1() {
        space();
        System.out.println("Случайное целое положительное число: ");
        int x = (int) (Math.random() * (89 + 1) + 10);
        System.out.println(x);
    }

    public static void exercise10_2() {
        space();
        int x = (int) (Math.random() * (18 + 1) - 9);
        int y = (int) (Math.random() * (18 + 1) - 9);
        System.out.println("Случайное первое число: " + x + "\nСлучайное второе число: " + y);
        if (x < y) {
            System.out.println(y + " - Наибольшее");
        } else {
            System.out.println(x + " - Наибольшее");
        }
    }

    public static void exercise10_3() {
        space();
        int x = (int) (Math.random() * (18 + 1) - 9);
        int y = (int) (Math.random() * (18 + 1) - 9);
        System.out.println("Случайное первое число: " + x + "\nСлучайное второе число: " + y);
        if (x > y) {
            System.out.println(x + " - Наибольшее\n" + y + " - Наименьшее");
        } else if (x < y) {
            System.out.println(y + " - Наибольшее\n" + x + " - Наименьшее");
        } else {
            System.out.println(x + "=" + y);
        }
    }

    public static void exercise10_4() {
        space();
        System.out.println("Введите целое положительное число: ");
        int b = scanner.nextInt();
        for (int i = 0; i <= 2; i++) {
            int x = (int) (Math.random() * (b + 0) - 0);
            System.out.println(x);
        }
    }

    public static void exercise10_5() {
        space();
        int b = (int) (Math.random() * (89 + 1) + 10);
        System.out.println("Случайное друзначное число:\n" + b + "\nТри числа меньше первого:");
        for (int i = 0; i <= 2; i++) {
            int x = (int) (Math.random() * (b - 10) + 10);
            System.out.println(x);
        }
    }

    public static void exercise10_6() {
        space();
        int b = (int) (Math.random() * (89 + 1) + 10);
        System.out.println("Случайное друзначное число:\n" + b + "\nТри числа не меньше первого:");
        b++;
        for (int i = 0; i <= 2; i++) {
            int x = (int) (Math.random() * ((99 - b) + 1) + b);
            System.out.println(x);
        }
    }

    public static void exercise10_7() {
        space();
        int a = (int) (Math.random() * (89 + 1) + 10);
        int b = (int) (Math.random() * (89 + 1) + 10);
        System.out.println("Первое случайное число: " + a + "\nВторое случайное число: " + b);
        int min, max;
        if (a < b) {
            min = a;
            max = b;
            System.out.println("Интревал: [" + a + "; " + b + "]");
            repeat(min, max);
        } else if (a > b) {
            min = b;
            max = a;
            System.out.println("Интревал: [" + b + "; " + a + "]");
            repeat(min, max);
        } else {
            System.out.println(a + "=" + b);
        }
    }

    public static void repeat(int max, int min) {
        for (int i = 0; i <= 2; i++) {
            int z = (int) (Math.random() * ((max - min) + 1) + min);
            System.out.println(z);
        }
    }

    public static void exercise10_8() {
        space();
        System.out.println("Введите целое положительное число:");
        int UserInput = scanner.nextInt();
        int minValue = UserInput - 5;
        int maxValue = UserInput + 5;
        System.out.println("Диапазон: [" + minValue + "; " + maxValue + "]");
        int randomValue = (int) (Math.random() * ((maxValue - minValue) + 1) + minValue);
        System.out.println("Случайное сгенерированое число компьютером: " + randomValue);
        if (UserInput == randomValue) {
            System.out.println("Угадал: " + UserInput + "=" + randomValue);
        } else if (randomValue > UserInput) {
            System.out.println("Слишком большое: " + randomValue + ">" + UserInput);
        } else if (randomValue < UserInput) {
            System.out.println("Слишком маленькое: " + randomValue + "<" + UserInput);
        } else {
            System.out.println("Равны: " + randomValue + "=" + UserInput);
        }
    }

    public static void exercise10_9() {
        space();
        int pardomPC = (int) (Math.random() * (89 + 1) + 0);
        int minValue = pardomPC - 5;
        int maxValue = pardomPC + 5;
        int UserInput = (int) (Math.random() * (((maxValue) - (minValue)) + 1) + (minValue));
        System.out.println("Случайное сгенерированое первое число компьтером: " + UserInput);
        System.out.println("Диапазон: [" + minValue + "; " + maxValue + "]");
        int randomValue = (int) (Math.random() * ((maxValue - minValue) + 1) + minValue);
        System.out.println("Случайное сгенерированое второе число компьютером: " + randomValue);
        if (UserInput == randomValue) {
            System.out.println("Угадал: " + UserInput + "=" + randomValue);
        } else if (randomValue > UserInput) {
            System.out.println("Слишком большое: " + randomValue + ">" + UserInput);
        } else if (randomValue < UserInput) {
            System.out.println("Слишком маленькое: " + randomValue + "<" + UserInput);
        } else {
            System.out.println("Равны: " + randomValue + "=" + UserInput);
        }
    }

    public static void exercise10_10() {
        space();
        int pardomPC = (int) (Math.random() * (89 + 1) + 0);
        int minValue = pardomPC - 5;
        int maxValue = pardomPC + 5;
        int UserInput = (int) (Math.random() * (((maxValue) - (minValue)) + 1) + (minValue));
        System.out.println("Случайное сгенерированое первое число компьтером: " + UserInput);
        System.out.println("Диапазон: [" + minValue + "; " + maxValue + "]");
        int randomValue = (int) (Math.random() * ((maxValue - minValue) + 1) + minValue);
        System.out.println("Случайное сгенерированое второе число компьютером: " + randomValue);
        if (UserInput == randomValue) {
            System.out.println("Угадал: " + UserInput + "=" + randomValue);
        } else if (randomValue > UserInput) {
            System.out.println("Слишком большое: " + randomValue + ">" + UserInput);
        } else if (randomValue < UserInput) {
            System.out.println("Слишком маленькое: " + randomValue + "<" + UserInput);
        } else {
            System.out.println("Равны: " + randomValue + "=" + UserInput);
        }
    }

    public static void exercise10_11() {
        space();
        int min = 2, max = 11, sum;
        int randomValue1 = (int) (Math.random() * ((max - min) + 1) + min);
        int randomValue2 = (int) (Math.random() * ((max - min) + 1) + min);
        int randomValue3 = (int) (Math.random() * ((max - min) + 1) + min);
        sum = randomValue1 + randomValue2 + randomValue3;
        System.out.println("Сумма = " + sum);
        if (sum < 21) {
            System.out.println("Недобор: " + sum + "<" + 21);
        } else if (sum > 21) {
            System.out.println("Перебор: " + sum + ">" + 21);
        } else {
            System.out.println("Очко: " + sum + "=" + 21);
        }
    }

    public static void exercise10_12() {
        space();
        int min = 2, max = 11, sum;
        int randomValue1 = (int) (Math.random() * ((max - min) + 1) + min);
        int randomValue2 = (int) (Math.random() * ((max - min) + 1) + min);
        int randomValue3 = (int) (Math.random() * ((max - min) + 1) + min);
        int randomValue4 = (int) (Math.random() * ((max - min) + 1) + min);
        sum = randomValue1 + randomValue2 + randomValue3;
        System.out.println("Сумма = " + sum);

        if (sum < 21) {
            System.out.println("Недобор: " + sum + "<" + 21);
            int Yes = 1;
            int inputUser;
            do {
                System.out.println("Хотите еще добрать карту: Да - 1, Нет - 0");
                inputUser = scanner.nextInt();
                if (inputUser == Yes) {
                    int sum1 = sum + randomValue4;
                    if (sum1 < 21) {
                        System.out.println("Недобор: " + sum1 + "<" + 21);
                    } else if (sum1 > 21) {
                        System.out.println("Перебор: " + sum1 + ">" + 21);
                    } else {
                        System.out.println("Очко: " + sum1 + "=" + 21);
                    }
                    sum = sum1;
                }
            } while (inputUser != Yes);
        } else if (sum > 21) {
            System.out.println("Перебор: " + sum + ">" + 21);
        } else {
            System.out.println("Очко: " + sum + "=" + 21);
        }
    }

    public static void exercise10_13() {
        space();
        int i = 1;
        while (i <= 10) {
            int firstPlayer = (int) (Math.random() * (5 + 1) + 1);
            int secondPlayer = (int) (Math.random() * (5 + 1) + 1);
            System.out.println("\nКость первого игрока = " + firstPlayer + "\nКость второго игрока = " + secondPlayer);
            if (firstPlayer > secondPlayer) {
                System.out.println("\nРаунд " + i + "\nПервый игрок победил - " + firstPlayer);
            } else if (firstPlayer < secondPlayer) {
                System.out.println("\nРаунд " + i + "\nВторой игрок победил - " + secondPlayer);
            } else {
                System.out.println("\nРаунд " + i + "\nНичья - " + secondPlayer + " = " + firstPlayer);
            }
            i++;
        }
    }

    public static void exercise10_14() {
        space();
        int count = 0;
        while (count < 5) {
            int number = (int) (Math.random() * ((80 + 1) + 10)); // Генерация случайного числа от 10 до 99
            if (number % 10 == 0) { // Проверка, заканчивается ли число на ноль
                System.out.println(number);
                count++;
            }
        }
    }

    public static void exercise10_15() {
        space();
        int min = 250, max = 746, a1, a2, a3, maxValue = 0, minValue = 0;
        int random = (int) (Math.random() * ((max - min) + 1) + min);
        System.out.println("Случайное число из диапазона [" + min + "; " + max + "]: " + random);
        a1 = random / 100;
        a2 = (random % 100) / 10;
        a3 = random % 10;
        if (a1 > a2 && a1 > a3) {
            maxValue = a1;
        }
        if (a2 > a1 && a2 > a3) {
            maxValue = a2;
        }
        if (a3 > a1 && a3 > a2) {
            maxValue = a3;
        }
        if (a1 < a2 && a1 < a3) {
            minValue = a1;
        }
        if (a2 < a1 && a2 < a3) {
            minValue = a2;
        }
        if (a3 < a1 && a3 < a2) {
            minValue = a3;
        }
        System.out.println("min = " + minValue + "\nmax = " + maxValue);
        if (a1 == a2 || a1 == a3 || a2 == a3) {
            System.out.println("Да");
        } else {
            System.out.println("НЕТ");
        }
    }

    public static void exercise10_16() {
        space();
        int min = 17, max = 94, a1, a2, a3, a4, maxValue = 0, minValue = 0;
        int random1 = (int) (Math.random() * ((max - min) + 1) + min);
        int random2 = (int) (Math.random() * ((max - min) + 1) + min);
        System.out.println("Случайное первое число из диапазона [" + min + "; " + max + "]: " + random1);
        System.out.println("Случайное второе число из диапазона [" + min + "; " + max + "]: " + random2);
        a1 = random1 / 10;
        a2 = random1 % 10;
        a3 = random2 / 10;
        a4 = random2 % 10;

        if (random1 > random2) {
            System.out.println(random1 + ">" + random2);
        } else if (random1 < random2) {
            System.out.println(random1 + "<" + random2);
        } else {
            System.out.println(random1 + "=" + random2);
        }

        if (a1 > a2 && a1 > a3 && a1 > a4) {
            maxValue = a1;
        }
        if (a2 > a1 && a2 > a3 && a2 > a4) {
            maxValue = a2;
        }
        if (a3 > a1 && a3 > a2 && a3 > a4) {
            maxValue = a3;
        }
        if (a4 > a1 && a4 > a2 && a4 > a3) {
            maxValue = a4;
        }
        if (a1 < a2 && a1 < a3 && a1 < a4) {
            minValue = a1;
        }
        if (a2 < a1 && a2 < a3 && a2 < a4) {
            minValue = a2;
        }
        if (a3 < a1 && a3 < a2 && a3 < a4) {
            minValue = a3;
        }
        if (a4 < a1 && a4 < a2 && a4 < a3) {
            minValue = a4;
        }
        System.out.println("min = " + minValue + "\nmax = " + maxValue);
    }

    public static void exercise10_17() {
        space();

    }

    public static void exercise10_18() {
        space();

    }

    public static void exercise10_19() {
        space();

    }

    public static void exercise10_20() {
        space();

    }

    public static void exercise10_21() {
        space();

    }

    public static void exercise10_22() {
        space();

    }

    public static void space() {
        System.out.println("");
    }

}

// Scanner scanner = new Scanner(System.in);
// System.out.print("Введите число: ");
// int number = scanner.nextInt();

// if (isPalindrome(number)) {
// System.out.println("Число является палиндромом.");
// } else {
// System.out.println("Число не является палиндромом.");
// }
// }

// public static boolean isPalindrome(int number) {
// int originalNumber = number;
// int reverseNumber = 0;

// while (number != 0) {
// int remainder = number % 10;
// reverseNumber = reverseNumber * 10 + remainder;
// number /= 10;
// }

// return originalNumber == reverseNumber;
