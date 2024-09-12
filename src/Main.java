import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final int MAX = 16;
    private static final int MIN = 1;
    private static final int DEFAULT_VALUE = 0;

    public static void main(String[] args) {
        //Мапа для пар и подсчета голосов
        HashMap<Integer, Integer> pairs = new HashMap<>();
        //Заполнение мапы парами и начальными значениями
        for (int i = MIN; i < MAX; i++) pairs.put(i, DEFAULT_VALUE);
        System.out.println("Введите кол-во сообщений:");
        Scanner scanner = new Scanner(System.in);
        //Получение кол-ва сообщений
        int n = scanner.nextInt();
        System.out.println("Введите пары:");
        //Ввод пар
        for (int i = 0; i < n; i++) {
            int pair = scanner.nextInt();
            pairs.put(pair, pairs.get(pair) + 1);
        }
        //Cортировка и вывод
        pairs
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);
    }
}