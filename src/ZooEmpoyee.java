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

    public void sayAboutAnimal(Animal animal){

    }
}
