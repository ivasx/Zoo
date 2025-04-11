public class Feeder extends ZooEmpoyee{
    public Feeder(int id, String name, int experience, kindEmpoyee typeActivity) {
        super(id, name, experience, typeActivity);
    }

    @Override
    public void sayAboutAnimal(Animal animal) {
        super.sayAboutAnimal(animal);
    }

    public void feed(Animal animal, Food food) {
        System.out.println("Зараз рівень голоду тварини: " + animal.getHungerLevel());
        System.out.println("Працівник " + name + " " + id + "погодував " + animal.getName());
        animal.feeding(food);
        System.out.println("Тепер рівень голоду тварини: " + animal.getHungerLevel());
    }
}
