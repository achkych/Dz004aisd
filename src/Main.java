import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Добавление элементов в хэш-карту
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // Получение значения по ключу
        int bananaValue = map.get("banana");
        System.out.println("Value of 'banana': " + bananaValue);

        // Удаление элемента по ключу
        int removedValue = map.remove("apple");
        System.out.println("Removed value: " + removedValue);

        // Проверка размера хэш-карты
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // Итерация по значениям хэш-карты
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println("Value: " + value);
        }
    }
}
