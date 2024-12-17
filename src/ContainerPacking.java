import java.util.ArrayList;
import java.util.Scanner;

public class ContainerPacking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество предметов
        System.out.print("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();

        // Запрашиваем вес каждого предмета
        System.out.print("Enter the weight of each item: ");
        ArrayList<Integer> itemWeights = new ArrayList<>();
        for (int i = 0; i < numberOfItems; i++) {
            itemWeights.add(scanner.nextInt());
        }

        // Упаковка предметов в контейнеры
        ArrayList<ArrayList<Integer>> containers = packItems(itemWeights);

        // Вывод результата
        System.out.println("Total number of containers needed: " + containers.size());
        for (int i = 0; i < containers.size(); i++) {
            System.out.print("Container " + (i + 1) + " contains items with weight: ");
            for (int weight : containers.get(i)) {
                System.out.print(weight + " ");
            }
            System.out.println();
        }
    }

    // Метод для упаковки предметов в контейнеры
    public static ArrayList<ArrayList<Integer>> packItems(ArrayList<Integer> itemWeights) {
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        ArrayList<Integer> currentContainer = new ArrayList<>();
        int currentWeight = 0;

        for (int weight : itemWeights) {
            // Если текущий контейнер не может вместить предмет, создаем новый контейнер
            if (currentWeight + weight > 10) {
                containers.add(currentContainer);
                currentContainer = new ArrayList<>();
                currentWeight = 0;
            }

            // Добавляем предмет в текущий контейнер
            currentContainer.add(weight);
            currentWeight += weight;
        }

        // Добавляем последний контейнер
        if (!currentContainer.isEmpty()) {
            containers.add(currentContainer);
        }

        return containers;
    }
}