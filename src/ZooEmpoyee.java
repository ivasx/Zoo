import java.util.HashMap;

public class ZooEmpoyee {
    protected int id;
    protected String name;
    protected int experience;
    protected kindEmpoyee typeActivity;

    public ZooEmpoyee(int id, String name, int experience, kindEmpoyee typeActivity){
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.typeActivity = typeActivity;
    }

    public void sayAboutAnimal(Animal animal) {
        HashMap<String, Object> info = animal.returnInfo();

        String name = (String) info.get("Назва");
        kindAnimal kind = (kindAnimal) info.get("Вид");
        int age = (int) info.get("Вік");
        double weight = (double) info.get("Вага");
        int hunger = (int) info.get("Рівень голоду");
        String location = (String) info.get("Місцезнаходження");

        System.out.println("Ця чудова тварина має ім'я " + name + ".");
        System.out.println("Вона мешкає у місці під назвою \"" + location + "\".");
        System.out.println("Їй вже " + age + " років, і вона важить приблизно " + weight + " кілограмів.");

        switch (kind) {
            case PREDATOR:
                System.out.println("Це справжній хижак — " + name + " харчується переважно м’ясом.");
                break;
            case HERBIVORE:
                System.out.println("Це травоїдна тварина — вона полюбляє рослини, траву та листя.");
                break;
            case OMNIVORE:
                System.out.println("Це всеїдна тварина — вона з радістю їсть і рослини, і м’ясо.");
                break;
        }

        if (hunger <= 3) {
            System.out.println("Зараз ця тварина ситиа, тому поводиться досить спокійно.");
        } else if (hunger <= 7) {
            System.out.println("Тварина вже трохи голодна, тож уважно стежить за всім навколо.");
        } else {
            System.out.println("Обережно тварина дуже голодна, час годувати!");
        }

    }
}
