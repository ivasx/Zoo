public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Лев", kindAnimal.PREDATOR, 5, 180.0, 8, "Вольєр 1");
        Animal giraffe = new Animal("Жирафа", kindAnimal.HERBIVORE, 7, 800.0, 3, "Вольєр 2");

        Food meat = new Food("Стейк", kindFood.MEAT, 15);
        Food grass = new Food("Трава", kindFood.VEGETABLES, 10);
        Food apple = new Food("Яблуко", kindFood.FRUITS, 8);

// Годуємо тварин
        lion.feeding(meat);  // Лев з'їв стейк і отримав ситість
        lion.feeding(grass); // Лев не їстиме рослини
        lion.feeding(apple); // Лев не їстиме фрукти

        giraffe.feeding(meat);  // Жирафа не їстиме м'ясо
        giraffe.feeding(grass); // Жирафа з'їла траву і отримала ситість
        giraffe.feeding(apple); // Жирафа з'їла яблуко і отримала ситість

    }
}
