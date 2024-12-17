import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем два списка для хранения чисел
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Запрашиваем у пользователя пять целых чисел для первого списка
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }

        // Запрашиваем у пользователя пять целых чисел для второго списка
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }

        // Получаем объединенный список
        ArrayList<Integer> unionList = union(list1, list2);

        // Отображаем результат объединения
        System.out.print("The union list is: ");
        for (int number : unionList) {
            System.out.print(number + " ");
        }
    }

    // Метод для объединения двух списков
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Создаем новый список для хранения результата
        ArrayList<Integer> unionList = new ArrayList<>();

        // Добавляем все элементы из первого списка
        unionList.addAll(list1);

        // Добавляем все элементы из второго списка
        unionList.addAll(list2);

        return unionList; // Возвращаем объединенный список
    }
}