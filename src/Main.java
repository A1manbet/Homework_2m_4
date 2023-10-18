import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> listA = new ArrayList<>();
        List <String> listB = new ArrayList<>();
        List <String> listC = new ArrayList<>();

        System.out.println("Введите 5 имен: ");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список A:");
        for (String item : listA) {
            System.out.println(item);
        }

        System.out.println("Введите 5 имен: ");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }

        System.out.println("Список B:");
        for (String item : listB) {
            System.out.println(item);
        }

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Список C:");
        for (String item : listC) {
            System.out.println(item);
        }

        Comparator <String> lengthComparator = (str1, str2) -> str1.length() - str2.length();

        Collections.sort(listC, lengthComparator);

        System.out.println("Список C по длине слова:");
        for (String item : listC) {
            System.out.println(item);
        }
    }
}