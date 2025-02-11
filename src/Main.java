import java.util.*;

public class Main {

    public static void main(String[] args) {
        Address city_0 = new Address("Россия", "Нижний Новгород");
        Address city_1 = new Address("Россия", "Москва");
        Address city_2 = new Address("USA", "New York");
        Address city_17 = new Address("Georgia", "Tbilisi");
        Address city_d = new Address("D", "Dd");
        Address city_f = new Address("F", "Ff");

        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(city_0, 200);
        costPerAddress.put(city_1, 100);
        costPerAddress.put(city_2, 2500);
        costPerAddress.put(city_17, 305);
        costPerAddress.put(city_d, 5);
        costPerAddress.put(city_f, 10);

        int totalShippingCost = 0;
        Set<String> uniqueShippingCountry = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String country = scanner.nextLine().toLowerCase();
            if (Objects.equals(country, "end")) {
                System.out.println("До свидания!");
                return;
            }
            System.out.print("Введите город: ");
            String city = scanner.nextLine().toLowerCase();
            System.out.print("Введите вес (кг): ");
            int weight = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            Address address = new Address(country, city);
            if (costPerAddress.containsKey(address)) {
                int shippingСost = weight * costPerAddress.get(address);
                System.out.println("Стоимость доставки составит: " + shippingСost + " руб.");
                totalShippingCost += shippingСost;
                System.out.println("Общая стоимость всех доставок: " + totalShippingCost + " руб.");
                uniqueShippingCountry.add(country);
                System.out.println("Количество уникальных стран, в которые были оформлены доставки: " + uniqueShippingCountry.size());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
        }

    }
}
