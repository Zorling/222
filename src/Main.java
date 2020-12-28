
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int q = 1;
        while (q != 0) {
            System.out.println("Добро пожаловать в игру Угадайка!");
            System.out.println("Попробуйте угадать число");
            int k = random();
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите Ваш вариант ответа");
                int m = number();
                if (k == m) {
                    i = 3;

                } else {
                    if (k < m) {
                        System.out.println("Ваша цифра больше загаданного числа");
                    }
                    if (k > m) {
                        System.out.println("Ваша цифра меньше загаданного числа");
                    }
                    System.out.println("Попробуйте ещё раз");
                }
            if (i == 3) {
                    System.out.println("Вы угадали. Победа!");
                }
            if (i == 2) {
                    System.out.println("Упс. Вы не угадали.");
                }
            }

            System.out.println("Повторить игру ещё раз? 1 - да/ 0 - нет");
            q = number();
        }
    }
    public static int number() {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        return (n);
    }
    public static int random() {

        return (int)(Math.random()*9);
    }
}
