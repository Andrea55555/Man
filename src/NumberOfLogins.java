import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * // создал класс.
 */
public final class NumberOfLogins {
    /**
     * // метод main.
     *
     * @param args .
     */
    public static void main(final String[] args) {
        Map<Integer, String> mapExamples = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4:");
        int number = scanner.nextInt();
        System.out.println("Спасибо!"
                + " Вы ввели число " + number);
        mapExamples.put(1, "Andrey");
        mapExamples.put(2, "Artem");
        mapExamples.put(0, "Anton");
        mapExamples.put(3, "Alexandr");
        int counter = 0;
        for (Map.Entry<Integer, String> item : mapExamples.entrySet()) {
            if (counter < number) {
                System.out.println("Логин: " + item.getKey());
            }
            counter++;
        }
        System.out.println("Введите из логинов:");
        Integer login = scanner.nextInt();
        System.out.println("Пароль для " + login
                + "=" + mapExamples.get(login));
    }
}

