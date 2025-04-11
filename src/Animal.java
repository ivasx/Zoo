import java.util.HashMap;

public class Animal {

    protected String name;
    protected kindAnimal kind;
    protected int age;
    protected double weight;
    protected int hungerLevel;
    protected String location;

    public Animal(String name, kindAnimal kind, int age, double weight, int hungerLevel, String location) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.weight = weight;
        this.hungerLevel = hungerLevel;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public kindAnimal getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(kindAnimal kind) {
        this.kind = kind;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeSound(){
        System.out.println(name + "видала звук.");
    }

    private void feeding(Food food) {
        if (kind == kindAnimal.HERBIVORE && (food.getKind() == kindFood.MEAT)) {
            System.out.println(getName() + " не їстиме м'ясо, оскільки вона травоїдна.");
        }
        else if (kind == kindAnimal.PREDATOR && (food.getKind() == kindFood.VEGETABLES || food.getKind() == kindFood.FRUITS)) {
            System.out.println(getName() + " не їстиме рослини чи фрукти, оскільки вона хижак.");
        } else {
            setHungerLevel(getHungerLevel() + food.getSatiety());
            System.out.println(getName() + " з'їла " + food.getName() + " і отримала +" + food.getSatiety() + " ситості.");
            System.out.println("Зараз ситість тварини: " + getHungerLevel());

        }
    }
    public void feedByFeeder(Food food) {
        feeding(food);
    }
    public void moves(){
        System.out.println("Тварина рухається.");
    }

    public HashMap<String, Object> returnInfo() {
        HashMap<String, Object> info = new HashMap<>();
        info.put("Назва", name);
        info.put("Вид", kind);
        info.put("Вік", age);
        info.put("Вага", weight);
        info.put("Рівень голоду", hungerLevel);
        info.put("Місцезнаходження", location);
        return info;
    }


}
