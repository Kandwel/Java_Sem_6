import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();

        // Входные данные
        phoneBook.put("Иванов", new HashSet<>(Arrays.asList("+7-(123)-456-78-90", "+7-(987)-654-32-10")));
        phoneBook.put("Петров", new HashSet<>(Collections.singletonList("+7-(999)-888-77-66")));
        phoneBook.put("Сидоров", new HashSet<>(Collections.singletonList("+7-(555)-555-55-55")));
        phoneBook.put("Иванов", new HashSet<>(Collections.singletonList("+7-(111)-222-33-44")));

        // Обработка данных
        Map<String, Integer> contactCount = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            contactCount.put(name, phoneBook.get(name).size());
        }

        // Сортировка по убыванию числа телефонов
        List<Map.Entry<String, Integer>> sortedContacts = new ArrayList<>(contactCount.entrySet());
        sortedContacts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Вывод результата
        for (Map.Entry<String, Integer> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + phoneBook.get(entry.getKey()));
        }
    }
}